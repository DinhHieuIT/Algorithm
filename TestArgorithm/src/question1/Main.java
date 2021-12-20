package question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num, temp, digit, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số cần tách:");
        num = scanner.nextInt();
        scanner.close();
        temp = num;
        while(num > 0)
        {
            num = num / 10;
            count++;
        }
        int[] arr = new int[count];
        while(temp > 0)
        {
            digit = temp % 10;
            System.out.println("Vị trí số "+count+" là: "+digit);
            for(int i=count-1;i>=0;i--) {
            	arr[i] = digit;
            }
            temp = temp / 10;
            count--;
        }
        
        int deletenumberIndex = 0;
        for (int j=0;j<arr.length-1;j++) {
        	if(arr[j]>arr[j+1]) {
        		deletenumberIndex=j;
        		break;
        	}
        }
        System.out.println(arr[0]);
        System.out.println("Số bị xóa là " + deletenumberIndex);
        String minnumber = null;
        for(int k=0;k<arr.length;k++) {
        	if(k==deletenumberIndex) {
        		
        	}else {
        	minnumber = minnumber + arr[k];
        	}
        }
        
        System.out.println("Số bị cắt là " + arr[deletenumberIndex]);
        System.out.println("Số nhỏ nhất còn lại  là " + minnumber.substring(4));
    }
		

	}


