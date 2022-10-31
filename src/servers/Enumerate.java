package servers;

import models.entities.Airplane;
import models.entities.Car;
import models.entities.Train;

import java.util.ArrayList;

public interface Enumerate {
    Car transferCar(Car[] carList);

    Train transferTrain(Train[] trainList);

    Airplane transferAirplane(Airplane[] airplaneList);
}
