package models.entities;

import servers.Reservation;
import servers.Ride;

import java.util.Scanner;

public class Train extends Vehicle {
    public Train() {
    }

    public Train( String vehicleNumber, Integer seat, Integer speed, Integer weight, String color) {
        super( vehicleNumber, seat, speed, weight, color);
    }
}
