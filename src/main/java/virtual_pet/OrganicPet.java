package virtual_pet;


public abstract class OrganicPet extends VirtualPet {

    protected int cleanLevel;
    protected int hunger;
    protected int thirst;

    public OrganicPet(String name, int age) {
        super(name, age);
        this.cleanLevel = 0;
        this.hunger = 0;
        this.thirst = 0;
    }


    public void wash() {
        System.out.println("Thanks for the shower");

        cleanLevel -= 10;
        if (cleanLevel <= 0) {
            cleanLevel = 0;
        }
        if (cleanLevel >= 50) {
            cleanLevel = 50;
        }
    }

    @Override

    public void tick() {

        hunger++;
        thirst++;
        boredom++;
        if (hunger > 20 || thirst > 20 || boredom > 20) {
            dead = true;
        }

        cleanLevel = cleanLevel - 10;
    }


    public int getThirst() {
        return thirst;
    }

    public void feed() {
        hunger -= 5;
    }

    public void water() {
        thirst -= 15;
    }
}
