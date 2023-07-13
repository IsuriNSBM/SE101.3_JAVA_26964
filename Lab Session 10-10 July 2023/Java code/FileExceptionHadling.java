

package com.mycompany.fileexceptionhadling;

import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;


public class FileExceptionHadling {
    public static void main(String[] args) 
{ 
String fileName = "nonexistent_file.txt";
 try {

 File file = new File(fileName);
 Scanner scanner = new Scanner(file);
 
// Read file contents or perform any necessary operations 
scanner.close(); 
}
 
catch (FileNotFoundException e) 
{
 System.out.println("Error: File not found!"); 
      } 
  }
 }



  