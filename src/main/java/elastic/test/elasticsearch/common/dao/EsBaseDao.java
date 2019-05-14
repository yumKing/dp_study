package elastic.test.elasticsearch.common.dao;

import java.util.List;
import java.util.Map;

import org.elasticsearch.search.sort.SortOrder;

import elastic.test.elasticsearch.common.model.BasePage;

public interface EsBaseDao<T> {

	/**
	 * 插入或等新，需要有id，id需要自己生成
	 * 
	 * @param tList
	 * @return
	 */
	public boolean insertOrUpdate(List<T> tList);

	/**
	 * 插入或更新
	 * 
	 * @param t
	 * @return
	 */
	public boolean insertOrUpdate(T t);

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	// public boolean deleteById(String id);

	/**
	 * 检查健康状态
	 * 
	 * @return
	 */
	public boolean ping();

	/**
	 * 条件分页查询 basePage.getRecordNo(), basePage.getPageSize()
	 * 
	 * @param searchfields
	 *            查询字段
	 * @param filedContentMap
	 *            字段和查询内容
	 * @param sortField
	 *            排序 字段
	 * @param order
	 *            排序
	 * @param from
	 * @param size
	 * @return
	 */
	public BasePage<T> queryPage(Class<T> classType,
			Map<String, Object> filedContentMap, List<String> heightFields,
			String sortField, SortOrder order, BasePage<T> basePage);

	/**
	 * 列表查询，不分页(默认10条)
	 * 
	 * @param filedContentMap
	 * @param heightFields
	 * @param sortField
	 * @param order
	 * @return
	 */
	public List<T> queryList(Class<T> classType,
			Map<String, Object> filedContentMap, List<String> heightFields,
			String sortField, SortOrder order);

	/**
	 * @Title: queryIndexNameCount 
	 * @Description: 查询索引总记录数
	 * @param @param indexName
	 * @param @param filedContentMap
	 * @param @return    
	 * @return Long    
	 * @throws
	 */
	public Long queryIndexNameCount(String indexName,Map<String, Object> filedContentMap);
	
	/**
	 * 本类查询
	 * 
	 * @param id
	 * @return
	 */
	// public T queryById(String id);

	/**
	 * 删除 by ids
	 * 
	 * @param idList
	 * @return
	 */
	public boolean deleteByIds(List<String> idList, Class<T> classType);

	/**
	 * 根据条件删除
	 * 
	 * @param filedContentMap
	 * @return
	 */
	// public boolean deleteByQuery(Map<String,Object> filedContentMap);
	public T queryById(String id, Class<T> classType);
}
