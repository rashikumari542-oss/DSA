import java.util.*;
class sorting{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i= 0; i<n-1 ;i++){
            int min_index = i;
            for (int j= i+1; j<n; j++){
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }
        System.out.println("sorted array:");
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");

        }
        sc. close();

    }
}
