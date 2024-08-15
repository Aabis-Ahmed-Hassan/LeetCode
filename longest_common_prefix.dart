class Solution {
  String longestCommonPrefix(List<String> strs) {
String longestPrefix = "";

    int counter = 200;
    String myString = strs[0];
    for (int currentStringIndex = 0;
        currentStringIndex < strs.length - 1;
        currentStringIndex++) {
      if (myString.length < strs[currentStringIndex + 1].length) {
        counter = myString.length;
      } else {
        counter = strs[currentStringIndex + 1].length;
      }
      for (int charAtIndex = 0; charAtIndex < counter; charAtIndex++) {
        if (myString[charAtIndex] ==
            strs[currentStringIndex + 1][charAtIndex]) {
          longestPrefix += strs[currentStringIndex + 1][charAtIndex];
        }
      }
      myString = longestPrefix;
      longestPrefix = "";
    }
    longestPrefix = myString;
    return longestPrefix;
      }
}




/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/
