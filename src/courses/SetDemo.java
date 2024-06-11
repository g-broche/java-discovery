package courses;

import java.util.HashSet;
import java.util.Set;

/**
 * Sets are used for collection in which the index and order is not a concern
 */
public class SetDemo {
    Set<String> flowers = new HashSet<String>();

    public void addFlowersToSet(String... flowerNames){
        for (String flowerName : flowerNames) {
            this.flowers.add(flowerName);
        }
    }

    public void removeFlowerFromSet(String flowerName){
        if(!this.flowers.contains(flowerName)){
            System.out.println("Error : The element "+flowerName+" does not exist inside the set");
            return;
        }
        boolean hasBeenRemoved = this.flowers.remove(flowerName);
        String toPrint = hasBeenRemoved ?
            "The element "+flowerName+" was removed from the set" : 
            "An error occured while attempting to remove the element from the set";
        System.out.println(toPrint);
    }

    public void printFlowerSet(){
        String toPrint = "";
        for (String flower : this.flowers) {
            toPrint += toPrint == "" ? flower : ", "+flower;
        }
        System.out.println(toPrint);
    }
}
