public class Main {

    public static void main(String[] args) {
        Solution solution=new Solution();
        String s="gdf3rdffxzgxdfgsr3sfsdfqe12eqweqweqwadzfuishixdizkdfksdfsfdfaasdasvcxcvx";
        String result=solution.longestPalindrome(s);
        System.out.println("s is "+result);
    }
}


class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<len;i++){
            s1.append(s.charAt(len-1-i));
        }
        int r=0;
        String s2="";
        for(int i=len;i>0;i--){
            for(int j=0;j<len-i+1;j++){
                if(s.substring(j,j+i).equals(s1.substring(len-j-i,len-j))){
                    s2=s.substring(j,j+i);
                    r=1;
                    break;
                }
            }
            if(r==1) break;
        }
        return s2;

    }
}