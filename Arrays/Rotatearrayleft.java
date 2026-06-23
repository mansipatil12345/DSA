//rotate the array to left by one place 
// public class Rotatearrayleft {  //t.c->O(n) ,s.c->O(1) (extra space complexity is O(1)) but normal space used is O(n)
//     public static void leftrotatebyoneplace(int nums[]){
//         int temp = nums[0];
//         int n = nums.length;
//         for(int i=1;i<n;i++){
//             nums[i-1]=nums[i];
//         }
//         nums[n-1] = temp;
//     }
//     public static void main(String[] args) {
//         int nums[]={1,2,3,4};
//         leftrotatebyoneplace(nums);
//         for(int i=0;i<nums.length;i++){
//             System.out.print(nums[i]+" ");
//         }
//     }
// }


//rotate by k places
// import java.util.*;         t.c -> O(n+d) , s.c -> O(d)
// public class Rotatearrayleft{
//     public static void rotatearraybyKplaces(int nums[],int k){
//         ArrayList<Integer> temp = new ArrayList<>();
//         int n = nums.length;
//         for(int i=0;i<k;i++){
//             temp.add(nums[i]);
//         }

//         for(int i=k;i<n;i++){
//             nums[i-k] = nums[i];
//         }

//         for(int i=n-k;i<n;i++){
//             nums[i]=temp.get(i-(n-k));
//         }
//     }
//     public static void main(String args[]){
//         int nums[]={1,2,3,4,5,6,7};
//         int k =3;

//         rotatearraybyKplaces(nums, k);
//         for(int i=0;i<nums.length;i++){
//             System.out.print(nums[i]+" ");
//         }
//     }
// }

//optimal sol -> try for s.c-> O(1) ,t.c is O(2n) increased slightly but s.c is O(1)
//by observation
// public class Rotatearrayleft{
//     public static void reverse(int arr[],int start,int end){ 
//         while(start<=end){
//             int temp = arr[start];
//             arr[start]= arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }

//     public static void rotatearraybyKplaces(int nums[],int k){
//         int n = nums.length;
//         reverse(nums, 0, k-1); //O(k)
//         reverse(nums, k, n-1);      //O(n-d)
//         reverse(nums, 0, n-1);  //O(n)  total is O(2n)
//     }
//     public static void main(String[] args) {
//         int nums[]={1,2,3,4,5,6,7};
//         int k =3;
//         rotatearraybyKplaces(nums,k);
//         for(int i=0;i<nums.length;i++){
//             System.out.print(nums[i]+" ");
//         }
//     }
// }




