package seminar3.drugstore.components.child;

import seminar3.drugstore.components.Component;

public class Water extends Component {   // Класс Water наследуется от класса Component (saline_solution)
    public Water(String name, String weight, int power) {
        super(name, weight, power);  // заданы поля свойств
    }
}
