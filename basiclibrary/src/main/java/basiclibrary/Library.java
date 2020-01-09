/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.HashSet;

public class Library {


    public static int[] roll(int inputNumber) {

        int[] roller = new int[inputNumber];

        for (int j = 0; j < inputNumber; j++) {
            int rollerCount = (int) (Math.random() * 6) + 1;
            roller[j] = rollerCount;
        }
        return roller;
    }

    public static boolean ContainsDuplicates(int[] newArray) {
        for (int k = 0; k < newArray.length; k++) {
            for (int j = k + 1; j < newArray.length; j++) {
                if (newArray[k] == (newArray[j])) {
                return true;
                }
            }

        }
        return false;
    }

    public static float averageCalc(int[] arrayData) {
        int sum = 0;
        float avg;
        for (int j = 0; j < arrayData.length; j++) {
            sum = sum + arrayData[j];
        }
        avg = (float) sum/(arrayData.length);
        return avg;
    }

    //couldn't figure out the last one. I will come back to it in the future.
    public static int doubleDownArrays(int[][] arrayOfDoubles) {
        int smallest = 100;
        for (int h = 0; h < arrayOfDoubles.length; h++) {
            int sum = 0;
            int mean;
            for (int f = 0; f < arrayOfDoubles[h].length; f++) {
                sum = sum + arrayOfDoubles[h][f];
            }
            mean = sum/(arrayOfDoubles[h].length);
            if (mean < smallest) {
                smallest = mean;
            }
        }
        return smallest;
    }

    //Temperature hash for lab 3
    //Multiple portions to follow

    public static String standardizeWeatherData(int[][] temperatures) {
        int tempHigh = temperatures[0][0];
        int tempLow = temperatures[0][0];

        HashSet<Integer> temps = new HashSet<>();

        for (int[] wMTemperature : temperatures) {
            for (int k : wMTemperature) {
                temps.add(k);

                if (k < tempLow) {
                    tempLow = k;
                }
                if (k > tempHigh) {
                    tempHigh = k;
                }
            }
        }
        String ticker = String.format("High: %d %nLow: %d", tempLow, tempHigh);

        // Now to reveal which temps are not in the data set
        for (int k = tempLow; k < tempHigh; k++) {
            if (!temps.contains(k)) {
                ticker += String.format("%nTemp wasn't reached: %d", k);
            }
        }
        return ticker;
    }
}

