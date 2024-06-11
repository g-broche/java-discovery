import courses.ArrayDemo;
import courses.Instruction;
import courses.ListDemo;
import courses.MapDemo;
import courses.SetDemo;

public class App {
    public static void main(String[] args) throws Exception {
        App.runCourse("testing instructions", App::testInstructions);
        App.runCourse("testing arrays", App::testArrays);
        App.runCourse("testing lists", App::testLists);
        App.runCourse("testing sets", App::testSets);
        App.runCourse("testing maps", App::testMaps);
    }

    private static void testInstructions(){
        System.out.println("testing instructions");
        Instruction.calculateResults();
        System.out.println();
    }

    private static void testArrays(){
        System.out.println("testing arrays");
        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.fillArray();
        arrayDemo.printArray();
        System.out.println();
    }

    private static void testLists(){
        ListDemo listDemo = new ListDemo();
        listDemo.addAnimalsToList("Clione", "Cat", "Bird");
        listDemo.printAnimalList();
        listDemo.addAnimalsToList("Fish");
        listDemo.printAnimalList();
        listDemo.switchAnimalOut(3, "Lizard");
        listDemo.printAnimalList();
        listDemo.removeAnimal(2);
        listDemo.printAnimalList();
    }

    private static void testSets(){
        SetDemo setDemo = new SetDemo();
        setDemo.addFlowersToSet("rose", "dandelion", "iris");
        setDemo.printFlowerSet();
        setDemo.addFlowersToSet("poppy");
        setDemo.printFlowerSet();
        setDemo.removeFlowerFromSet("dandelion");
        setDemo.printFlowerSet();
    }

    private static void testMaps(){
        MapDemo mapDemo = new MapDemo();
        final String keyJohnDoe = "John Doe";
        final String keyJaneDoe = "Jane Doe";
        final String keyPierreMichel = "Pierre Michel";

        String nonexistentKey = "Derp";

        mapDemo.addUsers(keyJohnDoe, 30);
        mapDemo.addUsers(keyJaneDoe, 27);
        mapDemo.addUsers(keyPierreMichel, 38);
        mapDemo.printUserList();
        String ageJaneDoe = StringifyIntegerForPrint(mapDemo.getUserInfo(keyJaneDoe));
        String nullResult = StringifyIntegerForPrint(mapDemo.getUserInfo(nonexistentKey));
        
        String toPrint = keyJaneDoe+": "+ageJaneDoe+"; "+nonexistentKey+": "+nullResult;
        System.out.print(toPrint);
    }

    /**
     * Wrapper method to make terminal print output clearer
     * @param title title of the topic
     * @param courseToExecute method to execute for the related topic
     */
    private static void runCourse(String title, Runnable courseToExecute){
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println();
        if(title != null){
            System.out.println("***** "+title+" *****");
            System.out.println();
        }
        courseToExecute.run();
    }

    /**
     * Used to return a string from an Integer class
     * @param value Integer to convert to string
     * @return value converter to string or "null" if value provided was null
     */
    private static String StringifyIntegerForPrint(Integer value){
        return value != null ? Integer.toString(value) : "null";
    }
}
