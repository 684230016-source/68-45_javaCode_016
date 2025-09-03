package Loop;

import java.util.Scanner;

public class  W11_03_While_True_ChooseMenu_SwitchCas{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //โจทย์: เขียนโปรแกรมให้ผู้ใช้เลือกเมนู
        //ถ้าเลือกเลข 1 ให้บวกเลข 2 จำนวน
        //ถ้าเลือกเลข 2 ให้บวกเลข 2 จำนวน
        //ถ้าเลือกเลข 3 ให้ออกจากโปรแกรม
//============================================================================
System.out.println("Enter Number1");
int num1 = kb.nextInt();
System.out.println("Enter Number2");
int num2 = kb.nextByte();

//================================================================================
        //แสดงเมนูเพื่อรับ choice
        
            System.out.println("=================");
            System.out.println("Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtractio");
            System.out.println("3. Exit");
            System.out.println("=================");
            while (true) { 
                System.out.print("Enter Your Choice:");
                int choice = kb.nextInt();
                System.out.println("--------------");
                // if(Choice == 1) {
                //     System.out.println("Addition Result:" + (num1 + num2));
                //     break;
                // }else if (Choice == 2) {
                //     System.out.println("Subtractio Result" + (num1 - num2));
                //     break;
                // }else if (Choice == 3) {
                //     System.out.println("Exiting the program. Goodbay");
                //     break;
                // }else{
                //     System.out.println("No Choice Please try again");
                // }
                switch(choice){
                    case  1:
                    int result = num1 + num2;
                    System.out.println("Addition Result:" + result);
                    break;
                    case  2:
                    System.out.println("Addition Result:" + (num1 - num2));
                    break;
                    case  3:
                    System.out.println("Exiting the program.Goodbay");
                    break;
                    default:
                    System.out.println("Invalid choice. Please try again.");
                }
                
                if (choice <=3){
                    break;
                }
                }
            }
            }
        
    
    

