class Solution {
    public boolean checkIfPangram(String s) {
      Set<Character> m=new HashSet<>();
      for(int i=0;i<s.length();i++)
      {
      m.add(s.charAt(i));
      }
      int n=m.size();
      if(n!=26)
      {
        return false;
      }
        return true;
    }
}