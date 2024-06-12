package Chapters;

import Courses.ArrayDemo;
import Courses.Instruction;
import Courses.ListDemo;
import Courses.MapDemo;
import Courses.SetDemo;

public class ContainerCourse extends BaseCourseWrapper{
        public static void runContainerRelatedCourse(){
        ContainerCourse.runCourse("testing instructions", ContainerCourse::testInstructions);
        ContainerCourse.runCourse("testing arrays", ContainerCourse::testArrays);
        ContainerCourse.runCourse("testing lists", ContainerCourse::testLists);
        ContainerCourse.runCourse("testing sets", ContainerCourse::testSets);
        ContainerCourse.runCourse("testing maps", ContainerCourse::testMaps);
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
        System.out.println(toPrint);

        mapDemo.removeUser(keyJohnDoe);
        mapDemo.printUserList();
    }


}
