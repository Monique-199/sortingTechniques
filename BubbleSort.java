/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author inven
 */
public class BubbleSort {
    void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) //2 for loops for o(n^2)j for swapping
                if (arr[j] > arr[j+1]) //swapping
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
  
    /* Display the array */
    void SortedArray(int arr[]) 
    { 
        int n = arr.length;
        System.out.println("----Sorted Array----"); 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        BubbleSort bs = new BubbleSort();
        Scanner scan = new Scanner(System.in);
        int total;
        
        System.out.println("Enter the total size of numbers to be sorted");
        total = scan.nextInt();
        
        int arr[] = new int[total];//to be passed as a parameter in bubble sort
        
        for(int i=0;i<total;i++)
        {
            System.out.println("Enter the "+(i+1)+" number");
            arr[i] = scan.nextInt();
        } 
        
        bs.bubbleSort(arr); 

        bs.SortedArray(arr); 
    } 
} 

    

