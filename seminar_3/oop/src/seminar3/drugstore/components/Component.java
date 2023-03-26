package seminar3.drugstore.components;

public abstract class Component {  // Абстрактный класс Component от которого буду наследоваться компоненты лекарств
    private final String name;  // Имя
    private final String weight;  // Удельная массовая доля
    private final int power;     // Относительная эффективность

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s, weight: %s, power: %s}", this.getClass().getSimpleName(), name, weight, power
        );
    }


    @Override
    public boolean equals(Object obj) {  // Реализовано из рекомендаций по методу equals в спецификации  Object
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Component component = (Component) obj;
        return this.name.equals(
                component.getName()) && this.weight.equals(component.getWeight()) && this.power == component.getPower();
    }

    @Override
    public int hashCode() {
        int hash = name == null ? 0 : name.hashCode();
        hash += weight == null ? 0 : weight.hashCode();
        hash += power;
        return hash;
    }
}
