//name : EMAM SAMARA\
//1220022
//LAB : 5L
//LECTURE : 3

package assigment1;

import java.util.Scanner;

public class assigment {
	
	
	public static void decimalToHex(int n) {
		
		
		if (n<0) {
			System.out.print("the decimal should be a positive number : ");
		}
		
		
		char hexa[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		int decimal=n;
		String hex="";
		int reminder;
		
		while(n>0) {	
			reminder = n%16;
			hex= hexa[reminder]+hex;
			n=n/16;
		}
		
		
		System.out.println("Hex representation of "+decimal+"  is :" + hex);
		
		
	}
	
	
       public static void   calculateTrigFunctions(double n) {
    	   double x = Math.toRadians(n);
    	  double a= Math.sin(x);
    	  double b= Math.cos(x);
    	  double d= Math.tan(x);
    	   
    	   System.out.println("sin ("+n+") is : "+a);
    	   System.out.println("cos ("+n+") is : "+b);
    	   System.out.println("tan ("+n+") is : "+d);
    	   
       }
       
  public static void calculateFactorial(int n) {
    	   
    	   if(n<0) {
    		  System.out.println("the number should be positive !!");
    	   }else {
    	   
    	   int sum=1;
    	   
    	   for (int i=1;i<=n;i++) {
    		   
    		sum = sum * i;  
    	              
    	   }
    	   System.out.println("the factorial for "+n+" is "+sum);
    	   }
    	   
    	   
       }
       
       
       
       
	
	public static boolean isValidID(long id) {
		
		if (id<100000000) {
		    System.out.println("the id must be 9 digits");
		    return false;
		}else if(id>999999999) {
			 System.out.println("the id must be 9 digits");
			    return false;
		}
	     
	     int sum2= 0;
	   
	     for(int i = 0;i<9;i++) {
	    	 
		     int digit = (int) id%10;
             
		     int weight = 0;
		     
		     if(i%2==0) {
		    	 weight = 1;
		     }
		     else if(i%2 != 0) {
		    	 weight = 2;
		     }
	    	 
		     
		     int a = digit * weight;
		     
		     int sum1 =0;
		     
		     if (a > 9) {
		    	    a = (a/10)+(a%10);
		    	}
		    	sum2 =sum2+a;
		     
		     
		     id= id/10;

		     
	     }
		     
		     
		     if(sum2%10==0) {
		    	 System.out.println("the id is valid");
		    	 return true;
		     }
		 
	     
		
	     System.out.println("invalid id");
    	 return false;
	     
	}
	
	
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Welcome to the Scientific Calculator!");
		System.out.println("Please enter your first name: ");
		String name = input.next();
		
		
		while(true) {
		System.out.println("Please enter your 9-digit ID number:");
		long id = input.nextLong();
		
		if(isValidID(id)) {
		break;
		}else {
			System.out.println("please enter ther id again :");
			
		}
		
		}
		
			while(true) {
			System.out.println("\nwelcome "+ name+" Please select an option from the menu:");
			System.out.println("1 : Calculate Sine, Cosine, and Tangent");
			System.out.println("2 : calculate factorial");
			System.out.println("3 : Decimal to Hexadecimal Conversion");
			System.out.println("4 : Exit ");

			
			
			int option=input.nextInt();
			
		
				
			if(option!=1&&option!=2&&option!=3&&option!= 4) {
				
			    System.out.println("invalid option !");
			    continue;
			}
				
				
		switch(option) {
		
		
		case 1 :		
			
		System.out.println("Enter the angel in digree : ");
		double angel = input.nextDouble();
		calculateTrigFunctions(angel);
		break;
		
		case 2 : 
		
		System.out.println("Enter a positive integer :  ");
		int n= input.nextInt();
		calculateFactorial(n);
		
		break;
		
		case 3 : 
			
			System.out.println("enter a positive integer : ");
		    int n1= input.nextInt();
		    decimalToHex(n1);
		break;
		
		case 4 : 
			
			System.out.println("good Bye !");
			return;
		    
		    
		    
		    
		    
		}
			
			}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
	}
}
