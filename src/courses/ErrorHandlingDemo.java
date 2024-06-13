package Courses;

import java.util.ArrayList;
import java.util.List;

public class ErrorHandlingDemo {
    public static void calculateAverageTemperature(String... temperaturesStrings){
        List<Integer> temperatureList = new ArrayList<Integer>();
        try {
            ErrorHandlingDemo.AddInputedTemperaturesToList(temperatureList, temperaturesStrings);
            Integer averageTemperature = ErrorHandlingDemo.calculateAverage(temperatureList);
            System.out.println(averageTemperature);
        } catch (NumberFormatException e) {
            System.out.println("All arguments should be provided as numbers");
			System.exit(-1);
		} catch (ArithmeticException e) {
			System.out.println("At least one temperature should be provided");
			System.exit(-1);
		}

    }

    private static void AddInputedTemperaturesToList(List<Integer> listToFill, String... temperaturesStrings){
        for( String temperatureAsString : temperaturesStrings){
            Integer temperatureAsInteger = Integer.parseInt(temperatureAsString);
            listToFill.add(temperatureAsInteger);
        }
    }

    private static int calculateAverage(List<Integer> inputedIntegers){
        int sum = 0;
        for (Integer value : inputedIntegers) {
            sum += value;
        }

        return sum / inputedIntegers.size();
    }
}
