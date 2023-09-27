/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author UserA
 */
public class Back {
    public static void main(String[] args){}
    
    public static String remLast(String x){
        
       String str= x, nstr="";
        char ch;
        
      for (int i=0; i<str.length()-1; i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      
      nstr=GFG.rev(nstr);
      
      return(nstr);
        
        
    }
    
}
