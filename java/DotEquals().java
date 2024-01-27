public class DotEquals() {
    public static void main(String[] args){
    String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
    String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
//First, print out whether line1 and line2 are the same
    System.out.println(line1.equals(line2));

//Now, print whether line2 and line3 are equal.
    System.out.print(line2.equals(line3));
  }       
}
