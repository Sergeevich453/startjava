public class MyFirstGame {
    public static void main(String [] args){
        int computerNum = 1;
        int playerNumHigh = 100;
        boolean neugadal = true;
        int count = 0;
        while (neugadal) {
            if (playerNumHigh > computerNum) {
                System.out.println("Загаданное число меньше= " + playerNumHigh + " > " + computerNum);
                playerNumHigh = playerNumHigh / 2;
            } else if (playerNumHigh < computerNum) {
                System.out.println("Загаданное число больше= " + playerNumHigh + " < " + computerNum); 
                playerNumHigh = playerNumHigh + 1;
            } else if (playerNumHigh == computerNum) {
                neugadal = false;
            }
            count++;
        }
        System.out.println("Вы выиграли" + "\n число итераций: " + count + "\n Загаданное число: " 
                + computerNum + "\n Число пользователя: " + playerNumHigh);
    }
}