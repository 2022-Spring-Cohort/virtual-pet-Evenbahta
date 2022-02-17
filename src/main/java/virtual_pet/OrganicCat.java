package virtual_pet;

public class OrganicCat extends OrganicPet implements Climb {

    int litterBoxSoilLevel;
    public OrganicCat(String name, int age) {
        super(name, age);
        this.litterBoxSoilLevel = 0;
    }

    @Override
    public void climb() {
        hunger++;
    }

    @Override
    public String toString() {
        return  "OrganicCat: " + name  +
                ", litterBoxSoilLevel=" + litterBoxSoilLevel +
                ", cleanLevel=" + cleanLevel +
                ", hunger=" + hunger +
                ", thirst=" + thirst +
                ", age=" + age +
                ", boredom=" + boredom +
                ", dead=" + dead ;
    }
}
