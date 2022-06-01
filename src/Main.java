public class Main {
    public static void main(String[] args) {
        int score = 100;
        int admission = 1100;
        int bonus;
        if (admission > 1000) {
            bonus = admission / 100;
        } else {
            bonus = 0;
        }
        int result = score + admission + bonus;
        System.out.println("количество на счету:" + result);
    }
}