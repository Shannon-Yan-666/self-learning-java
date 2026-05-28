package com.yanxiao.homework.case1_car;

public class FamilyCar extends Car{
    private String nameOfTheOwner;

    public FamilyCar() {
    }

    public FamilyCar(String licensePlate, String vehicleType, String nameOfTheOwner) {
        super(licensePlate, vehicleType);
        this.nameOfTheOwner = nameOfTheOwner;
    }

    public String getNameOfTheOwner() {
        return nameOfTheOwner;
    }

    public void setNameOfTheOwner(String nameOfTheOwner) {
        this.nameOfTheOwner = nameOfTheOwner;
    }
}
