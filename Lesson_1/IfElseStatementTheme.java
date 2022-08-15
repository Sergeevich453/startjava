public class IfElseStatementTheme {

    public static void main(String [] args) {
        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 1 \nПеревод псевдокода на язык Java\n");
        String name = "Ilya";
        int age = 39;
        String gender = "Пол мужской";
        double growth = 1.82;
        int firstLetterName = name.charAt(0);
        if (age < 20) {
            System.out.println("Возрастом младше 20 лет и составляет: " + age + " лет");
        } else {
            System.out.println("Возрастом старше 20 лет и составляет: " + age + " лет");
        }if (gender != "Пол мужской") {
            System.out.println("Пол женский");
        }
        if (growth < 1.8) {
            System.out.println("Ростом ниже 1 метр 80 см, а именно: " + growth + " метра");
        } else {
            System.out.println("Ростом выше 1 метр 80 см, а именно: " + growth + " метра");
        }
        if (firstLetterName == 'M') {
            System.out.println("Имя начинается на букву 'M': " + name);
        } else if (firstLetterName == 'I') {
            System.out.println("Имя начинается на букву 'I': " + name);
        } else {
            System.out.println("Имя не начинается на буквы 'M' и 'I': " + name);
        }

        System.out.println("");
        System.out.println("\t" + "ЗАДАНИЕ 2 \nПоиск max и min числа\n");
        int num1 = 47;
        int num2 = 49;
            System.out.println("Первое число: " + num1 + "\nВторое число: " + num2);
        if (num1 < num2) {
            System.out.println("Максимальным из чисел является второе число: " + num2);
        } else if (num1 > num2) {
            System.out.println("Максимальным из чисел является первое число: " + num1);
        } else {
            System.out.println("Числа равны: " + num1 + " = " + num2);
        }

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 3 \nРабота с числом\n");
        num1 = -77;
        if (num1 == 0) {
            System.out.println("Заданное число равно: " + num1);
        } else {
            if (num1 % 2 == 0) {
             System.out.println("Заданное число: " + num1 + " четное");
            } else {
                System.out.println("Заданное число: " + num1 + " нечетное");
            }
            if (num1 > 0) {
            System.out.println("Заданное число: " + num1 + " положительное");
            } else {
                System.out.println("Заданное число: " + num1 + " отрицательное");
            }
        }

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 4 \nПоиск одинаковых цифр в числах\n");
        num1 = 658;
        num2 = 608;
        int hundred1 = num1 / 100;
        int ten1 = num1 / 10 % 10;
        int unit1 = num1 % 10;
        int hundred2 = num2 / 100;
        int ten2 = num2 / 10 % 10;
        int unit2 = num2 % 10;
        int swithNum;
        System.out.println("Исходные числа: " + hundred1 + " " + ten1 + " " + unit1 + "\n\t\t" + hundred2
                + " " + ten2 + " " + unit2);
        if ((hundred1 != hundred2) & (ten1 != ten2) & (unit1 != unit2)) {
            swithNum = 4;
        } else {
            swithNum = 1;
            System.out.print("Регистры совпавших чисел: ");
        }
        switch(swithNum) {
            case 1:
                if (hundred1 == hundred2) {
                    System.out.print(" № 1 ");
                };
            case 2:
                if (ten1 == ten2) {
                    System.out.print(" № 2 ");
                };
            case 3:
                if (unit1 == unit2) {
                    System.out.print(" № 3 ");
                };
                break;
            case 4:
                System.out.println("совпадений нет ");
                break;
            default:
                System.out.println("Ошибка"); 
                 break;
        }

        System.out.println("\n");
        System.out.println("\t" + "ЗАДАНИЕ 5 \nОпределение буквы, числа или символа по их коду\n");
        char symbol = '\u0057';
        System.out.println("Символ кода: " + symbol);
        if (symbol >= 65  & symbol <= 90) {
            System.out.println("Заглавная буква");
        } else if (symbol >= 97  & symbol <= 122) {
            System.out.println("Прописная буква");
        } else if (symbol >= 48  & symbol <= 57) {
            System.out.println("Цифра");
        } else if ((symbol >= 0 & symbol <= 31) || (symbol >= 32 & symbol <= 42)
                || (symbol >= 58  & symbol <= 64) || (symbol >= 91  & symbol <= 96)
                || (symbol >= 123  & symbol <= 1000)) {
            System.out.println("Не является цифрой и буквой");
        } else {
            System.out.println("Такого символа не существует");
        }

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 6 \nОпределение суммы вклада и начисленных банком %\n");
        double deposit = 10000;
        if (deposit < 100_000) {
            double percent1 = 5;
            double accruedInterest = ((percent1 / 100) * deposit);
            System.out.println("Сумма вклада: " + deposit + "\nСумма начисления 5% процентов, составляет: "
                    + (float) accruedInterest + "\nИтоговая сумма: " + (deposit + accruedInterest));
        } else if (deposit >= 100_000 & deposit <= 300_000) {
            double percent2 = 7;
            double accruedInterest = ((percent2/100)*deposit);
            System.out.println("Сумма вклада: " + deposit + "\nСумма начисления 7% процентов, составляет: "
                    + (float) accruedInterest + "\nИтоговая сумма: " + (deposit + accruedInterest));
        } else if (deposit > 300_000) {
            double percent3 = 10;
            double accruedInterest = ((percent3 / 100) * deposit);
            System.out.println("Сумма вклада: " + deposit + "\nСумма начисления 10% процентов, составляет: "
                    + (float) accruedInterest + "\nИтоговая сумма: " + (deposit + accruedInterest));
        }

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 7 \nОпределение оценки по предметам\n");
        int historyPercent = 59;
        int historyPoints = 0; 
        int programmingPercent = 91;
        int programmingPoints = 0; 
        if (historyPercent >= 0 & historyPercent <= 60) {
            historyPoints = 2;
        } else if (historyPercent > 60) {
            historyPoints = 3;
        } else if (historyPercent > 73) {
            historyPoints = 4;
        } else if (historyPercent > 91 & historyPercent <=100) {
            historyPoints = 5;
        } else{
            System.out.println("Процент введен некорректно");
        }
        if (programmingPercent >= 0 & programmingPercent <= 60) {
            programmingPoints = 2;
        } else if (programmingPercent > 60) {
            programmingPoints = 3;
        } else if (programmingPercent > 73) {
            programmingPoints = 4;
        } else if (programmingPercent > 91 & programmingPercent <= 100) {
            programmingPoints = 5;
        } else {
            System.out.println("Процент введен некорректно");
        }
        System.out.println(historyPoints + " - Оценка по истории; " + "\n" + programmingPoints
                + " - Оценка по программированию;" + "\n" + (( historyPoints + programmingPoints ) / 2)
                + " - Средний балл оценок по предметам;" + "\n" + ((historyPercent + programmingPercent) / 2)
                + " - Средний процент по предметам;");

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 8 \nРасчет прибыли\n");
        double rent = 5000;
        double costPrice = 9000;
        double incomeMax = 16000;
        double incomeMin = 12000;
        double incomeJanuary = (Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
        double incomeFebruary = (Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
        double incomeMarch = (Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
        double incomeApril = (Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
        double incomeMay = (Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
        double incomeJune = (Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
        double incomeJule = (Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
        double incomeAugust = (Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
        double incomeSeptember = (Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
        double incomeOctober = (Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
        double incomeNovember = (Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
        double incomeDecember = (Math.random() * ((incomeMax - incomeMin) + 1)) + incomeMin;
        double profitJanuary = incomeJanuary - (costPrice + rent);
        double profitFebruary = incomeFebruary - (costPrice + rent);
        double profitMarch = incomeMarch - (costPrice + rent);
        double profitApril = incomeApril - (costPrice + rent);
        double profitMay = incomeMay - (costPrice + rent);
        double profitJune = incomeJune - (costPrice + rent);
        double profitJule = incomeJule - (costPrice + rent);
        double profitAugust = incomeAugust - (costPrice + rent);
        double profitSeptember = incomeSeptember - (costPrice + rent);
        double profitOctober = incomeOctober - (costPrice + rent);
        double profitNovember = incomeNovember - (costPrice + rent);
        double profitDecember = incomeDecember - (costPrice + rent);
        double profitYear = (profitJanuary + profitFebruary + profitMarch + profitApril + profitMay
                + profitJune + profitJule + profitAugust + profitSeptember + profitOctober + profitNovember
                + profitDecember) / 12;
        if (profitYear > 0) {
            System.out.println("Прибыль за год: +" + (int)profitYear);
        } else {
            System.out.println("Прибыль за год: " + (int)profitYear);
        }

        System.out.println();
        System.out.println("\t" + "ЗАДАНИЕ 9 \nПодсчет количества банкнот\n");
        int sumATM = 567;
        int hundredDollars = 100;
        int tensDollars = 10;
        int unitsDollars = 1;
        int banknotesHundred = 0;
        int banknotesTens = 50;
        int banknotesUnits = 0;
        int requiredHundred = 0; 
        int requiredTens = 0;
        int requiredUnits = 0;
        int requiredHundredOstatoc = 0;
        int requiredTensOstatoc = 0;
        int requiredUnitsOstatoc = 0;
        int dobavitTens = 0;
        int dobavitUnits = 0;
        System.out.println("Номиналы банкнот в банкомате: " + "\n" + hundredDollars + " долларов;" + "\n"
                + tensDollars + " долларов;" + "\n" + unitsDollars + " доллар;");
        //Разбиваем на сотни, десятки, единицы
        int hundred = sumATM / 100 * 100;
        int tens = (sumATM - hundred ) / 10 * 10;
        int units = sumATM - hundred - tens;
        //проверка остатка при нехватке купюр
        if (hundred * banknotesHundred == banknotesHundred) {
            requiredHundred = hundred / 100;
        } else {
            requiredHundred = banknotesHundred / 100;
            requiredHundredOstatoc = hundred - banknotesHundred;
            tens = tens + requiredHundredOstatoc;
        }
        if (tens * banknotesTens == banknotesTens) {
            requiredTens = tens / 10;
        } else {
            requiredTens = banknotesTens / 10;
            requiredTensOstatoc = tens - banknotesTens;
            units = units + requiredTensOstatoc; 
        }
        if (units * banknotesUnits == banknotesUnits) {
            requiredUnits = units / 1;
        } else {
            requiredUnits = banknotesUnits / 1;
            requiredUnitsOstatoc = units - banknotesUnits;
        }
        // проведем проверку правильности выданных сумм банкоматом
        if (sumATM == ((requiredHundred * 100) + (requiredTens * 10) + requiredUnits)) {
                System.out.println("Банкомат выдал запрошенную сумму корректно: " + sumATM + " долларов"
                + "\nВыданные купюры номиналом 100 долларов: " + requiredHundred
                + "\nВыданные купюры номиналом 10 долларов: " + requiredTens
                + "\nВыданные купюры номиналом 1 доллар: " + requiredUnits);
        } else {
            System.out.println("Банкомат выдал сумму некорректно: \nЗапрошено: " + sumATM + "\nВыдано: "
                    + ((requiredHundred * 100) + (requiredTens * 10) + requiredUnits));
        }
    }
}
