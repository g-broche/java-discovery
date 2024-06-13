package Chapters;

import Courses.InputDemo;

public class InputCourse extends BaseCourseWrapper{
    public static void runCourse(){
        InputCourse.runCourseContent("testing inputs", InputCourse::testInputs);
    }
    private static void testInputs(){
        String validatedUrl = null;
        validatedUrl = InputDemo.requestUrl();
        System.out.println("entered url is : "+validatedUrl);
    }
}
