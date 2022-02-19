package virtual_pet;

public class RoboticDog extends RoboticPet implements Walkable{



    public RoboticDog(String name, int age) {
        super(name, age);
    }


    @Override
    public void walk() {
        this.oilLevel -= 10;
        this.batteryLevel-=10;
        if(oilLevel < 0) {
            oilLevel = 0;
        }
        if(batteryLevel < 0) {
            batteryLevel = 0;

        }


    }
    @Override
    public String toString() {
        return  "RoboticDog: " + name  +
                ", batteryLevel=" + batteryLevel +
                ", oilLevelLevel=" + oilLevel +
                ", age=" + age +
                ", boredom=" + boredom +
                ", dead=" + dead ;
    }




}
