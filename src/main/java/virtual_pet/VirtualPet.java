package virtual_pet;

public abstract class VirtualPet {



    protected int age;
    protected String name;
    protected int boredom;
    protected boolean dead;


    public VirtualPet(String name, int age) {


        this.age = age;

        this.name = name;

        this.boredom = 0;
        this.dead = false;



    }

    public int getBoredom() {
        return boredom;
    }



    public int getAge() {
        return age;
    }



    public String getName() {
        return name;
    }

    public abstract void tick();

    public void play() {
        boredom -= 10;

        if(boredom < 0) {

            boredom =0;
        }
    }

    public boolean isDead() {
        return dead;
    }
    public void isAdopted(){
        return;
    }


}




