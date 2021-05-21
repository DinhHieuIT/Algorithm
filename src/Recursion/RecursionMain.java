package Recursion;

public class RecursionMain {
	static int i= 0;
	public static void print() {
		i++;
		if(i<5){
		System.out.println(i);
		print();
		}
	}

	public static void main(String[] args) {	
		print();
	}

}
