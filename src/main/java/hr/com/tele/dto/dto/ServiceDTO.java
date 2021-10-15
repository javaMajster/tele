package hr.com.tele.dto.dto;


import javax.persistence.*;
import java.io.Serializable;


public class ServiceDTO implements Serializable {
    private static final long serialVersionUID = -3941957588586266795L;

    private int id;
    private String service;
    private String value;
    private String comment;

    public ServiceDTO() {
    }

    public ServiceDTO(int id, String service, String value, String comment) {
        this.id = id;
        this.service = service;
        this.value = value;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
