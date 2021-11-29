import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class CarTest {
    @Test
    void shouldCreateCar() {

        Car car = new Car(10, 3, "25.06.2020");

        double fuelInTank = car.getFuelInTank();
        double fuelCons = car.getFuelConsumption();
        String inspection = car.getInspectionDate();

        Assertions.assertEquals(fuelInTank, 10);
        Assertions.assertEquals(fuelCons, 3);
        Assertions.assertEquals(inspection, "25.06.2020");
    }

    @Test
    void testFuel0() {
        Car car = new Car(0, 3, "25.06.2020");
        Assertions.assertFalse(car.trafficCondition());
    }

    @Test
    void testFuel1() {
        Car car = new Car(1, 3, "25.06.2020");
        Assertions.assertTrue(car.trafficCondition());
    }

    @Test
    void testInspection3Y() throws ParseException {
        Car car = new Car(1, 3, "01.01.2018");
        Assertions.assertFalse(car.instDate());
    }

    @Test
    void testInspection1Y() throws ParseException {
        Car car = new Car(1, 3, "01.01.2021");
        Assertions.assertTrue(car.instDate());
    }

    @Test
    void testDistance() {
        Car car = new Car(50, 10, "25.06.2020");
        Assertions.assertEquals(car.canDrive(), 500);
    }
}

//тест: может ли ехать машина когда в баке 0  топлива?
//поедет ли машина если у нее будет полный бак?
//можно ли использовать машину по истечению 2х лет после ТО?
//можна использовать машину если прошло меньше 2х лет после ТО?
//дистанция совпадает с расходом?