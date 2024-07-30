import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection; // импортируем интерфейс Collection



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

        final Collection<String> colors = new ArrayList<>();
        colors.add("Жёлтый");
        colors.add("Красный");
        colors.add("Зелёный");

        System.out.println("Список содержит Зелёный: " + colors.contains("Зелёный"));

        colors.remove("Жёлтый");
        System.out.println(colors);

        System.out.println("Оставшееся количество элементов: " + colors.size());
        System.out.println("Коллекция пустая? " + colors.isEmpty());
    }
}
