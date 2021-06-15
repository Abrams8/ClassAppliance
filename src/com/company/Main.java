package com.company;

public class Main {

    public static void main(String[] args) {
        Appliances microwave = new Appliances("Микроволновая печь", "LG", 1000, 15, "черный", true);
        Appliances dishwasher = new Appliances("Посудомоечная машина", "Bosch", 2000, 40, "белый", true);
        VacuumCleaner vacuumCleaner = new VacuumCleaner("Пылесос", "Samsung", 1800, 5, "Синий", false, 2300, "Hepu");
        RobotVacuumCleaner robotVacuumCleaner = new RobotVacuumCleaner("Робот-пылесос", "Xiaomi", 55, 7, "белый", true, 2200, "Hepu", true, "лидар", 5000, true);
        System.out.println(microwave);
        System.out.println(dishwasher);
        System.out.println(vacuumCleaner);
        System.out.println(robotVacuumCleaner);
    }
}
