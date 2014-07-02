package urban;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.http.ContentType.JSON;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
//import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import com.jayway.restassured.RestAssured;

public class DomainTest {
	
	@Before
	 public void setUp(){
	 RestAssured.basePath = "http://localhost:8080/urban";
	 }
	
	@Test
	public void getDomains(){
		given().
		contentType(JSON).
		expect().
	    statusCode(200).
	    log().all().
	    when().
	    get(RestAssured.basePath + "/domain/v1/domains");
	}
	
	@Test
    @Ignore("domains having domainState")
    public void domainLookupTest() {
        final String body = given().urlEncodingEnabled(false).get(RestAssured.basePath + "/domain/v1/domains").asString();
        assertThat(body, containsString("domainState"));
    }
	
	@Test
	public void getZone(){
		given().
		contentType(JSON).
		expect().
	    statusCode(200).
	    log().all().
	    when().
	    get(RestAssured.basePath + "/zone/v1/zone");
	}
	
	@Test
    @Ignore("zone details")
    public void zoneLookupTest() {
        final String body = given().urlEncodingEnabled(false).get(RestAssured.basePath + "/zone/v1/zone").asString();
        assertThat(body, containsString("zone"));
    }
	
	@Test
	public void getDns(){
		given().
		contentType(JSON).
		expect().
	    statusCode(200).
	    log().all().
	    when().
	    get(RestAssured.basePath + "/domain/v1/dns");
	}
	
	@Test
    @Ignore("dns details")
    public void dnsLookupTest() {
        final String body = given().urlEncodingEnabled(false).get(RestAssured.basePath + "/zone/v1/dns").asString();
        assertThat(body, not(nullValue()));
    }

}
