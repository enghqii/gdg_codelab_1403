import java.math.BigInteger;

public class Fibonacci{

     public static void main(String []args){
    	 
    	 int start = 0;
    	 
    	 
    	 try{
    		 if(args.length > 0){
    			 start = Integer.parseInt(args[0]);
    		 }
    		 
    	 }catch(NumberFormatException e){
    		 e.printStackTrace();
    	 }

    	 if(start > 2){

        	 long startTime = System.currentTimeMillis();
        	 
    		 BigInteger fib1 = new BigInteger("0");
    		 BigInteger fib2 = new BigInteger("1");
    		 

			 System.out.println("F" + 0 + " =  " + fib1);
			 System.out.println("F" + 1 + " =  " + fib2);
    		 
    		 for(int i = 0; i <= (start -2); i++) {
    			 BigInteger fib3 = fib1.add(fib2);
    			 System.out.println("F" + (i+2) + " =  " + fib3);
    			 fib1 = fib2;
    			 fib2 = fib3;
    		 }
    		 
    		 long endTime = System.currentTimeMillis();
    		 System.out.println("Execution time : " + ((endTime - startTime)/1000.0) + "sec" );
    	 }
     }
}
