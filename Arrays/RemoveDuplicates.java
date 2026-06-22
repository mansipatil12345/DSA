//brute force approach using set 
// import java.util.*;
// public class RemoveDuplicates{
//     public static int removeDuplicates(int nums[]){
//             HashSet<Integer> set = new HashSet<>();
//             int index = 0;
//             for(int i=0;i<nums.length;i++){
//                 if(!set.contains(nums[i])){
//                     set.add(nums[i]);
//                     nums[index] = nums[i];
//                     index++;
//                 }
//             }
//         return index;
//     }
//     public static void main(String[] args) {
//         int nums[]={0,0,1,1,1,2,2,3,3,4};
//         int k = removeDuplicates(nums);
//         System.out.println("Unique elements are: "+ k);
//     }
// }




// public class RemoveDuplicates { //t.c -> O(N) and s.c ->O(N)
//     public static int removeDuplicates(int nums[]){
//         int i=0;
//         for(int j=1;j<nums.length;j++){
//             if(nums[i]!=nums[j]){
//                 nums[i+1]=nums[j];
//                 i++;
//             }
//         }

//         return (i+1);
//     }
//     public static void main(String args[]){
//         int nums[]={0,0,1,1,1,2,2,3,3,4};
//         int k = removeDuplicates(nums);
//         System.out.println("Unique elements are: "+ k);
//     }
// }
