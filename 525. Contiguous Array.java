class Solution {
    public int findMaxLength(int[] nums) {
        int max=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
      //to get subarray length if subarray begins from 0th index to i.
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=(nums[i]==0)?-1:1;
            if(map.containsKey(sum))
            {
                if(max<(i-map.get(sum)))
                {
                    max=i-map.get(sum);
                }
            }
            map.putIfAbsent(sum,i);
        }
            return max;
        
    }
}
