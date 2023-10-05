class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int e : nums){
            map.merge(e, 1, Integer::sum);
        }
        
        
        List<Integer> result = new ArrayList<>();
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length / 3){
                result.add(entry.getKey());
            }
        } 
        
        return result;
    }
}