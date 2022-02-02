package virtual_pet;

public class VirtualPet {


    private String breed;
    private String furColor;
    private int age;
    private int hunger;
    private String name;
    private int thirst;
    private int boredom;
    private boolean dead;

    public VirtualPet(String breed, String furColor, int age, int hunger, String name, int thirst, int boredom) {
        this.breed = breed;
        this.furColor = furColor;
        this.age = age;
        this.hunger = hunger;
        this.name = name;
        this.thirst = thirst;
        this.boredom = boredom;
        this.dead = false;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public String getBreed() {
        return breed;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }

    public int getHunger() {
        return hunger;
    }

    public String getName() {
        return name;
    }

    public void tick() {
        hunger++;
        thirst++;
        boredom++;
        if(hunger > 20 || thirst>20 ||boredom > 20){
            dead = true;
        }
    }

    public void feed() {
        hunger -= 5;
    }

    public void play() {
        boredom -= 10;
    }

    public void water() {
        thirst -= 15;
    }

    public boolean isDead() {
        return dead;
    }
    public void isAdopted(){
        return;
    }
}




