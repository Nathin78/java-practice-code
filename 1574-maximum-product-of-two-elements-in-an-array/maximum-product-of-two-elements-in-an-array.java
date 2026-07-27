class Solution {
    public int maxProduct(int[] nums) {
      int f=0;
      int l=0;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]>f)
        {
            l=f;
            f=nums[i];
        }
        else if(nums[i]>l)
        {
            l=nums[i];
        }
      }
        return (f-1)*(l-1);
    }
}