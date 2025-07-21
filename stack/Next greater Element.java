class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
 
     
     Stack<Integer>stack = new Stack<>();
     HashMap<Integer,Integer> map= new HashMap<>();


     for(int num :nums2){
        while(!stack.isEmpty() && stack.peek()<num){
            map.put(stack.pop(),num);
        }
        stack.push(num);
     }

     int[]res = new int[nums1.length];

     for(int i=0;i<nums1.length;i++){
      res[i]=  map.getOrDefault(nums1[i],-1);
     }

   return res;
    }
}
