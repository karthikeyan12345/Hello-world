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

// to retur the largest contiguous subarray with equal 0 & 1.
/*
class Solution
{
	public static List<Integer> findLargestSubarray(List<Integer> nums)
	{
		List<Integer> largestSubarray = new ArrayList<>();
		
        int max=0;
        int sum=0;
        int left=0;
        int right=-1;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.size();i++)
        {
            sum+=(nums.get(i)==0)?-1:1;
            if(map.containsKey(sum))
            {
                if(max<(i-map.get(sum)))
                {
                	right=i;
                	left=map.get(sum)+1;
                    max=i-map.get(sum);
                }
            }
            map.putIfAbsent(sum,i);
        }
        for(int i=left;i<=right;i++)
        {
        	largestSubarray.add(nums.get(i));
        }
		return largestSubarray;
	}
}
*/
