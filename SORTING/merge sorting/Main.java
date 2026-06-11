import java.util.*;
public class Main {
    public static void mergesort(int[] arr, int left, int right){
        if(left < right){
            int mid = left + (right - left) / 2;
            mergesort(arr, left, mid);
            mergesort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right){
    ArrayList<Integer> temp = new ArrayList<>();
    int i = left, j = mid + 1;
    while(i <= mid && j <= right){
        if(arr[i] < arr[j]){
            temp.add(arr[i]);
            i++;
        }
        else{
            temp.add(arr[j]);
            j++;
        }
    }
    while(i <= mid){
        temp.add(arr[i]);
        i++;
    }
    while(j <= right){
        temp.add(arr[j]);
        j++;
    }
    for(int k = 0; k < temp.size(); k++){
        arr[left + k] = temp.get(k);
    }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();   
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Unsorted array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergesort(arr, 0, n - 1);
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}