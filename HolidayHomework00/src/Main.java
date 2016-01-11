
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		int[] list = new int[9];

	    Scanner s = new Scanner(System.in);
	    int intNum = s.nextInt();
	    
        while(intNum >= 500){
            intNum -= 500;
            list[0]++;
        }

        while(intNum >= 200){
            intNum -= 200;
            list[1]++;
        }

        while(intNum >= 100){
            intNum -= 100;
            list[2]++;
        }

        while(intNum >= 50){
            intNum -= 50;
            list[3]++;
        }

        while(intNum >= 20){
            intNum -= 20;
            list[4]++;
        }

        while(intNum >= 10){
            intNum -= 10;
            list[5]++;
        }
        

        while(intNum >= 5){
            intNum -= 5;
            list[6]++;
        }

        while(intNum >= 2){
            intNum -= 2;
            list[7]++;
        }

        while(intNum >= 1){
            intNum -= 1;
            list[8]++;
        }
        
        for(int i: list){
        	System.out.print(i);
        }
        
	}
	       
}
