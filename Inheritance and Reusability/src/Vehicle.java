import java.sql.SQLOutput;

public class Vehicle {

    String Vehicletype;
    int VehicleRent;
    void display(){
        System.out.println("Vehicle: "+Vehicletype+ "Rent: "+VehicleRent);
    }
    public String Vehicletype(String a){
        Vehicletype=a;
        return Vehicletype;
    }
    public int VehicleRent(int b){

        VehicleRent=b*30;
        return VehicleRent;
    }
}
class van extends Vehicle{

}
class car extends Vehicle{

}
class motorcycle extends Vehicle{

}