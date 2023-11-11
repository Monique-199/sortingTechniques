/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author inven
 */
public class ShellSort {
    int sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // Start with a big gap, then reduce the gap 
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
            // Do a gapped insertion sort for this gap size. 
            // The first gap elements a[0..gap-1] are already 
            // in gapped order keep adding one more element 
            // until the entire array is gap sorted 
            for (int i = gap; i < n; i += 1) 
            { 
                // add a[i] to the elements that have been gap 
                // sorted save a[i] in temp and make a hole at 
                // position i 
                int temp = arr[i]; 
  
                // shift earlier gap-sorted elements up until 
                // the correct location for a[i] is found 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
  
                // put temp (the original a[i]) in its correct 
                // location 
                arr[j] = temp; 
            } 
        } 
        return 0; 
    }
    /* Function to display array of size n*/
    static void sortedArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    
    public static void main(String args[]) 
    { 
        Scanner scan = new Scanner(System.in);
        int total;
        
        System.out.println("Enter the total size of numbers to be sorted");
        total = scan.nextInt();
        
        int arr[] = new int[total];
        
        for(int i=0;i<total;i++)
        {
            System.out.println("Enter the "+(i+1)+" number");
            arr[i] = scan.nextInt();
        } 
        
        System.out.println("----Array before sorting----"); 
        sortedArray(arr); 
  
        ShellSort shellS = new ShellSort(); 
        shellS.sort(arr); 
  
        System.out.println("----Array after sorting----"); 
        sortedArray(arr); 
    } 
}  
    
    

