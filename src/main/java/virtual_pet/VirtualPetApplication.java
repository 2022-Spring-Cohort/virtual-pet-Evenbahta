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
       myShelter.addPetToShelter(new RoboticCat("RoboFred",4));
       myShelter.addPetToShelter(new RoboticDog("RoboBob",8));
       myShelter.addPetToShelter(new OrganicCat("Eritrean",5));
       myShelter.addPetToShelter(new OrganicDog("Rwanda",7));
    while(myShelter.allPetsNotDead()){
        displayStats(myShelter);
        System.out.println("What do you want to do with the pets?");
        System.out.println("1 feed all");
        System.out.println("2 play all");
        System.out.println("3 water all");
        System.out.println("4 add pet");
        System.out.println("5 adopt pet");
        System.out.println("6 walk pet");
        System.out.println("7 clean pet");
        System.out.println("8 maintenance");
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
        else if (choice == 6) {
            myShelter.walkAllPets();
        }
        else if (choice == 7) {
            myShelter.cleanAllPets();
        }
        else if (choice == 8) {
            myShelter.maintainAllPets();
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
            System.out.println(currentPet.toString());
        }
      System.out.println("*******************************************************");
  }

}

