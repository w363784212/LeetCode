import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println("MDCLXVI:"+solution.romanToInt("MDCLXVI"));
    }
}

class Solution {
    public int romanToInt(String s) {
        char a[]=s.toCharArray();
        int result=0;
        HashMap<Character,Integer> roman=new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        for(int i=0;i<a.length-1;i++){
            if(roman.get(a[i])<roman.get(a[i+1])){
                result-=roman.get(a[i]);
            }else result+=roman.get(a[i]);
        }
        result+=roman.get(a[a.length-1]);
        return result;
    }
}