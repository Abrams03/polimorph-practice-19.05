package specs;

public class Plane extends Vehicle implements Flyable{

    public Plane(String model, int speed, int fuel, boolean isDieselFuel) {
        super(model, speed, fuel, isDieselFuel);
    }
///////////////////////////////////////////////////////////////////
    public String toString(){
        return "��� ������ ������ " + getModel();
    }


    public void drive() {
        if(getFuel() == 0) {
            System.out.println("��� ����");
            return;
        }else
            System.out.println("������ " + getModel() + " ������");
    }
    public void stop() {
        System.out.println("������ " + getModel() + " �����������");
    }

    @Override
    public void fly() {
        System.out.println("������ " + getModel() + " �������");
    }

    @Override
    public void landing() {
        System.out.println("������ " + getModel() + " �����������");
    }
}