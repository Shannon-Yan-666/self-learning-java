package com.yanxiao.demo09_Polymorphism_case1.order;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:  1. 国内订单   2. 国外订单");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                // 创建国内订单的业务类
                OrderServiceImpl orderService = new OrderServiceImpl();
                orderService.create();
                orderService.findOne();
                orderService.findList();
                orderService.cancel();
                orderService.finish();
                orderService.paid();
                break;
            case 2:
                // 创建国外订单的业务类
                OverseasServiceImpl overseasService = new OverseasServiceImpl();
                overseasService.create();
                overseasService.findOne();
                overseasService.findList();
                overseasService.cancel();
                overseasService.finish();
                overseasService.paid();
                break;
        }


    }
}
