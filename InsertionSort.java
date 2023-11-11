/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author inven
 */
public class InsertionSort {
      /*Function to sort array using insertion sort*/
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
  
            /* Moving elements that are greater than key*/
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
    } 
  
    /* Function to print array of size n*/
    static void sortedArray(int arr[]) 
    { 
        int n = arr.length; 
        System.out.println("----Sorted Array----"); 
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
  
        InsertionSort is = new InsertionSort();         
        is.sort(arr); 
          
        sortedArray(arr); 
    } 
}

    

