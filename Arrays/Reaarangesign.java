//Better app t.c->O(2N) that is 2 passes over array and O(N) for space complexity

// import java.util.ArrayList;

// public class Reaarangesign{
//     public static int[] rearrange(int nums[]){
//         ArrayList<Integer> pos = new ArrayList<>();
//         ArrayList<Integer> neg = new ArrayList<>();

//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>0){
//                 pos.add(nums[i]);
//             }else{
//                 neg.add(nums[i]);
//             }
//         }
//         int index=0;
//         int ans[]=new int[nums.length];
//         for(int i=0;i<pos.size();i++){
//             ans[index++]= pos.get(i);
//             ans[index++]= neg.get(i);
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int nums[]={3,1,-2,-5,2,-4};
//         int result[]=rearrange(nums);
//         for(int i=0;i<result.length;i++){
//             System.out.print(result[i]+" ");
//         }
//     }
// }



//optimized app
// public class Reaarangesign {         //t.c is O(n) ,s.c is O(n)
//     public static int[] rearrange(int nums[]){
//         int ans[]=new int[nums.length];
//         int posIndex= 0 ,negIndex = 1; //array is used coz we actually know the exact size of array 
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>0){
//                  ans[posIndex] = nums[i];
//                  posIndex+=2;
//             }
//             else{
//                 ans[negIndex] = nums[i];
//                 negIndex+=2;
//             }
//         }

//         return ans;
//     }
//     public static void main(String args[]){
//         int nums[]={3,1,-2,-5,2,-4};
//         int result[]=rearrange(nums);
//         for(int i=0;i<result.length;i++){
//             System.out.print(result[i]+" ");
//         }
//     }
// }

