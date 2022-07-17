package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int firstGreates = first > second ? first : second;
        int secondGreatest = second > third ? second : third;

        System.out.println(firstGreates > secondGreatest ? firstGreates : secondGreatest);
    }
}
