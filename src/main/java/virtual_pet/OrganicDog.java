package virtual_pet;

public class OrganicDog extends OrganicPet implements Walkable {

    int cage = 0;
    public OrganicDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void walk() {
        hunger++;
        cage = 0;
    }
    @Override
    public void tick(){
        super.tick();
        cage++;
    }
    @Override
    public String toString() {
        return  "OrganicDog: " + name  +
                ", cage=" + cage +
                ", cleanLevel=" + cleanLevel +
                ", hunger=" + hunger +
                ", thirst=" + thirst +
                ", age=" + age +
                ", boredom=" + boredom +
                ", dead=" + dead ;
    }
}
