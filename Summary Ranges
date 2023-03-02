# Java_Practice
Saved all the code related to java Practice
class Solution {
    public List<String> summaryRanges(int[] nums) {
     List<String> result= new ArrayList();
     int n = nums.length;
     if(n == 0) return result;
     int a = nums[0];

     for(int i = 0; i < n; i++){
         if( i == n-1 || nums[i]+1 != nums[i+1]){
             if(nums[i] != a){
                 result.add(a+ "->" + nums[i]);
             }
             else{ 
                 result.add(a + "");
                 }
            if(i !=n-1) a = nums[i+1]; 
             
         }
         
     }
     return result;

        
    }
}
// Input: nums = [0,1,2,4,5,7]
// Output: ["0->2","4->5","7"]
