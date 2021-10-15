package hr.com.tele.service;


import hr.com.tele.dto.request.WSRequest;
import hr.com.tele.dto.response.WSResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

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
    @ApiOperation(value = "Metoda za testiranje POST-a.",
            response = WSResponse.class, notes = "Vraća dummy response.")
    public WSResponse dodajSalter(
            @ApiParam(value = "Objekt koji sadrži podatke o salteru koju se dodaje.", required = true)
                    WSRequest request) {
        WSResponse response = new WSResponse(WSResponse.STATUS_OK);
		response.setPoruka(request.getMessage());
		
        return response;
    }
}