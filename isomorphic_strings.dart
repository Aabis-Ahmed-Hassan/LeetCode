class Solution {
  bool isIsomorphic(String s, String t) {
    Map<String, String> myMap = {};

    for (var i = 0; i < s.length; i++) {
      if (myMap.containsKey(s[i])) {
        if (!(myMap[s[i]] == t[i])) {
          return false;
        }
      } else {
        if (myMap.containsValue(t[i])) {
          return false;
        } else {
          myMap.addAll({s[i]: t[i]});
        }
      }
    }
    return true;
  }
}
