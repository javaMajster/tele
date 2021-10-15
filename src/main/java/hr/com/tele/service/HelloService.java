package hr.com.tele.service;


import hr.com.tele.dto.request.WSRequest;
import hr.com.tele.dto.response.WSResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/helloService")
@Api(value = "/helloService", description = "REST servis test API-ja")
public class HelloService {
    private static final Logger LOG = LoggerFactory.getLogger(HelloService.class);

    @GET

    @Path("/isAlive")
    @ApiOperation(value = "Metoda za provjeru živosti servisa.",
            response = String.class, notes = "Vraća objekt \"Hello World\" ako je servis živ.")
    public String isAlive() {
        return "Hello World!";
    }
	
	@POST
    @Path("/testPost")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @ApiOperation(value = "Metoda za testiranje POST-a.",
            response = WSResponse.class, notes = "Returns dummy response.")
    public WSResponse dodajSalter(
            @ApiParam(value = "Dummy string.", required = true)
                    WSRequest request) {
        WSResponse response = new WSResponse(WSResponse.STATUS_OK);
		response.setPoruka(request.getMessage());
		
        return response;
    }
}