class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> n=new TreeSet<>();
        for(int m:nums1){
            n.add(m);
        }
        for(int m:nums2){
            if(n.contains(m)){
                return m;
            }
        }return -1;
    }
}