//Brute force approach -> merge sort or quick sort have O(nlogN) or any sorting algorithm buble,selec,inser havr O(n^2)
//Better approach  -> t.c->O(N), s.c->O(1)
//even the t.c is O(n) here we had 2 pass on arr one counting and other rewriting
// public class sortarraywith012{
//     public static void sortColors(int nums[]){
//         int count0=0,count1=0,count2=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0){
//                 count0++;
//             }else if(nums[i]==1){
//                 count1++;
//             }else{
//                 count2++;
//             }
//         }

//         int index = 0;
//         while(count0>0){
//             nums[index]=0;
//             index++;
//             count0--;
//         }

//         while(count1>0){
//             nums[index]=1;
//             index++;
//             count1--;
//         }

//         while(count2>0){
//             nums[index]=2;
//             index++;
//             count2--;
//         }
//     }
//     public static void main(String args[]){
//         int nums[]={0,1,2,0,1,2,1,2,0,0,0,1};

//         sortColors(nums);
//         for(int i=0;i<nums.length;i++){
//             System.out.print(nums[i]+" ");
//         }

//     }
// }

//here we had only one pass with constant space 
// public class sortarraywith012 { //t.c->O(n) , s.c->O(1)
//     public static void sortcolors(int nums[]){
//         int n = nums.length;
//         int low = 0,mid = 0,high = n-1;
//         while(mid<=high){
//             if(nums[mid]==0){
//                 int temp = nums[low];
//                 nums[low]=nums[mid];
//                 nums[mid]= temp;

//                 low++;
//                 mid++;
//             }else if(nums[mid]==1){
//                 mid++;
//             }else{
//                 int temp = nums[high];
//                 nums[high]=nums[mid];
//                 nums[mid]= temp;

//                 high--;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int nums[]={0,1,2,0,1,2,1,2,0,0,0,1};
//         sortcolors(nums);

//         System.out.print("Sorted Array: ");
//         for(int i=0;i<nums.length;i++){
//             System.out.print(nums[i]+" ");
//         }
//     }
// }
