package models;

import java.util.Random;
import java.util.Scanner;

public class Runner {
    private Car car;
    private Train train;
    private Airplane airplane;

    public void console(){
        transport();
        Scanner sc = new Scanner(System.in);
        if (car != null) {
            car.ride();
            System.out.println("1.Номер\n2.Место\n3.Новое колесо");
            switch (sc.nextInt()) {
                case 1:
                    car.transportNumber();
                    break;
                case 2:
                    car.seat();
                    break;
                case 3:
                    car.newWheel();
                    break;
            }
        } else if (train != null) {
            train.ride();
            System.out.println("1.Номер\n2.Место");
            switch (sc.nextInt()) {
                case 1:
                    train.transportNumber();
                    break;
                case 2:
                    train.seat();
                    break;
            }
        } else if (airplane != null) {
            airplane.ride();
            System.out.println("1.Номер\n2.Место");
            switch (sc.nextInt()) {
                case 1:
                    airplane.transportNumber();
                    break;
                case 2:
                    airplane.seat();
                    break;
            }
        }
    }

    public void transport() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Машина\n2.Поезд\n3.Самолет\nВыберите транспорт: ");
        switch (sc.nextInt()) {
            case 1:
                car = new Car();
                System.out.println("Введите номер машины: ");
                car.setVehicleNumber(sc.next());
                car.setSeat(5);
                car.seat();
                System.out.println("Введите скорость машины: ");
                car.setSpeed(sc.nextInt());
                break;
            case 2:
                train = new Train();
                System.out.println("Введите номер поезда: ");
                train.setVehicleNumber(sc.next());
                train.setSeat(100);
                train.seat();
                System.out.println("Введите скорость поезда: ");
                train.setSpeed(sc.nextInt());
                break;
            case 3:
                airplane = new Airplane();
                System.out.println("Введите название самолета: ");
                airplane.setVehicleNumber(sc.next());
                airplane.setSeat(80);
                airplane.seat();
                airplane.setSeat(sc.nextInt());
                System.out.println("Введите скорость самолета: ");
                airplane.setSpeed(sc.nextInt());
                break;
        }
    }
}
