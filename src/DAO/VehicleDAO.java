package DAO;

import controllers.Runner;
import models.entities.Airplane;
import models.entities.Car;
import models.entities.Train;
import models.entities.enums.Transport;

import java.util.ArrayList;

public class VehicleDAO {
    public Car[] cars = new Car[10];
    public Train[] trains = new Train[10];
    public Airplane[] airplanes = new Airplane[10];

    public void initializeCar(String[] vehicleNumber, int[] seat, int[] speed, int[] weight, String[] color) {
        for (int i = 0; i < color.length; i++) {
            Car car = new Car();
            car.setVehicleNumber(vehicleNumber[i]);
            car.setSeat(seat[i]);
            car.setSpeed(speed[i]);
            car.setWeight(weight[i]);
            car.setColor(color[i]);
            cars[i] = car;
        }
    }

    public void initializeTrain(String[] vehicleNumber, int[] seat, int[] speed, int[] weight, String[] color) {
        for (int i = 0; i < color.length; i++) {
            Train train = new Train();
            train.setVehicleNumber(vehicleNumber[i]);
            train.setSeat(seat[i]);
            train.setSpeed(speed[i]);
            train.setWeight(weight[i]);
            train.setColor(color[i]);
            trains[i] = train;
        }
    }

    public void initializeAirplane(String[] vehicleNumber, int[] seat, int[] speed, int[] weight, String[] color) {
        for (int i = 0; i < color.length; i++) {
            Airplane airplane = new Airplane();
            airplane.setVehicleNumber(vehicleNumber[i]);
            airplane.setSeat(seat[i]);
            airplane.setSpeed(speed[i]);
            airplane.setWeight(weight[i]);
            airplane.setColor(color[i]);
            airplanes[i] = airplane;
        }
    }


    public void display() {

        for (Car car : cars) {
            System.out.println("Номер машины: " + car.getVehicleNumber() + "\nПосадочные места: " + car.getSeat() + "\nМакс. скорость: " + car.getSpeed() + "\nВес машины: " + car.getWeight() + "\nЦвет машины: " + car.getColor());
            car.textIndent();
        }


        for (Train train : trains) {
            System.out.println("Номер поезда: " + train.getVehicleNumber() + "\nПосадочные места: " + train.getSeat() + "\nМакс. скорость: " + train.getSpeed() + "\nВес поезда: " + train.getWeight() + "\nЦвет поезда: " + train.getColor());
            train.textIndent();
        }


        for (Airplane airplane : airplanes) {
            System.out.println("Название самолета: " + airplane.getVehicleNumber() + "\nПосадочные места: " + airplane.getSeat() + "\nМакс. скорость: " + airplane.getSpeed() + "\nВес самолета: " + airplane.getWeight() + "\nЦвет самолета: " + airplane.getColor());
            airplane.textIndent();


        }
    }

    public void choose() {
        Runner runner = new Runner();
        runner.transports(cars, trains, airplanes);
    }
}
