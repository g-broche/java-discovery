package Chapters;

import java.io.IOException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
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
        Scanner readInput = new Scanner(System.in);
        
        validatedUrl = InputCourse.requestUserForUrl(readInput);

        if(validatedUrl == null){
            System.out.println("The url request step process has been skipped");
            return;
        }
        
        List<String> responseContent =  InputCourse.getContentFromProvidedUrl(validatedUrl);
        InputCourse.printContent(responseContent);
        readInput.close();
    }

    /**
     * Request user for either a valid formated URL or an empty response
     * @param scanner instance of scanner to read user input
     * @return url compatible string or null if step is skipped
     */
    private static String requestUserForUrl(Scanner scanner){
        String urlStringToReturn = null;
        boolean isUrlValid = false;
        boolean isUrlSkipped = false;
        do {
            String inputedUrl = null;
            inputedUrl = InputDemo.requestUrl(scanner);
            if (InputDemo.isInputEmpty(inputedUrl)) {
                isUrlSkipped = true;
                break;
            }
            isUrlValid = InputDemo.isInputValidURLFormat(inputedUrl);
            if (isUrlValid) {
                urlStringToReturn = inputedUrl;
            }else{
                System.err.println("The URL selected does not have a valid format");
            }
        } while (!isUrlValid && !isUrlSkipped);
        return urlStringToReturn;
    }

    /**
     * Open a connection to the requested url and attempts to get content from it
     * @param url url formated String of the content's endpoint
     */
    private static List<String> getContentFromProvidedUrl(String url){
        List<String>content=new ArrayList<String>();
        try {
            URLConnection connection = InputDemo.connectFromURL(url);
            content = InputDemo.getContentFromApi(connection);
            return content;
        } catch (IOException e) {
            System.err.println("Can't establish connection - "+e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occured during the process of retrieving data from the network - "+e.getMessage());
        }
        return null;
    }

    private static void printContent(List<String> contentToPrint){
        if (contentToPrint == null) {
            System.out.println("there is no content to print");
            return;
        }
        System.out.println("content :");
        System.out.println(contentToPrint);
    }
}
