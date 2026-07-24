class Solution {
    public boolean checkIfPangram(String s) {
      Set<Character> m=new HashSet<>();
      for(int i=0;i<s.length();i++)
      {
      m.add(s.charAt(i));
      }
        return m.size()==26;
    }
}