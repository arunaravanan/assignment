package assignmentday2;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAllAlphabetPresence {
	public static void main(String args[]){ 
		 Scanner scan= new Scanner(System.in);  
		 System.out.print("Enter the String:\n");
		 String str= scan.nextLine(); 
		 str = str.toLowerCase().replaceAll("[^a-z]", "");
		 char[] ch = str.toCharArray();
		 Arrays.sort(ch);
		 boolean repeat;
		 String s="";
		 for (int i = 0; i < ch.length; i++) {
			    repeat = false;
			    for (int j = i + 1; j < ch.length; j++) {
			        if (ch[i] == ch[j]) {
			            repeat = true;
			            break;
			        }
			    }
			    if (!repeat) {
			        s=s+ch[i];
			    }
			}
		 scan.close();
		 if(s.length()==26)System.out.print("True");
		 else System.out.print("False");
				 
	}


}
