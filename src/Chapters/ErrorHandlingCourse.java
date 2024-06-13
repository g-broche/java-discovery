package Chapters;

import Courses.ErrorHandlingDemo;

public class ErrorHandlingCourse extends BaseCourseWrapper {
    public static void runCourse(){
        ErrorHandlingCourse.runCourseContent("testing errors", ErrorHandlingCourse::testErrors);
    }
    private static void testErrors(){
        //to trigger error, provide either no argument or non integer string
        ErrorHandlingDemo.calculateAverageTemperature("5", "10", "15");
    }
}
