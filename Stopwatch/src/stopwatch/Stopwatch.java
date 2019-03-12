/**
 * Sean O'Brien
 * Program 9.6
 * CSC 206 Intermediate Programming (Spring 2019, Osborne)
 * "Stopwatch"
 * */
/**
 * Create a class named StopWatch.  The class contains:
 * Private data fields startTime and endTime with getter methods
 * A no-arg constructor that initializes startTime and stopTime with the
 * current time.
 * A method named start() that resets the startTime to the current time
 * A method named stop() that resets the stopTime to the current time
 * A method named getElapsedtime() that returns the elapsed time for the
 * stopwatch in milliseconds
 * Write a test program that measures the execution time of sorting 100,000
 * random floating point (double) numbers with bubble sort and output the
 * time in milliseconds.
 * */
package stopwatch;

import java.util.Scanner;

public class Stopwatch {

    public static void main(String[] args) {

        // Write a test program that measures the execution time of 
        // sorting 100,000, or other value.
        System.out.println("Please enter the number of random numbers to "
                + "be sorted.  Try '100000' to start:  ");

        // Create Scanner for different number sizes to be sorted
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        System.out.println();
        System.out.println("Please standby while I sort " + size
                + " numbers and then tell you how long that took.");
        System.out.println("I am using selection sort from page 272.");

        System.out.println();
        double[] list = new double[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = Math.random() * list.length;
        }

        // new constructor for Watch class
        Watch Watch = new Watch();
        selectionSort(list);
        Watch.stop();

        System.out.println("The sort time is " + Watch.getElapsedTime()
                + " milliseconds.");
    }

    /**
     * Selection sort method from page 272 text Repeatedly selects the smallest
     * number and swaps it with the first number in the list
     */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            /**
             * Find the minimum in the list ['element i' to 'element
             * list.length-1']
             */
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list [i] with list [currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
