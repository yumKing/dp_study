package elastic.test.ipproxy;

import java.util.List;

import org.jsoup.helper.StringUtil;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

public abstract class IParse {

	public abstract List<JSONObject> parse(String res);
	
	/**
     * @param json     : JSON string
     * @param selector : JSON selector
     *  标示符 $：标示当前获取的对象为 JSONObject
	 *	标示符 #：标示当前获取的对象为 JSONArray
	 *	无标示符：标示当前获取的对象为 value
	 *	1、# 标示符后必须为 $ 标识符
	 *	2、标识符后可为 标识符、 # 标识符、无标识符
	 *	3、无标识符后不可跟任何数据
     *        $key|$key|#array|#int|$int|key
     *        #key|#int
     *        $key|#key|$int
     *        key
     *       
     *        array|key : is illegal 不符合第一条
     *        key|$     : is illegal 不符合第3条
     *        key|#     : is illegal 不符合第3条
     *        key|key   : is illegal 不符合第3条
     * @return
     */
    public String getJsonText(String json, String selector){
        JSONObject jo = null;
        JSONArray  ja = null;
        String jsonText = "";
        String item     = "";
        String flag     = "O"; // O - JSONObject; A - JSONArray; T - text
         
        // arguments must not be null
        if (json == null || selector == null) {
//            this.message = "The argument {" + json + "} and {" + selector + "} must be not null, please check this!";
//            this.logger.error(this.message);
             
            new IllegalArgumentException("The argument {\" + json + \"} and {\" + selector + \"} must be not null, please check this!");
        }
         
        // return empty if the json is empty
        if ("".equals(json)) {
            return "";
        }
         
        // return json if the selector is empty
        if ("".equals(selector)) {
            return json;
        }
         
        try{
            jo = JSONObject.parseObject(json);
             
            String[] select = selector.split("\\|");
             
            for (int i = 0; i < select.length; i++) {
                item = select[i];
                 
                // throw exception when selector against the rule
                if (flag.equals("T") || (flag.equals("A") && (!item.startsWith("O") || !item.startsWith("A") || !StringUtil.isNumeric(item.substring(1))))) {
                    new IllegalArgumentException("The argument {" + selector + "} is invalid to the define rule of selector, please check this!");
                }
                 
                if (item.startsWith("#")) {          // get JSONArray
                    if (flag.equals("A")) {
                        ja = ja.getJSONArray(Integer.valueOf(item.substring(1)));
                    } else if (flag.equals("O")){
                        ja = jo.getJSONArray(item.substring(1));
                    }
                     
                    flag = "A";
                } else if (item.startsWith("$")){    // get JSONObject
                    if (flag.equals("O")) {
                        jo = jo.getJSONObject(item.substring(1));
                    } else if (flag.equals("A")){
                        jo = ja.getJSONObject(Integer.valueOf(item.substring(1)));
                    }
                     
                    flag = "O";
                } else {                             // get text
                    jsonText = jo.get(item).toString();
                     
                    flag = "T";
                }
            }
        } catch (JSONException jsone){
            jsone.printStackTrace();
        }
         
        switch (flag) {
            case "O":
                return jo.toString();
            case "A":
                return ja.toString();
            default:
                return jsonText;
        }
    }
}
