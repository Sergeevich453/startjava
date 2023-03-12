package src.com.startjava.lesson_2_3.calculator;

public class Calculator {

    public int calculate(int num1, char sign, int num2) {
        switch(sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '^':
                int result = 1;
                for(int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                return result;
            case '%':
                return num1 % num2;
            default: 
                System.out.println("Вы ввели некорректное значение. Повторите попытку.");
        }
        return 0;
    }
}


