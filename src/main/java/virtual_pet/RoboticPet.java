package virtual_pet;

public class RoboticPet extends VirtualPet{
    protected int batteryLevel;
    protected int oilLevel;
    protected int hunger;
    protected int thirst;

    public RoboticPet(String name, int age) {
        super(name, age);
        this.batteryLevel = 100;
        this.oilLevel = 100;
    }



    public void batterCharge() {
        System.out.println("Thank you");
        batteryLevel += 10;
        if(batteryLevel > 100){
            batteryLevel = 100;
        }
        if(batteryLevel < 0){
            batteryLevel = 0;
        }

    }
    public void changeOil() {
        System.out.println("Thanks you for filling oil.");
        oilLevel += 10;
        if(oilLevel > 100){
            oilLevel = 0;
        }
    }

    @Override
    public void tick() {
        batteryLevel = batteryLevel - 10;
        oilLevel = oilLevel - 15;
    }


}

