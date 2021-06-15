package com.company;

import java.util.Objects;

public class Appliances {
    private String nameGadget;
    private String brand;
    private int power;
    private int weight;
    private String color;

    public String getNameGadget() {
        return nameGadget;
    }

    public void setNameGadget(String nameGadget) {
        this.nameGadget = nameGadget;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    private boolean isOn;

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }

    public boolean getState() {
        return isOn;
    }

    public Appliances(String nameGadget, String brand, int power, int weight, String color, boolean isOn) {
        this.nameGadget = nameGadget;
        this.brand = brand;
        this.power = power;
        this.weight = weight;
        this.color = color;
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "nameGadget='" + nameGadget + '\'' +
                ", brand='" + brand + '\'' +
                ", power=" + power +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliances that = (Appliances) o;
        return power == that.power &&
                weight == that.weight &&
                isOn == that.isOn &&
                Objects.equals(nameGadget, that.nameGadget) &&
                Objects.equals(brand, that.brand) &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameGadget, brand, power, weight, color, isOn);
    }
}
