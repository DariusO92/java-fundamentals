import java.util.Random;


public class Main {
    public static void main(String[] args){
        int carCount = 2;
        System.out.println("I own " + carCount + " " + pluralize("car", carCount) + ".");

        int catCount = 1;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int birdCount = 0;
        System.out.println("I own " + birdCount + " " + pluralize("bird", birdCount)+ ".");

        filpNHeads(1);
    }

    public static String pluralize(String item, int countNum){
        if (countNum == 0 || countNum > 1){
            return item + "s";
        } else {
            return item;
        }
    }

    public static void filpNHeads(int n){
        int count = 0;
        int headsCount =0;
        int headsInRow[] = new int[n];

        while(headsCount < headsInRow.length){
            double randomRoll = Math.random();
            if (randomRoll < 0.5){
                System.out.println("tails");
            } else {
                System.out.println("heads");
                headsInRow[headsCount++] = 1;
            }
            count++;
        }
        System.out.println("It took " + count + " flips to flip " + n + " heads in a row.");

    }

    public static void clock(){


    }
}


