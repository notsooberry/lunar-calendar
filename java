import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lunarAge;
        int lunarNum = 0;
        int num = 1;

        System.out.print("Enter day: ");
        int day = in.nextInt();
        System.out.print("Enter number of month: ");
        int month = in.nextInt();
        System.out.print("Enter year: ");
        int year = in.nextInt();

        for (int i = 0; i < year; i++) {
            if(num == 19){
                num = 0;
            }
            num++;
            lunarNum = num;
        }

        lunarAge = lunarNum * 11 - 14 + day + month;
        while(lunarAge > 30){
            lunarAge = lunarAge - 30;
        }
//        System.out.println("lunarNum - " + lunarNum);
//        System.out.println("lunarAge - " + lunarAge);

        if(lunarAge == 0 || lunarAge == 30){
            System.out.println("New moon. Moon not visible");
        }
        else if(lunarAge > 0 && lunarAge <=7){
            System.out.println("First quarter. The best time to observe is in the evening");
        }
        else if(lunarAge > 7 && lunarAge <= 15){
            System.out.println("Full Moon. Visible all night from sunset to sunrise");
        }
        else if(lunarAge > 15){
            System.out.println("Last Quarter. The Moon is best observed in the second half of the night, in the morning");
        }
    }
}