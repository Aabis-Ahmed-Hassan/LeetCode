class Solution {
  int sumOfTheDigitsOfHarshadNumber(int x) {
    int sum = 0;
    int number = x;
    while (number != 0) {
      sum += number % 10;
      number = number ~/ 10;
    }

    if (x % sum == 0) {
      return sum;
    }

    return -1;
  }
}
/*
An integer divisible by the sum of its digits is said to be a Harshad number. You are given an integer x. Return the sum of the digits of x if x is a Harshad number, otherwise, return -1.

 

Example 1:

Input: x = 18

Output: 9

Explanation:

The sum of digits of x is 9. 18 is divisible by 9. So 18 is a Harshad number and the answer is 9.


*/
