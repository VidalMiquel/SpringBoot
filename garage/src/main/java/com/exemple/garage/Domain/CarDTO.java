package com.exemple.garage.Domain;

public class CarDTO {

    private String color;
    private String brand;
    private int maxSpeed;

    // Constructor vacío
    public CarDTO() {
    }

    // Constructor con parámetros
    public CarDTO(String color, String brand, int maxSpeed) {
        this.color = color;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
