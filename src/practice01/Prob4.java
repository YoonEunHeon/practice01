package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		//String Method Test;
		
		Scanner scanner = new Scanner(System.in);
	    System.out.print("문자열을 입력하세요. : " );
	    String s = scanner.nextLine(); 
	    		//scanner.nextLine();
	
		int length = s.length();
	    
	    System.out.println("");
	   for(int j=0;j<length;j++){
		  // int sum = 0;
          for(int i=0;i<j+1;i++){
             System.out.print(s.charAt(i));
             
           }
                 
           System.out.println("");
           
	    }
        }
	   }
	
