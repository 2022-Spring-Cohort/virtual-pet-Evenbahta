package virtual_pet;


import java.util.Scanner;

public class VirtualPetApplication {

    Scanner inputScanner = new Scanner(System.in);



    public static void main(String[] args) {
        //Interact with a virtual_pet.VirtualPet object in this method
   new VirtualPetApplication().play();

    }
  public void play(){
        PetShelter myShelter = new PetShelter();
      System.out.println("Welcome to the game");
       myShelter.addPetToShelter(new VirtualPet("German","Brown",5,8,"Vicki",10,10));
       myShelter.addPetToShelter(new VirtualPet("british","Black",6,10,"Bobby",10,5));
       myShelter.addPetToShelter(new VirtualPet("irish","grey",10,11,"ruthie",11,5));
       myShelter.addPetToShelter(new VirtualPet("Italian","white",5,15,"Jackie",12,10));
    while(myShelter.allPetsNotDead()){
        displayStats(myShelter);
        System.out.println("What do you want to do with the pet?");
        System.out.println("1 feed");
        System.out.println("2 play");
        System.out.println("3 water");
        System.out.println("4 add pet");
        System.out.println("5 adopt pet");
        System.out.println("0 exit");
        int choice = inputScanner.nextInt();
        inputScanner.nextLine();
        if(choice == 1) {
            myShelter.feedAllPets();
        }
        else if (choice == 2){
             myShelter.playAllPets();
         }
        else if (choice == 3){
            myShelter.waterAllPets();
        }
        else if (choice == 4) {
            myShelter.addAllPets();
        }
        else if (choice == 5){
            System.out.println("Which Pet do you want to adopt?");
            myShelter.removePet(inputScanner.nextLine());
        }
        else {
            break;
        }
        myShelter.tickAllPets();
    }
  }
  public void displayStats(PetShelter shelter){
      System.out.println("****Stats*******************************************************");
        for(VirtualPet currentPet: shelter.getShelter()){
            System.out.println(currentPet.getName()+": Hunger "+ currentPet.getHunger()+ " thirst " + currentPet.getThirst()+ " boredom " + currentPet.getBoredom());
        }
      System.out.println("*******************************************************");
  }
}
