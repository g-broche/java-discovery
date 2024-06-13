package Chapters;

import java.util.Scanner;

import Courses.InputDemo;

public class InputCourse extends BaseCourseWrapper{
    public static void runCourse(){
        InputCourse.runCourseContent("testing inputs", InputCourse::testInputs);
    }
    /**
     * Request user for an URL string input in terminal, in case of non valid inputed string the request is made again but
     * it can be skipped by submitting an empty input
     */
    private static void testInputs(){
        String validatedUrl = null;
        boolean isUrlValid = false;
        boolean isUrlSkipped = false;
        Scanner readInput = new Scanner(System.in);
        do {
            String inputedUrl = null;
            inputedUrl = InputDemo.requestUrl(readInput);
            if (InputDemo.isInputEmpty(inputedUrl)) {
                isUrlSkipped = true;
                break;
            }
            isUrlValid = InputDemo.isInputValidURLFormat(inputedUrl);
            if (isUrlValid) {
                validatedUrl = inputedUrl;
            }else{
                System.err.println("The URL selected does not have a valid format");
            }
        } while (!isUrlValid && !isUrlSkipped);
        InputCourse.handleRequestResult(validatedUrl, isUrlValid, isUrlSkipped);
        readInput.close();
    }

    /**
     * Handle the result final result of the submitted url request, should only trigger if valid or skipped request
     * @param url requested url that has previously been validated
     * @param isUrlValid 
     * @param isUrlSkipped
     */
    private static void handleRequestResult(String url, boolean isUrlValid ,boolean isUrlSkipped){
        if (isUrlSkipped) {
            System.out.println("The url request step process has been skipped");
            return;
        }
        if (isUrlValid){
            System.out.println("Entered url is : "+url);
            return;
        }
        System.err.println("An unknown error occured while processing the input");
    }
}
