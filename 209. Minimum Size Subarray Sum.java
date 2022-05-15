class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      
      //sliding Window
        int i=0;
        int sum=0;
        int ans=nums.length+1;
        for(int j=0;j<nums.length;j++)
        {
             sum+=nums[j];
            while(sum>=target)
            {
                if(ans>(j-i+1))
                {
                    ans=(j-i+1);
                }
                sum-=nums[i++];
            }
        }
        return ans==nums.length+1?0:ans;
            
            
        
    }
}
