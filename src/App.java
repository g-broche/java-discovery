import Chapters.ContainerCourse;
import Chapters.ErrorHandlingCourse;
import Chapters.InputCourse;
import Chapters.InstructionCourse;
import Chapters.RecursionCourse;

public class App {
    /**
     * Entry point of the application, use "javac App.java" to compile the java files into binaries to then start the app with potential parameters
     * using "java App.java <optional parameters>"
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        App.salute(args);
        App.runCourses();
    }

    private static void runCourses(){
        InstructionCourse.runCourse();
        ContainerCourse.runCourse();
        ErrorHandlingCourse.runCourse();
        InputCourse.runCourse();
        RecursionCourse.runCourse();
    }

    private static void salute(String[] args){
        System.out.println();
        System.out.println("**********");
        String toPrint = "";
        if (args.length == 0) {
            toPrint = "Hello guest !";
        }else{
            for (String arg : args) {
                toPrint += toPrint == "" ? "Hello "+arg : ", "+arg;
            }
        }
        System.out.println(toPrint);
        System.out.println("**********");
    }
}
