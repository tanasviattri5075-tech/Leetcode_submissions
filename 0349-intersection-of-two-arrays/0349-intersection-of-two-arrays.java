class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     Set<Integer> S1 = new HashSet<>();
     Set<Integer> S2 = new HashSet<>(); 

     for(int num : nums1){
        S1.add(num);
     } 

      for(int num : nums2){
        S2.add(num);
     }
     
     //intersection
     int[] res = new int[S1.size()];
     int k =0;
     for(int num : S1) {
        if(S2.contains(num)) {
            res[k] = num;
            k = k+1;
        }
     }
     return Arrays.copyOfRange(res , 0 , k);
    }
}