package specs;

public class FlyingCar extends Vehicle implements Flyable{
    public FlyingCar(String model, int speed, int fuel, boolean isDieselFuel) {
        super(model, speed, fuel, isDieselFuel);
    }
    //////////////////////////////////////////////////////////
    public String toString(){
        return "Ёто летающа€ машина модели " + getModel();
    }

    @Override
    public void fly() {

        System.out.println("¬ундер¬афл€ " + getModel() + " взлетела");
    }
    @Override
    public void landing() {

        System.out.println("¬ундер¬афл€ " + getModel() + " приземлилась");
    }

}