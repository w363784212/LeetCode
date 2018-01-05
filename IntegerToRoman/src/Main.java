public class Main {

    public static void main(String[] args) {
        Solution solution=new Solution();
        String s=solution.intToRoman(1970);
        System.out.println("1970:"+s);
    }
}


class Solution {
    public String intToRoman(int num) {
        int a[]={num/1000,(num-num/1000*1000)/100,(num-num/100*100)/10,num%10};
        String b[]=new String[4];
        b[0]=intToRoman(a[0],3);
        b[1]=intToRoman(a[1],2);
        b[2]=intToRoman(a[2],1);
        b[3]=intToRoman(a[3],0);
        return b[0]+b[1]+b[2]+b[3];
    }


    public String intToRoman(int a,int n){
        String s1="",s2="",s3="",result="";
        switch (n){
            case 0:
                s1="I";s2="V";s3="X";
                break;
            case 1:
                s1="X";s2="L";s3="C";
                break;
            case 2:
                s1="C";s2="D";s3="M";
                break;
            case 3:
                s1="M";
        }
        if(a==0) result="";
        else if(1<=a && a<=3){
            StringBuffer s=new StringBuffer();
            for(int i=0;i<a;i++) s.append(s1);
            result=s.toString();
        }
        else if(a==4) result=s1+s2;
        else if(a>=5 && a<=8){
            StringBuffer s=new StringBuffer(s2);
            for(int i=5;i<a;i++) s.append(s1);
            result=s.toString();
        }
        else if(a==9) result=s1+s3;
        return result;
    }
}
