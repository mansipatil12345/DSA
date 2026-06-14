// public class arraySortedRotated{ //t.c -> O(n)
//     public static boolean check(int nums[]){
//         int count = 0;
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             if(nums[i]>nums[(i+1)%n]){
//                 count++;
//             }
//         }
//         return count<=1;
//     }
//     public static void main(String[] args) {
//         int nums[]={3,4,5,1,2};
//         if(check(nums)){
//             System.out.println("Array is sorted and rotated.");
//         }else{
//             System.out.println("Array  is not sorted and rotated.");
//         }
//     }
// }


public class arraySortedRotated{
    public static boolean check(int num[]){
        int count =0;
        int n = num.length;
        for(int i=0;i<num.length;i++){
            if(num[i]>num[(i+1)%n]){
                count++;
            }
        }

        return count<=1;
    }
    public static void main(String[] args) {
        int num[]={3,4,5,1,2};
        System.out.println(check(num));
    }
}