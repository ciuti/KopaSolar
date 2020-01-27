package com.kopasolar.database.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class KopaStock {
    int stockid;
    int productid;
    int quantity;
    int minquantity;
    Date lastorder;

    @Id
    public int getStockid() {
        return stockid;
    }

    public void setStockid(int stockid) {
        this.stockid = stockid;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMinquantity() {
        return minquantity;
    }

    public void setMinquantity(int minquantity) {
        this.minquantity = minquantity;
    }

    public Date getLastorder() {
        return lastorder;
    }

    public void setLastorder(Date lastorder) {
        this.lastorder = lastorder;
    }
}
