package com.yanxiao.homework.case1_car;

public class Car {
    private String licensePlate;//车牌
    private String vehicleType;//车型

    public Car() {
    }

    public Car(String licensePlate, String vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }


    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void start() {
        System.out.println("启动~" );
    }

    public void stop() {
        System.out.println("停止！");
    }
}
