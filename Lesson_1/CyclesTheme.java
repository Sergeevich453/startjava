public class CyclesTheme {
    
    public static void main(String[] args) {
        System.out.println("\n\t" + "ЗАДАНИЕ 1 \nПодсчет суммы четных и нечетных чисел\n");
        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven
                + ", а сумма нечетных чисел = " + sumOdd);

        System.out.println("\t" + "ЗАДАНИЕ 2 \nВывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num2 < num1 && num1 > num3) {
            max = num1;
        } else if (num3 < num2 && num2 > num1) {
            max = num2;
        } else {
            max = num3;
        }
        if (num2 > num1 && num1 < num3) {
            min = num1;
        } else if (num1 > num2 && num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        for (int i = max - 1; i >= min + 1; i--) {
            System.out.print(" " + i);
        }

        System.out.println("\n" + "\n\t" + "ЗАДАНИЕ 3 \nВывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            System.out.print(digit);
            sum += digit;
            num /= 10;
        }
        System.out.println("\nСумма чисел = " + sum);

        System.out.println("\n\t" + "ЗАДАНИЕ 4 \nВывод чисел на консоль в несколько строк\n");
        int count = 0;
        for (int i = 1; i <= 24; i += 2) {
            System.out.printf("%3d", i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        while (count % 5 != 0) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\n" + "\n\t" + "ЗАДАНИЕ 5 \nПроверка количества единиц на четность\n");
        num = 3141591;
        int copyNum = num;
        int countOnes = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit == 1) {
                countOnes++;
            }
            num /= 10;
        }
        if (countOnes % 2 == 0) {
            System.out.println("число " + copyNum + " содержит " + countOnes + " четное количество единиц");
        } else {
            System.out.println("число " + copyNum + " содержит " + countOnes + " нечетное количество единиц");
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 6 \nОтображение фигур в консоли\n");
        count = 0;
        for (int i = 0; i <= 49; i++) {
            System.out.print("*");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        int countSymbols = 10;
        while (countSymbols >= 1) {
            int countLines = 1;
            while (countLines <= countSymbols) {
                System.out.print("#");
                countLines++;
            }
            System.out.println();
            countSymbols--; 
        }

        System.out.println();
        int repeats = 3;
        int countLines = -repeats + 1;
        do {
            countSymbols = 1;
            int countRepeats = countLines;
            if (countRepeats < 0) {
                countRepeats = -countRepeats;
            }
            do {
                System.out.print("*");
                ++countSymbols;
            } while (countSymbols <= repeats - countRepeats);
                ++countLines;
                System.out.println();
        } while (countLines <= repeats - 1);

        System.out.println("\n\t" + "ЗАДАНИЕ 7 \nОтображение ASCII-символов\n");
        System.out.printf("%7s%7s%n%n", "Dec", "Char");
        for (char i = 0; i <= 47; i++) {
            if ( i % 2 != 0) {
                System.out.printf("%6d%6c%n", (int) i, i);
            }
        }
        for (char i = 97; i <= 122; i++) {
            if ( i % 2 == 0) {
                System.out.printf("%6d%6c%n", ((int)i), i);
            }
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 8 \nПроверка, является ли число палиндромом\n");
        num = 1234321;
        int reverseNum = 0;
        copyNum = num;
        while (num > 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        if (copyNum == reverseNum) {
            System.out.println("Число является палиндромом " + "\nЗаданное число: " + copyNum
                    + "\nРеверс числа: " + reverseNum);
        } else {
            System.out.println("Число неявляется палиндромом " + "\nЗаданное число: " + copyNum
                + "\nРеверс числа: " + reverseNum);
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 9 \nОпределение, является ли число счастливым\n");
        num = 657576;
        sum = 0;
        int sum1 = 0;
        int digit = num % 10;

        for (int i = 0; i <= 5; i++) {
            if (i <= 2) {
                sum += digit;
            } else {
                sum1 += digit;
            }
            num /= 10;
        }
        if (sum == sum1) {
            System.out.println("Сумма цифр sum = sum1: " + sum + " = " + sum1 + "\nЧисло является счастливым");
        } else {
            System.out.println("Сумма цифр sum != sum1: " + sum + " = " + sum1 + "\nЧисло неявляется счастливым");
        }

        System.out.println("\n\t" + "ЗАДАНИЕ 10 \nВывод таблицы умножения Пифагора\n");
        System.out.print("\tТАБЛИЦА ПИФАГОРА " + "\n   ");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}