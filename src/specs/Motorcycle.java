package specs;

public class Motorcycle extends Vehicle {
    int countWheels = 2;

    public Motorcycle(String model, int speed, int fuel, boolean isDieselFuel) {
        super(model, speed, fuel, isDieselFuel);
    }
/////////////////////////////////////////////////////////////////
    void wheels() {
        System.out.println(countWheels);
    }

    public String toString(){
        return "Это мотоцикл модели " + getModel();
    }


    void GetModel() {
        System.out.println(getModel());
    }
    public void drive() {
        if(getFuel() == 0) {
            System.out.println("Бак пуст");
            return;
        }else
        System.out.println("Транспорт поехал");
        System.out.println("Удобно проезжаем между машинами");
    }
    public void stop() {
        System.out.println("Транспорт остановился");
        System.out.println("....Круто.....");
    }

}

