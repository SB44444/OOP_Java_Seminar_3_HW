package seminar3.drugstore.components.child;

import seminar3.drugstore.components.Component;
import seminar3.drugstore.Drug;
import seminar3.drugstore.IterableDrug;

public class Penicillin extends Component {  // Класс Penicillin наследуется от класса Component
    public Penicillin(String name, String weight, int power) {
        super(name, weight, power); // заданы поля свойств
    }
}
