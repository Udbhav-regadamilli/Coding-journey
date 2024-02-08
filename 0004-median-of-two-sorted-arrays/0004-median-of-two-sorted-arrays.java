class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] temp = new int[m+n];
        int i=0, j=0, k=0;
        
        if(temp.length == 1 && m ==1){
            return nums1[0];
        }
        if(temp.length == 1 && n==1){
            return nums2[0];
        }
        
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                temp[k] = nums1[i];
                i++;
            }else{
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            temp[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n){
            temp[k] = nums2[j];
            j++;
            k++;
        }
        
        int mid = m+n;
        mid = mid/2;
        if(temp.length%2 == 0 && mid > 0){
            double ans = temp[mid] + temp[mid-1];
            ans = ans/2;
            return ans;
        }else{
            return temp[mid];
        }
    }
}