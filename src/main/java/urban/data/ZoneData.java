package urban.data;

/* @author Ram Namachivayam
 * Model object (for demo purpose values are hard coded).
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Zone")
public class ZoneData {
	
	private String id;
	private String hostName;
	private String timeToLive;
	private String zone;
	private String refresh;
	private String expiry;
	private String domainName;
	private String[] dnsServers;
	private RecordData[] records;

	@XmlElement(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@XmlElement(name = "hostName")
	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	@XmlElement(name = "timeToLive")
	public String getTimeToLive() {
		return timeToLive;
	}

	public void setTimeToLive(String timeToLive) {
		this.timeToLive = timeToLive;
	}
	@XmlElement(name = "zone")
	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}
	@XmlElement(name = "refresh")
	public String getRefresh() {
		return refresh;
	}

	public void setRefresh(String refresh) {
		this.refresh = refresh;
	}
	@XmlElement(name = "expiry")
	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	@XmlElement(name = "dnsServers")
	public String[] getDnsServers() {
		return dnsServers;
	}

	public void setDnsServers(String[] dnsServers) {
		this.dnsServers = dnsServers;
	}
	@XmlElement(name = "domainName")
	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	@XmlElement(name = "records")
	public RecordData[] getRecords() {
		return records;
	}

	public void setRecords(RecordData[] records) {
		this.records = records;
	}
	
	

}
