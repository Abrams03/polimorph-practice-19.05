package specs;

public class PassengerCar extends Vehicle{
    int countWheels = 4;

    public PassengerCar(String model, int speed, int fuel, boolean isDieselFuel) {
        super(model, speed, fuel, isDieselFuel);
        this.countWheels = countWheels;
    }
//////////////////////////////////////////////////////////
    void wheels() {
        System.out.println(countWheels);
    }

    public String toString(){
        return "��� �������� ���������� ������ " + getModel();
    }

    /*private void checkFuel() {
        if (getFuel() > 100 || getFuel() < 0) {
            return;
        }
        System.out.println("�����");
    }*/
    void GetModel() {
        System.out.println(getModel());
    }
    void drive() {
        if(getFuel() == 0) {
            System.out.println("��� ����");
            return;
        }else
        System.out.println("��������� ������");
    }
    void stop() {
        System.out.println("��������� �����������");
        System.out.println("....������.....");
    }

}





