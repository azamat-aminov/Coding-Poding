class Solution {
    public int strStr(String haystack, String needle) {
        
        int a = haystack.length();
        int b = needle.length();
       
        for(int i = 0; i < a - b + 1; i++){
            if (haystack.substring(i, i + b).contains(needle)){
                return i;
            }
        }
        return -1;
    }
}