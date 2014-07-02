package urban.data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/* @author Ram Namachivayam
 * Model object (for demo purpose values are hard coded).
 */

@XmlRootElement(name = "Answer")
public class AnswerData {
	
	private String domainName;
	private String type;
	private String dataClass;
	private String timeToLive;
	private String dataLength;
	private String resourceData;
	
	@XmlElement(name = "domainName")
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	@XmlElement(name = "type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@XmlElement(name = "dataClass")
	public String getDataClass() {
		return dataClass;
	}
	public void setDataClass(String dataClass) {
		this.dataClass = dataClass;
	}
	@XmlElement(name = "timeToLive")
	public String getTimeToLive() {
		return timeToLive;
	}
	public void setTimeToLive(String timeToLive) {
		this.timeToLive = timeToLive;
	}
	@XmlElement(name = "dataLength")
	public String getDataLength() {
		return dataLength;
	}
	public void setDataLength(String dataLength) {
		this.dataLength = dataLength;
	}
	@XmlElement(name = "resourceData")
	public String getResourceData() {
		return resourceData;
	}
	public void setResourceData(String resourceData) {
		this.resourceData = resourceData;
	}

}
