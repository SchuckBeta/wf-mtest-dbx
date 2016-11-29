/**    
* @Project: wf-ptestdbx-proxy 
* @Title: YYYYY 
* @Package www.wanfin.com.ptestdbx.proxy.modules.cms.service.impl 
* @Description [[_XXXXX_]]文件
* @author Chenh 
* @date 2016年10月26日 下午5:15:52   
* @version V1.0.0   */ 
package www.wanfin.com.ptestdbx.proxy.modules.cms.service.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import www.wanfin.com.ptestdbx.providers.api.modules.cms.service.IFileTplService;
import www.wanfin.com.ptestdbx.proxy.api.modules.cms.service.IFileTplProxyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.alibaba.dubbo.rpc.RpcContext;

/**   
 * @author Chenh  
 * @date 2016年10月26日 下午5:15:52 
 * @Description [[_XXXXX_]] YYYYY类
 * TODO 
 *   
 */
@Service("fileTplProxyService")
@Path("fileTpl")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8 })
public class FileTplProxyServiceImpl implements IFileTplProxyService{
	@Autowired
	private IFileTplService fileTplService;
	
	@Override
	@GET
	@Path("{name}")
	public String sayHello(@PathParam("name") String name) {
		return "Hello "+name;
	}
	

	public IFileTplService getFileTplService() {
		return fileTplService;
	}

	public void setFileTplService(IFileTplService fileTplService) {
		this.fileTplService = fileTplService;
	}
}
