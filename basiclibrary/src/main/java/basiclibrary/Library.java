/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

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
    //

    public static String analyzeWeather(int[][] weatherArray){
        int low = weatherArray[0][0];
        int high = weatherArray[0][0];
        HashSet<Integer> varyingTemperatures = new HashSet<>();
        String answer = "";


        for (int i = 0; i < weatherArray.length; i++){
            for (int j = 0; j < weatherArray[i].length; j++){
                if (weatherArray[i][j] < low){
                    low = weatherArray[i][j];
                }
                if (weatherArray[i][j] > high){
                    high = weatherArray[i][j];
                }
                varyingTemperatures.add(weatherArray[i][j]);
            }
        }


        System.out.println("High: " + high);
        System.out.println("Low: " + low);


        for (int i = low + 1; i < high; i++){
            if (!varyingTemperatures.contains(i)){
                answer += "\nTemp never reached: " + i;
            }
        }
        return answer;
    }


    public static String tallyVotes(List<String> votes) {
        HashMap<String, Integer> votingMap = new HashMap<>();
        int votesSum = 0;
        String champ = "";


        for (String vote : votes){
            if (votingMap.containsKey(vote)){
                votingMap.put(vote, votingMap.get(vote) + 1);
            } else {
                votingMap.put(vote, 1);
            }
        }


        for (String key : votingMap.keySet()) {
            if (votesSum < votingMap.get(key)) {
                votesSum = votingMap.get(key);
                champ = key;
            }
        }


        System.out.println(champ + " got the most votes.");
        return champ;
    }

}

