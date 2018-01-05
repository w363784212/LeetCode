public class Main {

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.isPalindrome(1));
    }
}


class Solution {
    public boolean isPalindrome(int x) {
        int len=0;
        long i=1;
        if(x<0) return false;
        else if(x<=9) return true;
        else{
            while(i<2147483647){
                if(x%i==x) break;
                else{
                    i=i*10;
                    len++;
                }
            }
            int p=(int)Math.pow(10,len-1),n=10;
            while((x%n-x%(n/10))/(n/10)==(x-x%p)/p){
                if(p==10*n||p==n) return true;
                n=n*10;
                x=x-p*(x/p);
                p=p/10;
            }
            return false;
        }
    }
}
