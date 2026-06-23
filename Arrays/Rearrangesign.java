
import java.util.ArrayList;

//this both app is for equal number of array especially the optimal one
// but for unequal one -> better approach

//Better app t.c->O(2N) that is 2 passes over array and O(N) for space complexity

// import java.util.ArrayList;

// public class Rearrangesign{
//     public static int[] rearrange(int nums[]){
//         ArrayList<Integer> pos = new ArrayList<>();
//         ArrayList<Integer> neg = new ArrayList<>();

//         for(int i=0;i<nums.length;i++){ //O(n)
//             if(nums[i]>0){
//                 pos.add(nums[i]);
//             }else{
//                 neg.add(nums[i]);
//             }
//         }
//         int index=0;
//         int ans[]=new int[nums.length]; 
//         for(int i=0;i<pos.size();i++){ //O(n/2)->O(n) by removing constant
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
// public class Rearrangesign {         //t.c is O(n) ,s.c is O(n)
//     public static int[] rearrange(int nums[]){
//         int ans[]=new int[nums.length];
//         int posIndex= 0 ,negIndex = 1; //array is used coz we actually know the exact size of array 
//         for(int i=0;i<nums.length;i++){  //O(n)
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


//unequal number of ele where no of pos != no of neg , where either pos el > neg el or neg el > pos el
//t.c is O(2N)  and s.c is (N)
// public class Rearrangesign{
//     public static int[] rearrange(int nums[]){
//         int n = nums.length;
//         ArrayList<Integer> pos = new ArrayList<>();
//         ArrayList<Integer> neg = new ArrayList<>();

//         for(int i=0;i<n;i++){
//             if(nums[i]<0){
//                 neg.add(nums[i]);
//             }else{
//                 pos.add(nums[i]);
//             }
//         }

//         //check
//         if(pos.size()>neg.size()){
//             for(int i=0;i<neg.size();i++){
//                 nums[2*i]=pos.get(i);
//                 nums[2*i+1]= neg.get(i);
//             }

//             int index = neg.size()*2;
//             for(int i=neg.size();i<pos.size();i++){
//                 nums[index]= pos.get(i);
//                 index++;
//             }
//         }
//         else{

//             for(int i=0;i<pos.size();i++){
//                 nums[2*i]=pos.get(i);
//                 nums[2*i+1]= neg.get(i);
//             }

//             int index = pos.size()*2;
//             for(int i=pos.size();i<neg.size();i++){
//                 nums[index]= neg.get(i);
//                 index++;
//             }
//         }
//         return nums;
//     }
//     public static void main(String[] args) {
//         int nums[]={-1,2,3,4,-3,1};
//         int result[] = rearrange(nums);
//         for(int i=0;i<result.length;i++){
//             System.out.print(result[i]+" ");
//         }
//     }
// }