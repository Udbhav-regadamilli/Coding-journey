class Solution {
public:
    int getCommon(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> temp;
        for(int i=0; i<nums1.size(); i++){
            temp.insert(nums1[i]);
        }
        for(int i=0; i<nums2.size(); i++){
            if(temp.find(nums2[i]) != temp.end()){
               return nums2[i]; 
            }
        }
        return -1;
    }
};