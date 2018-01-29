package com.boot.model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import com.boot.model.Med;

@Entity
@Table(name = "StockIns")
public class StockIn {

    @GeneratedValue
    @Id
    private Long _id;
    @OneToMany(mappedBy="_id")
    private Set<Med> items;

    private String fromwhere;
    private Date date;
    private BigDecimal priceForAll;

    public StockIn(){}


    public StockIn(Set<Med> items, String from, Date date, BigDecimal priceForAll) {
        this.items = items;
        this.fromwhere = from;
        this.date = date;
        this.priceForAll = priceForAll;
    }

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public Set<Med> getItems() {
        return items;
    }

    public void setItems(Set<Med> items) {
        this.items = items;
    }

    public String getFrom() {
        return fromwhere;
    }

    public void setFrom(String from) {
        this.fromwhere = from;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getPriceForAll() {
        return priceForAll;
    }

    public void setPriceForAll(BigDecimal priceForAll) {
        this.priceForAll = priceForAll;
    }



}
