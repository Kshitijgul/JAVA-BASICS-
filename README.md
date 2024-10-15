# JAVA-BASICS- WITH DSA STRIVER 
# Java Program to Count Digits of a Number

This Java program demonstrates two methods to count the digits of a number:

1. **Using Logarithms (`Log_count`)**: This method calculates the number of digits by applying the logarithm base 10 (`log10`) function. This approach is efficient for large numbers.

2. **Using Iteration (`count_digits`)**: This method counts the digits by iterating through the number, repeatedly dividing by 10 until the number becomes zero.

## Program Explanation

### Methods

1. **`Log_count(int n)`**:
    - Uses the `Math.log10()` function to find the logarithm base 10 of the absolute value of the number.
    - The number of digits is calculated as `floor(log10(n)) + 1`.
    - Handles the special case when `n = 0` by returning 1 directly, as 0 has exactly 1 digit.

2. **`count_digits(int n)`**:
    - This method works by using a loop to extract the last digit of the number using the modulus operation (`n % 10`).
    - It increments the digit count on each iteration and divides the number by 10 to remove the last digit.

### Code

```java
import java.lang.Math;

class HelloWorld {
  
  // Method to count digits using logarithm
  public static int Log_count(int n) {
    if (n == 0) {
        return 1; // Special case for 0
    }
    return (int) Math.floor(Math.log10(Math.abs(n))) + 1;
  }

  // Method to count digits using iteration
  public static int count_digits(int n){
      int count = 0;
      while(n != 0){
          int last_digit = n % 10;
          count += 1;
          n = n / 10;
      }
      return count;
  }

  // Main method to test both digit counting methods
  public static void main(String[] args) {
      int n = 8977;  // Example number to test
      System.out.println(count_digits(n));    // Output: 4
      System.out.println(Log_count(n));       // Output: 4
  }
}










