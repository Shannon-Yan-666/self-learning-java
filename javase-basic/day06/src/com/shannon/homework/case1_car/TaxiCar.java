package com.yanxiao.homework.case1_car;

public class TaxiCar extends Car{
    private String ownerName;

    public TaxiCar() {
    }

    public TaxiCar(String licensePlate, String vehicleType, String ownerName) {
        super(licensePlate, vehicleType);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void start() {
        System.out.println("欢迎乘车，请系好安全带！");
    }

    @Override
    public void stop() {
        System.out.println("抵达目的地，请拿好您随身携带的物品！");
    }
}
