import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int num1[]={1,5,9,10};
        int num2[]={2,3,7};
        Solution solution=new Solution();
        int r=(int)solution.findMedianSortedArrays(num1,num2);
        System.out.print("Median is "+r);
    }
}


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int i=0,j=0;
        int m=nums1.length,n= nums2.length;
        while(i<m || j<n) {
            if(i<m && j<n) {
                if (nums1[i] < nums2[j]) {
                    arrayList.add(nums1[i]);
                    i++;
                } else {
                    arrayList.add(nums2[j]);
                    j++;
                }
            }
            if (i == m && j < n) {
                arrayList.add(nums2[j]);
                j++;
            }
            if (j == n && i < m) {
                arrayList.add(nums1[i]);
                i++;
            }
        }
        int len=arrayList.size();
        if(len%2==0) return ((double)(arrayList.get(len/2-1)+arrayList.get(len/2)))/2;
        else return arrayList.get(len/2);
    }
}
