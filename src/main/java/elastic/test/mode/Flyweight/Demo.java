package elastic.test.mode.Flyweight;;

public class Demo {

	public static void main(String args[]) {

		String str1="abcd";
		
		String str2="abcd"; //发现jvm常量池中有adcd，直接将指针传给了str2
		
		String str3="ab"+"cd"; //同时临时创建2个字符串"ab","cd",在拼接abcd,发现有这个字符串，直接返回指针
		
		String str4="ab"; //先创建字符串"ab",str4指向这个字符串
		
		str4+="cd";  //修改时，先深copy一份字符串"ab",新的"ab"的内存地址给str4,再讲"ab"+"cd"合并 
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1==str4);
		
		str2+="e";  //同理，先将"abcd"深copy一份，str2指向他，然后拼接"e"
		
		System.out.println(str1==str2);
		
	}

}
