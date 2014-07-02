package urban.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import urban.util.ZoneResponseUtil;

import com.sun.jersey.api.NotFoundException;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

/* @author Ram Namachivayam
 * Zone service to provide zone related services.
 * It uses util classes to build model data (sample) and returns the response.
 * 
 */

@Path("/zone/v1")
@Api(value = "/zone/v1", description = "Zone DNS related services.")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class ZoneService {
	
	 ZoneResponseUtil zoneResponseUtil = new ZoneResponseUtil();
	
	  @GET
	  @Path("/zone")
	  @ApiOperation(value = "GET /zone", notes = "Gets the zone details")
	  @ApiResponses(value = { @ApiResponse(code = 404, message = "API not found") })
	  public Response getDomains() throws NotFoundException {
		  Response resp = Response.ok().entity(zoneResponseUtil.getZone()).build();
		  return resp;
	  }

}
