package com.example.android.foodorderapp.Models;

public class OrderModel {

    int OrderImage ;
    String soldItemName , price ,orderNumber ;

    public OrderModel(int orderImage, String soldItemName, String price, String orderNumber) {
        OrderImage = orderImage;
        this.soldItemName = soldItemName;
        this.price = price;
        this.orderNumber = orderNumber;
    }

    public int getOrderImage() {
        return OrderImage;
    }

    public void setOrderImage(int orderImage) {
        OrderImage = orderImage;
    }

    public String getSoldItemName() {
        return soldItemName;
    }

    public void setSoldItemName(String soldItemName) {
        this.soldItemName = soldItemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
