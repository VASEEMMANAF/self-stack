import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Vehicle c1=new car();
        Vehicle m1=new motorcycle();
        Vehicle v1=new van();
      c1.VehicleRent(100);
      c1.Vehicletype("BMW ");
       c1.display();
      m1.Vehicletype("ns" );
      m1.VehicleRent(50);
      m1.display();
    }
}