import courses.ArrayDemo;
import courses.Instruction;
import courses.ListDemo;

public class App {
    public static void main(String[] args) throws Exception {
        App.runCourse("testing instructions", App::testInstructions);
        App.runCourse("testing arrays", App::testArrays);
        App.runCourse("testing lists", App::testLists);
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
}
