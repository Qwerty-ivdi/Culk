import java.util.Scanner;

public class Culculator {
    public void run(){
        Culc culc;
        double res;
        while (true){
            System.out.println("Выберите систему счисления");
            System.out.println("1. Bin");
            System.out.println("2. Oct");
            System.out.println("3. Dec");
            System.out.println("4. Hex");
            Scanner scanner = new Scanner(System.in);
            int sys = scanner.nextInt();

            System.out.println("Введите первое число");
            int operand1 = scanner.nextInt();
            System.out.println("Введите операцию");
            char operation = scanner.next().charAt(0);
            System.out.println("Введите второе число");
            int operand2 = scanner.nextInt();

            switch (sys){

                case 3: culc = new DecCulc();
                res=culc.Sul(operand1,operand2,operation);
                culc.print(res);
                break;
            }

        }
    }
}
