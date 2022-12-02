import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Софья Свиридова
 */

public class Func {

    /**
     * Функция add() предназначена для добавления новых элементов в ArrayList и LinkedList.
     * Мы используем функцию nanoTime для получения текущего времени и с переменной duration
     * мы получаем время, потраченное на использование каждой из этих функций.
     */
    public void add() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        long startTime = System.nanoTime();
        for (int i =0; i<2000; i++)
            arrayList.add(100);
        long endTime = System.nanoTime();
        long duration = (endTime-startTime);
        System.out.println("ArrayList добавление - "+ duration);
        startTime = System.nanoTime();
        for (int i =0; i<2000; i++)
            list.add(100);
        endTime = System.nanoTime();
        duration = (endTime-startTime);
        System.out.println("LinkedList добавление - "+ duration);
    }

    /**
     * В функции get() почти то же самое, но получаем элемент с нужной позиции.
     */
    void get() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i =0; i<2000; i++)
            arrayList.add(100);
        for (int i =0; i<2000; i++)
            list.add(100);
        long startTime = System.nanoTime();
        for (int i =0; i<2000; i++)
            arrayList.get(i);
        long endTime = System.nanoTime();
        long duration = (endTime-startTime);
        System.out.println("ArrayList получение - "+ duration);
        startTime = System.nanoTime();
        for (int i =0; i<2000; i++)
            list.get(i);
        endTime = System.nanoTime();
        duration = (endTime-startTime);
        System.out.println("LinkedList получение - "+ duration);
    }

    /**
     * В функции delete() мы удаляем элемент из каждой позиции и
     * подсчитываем время, затраченное на эту функцию.
     */
    void delete() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i =0; i<2000; i++)
            arrayList.add(100);

        for (int i =0; i<2000; i++)
            list.add(100);

        long startTime = System.nanoTime();
        for (int i = 1999; i>=0; i--)
            arrayList.remove(i);
        long endTime = System.nanoTime();
        long duration = (endTime-startTime);
        System.out.println("ArrayList удаление - "+ duration);
        startTime = System.nanoTime();
        for (int i =1999; i>=0; i--)
            list.remove(i);
        endTime = System.nanoTime();
        duration = (endTime-startTime);
        System.out.println("LinkedList удаление - "+ duration);
    }
}
