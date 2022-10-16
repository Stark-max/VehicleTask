package models;

import servers.GroundRide;
import servers.Reservation;
import servers.VehicleName;
import servers.WheelReplacement;

import java.util.Date;
import java.util.Scanner;

public class Car extends Vehicle implements GroundRide, WheelReplacement, Reservation, VehicleName {
    public Car() {
    }

    public Car(String carNumber, Integer seat, Integer speed) {
        super(carNumber, seat, speed);
    }

    @Override
    public void ride() {
        System.out.println("Вы едете со скоростью " + getSpeed());
        try {
            Thread.sleep(10000);
            System.out.println("Вам нужно поменять колесо!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        textIndent();
    }

    @Override
    public void seat() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите посадочное место: " + getSeat());
        int s = in.nextInt();
        while (true)
            if (s <= getSeat()) {
                setSeat(s);
                System.out.println("Ваше посадочное место забронировано. Спасибо что выбираете нас!");
                break;
            } else {
                System.out.println("Такго места нету! Выберите еще раз!");
            }
        textIndent();
    }

    @Override
    public void newWheel() {
        try {
            Thread.sleep(5000);
            System.out.println("Колесто успешно заменено!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        textIndent();
    }

    @Override
    public void transportNumber() {
        System.out.println("Номер машины "+getVehicleNumber());
        textIndent();
    }
}
