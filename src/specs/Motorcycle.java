package specs;

public class Motorcycle extends Vehicle {
    int countWheels = 2;

    public Motorcycle(String model, int speed, int fuel, boolean isDieselFuel) {
        super(model, speed, fuel, isDieselFuel);
        this.countWheels = countWheels;
    }
/////////////////////////////////////////////////////////////////
    void wheels() {
        System.out.println(countWheels);
    }


    void GetModel() {
        System.out.println(getModel());
    }
    public void drive() {
        if(getFuel() == 0) {
            System.out.println("��� ����");
            return;
        }else
        System.out.println("��������� ������");
        System.out.println("������ ��������� ����� ��������");
    }
    public void stop() {
        System.out.println("��������� �����������");
        System.out.println("....�����.....");
    }

}

