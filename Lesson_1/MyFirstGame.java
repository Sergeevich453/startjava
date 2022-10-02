public class MyFirstGame {
    public static void main(String [] args){
        int computerNum = 1;
        int playerNum = 100;
        int count = 0;
        while (playerNum != computerNum) {
            if (playerNum > computerNum) {
                System.out.println("Загаданное число меньше = " + playerNum + " > " + computerNum);
                playerNum = playerNum / 2;
            } else if (playerNum < computerNum) {
                System.out.println("Загаданное число больше = " + playerNum + " < " + computerNum); 
                playerNum = playerNum + 1;
            }
            count++;
        }
        System.out.println("Вы выиграли" + "\n Количество попыток: " + count + "\n Загаданное число: " 
                + computerNum + "\n Число пользователя: " + playerNum);
    }
}