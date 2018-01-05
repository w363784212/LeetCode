import java.util.*;

public class Main {

    public static void main(String[] args) {
        Solution solution=new Solution();
        int num[]={-1,0,1,2,-1,-4};
        System.out.println(solution.threeSum(num));
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> num=new ArrayList<>();
        for (int n:nums) num.add(n);
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                num.remove(j);num.remove(i);
                if(num.contains(-nums[i]-nums[j])){
                    List<Integer> sum=new ArrayList<>();
                    sum.add(nums[i]);
                    sum.add(nums[j]);
                    sum.add(-nums[i]-nums[j]);
                    Collections.sort(sum);
                    if(!list.contains(sum)) list.add(sum);
                }
                num.add(i,nums[i]);num.add(j,nums[j]);
            }
        }

        return list;
    }

}
