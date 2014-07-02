package urban.util;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import urban.data.AdditionalRecordsData;
import urban.data.AnswerData;
import urban.data.AuthoritativeNSData;

@XmlRootElement(name = "DNSResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({AnswerData.class,AuthoritativeNSData.class,AdditionalRecordsData.class})
public class DNSResponseUtil {
	
	private Map<String, Object> responseMap = new HashMap<String, Object>();
	
	private static AnswerData domainData = new AnswerData();
	static {
		
		domainData.setDataClass("INET");
		domainData.setDataLength("2");
		domainData.setDomainName("www.ram.com");
		domainData.setResourceData("Primary Name: www.ram.com");
		domainData.setTimeToLive("2 Days");
		domainData.setType("CNAME");
	}
	
	private static AuthoritativeNSData authoritativeNSData =  new AuthoritativeNSData();
	static {
		
		authoritativeNSData.setDataClass("INET");
		authoritativeNSData.setDataLength("16");
		authoritativeNSData.setDomainName("ram.com");
		authoritativeNSData.setResourceData("Name Server: ns2.ram.com");
		authoritativeNSData.setTimeToLive("2 Days");
		authoritativeNSData.setType("Authoritative name server");
	}
	
	private static AdditionalRecordsData additionalRecordsData = new AdditionalRecordsData();
	static {
		
		additionalRecordsData.setDataClass("INET");
		additionalRecordsData.setDataLength("4");
		additionalRecordsData.setDomainName("ns2.ram.com");
		additionalRecordsData.setResourceData("Addr: 64.63.156.2");
		additionalRecordsData.setTimeToLive("1 Day, 22 hours, 46 minutes, 8 seconds");
		additionalRecordsData.setType("Host Address");
	}
	
	static String answer = "www.ram.com: type A, class INET, addr 64.63.156.2 ";
	static String authoritativeKey = "www.ram.com: type NS, class INET, ns ns2.ram.com ";
	static String additionalRecordsKey = "ns ns2.ram.com: type A, class INET, addr 64.63.156.2 ";
	
	public Map<String, Object> getDNSReponse(String domainName,String queryType , String queryClass){
		
		responseMap.put(answer, domainData) ;
		responseMap.put(authoritativeKey, authoritativeNSData) ;
		responseMap.put(additionalRecordsKey, additionalRecordsData);
		return responseMap;
	}
	
	

}
