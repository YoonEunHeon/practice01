package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		System.out.print("숫자를 입력하세요 : "); 
	    int a = scanner.nextInt(); //입력받는 수;
		if(a%2==0){
			for(int i=(a-1);i>=0;--i){
		    if(i%2==0){
			   sum += i;
			   
			 }
		    
		    else{
		       continue;
		    }
		    
	    
		 }
			System.out.println("결과값은 : " + sum); } 
		else{
		   for(int i=a-1;i>=0;i--){
			   if(i%2!=0){
				   sum += i;
				   
			   }else{
				   
				 continue;
			   }
		
			    
   	   }
		   System.out.println("결과값은 : " + sum); 
	  }
		
    }
}
	



