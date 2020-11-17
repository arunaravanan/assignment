package assignmentday2;
import java.util.*;

public class SecondFrequentlyOccurringNumber {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the lim:\n");
		int lim=scan.nextInt();
		int input[] = new int [lim];
		System.out.print("Enter the series of "+lim +" numbers separated by spaces\n");
		 
		 for(int i=0;i<lim;i++)
		 input[i]=scan.nextInt();
		 scan.close();
//	     System.out.print(input+"\n");
	     String cnt="";
	     Arrays.sort(input);
		 boolean repeat;
		 String s="";
		 //getting the unique elements
		 for (int i = 0; i < input.length; i++) {
			    repeat = false;
			    for (int j = i + 1; j < input.length; j++) {
			        if (input[i] == input[j]) {
			            repeat = true;
			            break;
			        }
			    }
			    if (!repeat) {
			        s=s+input[i];
			    }
			}
	  
//		 System.out.print(s+"\n");
		 for (int i = 0; i < s.length(); i++) {
		 int count=0;
		
		  for (int j = 0; j < input.length; j++) {
			  if (Character.getNumericValue(s.charAt(i))==(input[j])) {
				  count+=1;				 
			  }
		  }cnt+=count;
//		  System.out.print( count+"times"+Character.getNumericValue(s.charAt(i))+"\n");	
		  
	  }	  
//	  System.out.print(cnt);
	  char[] n=cnt.toCharArray();
	  Arrays.sort(n);
	  System.out.print("\n");
	  char key=n[n.length-2];
//	  System.out.print(key+"\n");
	  for (int i=0;i<cnt.length();i++)
		  if(cnt.charAt(i)==key)System.out.print(s.charAt(i)+"\t");
	}
}
