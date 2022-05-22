import specs.*;

public class Main {


        public static void main(String[] args) {
            Vehicle passengerCar1 = new PassengerCar("Лада", 60, 20, true);
            Vehicle suv1 = new SUV("Hummer", 85, false, 50);
            Vehicle flyingCar1 = new FlyingCar("DeLorian", 350, 80, false);
            Vehicle plane1 = new Plane("CRJ200", 670, 95, false);


           Vehicle[] vehicles = {passengerCar1, suv1, flyingCar1, plane1};

            TransportSorter ts = new TransportSorter(vehicles);
            ts.print();
            ts.sort();
        }
}
