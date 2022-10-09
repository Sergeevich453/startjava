public class WolfTest {
    
    public static void main(String[] agrs) {
        Wolf grey = new Wolf();
        grey.gender = "Мужской";
        grey.nickname = "Серый";
        grey.weight = 50;
        grey.age = 5;
        grey.color = "Серый";
        System.out.println("Кличка волка: " + grey.nickname + "\nПол: " + grey.gender + "\nВес: " 
                + grey.weight + "\nВозраст: " + grey.age + "\nЦвет: " + grey.color + "\n" + grey.walk()
                + "\n" + grey.sit() + "\n" + grey.run() + "\n" + grey.howl() + "\nВолк охотится: " 
                + grey.hunting());
    }
}