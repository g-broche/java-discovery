package Courses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
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

    /**
     * Establish a connection to a distance source
     * @param url url of the source to connect to
     * @return  established connection
     * @throws IOException
     */
    public static URLConnection connectFromURL(String url) throws IOException{
        URL mySite = URI.create(url).toURL();
		URLConnection myURLConnection = mySite.openConnection(); 
		myURLConnection.connect();
		return myURLConnection;
    }

    /**
     * Get content from a source
     * @param connectedConnection instance of URLConnection that has previously been connected
     * @return List of strings corresponding to the response sent by the source
     * @throws IOException
     */
    public static List<String> getContentFromApi(URLConnection connectedConnection) throws IOException{
        System.out.println("Retrieved a resource of type: " + connectedConnection.getContentType() + " from " + connectedConnection.getURL());
        List<String>lines=new ArrayList<String>();
		BufferedReader in = new BufferedReader(new InputStreamReader(connectedConnection.getInputStream()));
		String line;
		while ((line = in.readLine()) != null) {
			lines.add(line);
		}
		return lines;
    }
}
