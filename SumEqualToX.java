import java.util.Arrays;

class SumEqual {
    public static void main(String[] args) {
        int[] arr = {-4, -2, -1, 0, 3, 6, 7, 9};
        int X = 9;
        findPairsEqualtoX(arr, X);
    }

    public static void findPairsEqualtoX(int[] arr, int X) {
        if(arr.length < 2){
            return;
        }
        Arrays.sort(arr);
        System.out.println("The pair whose sum is equal to 9 : ");
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
          int sum = arr[left] + arr[right];
          if (sum == X) {
               System.out.println(arr[left] + " " + arr[right]);
            left++;
            right--;
          } else if(arr[left] + arr[right] < X){
               left++;
          } else{
               right--;
          }
        }
    }
}
