class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        ArrayList<Integer> list=new ArrayList<>();
        int length=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i+1]==nums[i]+1){
            length++;
            }
            else {
                list.add(length);
                length=1;
            }    
        }
        list.add(length);
        return Collections.max(list);
    }
}

// class Solution {
//     public int longestConsecutive(int[] nums) {
//         Set<Integer> set=new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             set.add(nums[i]);
//         }
//         int store=0;
//         for(int i=0;i<nums.length;i++){
//             if(!set.contains(nums[i]-1)){
//                 int count=1;
//                 while(set.contains(nums[i]+count)){
//                     count++;
//                 }
//                 store=Math.max(store,count);
//             } 
//         }
//         return store;
        
  

//     }
// }
