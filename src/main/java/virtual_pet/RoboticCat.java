package virtual_pet;

public class RoboticCat extends RoboticPet implements Climb{


    public RoboticCat( String name, int age) {
        super(name, age);
    }

    @Override
    public void climb() {

    }
    @Override
    public String toString() {
        return  "RoboticCat: " + name  +
                ", batteryLevel=" + batteryLevel +
                ", oilLevelLevel=" + oilLevel +
                ", age=" + age +
                ", boredom=" + boredom +
                ", dead=" + dead ;
    }

}



