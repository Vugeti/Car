import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
    private double fuelInTank;
    private double fuelConsumption;
    private String inspectionDate;

    public double getFuelInTank() {
        return fuelInTank;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getInspectionDate() {
        return inspectionDate;
    }


    public Car(double fuelInStock, double fuelConsumption, String inspectionDate) {
        this.fuelInTank = fuelInStock;
        this.fuelConsumption = fuelConsumption;
        this.inspectionDate = inspectionDate;
    }

    public boolean trafficCondition() {
        return fuelInTank != 0;
    }

    public boolean instDate() throws ParseException {
        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
        Date dateStr = f.parse(inspectionDate);
        String formattedDate = f.format(dateStr);
        Date date = new Date();
        long newDate = date.getTime() - dateStr.getTime();
        if (newDate / 1000 / 60 / 60 / 24 <= 730) {
            return true;
        } else return false;
    }

    public double canDrive() {
        return fuelInTank / fuelConsumption * 100;
    }
}