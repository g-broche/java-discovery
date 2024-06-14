package Chapters;

import Courses.RecursionDemo;

public class RecursionCourse extends BaseCourseWrapper{
    public static void runCourse(){
        RecursionCourse.runCourseContent("testing recursion", RecursionCourse::testRecursion);
    }
    
    private static void testRecursion(){
        int testNumber = 5;
        int result = 0;
        result = RecursionDemo.factorial(testNumber);
        System.out.println("Result of factorial of "+testNumber+" is: "+result);
    }
}
