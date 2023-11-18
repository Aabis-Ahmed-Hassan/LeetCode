import java.util.Scanner;
class validParenthesis {
    public static boolean isValid(String s) {

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ) 
            {
                if(s.charAt(i) == '(' && s.charAt(i+1) == ')') 
                {
                
                } 
                else if(s.charAt(i)=='{' && s.charAt(i+1) == '}') 
                {

                }
                else if(s.charAt(i)=='[' && s.charAt(i+1) == ']') 
                {
                    
                }
                else 
                {
                    return false; //return from the function if alternate characters aren't pairs. 
                }
                i++; //i will be incremented with 2 in each iteration. It is because we've to compare every two characters of the string

        } //end of if statement
        else 
        {
            return false; //return from the function if input is invalid
        } //end of else statement
        } //end of for loop
    return true;

} //end of isValid function 
public static void main(String[] args) {

    String input;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the parenthesis: ");
    input = sc.nextLine();
    System.out.println(isValid(input));
    sc.close();

} //end of main function
} ///end of validParenthesis class


/*LeetCode Problem
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/