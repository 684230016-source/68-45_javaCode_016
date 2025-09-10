package Arrays;

public class W13_02_basicArray {
    public static void main(String[] args) {
        //การประกาศตัวแปร Array แบบที่ 1 ระบุสมาชิกในวงเล็บปีกกา
        String animals[] = {"Dog", "Cat", "Lion"};
        
        int dice[] = {1, 2, 3, 4, 5, 6};

        float avgScore[] = {3.50f, 4.00f, 2.75f};
       
        System.out.println("Animals at index 0 :" + animals [0]);
        System.err.println("Animals at index 2 :" + animals [2]);

        //หาขนาดของ Array
        System.out.println("Size of animals array :" + animals.length);

        //การดข้าถึงสมาชิกใน Array avgScore
        System.out.println("Animals at index 0 :" + animals [0]);
        System.err.println("Animals at index 2 :" + animals [2]);

        //วนลูปแสดงสมาชิกใน Array avgScore
        System.out.println("Show all average score:");
        for(int i=0;i < avgScore.length ;i++){
            System.out.println("avgScore[i]");
        }
        //การประกาศตัวแปรแบบ Array แบบที่ 2 ระบุขนาดของArray
        String colors[] = new String[4];
        colors[2] = "Red";
        colors[0] = "Green";
        colors[3] = "Blue";

        System.out.println("Show all colors:");
        int j = 1;
        for(int i=0;i < colors.length ;i++){
            System.out.println("Block"+ (i+1)+":"+colors);
            System.out.println("Block :"+j+colors[i]);
            j++;
        System.out.println("Size of animals array : " + colors.length);
         System.out.println("colors at index 0 :" + colors  [0]);
        System.err.println("colors at index 1 :" + colors [1]);
        

        int score[] = new int[5];
        score[0] = 50;

        System.out.println("Score at index 4 :" + score[4]);
    }
 }
}

