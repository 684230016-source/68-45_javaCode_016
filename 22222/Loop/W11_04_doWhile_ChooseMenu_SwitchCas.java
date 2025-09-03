package Loop;

import java.util.Scanner;
import javax.swing.text.JTextComponent;

public class  W11_04_doWhile_ChooseMenu_SwitchCas{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //โจทย์: เขียนโปรแกรมให้ผู้ใช้เลือกเมนู
        //ถ้าเลือกเลข 1 ให้บวกเลข 2 จำนวน
        //ถ้าเลือกเลข 2 ให้บวกเลข 2 จำนวน
        //ถ้าเลือกเลข 3 ให้ออกจากโปรแกรม
//============================================================================

//================================================================================
//แสดงเมนูเพื่อรับ choice

System.out.println("=================");
System.out.println("Menu");
System.out.println("1. Addition");
System.out.println("2. Subtractio");
System.out.println("3. Exit");
System.out.println("=================");
int choice;
do {
    System.out.print("Enter Your Choice:");
    choice = kb.nextInt();
    System.out.println("--------------");
    
    switch(choice){
        case  1:
            System.out.println("Enter Number1");
            int num1 = kb.nextInt();
            System.out.println("Enter Number2");
            int num2 = kb.nextByte();

            int result = num1 + num2;
            System.out.println("Addition Result:" + result);
            break; //ออกจาก switch case
        case  2:
            System.out.println("Enter Number1");
            num1 = kb.nextInt();
            System.out.println("Enter Number2");
            num2 = kb.nextByte();

            System.out.println("Addition Result:" + (num1 - num2));
            break;
        case  3:
        System.out.println("Exiting the program.Goodbay");
        break;
        default:
        System.out.println("Invalid choice. Please try again.");
            }
        }while(choice < 3);
        }
        }
                
                
                
                
                
            
            
        
    
    

