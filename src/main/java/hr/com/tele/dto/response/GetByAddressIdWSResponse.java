package hr.com.tele.dto.response;

import hr.com.tele.dto.dto.AddressDTO;
import hr.com.tele.dto.dto.ServiceDTO;
import hr.com.tele.model.Service;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@ApiModel(description = "Generički response objekt kojeg naslijeđuju svi odgovori web servisa.")
public class GetByAddressIdWSResponse extends WSResponse {
    private static final long serialVersionUID = 4761747904037493446L;

    private List<ServiceDTO> service = new ArrayList<>();
    private AddressDTO address ;


    public GetByAddressIdWSResponse() {
    }

    public GetByAddressIdWSResponse(List<ServiceDTO> service, AddressDTO address) {
        this.service = service;
        this.address = address;
    }

    public GetByAddressIdWSResponse(byte status, List<ServiceDTO> service, AddressDTO address) {
        super(status);
        this.service = service;
        this.address = address;
    }

    public GetByAddressIdWSResponse(byte status, String poruka, List<ServiceDTO> service, AddressDTO address) {
        super(status, poruka);
        this.service = service;
        this.address = address;
    }

    public List<ServiceDTO> getService() {
        return service;
    }

    public void setService(List<ServiceDTO> service) {
        this.service = service;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }
}
