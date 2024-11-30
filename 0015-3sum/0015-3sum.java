class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
       
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        
        for (int i = 0; i < nums.length - 2; i++) {
            // Avoid duplicates for the first number
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int l = i + 1, r = nums.length - 1;
                int t = 0 - nums[i]; // Target value for two pointers

                while (l < r) {
                    if (nums[l] + nums[r] == t) {
                        
                    result.add(Arrays.asList(nums[i], nums[l],nums[r]));

                      
                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;

                        
                        r--;
                    } else if (nums[l] + nums[r] < t) {
                        l++; 
                    } else {
                        r--; 
                    }
                }
            }
        }

        return result;
    }
}

    