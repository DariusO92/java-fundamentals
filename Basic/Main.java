import java.util.Random;



PUBLIC CLASS Main{
  public static void main(Strings args){
    int carCount = 2;
    System.out.println("I own " + carCount + "" + pluralize("car", carCount) + ".");

    int catCount = 1;
    System.out.println("I own" + catCount + "" + pluralize("cat", catCount) + ".");

    int birdCount = 0; 
    System.out.println("I own" + birdCount + "" + pluralize("bird", birdCount)+ ".");
  }

  public static String pluralize(String item, int countNum){
    if (countNum == 0 || countNum > 1){
      return item + "s";
    } else {
      return item;
    }
  }
 
 public static void filpNHeades(int heads){
   
 }
}