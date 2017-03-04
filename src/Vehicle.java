import java.util.Comparator;

/**
 * Created by brionsilva on 29/10/2016.
 */
public abstract class Vehicle{

    //instance variables
    public String vehicleType;
    public String idPlate;
    public String vehicleBrand;
    DateTime dateTime;

    public abstract String getVehicleType();

    public abstract void setVehicleType(String vehicleType);

    public abstract String getIdPlate();

    public abstract void setIdPlate(String idPlate);

    public abstract String getVehicleBrand();

    public abstract void setVehicleBrand(String vehicleBrand);

    public abstract DateTime getDateTime();

    public abstract void setDateTime(DateTime dateTime);

    @Override
    public String toString() {
        return dateTime.toString()+"/"+ getIdPlate() +"/"+ getVehicleBrand();
    }
}
