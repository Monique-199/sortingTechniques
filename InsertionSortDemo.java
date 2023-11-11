/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author inven
 */
public class InsertionSortDemo {
    int a[];
  int n;
  public InsertionSortDemo(int size) {
    n = size;
    a = new int[n];
  }
  public void readArray() {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter " + n + " Elements");
    for (int i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }
  }
  public void showArray() {
    System.out.println("");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println("");
  }
  public void insertionSort() {
    int i, j;
    for (i = 1; i < n; i++) {
      int temp = a[i];
      for (j = i - 1; j >= 0 && temp < a[j]; j--) {
        a[j + 1] = a[j];
      }
      a[j + 1] = temp;
      System.out.println("After " + i + " Phase");
      showArray();
    }
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Array Size");
    int n = s.nextInt();
    InsertionSortDemo demo = new InsertionSortDemo(n);
    demo.readArray();
    System.out.println("Before InsertionSort");
    demo.showArray();
    demo.insertionSort();
    System.out.println("After InsertionSort");
    demo.showArray();
  }
}
    

