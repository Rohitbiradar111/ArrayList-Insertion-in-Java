//This program inserts Array elements in an ArrayList in Java

import java.util.ArrayList;
public class ArrayListInsertion {
    public static void main(String args[])
    {
        int arr[] = {10,20,30,40,50};
        System.out.print("Array = ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            al.add(arr[i]);
        }
        System.out.println("ArrayList = "+al);
    }
}