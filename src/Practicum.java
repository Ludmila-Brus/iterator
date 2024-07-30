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

        workWithAll();
    }

    public static void workWithAll() {
        final Collection<String> colors = new ArrayList<>();
        colors.add("Жёлтый");
        colors.add("Красный");

        final Collection<String> colorsAdditional = new ArrayList<>();
        colorsAdditional.add("Зелёный");
        colorsAdditional.add("Жёлтый");

        colors.addAll(colorsAdditional);
        System.out.println(colors);

        final Collection<String> greenAndRed = new ArrayList<>();
        greenAndRed.add("Зелёный");
        greenAndRed.add("Красный");
        System.out.println("Список содержит Зелёный и Красный: " + colors.containsAll(greenAndRed));

        final Collection<String> yellowOnly = new ArrayList<>();
        yellowOnly.add("Жёлтый");
        colors.removeAll(yellowOnly);

        System.out.println(colors);
    }

//    В интерфейсе Collection<T> есть и другие полезные методы, например метод clear() для удаления всех элементов коллекции или метод по преобразованию коллекции в массив toArray().
}
