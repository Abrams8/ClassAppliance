package com.company;

import java.util.Objects;

class RobotVacuumCleaner extends VacuumCleaner {
    private boolean isTurboBrush;
    private String navigationType;
    private int batteryCapacity;
    private boolean wifi;

    public boolean isTurboBrush() {
        return isTurboBrush;
    }

    public void setTurboBrush(boolean turboBrush) {
        isTurboBrush = turboBrush;
    }

    public String getNavigationType() {
        return navigationType;
    }

    public void setNavigationType(String navigationType) {
        this.navigationType = navigationType;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
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

    public RobotVacuumCleaner(String nameGadget, String brand, int power, int weight, String color, boolean isOn, int powerVacuum, String filterType, boolean isTurboBrush, String navigationType, int batteryCapacity, boolean wifi) {
        super(nameGadget, brand, power, weight, color, isOn, powerVacuum, filterType);
        this.isTurboBrush = isTurboBrush;
        this.navigationType = navigationType;
        this.batteryCapacity = batteryCapacity;
        this.wifi = wifi;
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "RobotVacuumCleaner{" +

                "nameGadget='" + getNameGadget() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", power=" + getPower() +
                ", weight=" + getWeight() +
                ", color='" + getColor() + '\'' +
                ", isOn=" + isOn +

                ", isTurboBrush=" + isTurboBrush +
                ", navigationType='" + navigationType + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", wifi=" + wifi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RobotVacuumCleaner that = (RobotVacuumCleaner) o;
        return isTurboBrush == that.isTurboBrush &&
                batteryCapacity == that.batteryCapacity &&
                wifi == that.wifi &&
                Objects.equals(navigationType, that.navigationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isTurboBrush, navigationType, batteryCapacity, wifi);
    }
}
