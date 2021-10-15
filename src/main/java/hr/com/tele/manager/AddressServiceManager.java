package hr.com.tele.manager;

import hr.com.tele.dto.dto.AddressDTO;
import hr.com.tele.dto.request.GetByAddressIdWSRequest;
import hr.com.tele.dto.response.GetByAddressIdWSResponse;
import hr.com.tele.home.AddressServiceHome;
import hr.com.tele.model.Address;
import hr.com.tele.model.AddressService;
import hr.com.tele.model.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
@LocalBean
public class AddressServiceManager extends AddressServiceHome {

    private static final Logger LOG = LoggerFactory.getLogger(AddressServiceManager.class);

    @EJB
    AddressServiceManager addressServiceManager;

    public GetByAddressIdWSResponse findAddressService(GetByAddressIdWSRequest request) {

        List<Service> services = (List<Service>) entityManager.createQuery(
            "select ser from AddressService ser where ser.addressId = : address"
        )
                .setParameter("address",request.getAddressId())
                .getResultList();


        return null;
    }


}
