import models.Airplane;
import models.Car;
import models.Train;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("0185KG",5,60);
        Train train = new Train("5972",60,80);
        Airplane airplane = new Airplane("AirEarth",100,250);
        car.transportNumber();
        car.seat();
        car.ride();
        car.newWheel();
        train.transportNumber();
        train.seat();
        train.ride();
        airplane.transportNumber();
        airplane.seat();
        airplane.ride();
    }
}