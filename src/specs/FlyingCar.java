package specs;

public class FlyingCar extends Vehicle implements Flyable{
    public FlyingCar(String model, int speed, int fuel, boolean isDieselFuel) {
        super(model, speed, fuel, isDieselFuel);
    }
    //////////////////////////////////////////////////////////
    public String toString(){
        return "��� �������� ������ ������ " + getModel();
    }

    @Override
    public void fly() {

        System.out.println("����������� " + getModel() + " ��������");
    }
    @Override
    public void landing() {

        System.out.println("����������� " + getModel() + " ������������");
    }

}