package hr.com.tele.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@ApiModel(description = "Dummy request.")
public class GetByAddressIdWSRequest extends WSRequest {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(required = true, value = "Look up by addressId.")
    private int addressId;




    public GetByAddressIdWSRequest() {
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }
}
