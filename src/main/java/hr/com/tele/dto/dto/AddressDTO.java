package hr.com.tele.dto.dto;


import javax.persistence.*;
import java.io.Serializable;


public class AddressDTO implements Serializable {
    private static final long serialVersionUID = -3941957588586266795L;

    private int id;
    private String streetNo;
    private String street;
    private String city;
    private String post;
    private String postNo;

    public AddressDTO() {
    }

    public AddressDTO(int id, String streetNo, String street, String city, String post, String postNo) {
        this.id = id;
        this.streetNo = streetNo;
        this.street = street;
        this.city = city;
        this.post = post;
        this.postNo = postNo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPostNo() {
        return postNo;
    }

    public void setPostNo(String postNo) {
        this.postNo = postNo;
    }
}
