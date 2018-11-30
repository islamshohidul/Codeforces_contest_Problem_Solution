import java.util.Scanner;
	
	public class A54 {
	
	   public static void main(String[] argv){
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      String s = sc.next();
	      int position = n-1;
	      	      for(int i =1 ; i<s.length(); i++){
	      
	         char c1 = s.charAt(i-1);
	         char c2 = s.charAt(i);
	         if(c1>c2){
	            position = i-1;
	            break;	      
	      }
	      
	   
	   }
	      String answer = s.substring(0, position)+ s.substring(position+1);
	      System.out.println(answer);
	
	}	}