
import java.util.Random;
import java.util.Scanner;

public class two {

    public static void main(String[] args) {

        int dataPoints[] = new int[100];
        int count = 0;
        int index = 0;
        int min, max;
        Random rand = new Random();
        Scanner pipe = new Scanner(System.in);
        double sum = 0;
        double average = 0;


        for (int i = 0; i < 100; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Values in dataPoints......");
        for (int i = 0; i < 99; i++) {
            System.out.print(dataPoints[i] + " | ");
        }

        int searchNumber = TeachersSafeInput.SafeInput.getRangedInt(pipe, "Enter number", 1, 100);


        for (int i = 0; i < 100; i++) {
            if (searchNumber == dataPoints[i])
                count++;
        }
        System.out.println("Count of " + searchNumber + " in array: " + count + " ");
        searchNumber = TeachersSafeInput.SafeInput.getRangedInt(pipe, "Enter an Integer", 1, 100);
        int i;
//finding the first index where value occurs
        for (i = 0; i < 100; i++) {
            if (searchNumber == dataPoints[i]) {
                index = i;
                break;
            }
        }
        if (i < 100)
            System.out.println("The value " + searchNumber + " was found at array index " + index);
        else {
            System.out.println("Value " + searchNumber + " not found in array");
        }
        System.out.println(" ");

//finding the minimum and maximum values

        min = dataPoints[0];
        max = dataPoints[0];
        for (i = 1; i < 100; i++) {
            if (min > dataPoints[i])
                min = dataPoints[i];
            if (max < dataPoints[i])
                max = dataPoints[i];
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average of datapoints is: " + getAverage(dataPoints));
    }

    private static double getAverage(int[] dataPoints) {
        double sum = 0;
        double average = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            sum = sum + dataPoints[i];
        }
        average = sum / dataPoints.length;
        System.out.println("");
        return average;
    }
}