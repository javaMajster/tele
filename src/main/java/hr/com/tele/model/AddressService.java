package hr.com.tele.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address_service")
public class AddressService implements Serializable {
    private static final long serialVersionUID = -3941957588586266795L;

    private int id;
    private Address addressId;
    private Service serviceId;

    public AddressService() {
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

    @OneToOne
    @JoinColumn(name = "address_id", nullable = false)
    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    @OneToOne
    @JoinColumn(name = "service_id", nullable = false)
    public Service getServiceId() {
        return serviceId;
    }

    public void setServiceId(Service serviceId) {
        this.serviceId = serviceId;
    }






}
