/**    
* @Project: wf-ptestdbx-api 
* @Title: YYYYY 
* @Package www.wanfin.com.ptestdbx.proxy.api.modules.cms.entity 
* @Description [[_XXXXX_]]文件
* @author Chenh 
* @date 2016年10月26日 下午4:00:53   
* @version V1.0.0   */ 
package www.wanfin.com.ptestdbx.proxy.api.modules.cms.entity;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

/**   
 * @author Chenh  
 * @date 2016年10月26日 下午4:00:53 
 * @Description [[_XXXXX_]] YYYYY类
 * TODO 
 *   
 */
@SuppressWarnings("restriction")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FileTplProxy implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("id")
    @XmlElement(name = "id")
    @NotNull
    private String id;

    @JsonProperty("file")
    @XmlElement(name = "file")
    @NotNull
    private String file;

    @JsonProperty("root")
    @XmlElement(name = "root")
    @NotNull
   	private String root;// 应用的根目录

	public FileTplProxy() {
		super();
	}
	
   	public FileTplProxy(String file, String root) {
   		this.file = file;
   		this.root = root;
   	}

	public FileTplProxy(String id, String file, String root) {
		super();
		this.id = id;
		this.file = file;
		this.root = root;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}
	
    @Override
    public String toString() {
        return "response code:" +
                " id=" + id +
                " file=" + file +
                ", root='" + root + "'";
    }
}