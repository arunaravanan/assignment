package assignment;
import java.util.*;

public class assignment2 {
	 public static void main(String args[]){
		 Scanner scan= new Scanner(System.in); 
		 System.out.print("Enter the strings: ");  
		 String str= scan.nextLine(); 
		 String str1=scan.nextLine();
		 scan.close();
		 str=str.toLowerCase();
		 str1=str1.toLowerCase();
		 char[] ch = str.toCharArray();
	   	 char[] ch1 = str1.toCharArray();
	     Arrays.sort(ch);
	     Arrays.sort(ch1);
	     str=String. valueOf(ch);
	     str1= String. valueOf(ch1);
	     if(str.equals(str1))System.out.print("Anagrams");
	     else System.out.print("Not Anagrams");
	     		 
	 }

}
