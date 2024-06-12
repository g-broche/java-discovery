package Courses;

import java.util.ArrayList;
import java.util.List;

/**
 * Lists are used for collection that require a flexibility
 */
public class ListDemo {
    List<String> animalList = new ArrayList<String>();

    public void addAnimalsToList(String... animalNames){
        for (String animalName : animalNames) {
            this.animalList.add(animalName);
        }
    }

    public void printAnimalList(){
        String toPrint = "";
        for (String animal : this.animalList) {
            toPrint += toPrint == "" ? animal : ", "+animal;
        }
        System.out.println(toPrint);
    }

    public void switchAnimalOut(int index, String animalName){
        this.ThrowErrorIfIndexOutOfListBounds(index, this.animalList);
        String removedAnimal = this.animalList.set(index, animalName);
        System.out.println(removedAnimal+" has been removed from the list and replaced by "+animalName);
    }

    public void removeAnimal(int index){
        this.ThrowErrorIfIndexOutOfListBounds(index, this.animalList);
        String removedAnimal = this.animalList.remove(index);
        System.out.println(removedAnimal+" has been removed from the list");
    }

    private void ThrowErrorIfIndexOutOfListBounds(int index, List<String> list){
        if(index < 0 || index > list.size() - 1){
            throw new IndexOutOfBoundsException("index required for the operation is out of bounds of the associated list");
        }
    }
}
