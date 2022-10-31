package models.entities.enums;

public enum Transport {
    Mashina("1457",4,260,150,"Red"),
    Avto("5474",5,360,250,"White"),
    Poezd("478",150,250,1000,"Green"),
    Train("857",50,360,700,"Silver"),
    Samolet("AirDubai",250,450,500,"White-Red"),
    AirPlane("AirMoscow",200,400,550,"Red");

    String vehicleNumber;
    Integer seat;
    Integer speed;
    Integer weight;
    String color;


    Transport(String vehicleNumber, int seat, int speed, int weight, String color) {
        this.vehicleNumber=vehicleNumber;
        this.seat=seat;
        this.speed=speed;
        this.weight=weight;
        this.color=color;
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
}
