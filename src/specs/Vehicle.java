package specs;

abstract public class Vehicle {
    private String model;
    private int speed;
    private int fuel;
    private boolean isDieselFuel;
////////////////////////////////////////////////////////////////
    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDieselFuel() {
        return isDieselFuel;
    }

    public int getFuel() {
        return fuel;
    }
//////////////////////////////////////////////////////////////////


    public Vehicle(String model, int speed, int fuel, boolean isDieselFuel) {
        this.model = model;
        this.speed = speed;
        this.fuel = fuel;
        this.isDieselFuel = isDieselFuel;

    }

    ////////////////////////////////////////////////////////
    private void checkFuel() {
        if (fuel > 100 || fuel < 0) {
            return;
        }
        System.out.println("?????");
    }
    void GetModel() {
        System.out.println(model);
    }
   void drive() {
       fuel -=10;
       if(fuel <0) {
           System.out.println("??? ????");
           return;
       }else
       System.out.println("????????? ??????");
   }
   void stop() {

        System.out.println("????????? ???????????");
   }

    void refuel() {
        while(fuel < 100 && fuel >= 0){
            fuel++;
        }
    }

}
