package Chapters;
public class BaseCourseWrapper {
    /**
     * Wrapper method to make terminal print output clearer
     * @param title title of the topic
     * @param courseToExecute method to execute for the related topic
     */
    protected static void runCourse(String title, Runnable courseToExecute){
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
    protected static String StringifyIntegerForPrint(Integer value){
        return value != null ? Integer.toString(value) : "null";
    }
}
