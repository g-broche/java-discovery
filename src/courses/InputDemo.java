package Courses;

import java.net.URI;
import java.util.Scanner;

public class InputDemo {
    /**
     * Request a string input compatible with a URL format
     * @param scanner scanner instance to read the submitted input
     * @return string submitted through command line
     */
    public static String requestUrl(Scanner scanner){
        System.out.println("Please enter a valid URL or nothing to skip");
		String url=scanner.nextLine(); 
		return url;
    }
    /**
     * Checks if an inputed string is an empty string
     * @param inputedUrl
     * @return true if input is an empty string, otherwise false
     */
    public static boolean isInputEmpty(String inputedUrl){
        return inputedUrl == "";
    }
    /**
     * Attempts to convert the inputed string into an URL to check if the format is valid
     * @param inputedUrl string to compare to an URL format for validation
     * @return true if format is correct, otherwise false
     */
    public static boolean isInputValidURLFormat(String inputedUrl){
        try {
            URI.create(inputedUrl).toURL();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
