import java.util.*;
public class BubbleSort {
	void bubbleSort(int arr[]) { 
        int len = arr.length; 
        for (int t=0; t<len-1; t++) 
            for (int i=0; i<len-t-1; i++) 
                if (arr[i] > arr[i+1]) { 
                    int tmp = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = tmp; 
                } 
    } 
    void printArray(int arr[]) { 
        int len = arr.length; 
        for (int t=0; t<len; t++) 
            System.out.print(arr[t] + " "); 
        System.out.println(); 
    } 
    public static void main(String args[]) { 
        BubbleSort bs = new BubbleSort(); 
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++) {
        	arr[i] = sc.nextInt();
        }
        bs.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        bs.printArray(arr); 
    } 
}
