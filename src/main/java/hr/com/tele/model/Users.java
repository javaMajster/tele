package hr.com.tele.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class Users implements Serializable {
    private static final long serialVersionUID = -3941957588586266795L;
    private int id;
    private Address addres;
    private String userName;
    private String password;

    public Users(int id, Address addres, String userName, String password) {
        this.id = id;
        this.addres = addres;
        this.userName = userName;
        this.password = password;
    }

    public Users() {

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



    @OneToOne(
            mappedBy = "id",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    public Address getAddres() {
        return addres;
    }

    public void setAddres(Address addres) {
        this.addres = addres;
    }

    @Column(name = "user_name", unique = true, nullable = false)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Column(name = "password",  nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
