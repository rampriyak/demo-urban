package urban.data;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* @author Ram Namachivayam
 * Model object (for demo purpose values are hard coded).
 */

@XmlRootElement(name = "Domain")
public class DomainData {
	
	private String id;
	private String name;
	private String token;
	private String language;
	private String recordCount;
	private Date createdDate;
	private Date expiryDate;
	private String domainState;
	
	@XmlElement(name = "id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@XmlElement(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement(name = "token")
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@XmlElement(name = "language")
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@XmlElement(name = "recordCount")
	public String getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(String recordCount) {
		this.recordCount = recordCount;
	}
	@XmlElement(name = "createdDate")
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@XmlElement(name = "expiryDate")
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@XmlElement(name = "domainState")
	public String getDomainState() {
		return domainState;
	}
	public void setDomainState(String domainState) {
		this.domainState = domainState;
	}

}
