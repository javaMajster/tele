package hr.com.tele.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "Dummy request.")
public class WSRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(required = true, value = "Dummy message.")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
