package hr.com.tele.service;


import hr.com.tele.beans.AddressServiceBean;
import hr.com.tele.dto.request.GetByAddressIdWSRequest;
import hr.com.tele.dto.request.WSRequest;
import hr.com.tele.dto.response.GetByAddressIdWSResponse;
import hr.com.tele.dto.response.WSResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/helloService")
@Api(value = "/helloService", description = "REST servis test API-ja")
public class TeleService {
    private static final Logger LOG = LoggerFactory.getLogger(TeleService.class);

    @EJB
    private AddressServiceBean addressServiceBean;

	@POST
    @Path("/getByAddressId")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @ApiOperation(value = "Metod for getting data by address id",
            response = GetByAddressIdWSResponse.class, notes = "data.")
    public GetByAddressIdWSResponse getByAddressId(
            @ApiParam(value = "Address id.", required = true)
                    GetByAddressIdWSRequest request) {
        LOG.info(request.toString());

        return addressServiceBean.getByAddressId(request);
    }
}