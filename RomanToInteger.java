//LeetCode description for this program is written at the bottom. 

import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {

        char currentChar;
        int numberInIntegar=0;
        for(int i=0;i<s.length();i++) {
        currentChar = s.charAt(i);
        if(currentChar == 'M') { //1000

            if((i!=0) && s.charAt(i-1) == 'C' ) {

                numberInIntegar += 800;
            } //if End Bracket
        else {

            numberInIntegar += 1000;
        } //else End Bracket
        } //if End Bracket

        else if(currentChar == 'D') { //500 

            if((i!=0) && s.charAt(i-1)=='C') {
                numberInIntegar += 300;
            } //if End Bracket
            else {
                numberInIntegar += 500;
            } //else End Bracket

        } //else if End Bracket

        else if(currentChar == 'C') {

            if((i!=0) && s.charAt(i-1)=='X') {
                numberInIntegar += 80;
            } //if End Bracket
            else {
                numberInIntegar += 100;
            } //else End Bracket
        } //else if End Bracket

        else if(currentChar == 'L') {
            if((i!=0) && s.charAt(i-1)=='X') {
                numberInIntegar += 30;
            } //if End Bracket
            else {
                numberInIntegar += 50;
            } //else End Bracket
        } //else if End Bracket

        else if(currentChar == 'X') {

            if((i!=0) && s.charAt(i-1)=='I') {
                numberInIntegar += 8;
            } //if End Bracket
            else {
                numberInIntegar += 10;
            } //else End Bracket
        } //else if End Bracket
        else if(currentChar == 'V') {
            if((i!=0) && s.charAt(i-1) == 'I') {
                numberInIntegar += 3;
            } //if End Bracket
            else {
                numberInIntegar += 5;
            } //else End Bracket
        } //else if End Bracket

        else if(currentChar == 'I') {
            numberInIntegar += 1;
        } //else if End Bracket

        } //for loop End Bracket 
        return numberInIntegar;
    } //function romanToInt End Bracket
    public static void main(String[] args) {
         
        String input;
        System.out.print("Enter the Roman Number: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        int answer = romanToInt(input);
        System.out.println("After converting Roman Number to Integer, we get " + answer);
    } //main function End Bracket
} //RomanToInteger class End Bracket


// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.

 

// Example 1:

// Input: s = "III"
// Output: 3
// Explanation: III = 3.
// Example 2:

// Input: s = "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.
// Example 3:

// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

// Constraints:

// 1 <= s.length <= 15
// s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
// It is guaranteed that s is a valid roman numeral in the range [1, 3999].
