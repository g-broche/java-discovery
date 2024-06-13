package Courses;

import java.util.Arrays;

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

    public static void testLoops(){
        int[] ForbiddenValues = new int[2];
        ForbiddenValues[0] = 3;
        ForbiddenValues[1] = 5;
        int breakCondition = 7;
        String toPrint = "Allowed values in loop: ";
        boolean isFirstAddition = true;

        for(int i=0; i<10; i++){
            final int CurrentIteration  = i;
            if(breakCondition == CurrentIteration){
                break;
            }
            if(Arrays.stream(ForbiddenValues).anyMatch(value -> value == CurrentIteration)){
                continue;
            }
            toPrint += isFirstAddition ? Integer.toString(CurrentIteration) : ", "+Integer.toString(CurrentIteration);
            isFirstAddition = false;
        }
        System.out.println(toPrint);
    }
}
