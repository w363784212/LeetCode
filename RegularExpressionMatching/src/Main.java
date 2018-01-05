import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Solution solution=new Solution();
        if(solution.isMatch("sss","s*")) System.out.println("Match Success");
        else System.out.println("Match Fail");
    }
}


class Solution {
    public boolean isMatch(String s, String p) {
        ArrayList<Character> s1=new ArrayList<>();
        ArrayList<Character> s2=new ArrayList<>();
        for(int i=0;i<s.length();i++) s1.add(s.charAt(i));
        for(int i=0;i<p.length();i++) s2.add(p.charAt(i));
        while(s2.indexOf('*')>0){
            if(s2.get(s2.indexOf('*')-1)=='.'){
                
            }
        }return false;
    }
}
