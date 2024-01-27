public class GreaterThanEqualTo {
    public static void main(String[] args){
    double recommendedWaterIntake = 8;
    double daysInChallenge = 30;
    double yourWaterIntake = 235.5;
    /*Create a double variable called totalRecommendedAmount and set it to the product of the recommended water intake (recommendedWaterIntake) and the amount of days in the challenge (daysInChallenge).*/
    double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
   /* Create a boolean variable called isChallengeComplete and set it to the result of checking if your intake, yourWaterIntake, is at least as much as the totalRecommendedAmount.*/
    boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
   /*Then, print the isChallengeComplete variable.*/
   System.out.println(isChallengeComplete);
  }       
}
