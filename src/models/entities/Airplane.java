package models.entities;

import servers.Reservation;
import servers.Ride;

import java.util.Scanner;

public class Airplane extends Vehicle {
    public Airplane() {
    }

    public Airplane( String vehicleNumber, Integer seat, Integer speed, Integer weight, String color) {
        super( vehicleNumber, seat, speed, weight, color);
    }


}
