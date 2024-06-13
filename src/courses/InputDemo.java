package Courses;

import java.util.Scanner;

public class InputDemo {
    
    public static String requestUrl(){
        Scanner readInput = new Scanner(System.in);
        System.out.println("Please enter a valid URL");
		String url=readInput.nextLine(); 
		readInput.close();
		return url;
    }
}
