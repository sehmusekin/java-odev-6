package org.example.entities;

public class Car {

    private int id;
    private String brand;
    private double unitPrice;
    private int modelYear;
    private String model;



    public Car() {

    }

    public Car(int id, String brand, double unitPrice, int modelYear, String model) {
        this.id = id;
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.modelYear = modelYear;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
