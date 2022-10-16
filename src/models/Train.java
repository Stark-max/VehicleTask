package models;

import servers.GroundRide;
import servers.Reservation;
import servers.VehicleName;

import javax.naming.Name;
import java.util.Scanner;

public class Train extends Vehicle implements GroundRide, Reservation, VehicleName {
    public Train() {
    }

    public Train(String trainNumber, Integer seat, Integer speed) {
        super(trainNumber, seat, speed);
    }


    @Override
    public void ride() {
        System.out.println("Траспорт движеться со скоростью "+getSpeed());
        textIndent();
    }

    @Override
    public void seat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите посадочное место: " + getSeat());
        int s = sc.nextInt();
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
        System.out.println("Номер поезда "+getVehicleNumber());
        textIndent();
    }
}
