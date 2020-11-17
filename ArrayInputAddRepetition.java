package assignmentday2;

import java.util.*;

public class ArrayInputAddRepetition {
	public static void main(String args[]){ 
		Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the lim:\n");
		 int lim=scan.nextInt();
		 int input[] = new int [lim];
		 System.out.print("Enter the series of "+lim +" numbers separated by spaces\n");
	     for(int i=0;i<lim;i++)
		    input[i]=scan.nextInt();
		 scan.close();
//		 System.out.println(java.util.Arrays.toString(input));
		 for(int i=0;i<input.length-1;i++)
		 { if(input[i]==0)continue;
		 for(int j=i+1;j<input.length;j++)
			 if(input[i]==input[j]) {input[i]*=2; input[j]=0;} }
		
		 
//		 System.out.println(java.util.Arrays.toString(input));
		 
		 
		 
		 for(int j=0;j<input.length;j++)
		 for(int i=0;i<input.length-1;i++)
			 if(input[i]==0) {
				 input[i]=input[i+1];
				 input[i+1]=0;
				 
			 }
		 System.out.println(java.util.Arrays.toString(input));
		 
	}
	     

}
