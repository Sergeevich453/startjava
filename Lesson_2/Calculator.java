public class Calculator {

    public double calculate(double num1, char sign, double num2) {
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
                double result = 1;
                for(int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                return result;
            case '%':
                return num1 % num2;
            default: 
                System.out.println("Вы ввели некорректное значение повторите попытку.");
        }
        return 0;
    }
}


