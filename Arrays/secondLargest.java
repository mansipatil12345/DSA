//bruteforce approach  t.c -> O(nlogn) +O(n)
// import java.util.*;
// public class secondLargest{
//     public static int secondlargest(int arr[]){

//         //sort
//         Arrays.sort(arr);

//         int largest = arr[arr.length-1];
//         int slargest = Integer.MIN_VALUE;
//         for(int i=arr.length-2;i>=0;i--){
//             if(arr[i]!=largest){
//                 slargest = arr[i];
//                 break;
//             }
//         }
//         return slargest;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,4,7,7,5};
//         int ans = secondlargest(arr);
//         System.out.println(ans);
//     }
// }



//better approach t.c -> O(2N)
// public class secondLargest{
//     public static int secondLargest(int arr[]){
//         int largest = arr[0];
//         int slargest = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){ //O(n)
//             if(arr[i]>largest){
//                 largest=arr[i];
//             }
//         }

//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>slargest && arr[i]!=largest){ //O(n)
//                 slargest = arr[i];
//             }
//         }
//         return slargest;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,4,7,7,5};
//         int ans = secondLargest(arr);
//         System.out.println(ans);
//     }
// }


//optimal approach t.c -> O(n)  (similarly can be done for second smallest)
// public class secondLargest{
//     public static int secondlargest(int arr[]){
//         int largest = arr[0];
//         int slargest = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>largest){
//                 slargest = largest;
//                 largest = arr[i];
//             }else if(arr[i]<largest && arr[i]>slargest){
//                 slargest = arr[i];
//             }
//         }
//         return slargest;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,4,7,7,5};
//         int ans = secondlargest(arr);
//         System.out.println(ans);
//     }
// }

public class secondLargest{
    public static int secondLargest(int arr[]){
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
         int arr[]={1,2,4,7,7,5};
         System.out.println(secondLargest(arr));
    }
}