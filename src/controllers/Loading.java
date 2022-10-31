package controllers;

import DAO.VehicleDAO;
import models.entities.Airplane;
import models.entities.Car;
import models.entities.Train;

import java.util.ArrayList;

public class Loading {
    public void initialize(){
       /* ArrayList<Car> carArrayList = new ArrayList<>();
        ArrayList<Train> trainArrayList = new ArrayList<>();
        ArrayList<Airplane> airplaneArrayList = new ArrayList<>();*/
        VehicleDAO vehicleDAO = new VehicleDAO();
       /* Car car = new Car("1457",4,260,150,"Red");
        Car car2 = new Car("5474",5,250,250,"White");
        Train train = new Train("478",150,250,1000,"Green");
        Train train2 = new Train("875",100,360,700,"Silver");
        Airplane airplane = new Airplane("AirDubai",250,450,500,"White-Red");
        Airplane airplane2 = new Airplane("AirMoscow",200,400,400,"Red");
        carArrayList.add(car);
        carArrayList.add(car2);
        trainArrayList.add(train);
        trainArrayList.add(train2);
        airplaneArrayList.add(airplane);
        airplaneArrayList.add(airplane2);

        vehicleDAO.setCars(carArrayList);
        vehicleDAO.setTrains(trainArrayList);
        vehicleDAO.setAirplanes(airplaneArrayList);*/
        vehicleDAO.initializeCar(new String[]{"1457","5474"},new int[]{4,5}, new int[]{260,250},new int[]{150,250},new String[]{"Red","White"});
        vehicleDAO.initializeTrain(new String[]{"478","857"},new int[]{150,100},new int[]{250,360},new int[]{1000,700},new String[]{"Green","Silver"});
        vehicleDAO.initializeAirplane(new String[]{"AirDubai","AirMoscow"},new int[]{250,200},new int[]{450,400},new int[]{500,550},new String[]{"White-Red","Red"});
    }
}
