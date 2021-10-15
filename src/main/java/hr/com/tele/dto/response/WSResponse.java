package hr.com.tele.dto.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Generički response objekt kojeg naslijeđuju svi odgovori web servisa.")
public class WSResponse implements Serializable {
    private static final long serialVersionUID = 4761747904037493446L;

    public static final byte STATUS_OK = 0;
    public static final byte STATUS_WARNING = 1;
    public static final byte STATUS_ERROR = 2;

    @ApiModelProperty(required = true, value = "Status obrade zahtjeva prema WS-u.")
    protected byte status;
    @ApiModelProperty(required = true, value = "Poruka koja opisuje rezultat obrade zahtjeva prema WS-u.")
    protected String poruka;

    private List<String> errors = new ArrayList<>();

    public WSResponse() {
    }

    public WSResponse(byte status) {
        this.status = status;
    }

    public WSResponse(byte status, String poruka) {
        this.status = status;
        this.poruka = poruka;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
