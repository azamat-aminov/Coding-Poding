class Solution {
    public boolean isPalindrome(String s) {
        
    String alphanumeric = s.replaceAll("[^a-zA-Z0-9]", "");
    String x = alphanumeric.toLowerCase();
    // System.out.println(x);
    StringBuilder builder = new StringBuilder(x);

    StringBuilder reverse = builder.reverse();
    String y = reverse.toString();
    // System.out.println(y);

   return y.contentEquals(x);
        
    }
}