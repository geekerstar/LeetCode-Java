给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。

示例 1:

输入: "aba"
输出: True
示例 2:

输入: "abca"
输出: True
解释: 你可以删除c字符。
注意:

字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。

```java
class Solution {
    public boolean validPalindrome(String s) {
        int i = -1,j = s.length();
        while(++i < --j){
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s,i,j-1) || isPalindrome(s,i+1,j);
            }
        }
        return true;
    }
    
    private boolean isPalindrome(String s,int i,int j){
        while(i < j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
```