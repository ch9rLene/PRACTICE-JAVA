public class FinalKeyword {
	public static void main(String[] args) { 
    //Create an unchangeable double variable called pi and set its value to 3.14.
      final double pi = 3.14;
    //Print the value of pi.
      System.out.print(pi);
 //On a new line, try to change the value of pi.
     // double pi = 3.15;
     //output: error: cannot assign a value to final double pi
		
	}
}