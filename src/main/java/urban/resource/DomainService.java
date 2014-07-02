package urban.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import urban.data.DomainData;
import urban.util.DNSResponseUtil;
import urban.util.DomainResponseUtil;

import com.sun.jersey.api.NotFoundException;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

/* @author Ram Namachivayam
 * Domain service to provide domain related services.
 * It uses util classes to build model data (sample) and returns the response.
 * 
 */


@Path("/domain/v1")
@Api(value = "/domain/v1", description = "DNS related services.")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class DomainService {
	
	DNSResponseUtil dnsResponseUtil = new DNSResponseUtil();
	DomainResponseUtil domainResponseUtil = new DomainResponseUtil();
	
	  @GET
	  @Path("/domains")
	  @ApiOperation(value = "GET /domains", notes = "Gets the list of domains", response = DomainData.class, responseContainer = "List" )
	  @ApiResponses(value = { @ApiResponse(code = 404, message = "API not found") })
	  public Response getDomains() throws NotFoundException {
		  GenericEntity<List<DomainData>> entity = new GenericEntity<List<DomainData>>(domainResponseUtil.getDomains()) {};
		  Response resp = Response.ok(entity).build();
		  return resp;
	  }
	  
	  @POST
	  @Path("/domains")
	  @ApiOperation(value = "POST /domains", notes = "Create a new Domain")
	  @ApiResponses(value = { @ApiResponse(code = 404, message = "API not found") })
	  public Response createDomain(@ApiParam(value = "Domain Name.",  required = true) String domainName) throws NotFoundException {
		  Response resp = Response.ok().entity(domainResponseUtil.addNewDomain(domainName)).build();
		  return resp;
	  }
	
	  
	  @GET
	  @Path("/dns")
	  @ApiOperation(value = "GET /v1/dns", notes = "Gets the DNS details for the given domain name")
	  @ApiResponses(value = { @ApiResponse(code = 404, message = "API not found") })
	  public Response dnsLookup(@ApiParam(value = "Domain Name.",  required = true) @QueryParam("domainName") String domainName,
			  @ApiParam(value = "Domain Query Type.",  required = true) @QueryParam("queryType") String queryType,
			  @ApiParam(value = "Domain Query class.",  required = true) @QueryParam("queryClass") String queryClass) throws NotFoundException {
		  Response resp = Response.ok().entity(dnsResponseUtil.getDNSReponse(domainName,queryType,queryClass)).build();
		  return resp;
	  }

}
