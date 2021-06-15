package com.company;

import java.util.Objects;

class VacuumCleaner extends Appliances {
    private int powerVacuum;
    private String filterType;

    public int getPowerVacuum() {
        return powerVacuum;
    }

    public void setPowerVacuum(int powerVacuum) {
        this.powerVacuum = powerVacuum;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
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

    public VacuumCleaner(String nameGadget, String brand, int power, int weight, String color, boolean isOn, int powerVacuum, String filterType) {
        super(nameGadget, brand, power, weight, color, isOn);
        this.powerVacuum = powerVacuum;
        this.filterType = filterType;
        this.isOn = isOn;
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +

                "nameGadget='" + getNameGadget() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", power=" + getPower() +
                ", weight=" + getWeight() +
                ", color='" + getColor() + '\'' +
                ", isOn=" + isOn +

                ", powerVacuum=" + powerVacuum +
                ", filterType='" + filterType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerVacuum == that.powerVacuum &&
                Objects.equals(filterType, that.filterType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerVacuum, filterType);
    }
}