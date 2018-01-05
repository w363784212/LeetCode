public class Main {

    public static void main(String[] args) {
        String str[]={"a"};
        System.out.println(Solution.longestCommonPrefix(str));
    }
}

class Solution {
    static public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        else if(strs.length>1) {
            int len = strs[0].length(), maxprefix = 0;
            for (int i = 0; i < strs.length; i++) {
                len = Math.min(len, strs[i].length());
            }
            for (int i = len; i > 0; i--) {
                for (int j = 0; j < strs.length - 1; j++) {
                    if (!strs[j].substring(0, i).equals(strs[j + 1].substring(0, i))) break;
                    if (j == strs.length - 2) maxprefix = Math.max(maxprefix, i);
                }
            }
            return strs[0].substring(0, maxprefix);
        }
        else return "";
    }
}