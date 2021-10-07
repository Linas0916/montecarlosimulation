package com.example.java;

import java.util.Arrays;

public class Main {

    public static double getMonteCarlosimulationresult(int numTrials){

        double count =0.0;
        double result = 0.0;


        for (int t = 0; t < numTrials; t++){
            result++;

            int [] allNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70};

            int [] myNumbers = {1,10,16,53,70};

            int [] luckyNumbers = new int [5];

            for (int k = 0; k < luckyNumbers.length; k++){
                int index = (int) (Math.random() * allNumbers.length);

                luckyNumbers[k] = allNumbers[index];

                int [] newallNumbers = new int [allNumbers.length-1];

                int j = 0;

                for (int i = 0; i< allNumbers.length; i++){
                    if (i==index){
                        continue;
                    }
                    newallNumbers[j] = allNumbers [i];
                    j++;
                }
                allNumbers = newallNumbers;
            }

            Arrays.sort(luckyNumbers);

            if (Arrays.equals(myNumbers, luckyNumbers)) {
                count++;
            }

        }
        double additionaltwonumbersprobability = getMonteCarlosimulationforadditionaltwonumbers(numTrials);

        return count/result*additionaltwonumbersprobability;

    }
    public static double getMonteCarlosimulationforadditionaltwonumbers(int numTrials){

        double count =0.0;
        double result = 0.0;


        for (int t = 0; t < numTrials; t++){
            result++;

            int [] allNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};

            int [] myNumbers = {10};

            int [] luckyNumbers = new int [1];

            for (int k = 0; k < luckyNumbers.length; k++){
                int index = (int) (Math.random() * allNumbers.length);

                luckyNumbers[k] = allNumbers[index];

                int [] newallNumbers = new int [allNumbers.length-1];

                int j = 0;

                for (int i = 0; i< allNumbers.length; i++){
                    if (i==index){
                        continue;
                    }
                    newallNumbers[j] = allNumbers [i];
                    j++;
                }
                allNumbers = newallNumbers;
            }

            Arrays.sort(luckyNumbers);

            if (Arrays.equals(myNumbers, luckyNumbers)) {
                count++;
            }

        }

        return count/result;

    }

    public static void main(String[] args) {

        System.out.format("%.10f%n",getMonteCarlosimulationresult(10000000));

    }

}
