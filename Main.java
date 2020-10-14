/**
 * method to count numbers of 1's
 * 
 * @author Darian
 */
public class Main {
  public static int countOnes(int number) {
    // declare count variable to keep count of 1's
    int count = 0;
    // keep repeating loop until number becomes 0
    while (number > 0 || number < 0) {
      // digit stores the remainder
      int digit = (number % 10);
      // this checks if that digit is equal to 1
      if (digit == 1 || digit == -1) {
        // if it is, add one to the count and remove that digit from the number
        count++;

      }
      // divide the number by 10 to remove the last digit
      number /= 10;

    }

    // when the loop is finished, it will return the final count
    return count;
  }

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // declare a variable to store the method so it can be printed to screen
    int amountOfOnes = countOnes(9911831);
    System.out.println(amountOfOnes);

  }
}
