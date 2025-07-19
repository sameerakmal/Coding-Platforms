class Solution {
    public int[] twoSum(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] ans = new int[2]; 
        for(int i = arr.length-1; i >= 0; i--){
            int target = k - arr[i];
            if(hm.containsKey(target)){
                ans[0] = hm.get(target);
                ans[1] = i;
                break;
            }
            else{
                hm.put(arr[i], i);
            }
        }
        return ans;
    }
}