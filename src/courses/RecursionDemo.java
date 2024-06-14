package Courses;

public class RecursionDemo {
    /**
     * Calculate the factorial of a number
     * @param number
     * @return return result if the provided number is higher than 0 or null otherwise.
     */
    public static Integer factorial(int number){
        if (number <= 0){
            System.out.println("The use of factorial require an integer superior to 0");
            return null;
        }
        if (number == 1){
            return 1;
        }
        return number * factorial(number - 1);
    }
}