import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Solution solution=new Solution();
        String s="AB";
        System.out.println("The string is "+solution.convert(s,1));
    }
}

class Solution {
    public String convert(String s, int numRows) {
        if(numRows>1) {
            int increase = numRows - 1;
            int len = s.length();
            int j = 1, flag = 1;
            ArrayList<Character> arrayList = new ArrayList<>();
            ArrayList<Integer> row = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                arrayList.add(s.charAt(i));
                row.add(j);
                if (j == 1) flag = 1;
                if (j == numRows) flag = -1;
                j = j + flag;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i <= numRows; i++) {
                for (int k = 0; k < len; k++) {
                    if (row.get(k) == i) {
                        stringBuilder.append(arrayList.get(k));
                    }
                }
            }
            return stringBuilder.toString();
        }
        else return s;
    }
}