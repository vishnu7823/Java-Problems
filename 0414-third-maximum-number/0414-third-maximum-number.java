class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int num: nums){
            set.add(num);
        }
        
        List<Integer> sortedlist = new ArrayList<>(set);
        Collections.sort(sortedlist , Collections.reverseOrder());
        
        if(sortedlist.size()>=3){
            return sortedlist.get(2);
        }
        else{
            return sortedlist.get(0);
        }
        
         
    }
}