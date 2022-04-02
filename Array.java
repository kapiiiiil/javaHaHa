import java.util.*;

public class Main{
    public static void comp(int arr[],int a){
        int max = Integer.MAX_VALUE;  // Returns largest possible value in java..
        int min = Integer.MIN_VALUE;  // Returns smallest possibe value in java..

        for(int i=0;i<a;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
    }
    // Function for bubble sort..
    public static void sort(arr[],int a){
        int comp = 0 , swap = 0;
        int flag = 0;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                comp++;
                if(arr[j]>arr[j+1]){
                    swap++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    flag = 1;
                }
            }
            if(flag == 0)
            break;
        }
    }

    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the no of elements you want in array: ");
        int n = x.nextInt();
        System.out.print("Enter the elements: ");
        int arr[n] = new arr[n];
        for(int i=0;i<n;i++){
            arr[i] = x.nextInt();
        } 
        comp(arr[n],n);
        sort(arr[],n);
        System.out.print("The largest no in array is: "+max+" & smallest no is "+min);
        System.out.print("\nRequired sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("Enter the element you want to search: ");
        int y = x.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==y){
                System.out.print("The searched element is at position: "+i);
            }
        }
    }
}

