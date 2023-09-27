/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.io.*;
import java.util.Scanner;
 
class GFG {
    public static void main (String[] args) {}
    
    public static String rev(String s){
       
        String str=s, nstr="";
        char ch;
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      return(nstr);
      
      
    }
}