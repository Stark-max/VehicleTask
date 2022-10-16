package models;

import servers.AirRide;
import servers.Reservation;
import servers.VehicleName;

import java.util.Scanner;

public class Airplane extends Vehicle implements AirRide, Reservation, VehicleName {
    public Airplane() {
    }

    public Airplane(String airplaneNumber, Integer seat, Integer speed) {
        super(airplaneNumber, seat, speed);
    }

    @Override
    public void ride() {
        System.out.println("Вы летите со скоростью "+getSpeed());
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
    public void transportNumber() {
        System.out.println("Название самолета "+getVehicleNumber());
        textIndent();
    }
}
