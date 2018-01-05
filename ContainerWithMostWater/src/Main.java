import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] a={1,3,4,2,3};
        System.out.println("Max Area:"+solution.maxArea(a));
    }
}


class Solution {
    public int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                max=Math.max(max,Math.min(height[i],height[j])*(j-i));
            }
        }
        return max;
    }
}
