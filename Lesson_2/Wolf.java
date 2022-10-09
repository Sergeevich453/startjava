public class Wolf {
    
    String gender;
    String nickname;
    int weight;
    int age;
    String color;

    String walk() {
        return "Волк идет!";
    }

    String sit() {
        return "Волк сел!";
    }

    String run() {
        return "Волк бежит!";
    }

    String howl() {
        return "Волк воет: У-У-У!";
    }

    boolean hunting() {
        return true;
    }
}