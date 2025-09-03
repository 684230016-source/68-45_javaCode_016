package Loop;
import java.util.Scanner;
public class W12_02_SumNumber {
    public static void main(String[] args) {
        
    //ใช้ do  while
    Scanner kb = new Scanner(System.in);
    int start,stop;
    do{
            System.out.print("Enter a Start number:");
            start = kb.nextInt();
            System.out.print("Enter a Stop number:");
            stop = kb.nextInt();
            int sum = 0;
            int num = 1;
            if(start<stop){
                for (int count=start  ; count <=stop; count = count + 1) {
                    System.out.println("รอบที่"+ + num+ ":" + sum+"+"+num+"="+(sum+=count));
                    num++;
                }
            }else{
                System.err.println("Erer");
            }
    }while(start>=stop);
    kb.close();
    }
}

        


    



