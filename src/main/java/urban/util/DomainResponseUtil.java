package urban.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;




import urban.data.DomainData;

/* @author Ram Namachivayam
 * Util class to assemble static model object values (for demo purpose values are hard coded).
 */

@XmlRootElement(name = "DomainsInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({DomainData.class})
public class DomainResponseUtil {
	
	private static List<DomainData> domains = new ArrayList<DomainData>();
	
	static{
		DomainData domainData1 = new DomainData();
		domainData1.setCreatedDate(new Date());
		domainData1.setDomainState("Registered");
		domainData1.setExpiryDate(new Date(4567890));
		domainData1.setLanguage("English");
		domainData1.setRecordCount("2");
		domainData1.setToken("zsd-xcg-198fgh");
		domainData1.setId("120");
		domainData1.setName("ram.com");
		
		DomainData domainData2 = new DomainData();
		domainData2.setCreatedDate(new Date());
		domainData2.setDomainState("Hosted");
		domainData2.setExpiryDate(new Date(45678987));
		domainData2.setLanguage("English");
		domainData2.setRecordCount("8");
		domainData2.setToken("zsd-xcg-234fgh");
		domainData2.setId("121");
		domainData1.setName("rambiz.com");
		
		domains.add(domainData1);
		domains.add(domainData2);
	}
	
	@XmlElementWrapper(name = "domains")
	@XmlElementRef()
	public List<DomainData> getDomains(){
		return domains;
	}
	
   public DomainData addNewDomain(String domainName){
	   DomainData newDomainData = new DomainData();
	   newDomainData.setCreatedDate(new Date());
	   newDomainData.setDomainState("Hosted");
	   newDomainData.setExpiryDate(new Date(45678987));
	   newDomainData.setLanguage("English");
	   newDomainData.setRecordCount("8");
	   newDomainData.setToken(UUID.randomUUID().toString());
	   Random rnd = new Random();
	   newDomainData.setId(""+rnd.nextInt());
	   newDomainData.setName(domainName);
	   return newDomainData;
	}

}
