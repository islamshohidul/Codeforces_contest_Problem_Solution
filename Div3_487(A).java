import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Div
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
            if(a[i]%2==0){ a[i] -=1; }

        System.out.print(a[i]+" ");

}



	}
}
