package Chapters;

import Courses.ArrayDemo;
import Courses.ListDemo;
import Courses.MapDemo;
import Courses.SetDemo;

public class ContainerCourse extends BaseCourseWrapper{
        public static void runCourse(){
        ContainerCourse.runCourseContent("testing arrays", ContainerCourse::testArrays);
        ContainerCourse.runCourseContent("testing lists", ContainerCourse::testLists);
        ContainerCourse.runCourseContent("testing sets", ContainerCourse::testSets);
        ContainerCourse.runCourseContent("testing maps", ContainerCourse::testMaps);
    }

    private static void testArrays(){
        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.fillArray();
        arrayDemo.printArray();
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
