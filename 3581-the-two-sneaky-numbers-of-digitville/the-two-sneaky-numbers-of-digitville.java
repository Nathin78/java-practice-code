class Solution {
    public int[] getSneakyNumbers(int[] nums) {
         int arr[]=new int[2];
         int ind=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    arr[ind++]=nums[i];
                }
            }
        }
        return arr;
        // // Arrays.sort(n);
        // int ind=0;
        // HashMap<Integer,Integer>n=new HashMap<>();
        // for(int i:nums)
        // {
        //     n.put(i,n.getOrDefault(i,0)+1);
        // }
        // for(var entry:n.entrySet())
        // {
        //     if(entry.getValue()==2)
        //     {
        //        arr[ind++]= entry.getKey();
        //     }
        // }
        // return arr;
    }
}