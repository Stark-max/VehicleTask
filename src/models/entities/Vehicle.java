package models.entities;

public abstract class Vehicle {
    private String vehicleNumber;
    private Integer seat;
    private Integer speed;
    private Integer weight;
    private String color;

    public Vehicle() {
    }

    public Vehicle(String vehicleNumber, Integer seat, Integer speed, Integer weight, String color) {
        this.vehicleNumber = vehicleNumber;
        this.seat = seat;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }


    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void textIndent(){
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - ");
    }
}
