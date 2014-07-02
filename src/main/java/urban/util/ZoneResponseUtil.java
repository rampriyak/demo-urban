package urban.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import urban.data.RecordData;
import urban.data.ZoneData;

/* @author Ram Namachivayam
 * Util class to assemble static model object values (for demo purpose values are hard coded).
 */

@XmlRootElement(name = "ZoneResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({ZoneData.class,RecordData.class})
public class ZoneResponseUtil {
	
	private static ZoneData zoneData = new ZoneData();
	
	static {
		zoneData.setHostName("hosting.com");
		zoneData.setDomainName("www.ram.com");
		zoneData.setId("1001");
		zoneData.setZone("ds1");
		zoneData.setTimeToLive("3600");
		zoneData.setExpiry("1209600");
		
		RecordData recordData = new RecordData();
		recordData.setId("2001");
		recordData.setType("NS");
		recordData.setAnswers(new String[]{"dns1.s01.ram.net","dns1.s02.ram.net"});
		RecordData[] records = new RecordData[]{recordData};
		zoneData.setRecords(records);
		
		zoneData.setDnsServers(new String[]{"dns1.s01.ram.net","dns1.s02.ram.net"});
		
	}
	
	public ZoneData getZone(){
		return zoneData ;
	}

}
