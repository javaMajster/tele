package hr.com.tele.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "service")
public class Service implements Serializable {
    private static final long serialVersionUID = -3941957588586266795L;

    private int id;
    private String service;
    private String value;
    private String comment;

    public Service() {
    }

    public Service(int id, String service, String value, String comment) {
        this.id = id;
        this.service = service;
        this.value = value;
        this.comment = comment;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "service", unique = true, nullable = false)
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
    @Column(name = "value", unique = true, nullable = false)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Column(name = "comment", unique = true, nullable = false)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
