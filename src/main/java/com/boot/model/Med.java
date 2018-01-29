package com.boot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


@Entity
@Table(name = "Medicines")
public class Med {


  //  @GeneratedValue
    @Id
    private Long _id;
    private String name;
    private String description;
    private String composition;
    private BigDecimal price;
    private String imageUrl;
    private Integer quantity;

    public Med(){}

    public Med(String name, String description, String composition, BigDecimal price, String imageUrl, Integer quantity) {
        this.name = name;
        this.description = description;
        this.composition = composition;
        this.price = price;
        this.imageUrl = imageUrl;
        this.quantity = quantity;
    }


    public Long getId() {
        return _id;
    }

    public void setId(Long id) {
        this._id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
