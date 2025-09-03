package Loop;

public class W10_01_While_Java100{
    public static void main(String[] args) {
        
        //Loop while แสดงข้อความ java 100ตรั้ง
        
    int count = 0; //ค่าเริ่มต้นในการวนลูป
    while (count <= 99) { 
            
    System.out.println("java "+ (count + 1));
count = count+1; //update ค่า count  
}
    }
}