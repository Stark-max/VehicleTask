package models.entities;

import servers.Reservation;
import servers.Ride;
import servers.WheelReplacement;

import java.util.Scanner;

public class Car extends Vehicle {
    private Integer wheel = 4;
    public Car() {
    }

    public Car(String vehicleNumber, Integer seat, Integer speed, Integer weight, String color) {
        super( vehicleNumber, seat, speed, weight, color);
    }
}
