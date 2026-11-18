import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean externalFlag = true;
        Scanner scanner = new Scanner(System.in);
        while (externalFlag) {
            boolean innerFlag = true;
            int operand1 = scanner.nextInt();
            while (innerFlag) {
                char operation = scanner.next().charAt(0);
                int operand2 = 1;
                if ("cCsS".indexOf(operation) == -1) {
                    operand2 = scanner.nextInt();
                }
                switch (operation) {
                    case '-':
                        operand1 -= operand2;
                        System.out.println(operand1);
                        break;
                    case '+':
                        operand1 += operand2;
                        System.out.println(operand1);
                        break;
                    case '*':
                        operand1 *= operand2;
                        System.out.println(operand1);
                        break;
                    case '/':
                        if (operand2 != 0) {
                            operand1 /= operand2;
                            System.out.println(operand1);
                        } else {
                            System.out.println("Деление на ноль");
                        }
                        break;
                    case 'c':
                    case 'C':
                        innerFlag = false;
                        break;
                    case 's':
                    case 'S':
                        externalFlag = false;
                        innerFlag = false;
                        break;
                    default:
                        System.out.println("Неизвестная команда");
                }
            }
        }
    }
}