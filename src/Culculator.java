import java.util.Scanner;

public class Culculator {
    Scanner scanner = new Scanner(System.in);
    public int sul(Number a, Number b, char c) {
        try {
            switch (c) {
                case '+':
                    return a.getNumber()+b.getNumber();
                case '-':
                    return a.getNumber()-b.getNumber();
                case '*':
                    return a.getNumber()*b.getNumber();
                case '/':
                    if (b.getNumber() != 0) return a.getNumber()/b.getNumber();
                    else throw new IllegalArgumentException("На 0 делить нельзя");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    void add(Number operand1, int sys){
        switch (sys){
            case 1: operand1.setNumber(scanner.next(),2); break;
            case 2: operand1.setNumber(scanner.next(),8); break;
            case 3: operand1.setNumber(scanner.next(),10); break;
            case 4: operand1.setNumber(scanner.next(),16); break;
        }
    }

    public void run(){
        Number res=new Number();
        while (true){
            System.out.println("Выберите систему счисления");
            System.out.println("1. Bin");
            System.out.println("2. Oct");
            System.out.println("3. Dec");
            System.out.println("4. Hex");

            int sys = scanner.nextInt();

            System.out.println("Введите первое число");
            Number operand1=new Number();
            add(operand1,sys);

            System.out.println("Введите операцию");
            char operation = scanner.next().charAt(0);
            System.out.println("Введите второе число");
            Number operand2=new Number();
            add(operand2,sys);

            res.setNumber(String.valueOf(sul(operand1,operand2,operation)),10);
            System.out.println(res.printNumber());

        }
    }
}
