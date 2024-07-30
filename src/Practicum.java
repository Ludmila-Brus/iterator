import java.util.ArrayList;
import java.util.Iterator;

public class Practicum {

    public static void main(String[] args) {
        final ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(" ");
        list.add("World!");

        final Iterator<String> iterator; // объявили объект iterator
        iterator = list.iterator(); // проинициализировали iterator через метод iterator()

        while (iterator.hasNext()) { // проверяем, есть ли следующий элемент в коллекции
            final String element = iterator.next();  // возвращаем элемент
            System.out.print(element);
        }
    }
}
