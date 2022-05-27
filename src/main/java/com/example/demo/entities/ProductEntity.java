package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq_gen")
    @SequenceGenerator(name = "product_seq_gen", sequenceName = "product_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "name", columnDefinition = "varchar(60)", nullable = false)
    private String name;

    @Column(name = "supplier", columnDefinition = "varchar(60)", nullable = false)
    private String supplier;

    @Column(name = "prize", columnDefinition = "int", nullable = false)
    private Integer prize;

    @Column(name = "deliverFrom", columnDefinition = "varchar(60)", nullable = false)
    private String deliverFrom;

    public ProductEntity(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Integer getPrize() {
        return prize;
    }

    public void setPrize(Integer prize) {
        this.prize = prize;
    }

    public String getDeliverFrom() {
        return deliverFrom;
    }

    public void setDeliverFrom(String deliverFrom) {
        this.deliverFrom = deliverFrom;
    }
}
