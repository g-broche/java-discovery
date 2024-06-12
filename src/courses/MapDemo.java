package Courses;

import java.util.HashMap;
import java.util.Map;

/*
 * Collections containing entries in the format key => value
 */
public class MapDemo {
    Map<String, Integer> userAgesMap = new HashMap<String, Integer>();

    public void addUsers(String userName, int age){
        this.userAgesMap.put(userName, age);
    }

    public Integer getUserInfo(String userName){
        if(!this.isUserInMap(userName)){
            return null;
        }
        int age = this.userAgesMap.get(userName);
        System.out.println("User "+userName+" is of age "+age);
        return age;
    }

    public void removeUser(String userName){
        if(!this.isUserInMap(userName)){
            return;
        }
        if(this.userAgesMap.remove(userName) != null){
            System.out.println("User named "+userName+" has been removed.");
        };
    }

    public void printUserList(){
        String toPrint = "";
        for (Map.Entry<String, Integer> entry : this.userAgesMap.entrySet()) {
            String user = entry.getKey();
            Integer age = entry.getValue();
            toPrint += toPrint == "" ? user+": "+Integer.toString(age) : "; "+user+": "+Integer.toString(age);
        }
        System.out.println(toPrint);
    }

    private boolean isUserInMap(String userName){
        boolean isPresent = this.userAgesMap.containsKey(userName);
        if(!isPresent){System.out.println("There are no user registered for the inputted key");}
        return isPresent;
    }
}
