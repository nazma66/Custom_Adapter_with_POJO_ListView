package com.example.custom_adapter_with_pojo;

public class Item {


    public Item(String itemName, String itemDescription, String itemDate, Integer itemPrice, Double itemDouble) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemDate = itemDate;
        this.itemPrice = itemPrice;
        this.itemDouble = itemDouble;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }





    public String getItemDescription() {
        return itemDescription;

    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }





    public String getItemDate() {

    return itemDate;
    }

    public void setItemDate(String itemDate) {
        this.itemDate = itemDate;
    }





    public Integer getItemPrice() {

        return itemPrice;
    }

    public void setItemPrice(Integer itemPrice) {
        this.itemPrice = itemPrice;
    }




    public Double getItemDouble() {
        return itemDouble;
    }

    public void setItemDouble(Double itemDouble) {
        this.itemDouble = itemDouble;
    }

    private String itemName;
    private String itemDescription;
    private String itemDate;
    private Integer itemPrice;

    private Double itemDouble;

}





