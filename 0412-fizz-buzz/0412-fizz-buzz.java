class Solution {
    public List<String> fizzBuzz(int n) {
        
        List<String> list = new ArrayList<>();
        
        int i = 1;
        
        while(i <= n) {
            if(i % 3 == 0 && i % 5 == 0) {
                list.add(String.valueOf("FizzBuzz"));
            }else if(i % 3 == 0) {
                list.add(String.valueOf("Fizz"));
            }else if(i % 5 == 0) {
                list.add(String.valueOf("Buzz"));
            }else {
                list.add(String.valueOf(i));
            }
            i++;
        }
        return list;
    }
}