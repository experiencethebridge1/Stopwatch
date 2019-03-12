/**
 * Class Watch measures the execution time of sorting 100,000 numbers
 * using the selection sort
 */
package stopwatch;

public class Watch {

    //  Private data fields startTime and endTime with getter methods
    private long startTime = System.currentTimeMillis();
    private long endTime = startTime;

    /**
     * A no-arg constructor that initializes startTime and stopTime with the
     * current time.
     */
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // A method named start() that resets the startTime to the current time
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    /**
     * A method named getElapsedtime() that returns the elapsed time for the
     * stopwatch in milliseconds
     */
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
