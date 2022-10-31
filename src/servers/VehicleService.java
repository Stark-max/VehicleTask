package servers;

import models.entities.Airplane;
import models.entities.Car;
import models.entities.Train;

import java.util.ArrayList;

public interface VehicleService {
    void transports(Car[] cars, Train[] trains, Airplane[] airplanes);
}
