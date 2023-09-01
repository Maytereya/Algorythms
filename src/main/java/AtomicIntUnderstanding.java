import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntUnderstanding {
    static int tryCount = 0;

    public static void main(String[] args) {
        int LastNumber = 20;

        AtomicInteger counter = new AtomicInteger();
        System.out.printf("(1) Сумма всех чисел от 1 до %d равна %d\n",
                LastNumber, sum(LastNumber, counter, tryCount));
        System.out.println("Количество итераций: " + counter.get());
        System.out.println("Количество итераций c int: " + tryCount);
        counter.set(0);
        System.out.printf("Простые числа в диапазоне от 1 до %d: \n%s\n", LastNumber,
                findSimpleNum(LastNumber, counter));
        System.out.println("Количество операций: " + counter.get());
    }

    public static int sum(int lastNumber, AtomicInteger c, int tryC) {
        int sum = 0;
        for (int i = 0; i <= lastNumber; i++) {
            sum += i;
            c.getAndIncrement();
            tryC++;
            tryCount++;
        }
        return sum;
    }

    public static ArrayList<Integer> findSimpleNum(int LstNum, AtomicInteger c) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= LstNum; i++) {
            boolean simple = true;
            for (int j = 2; j < i / 2; j++) {
                c.getAndIncrement();
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple)
                arrayList.add(i);
        }
        return arrayList;
    }
}
