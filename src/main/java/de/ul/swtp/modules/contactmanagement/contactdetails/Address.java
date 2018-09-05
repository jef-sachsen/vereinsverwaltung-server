package de.ul.swtp.modules.contactmanagement.contactdetails;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cm_address")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private Long zipCode;
    private String city;
    private String country;

}