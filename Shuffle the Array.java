# Java_Practice
Saved all the code related to java Practice
class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int ans[] = new int[nums.length];
        int i = 0,  j = n;
        int k = 0;
       while( k < nums.length){
            ans[k] =nums[i];
            k++;
            ans[k] = nums[j];
               i++;
               j++;
            
            
            k++;
        }
        return ans;
        
    }
}
// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7]
