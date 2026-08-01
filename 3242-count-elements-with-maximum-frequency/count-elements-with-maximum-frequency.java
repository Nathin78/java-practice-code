class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count=0;
        int max=0;
       HashMap<Integer,Integer>n=new HashMap<>();
       for(int i:nums)
       {
        n.put(i,n.getOrDefault(i,0)+1);
       }
       for(var entry:n.entrySet())
       {
        max=Math.max(max,entry.getValue());
       }
       for(var entry:n.entrySet())
       {
        if(entry.getValue()==max)
        {
            count+=entry.getValue();
        }
       }
        return count;
    }
}