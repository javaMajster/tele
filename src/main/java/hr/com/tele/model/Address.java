package hr.com.tele.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "addres")
public class Address implements Serializable {
    private static final long serialVersionUID = -3941957588586266795L;

    private int id;
    private String streetNo;
    private String street;
    private String city;
    private String post;
    private String postNo;

    public Address() {
    }

    public Address(int id, String streetNo, String street, String city, String post, String postNo) {
        this.id = id;
        this.streetNo = streetNo;
        this.street = street;
        this.city = city;
        this.post = post;
        this.postNo = postNo;
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

    @Column(name = "streetNo", unique = true, nullable = false)
    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    @Column(name = "street", unique = true, nullable = false)
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Column(name = "city", unique = true, nullable = false)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "post", unique = true, nullable = false)
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Column(name = "postNo", unique = true, nullable = false)
    public String getPostNo() {
        return postNo;
    }

    public void setPostNo(String postNo) {
        this.postNo = postNo;
    }
}
