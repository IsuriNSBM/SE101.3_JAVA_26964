

package com.mycompany.arrayexceptionhadling;


public class ArrayExceptionHadling {
    
 
public static void main(String[] args) 
{
    int[] array = {1, 2, 3, 4, 5}; 
    try { 
    
        // Access an index that is out of bounds 
        int value = array[10]; 
        System.out.println("Value: " + value);
 }
 catch (ArrayIndexOutOfBoundsException e) 
{ 

System.out.println("Error: Invalid index accessed!"); 
     } 
   } 
}




