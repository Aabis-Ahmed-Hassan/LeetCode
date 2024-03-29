
class Solution {
  bool isPalindrome(int x) {
    String myString = x.toString();

int startingNumber = 0;
   int endingNumber = myString.length-1;


bool solution = false;


if(myString.length==1) {
solution = true;
}
else if(x<0) {
    solution = false;
}
else {
          while(startingNumber<endingNumber) {
          if(myString[startingNumber]==myString[endingNumber]) {
              solution = true;
          }
          else{
              solution = false;
            break;
          }
          startingNumber++;
          endingNumber--;
      }

}


return solution;

  }
}

/*
Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1
 */

