package Loop;
import  java.util.Scanner;



public class W12_01_For_SumOdd {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        System.err.print("Enter a Start number:");
        int start = kb.nextInt();
        System.err.print("Enter a Stop number:");
        int stop = kb.nextInt();

        while(start<stop){
            System.err.print("Start number must be less than Stop number:");
            System.out.print("Enter a Start number:");
            start = kb.nextInt();
            System.out.println("Enter a Stop number:");
            stop = kb.nextInt();




        int sum = 0;
        int num = 1;
        // if(start<stop){
            for (int count=start  ; count <=stop; count = count + 1) {
                System.out.println("รอบที่"+ + num+ ":" + sum+"+"+num+"="+(sum+=count));
                num++;
        // }
        // }else{
        // System.err.println("Erer");
        // }
}
    }
}
}


