import java.util.*;
public class NewSort {
	void Insertionsort(int arr[]) { 
        int len = arr.length; 
        for (int t=1; t<len; t++) { 
            int k = arr[t]; 
            int j = t-1; 
            while (j>=0 && arr[j] > k) { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = k; 
        } 
    } 
    static void printArray(int arr[]) { 
        int len = arr.length; 
        for (int i = 0; i < len; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	int len = sc.nextInt();
        int arr[] = new int[len]; 
        for(int i=0;i<len;i++) {
        	arr[i] = sc.nextInt();
        }
        NewSort ns = new NewSort(); 
        ns.Insertionsort(arr); 
        printArray(arr); 
    } 
}
