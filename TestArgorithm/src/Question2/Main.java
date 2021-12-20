package Question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    int sum = 0, a;
	    System.out.println("\n\nNhập vào số cần kiểm tra: ");
	    
	    try {
			a = sc.nextInt();
			if(a>0) {
			for(int i=1;i<=a/2;i++){
			      if(a%i==0) 
			        sum+=i;
			    }
			    if(sum==a){
			      System.out.println(a + " là số hoàn hảo");
			    }
			    else {
			      System.out.println(a + " không phải là số hoàn hảo");
			    }
			}else {
				System.out.println("Vui lòng nhập số nguyên dương");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Vui lòng nhập số nguyên");
			
		}
	    
	    
	  }

	}


