package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_seq_gen")
    @SequenceGenerator(name="customer_seq_gen", sequenceName = "customer_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;

    @Column(name = "firstName", columnDefinition = "varchar(20)", nullable = false)
    private String firstName;

    @Column(name = "lastName", columnDefinition = "varchar(60)", nullable = false)
    private String lastName;

    @Column(name = "pais", columnDefinition = "varchar(20)", nullable = false)
    private String pais;

    public CustomerEntity(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}


