package input;

import java.util.Scanner;

//Nhập số nguyên dương từ màn hình.
public class Main {
     
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		inputId();
	}
	
	public static void inputId() {
        System.out.print("Input interger: ");
        boolean exit=true;
        while (exit) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                exit=false;
            } catch (NumberFormatException ex) {
                System.out.print("wrong type! Please input interger again: ");
            }
        }
    }

}
