package br.com.alura.product_control.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private Double price;

    @Temporal(TemporalType.DATE)
    private Calendar salesStartDate;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Calendar getSalesStartDate() {
        return salesStartDate;
    }

    public void setSalesStartDate(Calendar salesStartDate) {
        this.salesStartDate = salesStartDate;
    }
}
