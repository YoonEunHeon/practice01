package practice01;

public class Prob5 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<100;i++){
		String number = String.valueOf(i);
		int a = number.length();
	    int clap = 0 ;
	       for(int j=0;j<a;j++){
	    	   char n = number.charAt(j);
	    	   if(n=='3' || n=='6' || n=='9'){
	    		     
	    		  
	    		   clap++;
	    		   
	    	   }
	         }
	       if(clap==0){
	    	   
	    	   continue;
	       }else{
	    	   System.out.println(number);
	    	   for(int k=0;k<clap;k++){
	    		   System.out.print("짝");
	    		   
	    	   }
	    	   System.out.println("");
	       }
		
	      } 
     }
}
