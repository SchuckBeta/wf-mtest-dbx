/**    
* @Project: wf-ptest-providers 
* @Title: YYYYY 
* @Package www.wanfin.com.ptest.providers.modules.cms.dao 
* @Description [[_XXXXX_]]文件
* @author Chenh 
* @date 2016年9月28日 下午4:15:39   
* @version V1.0.0   */ 
package www.wanfin.com.ptestdbx.providers.modules.cms.dao;

import java.util.List;

import www.wanfin.com.ptestdbx.providers.api.modules.cms.entity.FileTpl;

/**   
 * @author Chenh  
 * @date 2016年9月28日 下午4:15:39 
 * @Description [[_XXXXX_]] YYYYY类
 * TODO 
 *   
 */
public interface FileTplDao {
	public FileTpl get(FileTpl entity);
	public List<FileTpl> findList(FileTpl entity);
	public List<FileTpl> findAllList();
	
	public int insert(FileTpl entity);
	public int update(FileTpl entity);
	public int delete(FileTpl entity);
}