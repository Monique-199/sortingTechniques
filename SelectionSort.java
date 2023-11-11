/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author inven
 */
public class SelectionSort {
    void sort(int arr[]) 
    { 
        int size = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < size-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_elem = i; 
            for (int j = i+1; j < size; j++) 
                if (arr[j] < arr[min_elem]) 
                    min_elem = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_elem]; 
            arr[min_elem] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  
    // Display the array 
    void sortedArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
  
    // Driver code to test above 
    public static void main(String args[]) 
    { 
        SelectionSort selS = new SelectionSort(); 
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
        
        selS.sort(arr); 
        System.out.println("----Sorted array----"); 
        selS.sortedArray(arr); 
    } 
} 

    
    

