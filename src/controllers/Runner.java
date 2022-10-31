package controllers;

import DAO.VehicleDAO;
import models.entities.Airplane;
import models.entities.Car;
import models.entities.Train;
import servers.Enumerate;
import servers.VehicleService;

import java.util.Scanner;

public class Runner implements VehicleService, Enumerate {
    private Car car;
    private Train train;
    private Airplane airplane;


    public void console() {
        Loading loading = new Loading();
        loading.initialize();
        VehicleDAO vehicleDAO = new VehicleDAO();
        vehicleDAO. display();
        vehicleDAO.choose();
    }

    @Override
    public void transports(Car[] cars, Train[] trains, Airplane[] airplanes) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Машина\n2.Поезд\n3.Самолет\nВыберите транспорт: ");
        switch (sc.nextInt()) {
            case 1:
                setCar(transferCar(cars));
                break;
            case 2:
                setTrain(transferTrain(trains));
                break;
            case 3:
                setAirplane(transferAirplane(airplanes));
                break;
        }
    }

    @Override
    public Car transferCar(Car[] carList) {
        Scanner sc = new Scanner(System.in);
        int v = 0;
        if (carList != null) {
            for (Car c : carList) {
                System.out.println("Номер машины: " + c.getVehicleNumber() + "\nПосадочные места: " + c.getSeat() + "\nМакс. скорость: " + c.getSpeed() + "\nВес машины: " + c.getWeight() + "\nЦвет машины: " + c.getColor());
                c.textIndent();
            }
        } else {
            System.out.println("Машин нету");
        }
        System.out.println("Выберите машину ->");
        switch (sc.nextInt()) {
            case 1:
                return carList[0];
            case 2:
                return carList[1];
        }
        return null;
    }

    @Override
    public Train transferTrain(Train[] trainList) {
        Scanner sc = new Scanner(System.in);
        int v = 0;
        if (trainList != null) {
            for (Train t : trainList) {
                System.out.println("Номер поезда: " + t.getVehicleNumber() + "\nПосадочные места: " + t.getSeat() + "\nМакс. скорость: " + t.getSpeed() + "\nВес поезда: " + t.getWeight() + "\nЦвет поезда: " + t.getColor());
                t.textIndent();
            }
        } else {
            System.out.println("Поездов нету");
        }
        System.out.println("Выберите поезд ->");
        switch (sc.nextInt()) {
            case 1:
                return  trainList[0];
            case 2:
                return  trainList[1];
        }
        return null;
    }

    @Override
    public Airplane transferAirplane(Airplane[] airplaneList) {
        Scanner sc = new Scanner(System.in);
        int v = 0;
        if (airplaneList != null) {
            for (Airplane a : airplaneList) {
                System.out.println("Название самолета: " + a.getVehicleNumber() + "\nПосадочные места: " + a.getSeat() + "\nМакс. скорость: " + a.getSpeed() + "\nВес самолета: " + a.getWeight() + "\nЦвет самолета: " + a.getColor());
                a.textIndent();
            }
        } else {
            System.out.println("Самолетов нету");
        }
        System.out.println("Выберите самолет ->");
        switch (sc.nextInt()) {
            case 1:
                return  airplaneList[0];
            case 2:
                return  airplaneList[1];
        }
        return null;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
}
