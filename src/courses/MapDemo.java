package courses;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    Map<String, Integer> userAgesMap = new HashMap<String, Integer>();

    public void addUsers(String userName, int age){
        this.userAgesMap.put(userName, age);
    }

    public Integer getUserInfo(String userName){
        if(!this.userAgesMap.containsKey(userName)){
            System.out.println("There are no user registered for the inputted key");
            return null;
        }
        int age = this.userAgesMap.get(userName);
        System.out.println("User "+userName+" is of age "+age);
        return age;
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
}
