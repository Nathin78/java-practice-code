class Solution {
    public String reverseWords(String s) {
        String n[]=s.split("\\s+");
        StringBuilder d = new StringBuilder();
        for(int i=0;i<n.length;i++)
        {
        for(int j=n[i].length()-1;j>=0;j--)
        {
            d.append(n[i].charAt(j));
        }
            if(i!=n.length-1)
            {
                d.append(" ");
            }
        }
        return d.toString();
    }
}