package hr.com.tele.beans;

import hr.com.tele.dto.request.GetByAddressIdWSRequest;
import hr.com.tele.dto.response.GetByAddressIdWSResponse;
import hr.com.tele.manager.AddressServiceManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class AddressServiceBean {
    private static final Logger LOG = LoggerFactory.getLogger(AddressServiceBean.class);

    @EJB
    private  AddressServiceManager addressServiceManager;



    public GetByAddressIdWSResponse getByAddressId(GetByAddressIdWSRequest request){


        return addressServiceManager.findAddressService(request);
    }
}
