package virtual_pet;


import java.util.Scanner;

public class VirtualPetApplication {

    Scanner inputScanner = new Scanner(System.in);



    public static void main(String[] args) {
        //Interact with a virtual_pet.VirtualPet object in this method
   new VirtualPetApplication().play();

    }
  public void play(){
      System.out.println("Welcome to the game");
       VirtualPet dog = new VirtualPet("German","Brown",5,8,"Vicki",10,10);

    while(dog.getHunger()<20){
        System.out.println("Hunger "+ dog.getHunger()+ " thirst " + dog.getThirst()+ " boredom " + dog.getBoredom());
        System.out.println("What do you want to do with the pet?");
        System.out.println("1 feed");
        System.out.println("2 play");
        System.out.println("3 water");
        System.out.println("0 exit");
        int choice = inputScanner.nextInt();
        if(choice == 1) {
            dog.feed();
        }
        else if (choice == 2){
             dog.play();
         }
        else if (choice == 3){
            dog.water();
        }
        else {
            break;
        }
        dog.tick();
    }
  }
}
