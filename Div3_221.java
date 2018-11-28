/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	//int a = sc.nextInt();
      
         
				
		
		for(int i =0; i<t; i++){
         
         long a = sc.nextInt();
			long b = sc.nextInt();
			long n = sc.nextInt();
         long total =0;
         
				
			if(n%2==0){
				total = ((a*(n/2))- (b*(n/2)));
         // System.out.println(total);
				
			}else{
					total =(a-b)*(n/2)+a;
           // System.out.println(total);
				
			}
         
           System.out.println(total);
		}
      // System.out.println(total);
		
	}
}