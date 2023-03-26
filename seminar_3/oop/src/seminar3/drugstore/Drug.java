package seminar3.drugstore;

import seminar3.drugstore.components.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Drug implements Iterator<Component> {
    private final List<Component> components;  // поле абстрактного класса (список)
    private int index;  // поле абстрактного класса (число)

    public Drug() {   // Конструктор
        this.components = new ArrayList<>(); // добавляет в список  components значение поля
        this.index = 0; //  присваивает переменной  index значение поля класса раное 0
    }

    public void addComponent(Component component) { // Метод класса добавляет значение components в список
        components.add(component);
    }

    public void getComponents() {
        components.forEach(System.out::println);
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }

}
