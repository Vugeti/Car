import java.text.ParseException;

public class main {
    public static void main(String[] args) throws ParseException {
        Car car = new Car(10,1,"10.11.2021");
        System.out.println("может завестись? -> "+car.trafficCondition());
        System.out.println("может проехать км: "+car.canDrive());
        System.out.println("не прострочено ТО? ->"+car.instDate());

        /*Date a = new Date();
        System.out.println(a);*/


        /*String inspectionDate = "19.05.2019";*/
        /*SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
        Date dateStr = f.parse(car.getInspectionDate());
        String formattedDate = f.format(dateStr);
        System.out.println("dd.MM.yyyy date is ==>"+formattedDate);
        Date date = new Date();
        long newDate = date.getTime()-dateStr.getTime();
        System.out.println(newDate/1000/60/60/24);*/
    }
}
