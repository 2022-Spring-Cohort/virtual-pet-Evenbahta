package virtual_pet;

import java.util.ArrayList;

public class PetShelter {

    private ArrayList<VirtualPet> shelter;


    public PetShelter() {
        shelter = new ArrayList<>();
    }
    public void addPetToShelter(VirtualPet pet){
        shelter.add(pet);
    }

    public ArrayList<VirtualPet> getShelter() {
        return shelter;
    }
    public boolean allPetsNotDead(){
        for (VirtualPet currentPet:shelter) {
            if(currentPet.isDead()){
                return false;
            }
        }
        return true;
    }
    public void feedAllPets(){
        for (VirtualPet currentPet:shelter) {
            //currentPet.feed();
        }
    }
    public void tickAllPets(){
        for (VirtualPet currentPet:shelter) {
            currentPet.tick();
        }
    }
    public void playAllPets(){
        for (VirtualPet currentPet:shelter){
            currentPet.play();
        }
    }
    public void waterAllPets(){
        for (VirtualPet currentPet:shelter){
            //currentPet.water();
        }
    }
    public void addAllPets(){
        for (VirtualPet currentPet:shelter){
            addPetToShelter(currentPet);
        }
    }
    public void removePet(String forAdoption){
        VirtualPet foundPet = null;
        for (VirtualPet currentPet:shelter){
            if(forAdoption.equals(currentPet.getName())){
                foundPet = currentPet;
            }
        }
        if(foundPet!= null){
            shelter.remove(foundPet);
        }

    }
    public void walkAllPets(){
        for (VirtualPet currentPet:shelter){
            if(currentPet instanceof Walkable){
                ((Walkable)currentPet).walk();
            }

        }
    }
    public void cleanAllPets(){
        for (VirtualPet currentPet:shelter){
            if(currentPet instanceof OrganicPet){
                ((OrganicPet)currentPet).wash();
            }

        }
    }
    public void maintainAllPets(){
        for (VirtualPet currentPet:shelter){
            if(currentPet instanceof RoboticPet){
                ((RoboticPet)currentPet).batterCharge();
            }

        }
    }


}
