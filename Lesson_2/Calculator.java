public class Calculator {
    
    public double calculate(double num1, char sign, double num2) {
        double result = 1;
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
                for(int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                break;
            case '%':
                return num1 % num2;
            default: 
                System.out.println("Вы ввели некорректное значение повторите попытку.");
        }
    }
}


