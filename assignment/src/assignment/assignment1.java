package assignment;
import java.util.Scanner;

public class assignment1 {
	 public static void main(String args[]){  
		 
		 Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the date in  MM DD YYYY format: "); 
	       
	        int m = scan.nextInt();
	        int d = scan.nextInt();	        
	        m=m-2;
	        if(m<0)m=m+10;
	        int y = scan.nextInt();
	        if(d<=31 && m<=12)
	        {
	        int y1=y/100;
	        int y2=y%100;
	        scan.close();
	        int res = (d+(((13*m)-1)/5)+y2+(y2/4)+(y1/4)-2*y1)%7;
	        if(res<0)res=res*(-1);
	        String day = null;
	        switch(res)
	        {
	        case 0:
	        	day="Sunday";
	        	break;
	        case 1:
	        	day="Monday";
	        	break;
	        case 2:
	        	day="Tuesday";
	        	break;
	        case 3:
	        	day="Wednesday";
	        	break;
	        case 4:
	        	day="Thursday";
	        	break;
	        case 5:
	        	day="Friday";
	        	break;
	        case 6:
	        	day="Saturday";
	        	break;
	        	
	        }
	        System.out.println(day );
	        }
	        else
	        	 System.out.println("Invalid Input" );
	        	
	        
	    }  

}