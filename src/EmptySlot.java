/**
 * Created by brionsilva on 29/10/2016.
 */
public class EmptySlot extends Vehicle{
    private String availability;

    public EmptySlot(String availability){
        this.availability = availability;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return availability;
    }

    @Override
    public String getVehicleType() {
        return null;
    }

    @Override
    public void setVehicleType(String vehicleType) {

    }

    //implementing the abstract methods in the vehicle class
    public String getIdPlate() {return idPlate;}

    public void setIdPlate(String idPlate) {
        this.idPlate = idPlate;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }
}
