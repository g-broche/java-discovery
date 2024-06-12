package Courses;

public class Instruction {
    public static void calculateResults(){
        int numberToDivide = 5;
        int divisor = 2;

        int integerResult = numberToDivide / divisor;
        double floatingPointResult = numberToDivide / divisor;
        double floatingPointResultWithTypeCasting = numberToDivide / (double) divisor;
    
        System.out.println("The result of "+numberToDivide+" divided by "+divisor+" as integer equals "+integerResult);
        System.out.println("The result of "+numberToDivide+" divided by "+divisor+" without type casting equals "+floatingPointResult);
        System.out.println("The result of "+numberToDivide+" divided by "+divisor+" with type casting equals "+floatingPointResultWithTypeCasting);
    }

    // Unless one of the term is declared or casted as a float/double, the result of the operation is an integer (like in an euclidean division)
    // that will then be assigned to the variable. 
}
