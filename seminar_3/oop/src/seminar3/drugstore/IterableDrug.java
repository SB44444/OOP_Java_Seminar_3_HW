package seminar3.drugstore;

import seminar3.drugstore.components.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class IterableDrug implements Iterable<Component>, Comparable<IterableDrug> {
    public List<Component> components;
    public int index;

    // ассоциация. агрегация и композиция.
    public IterableDrug() {
        this.components = new ArrayList<>();
        this.index = 0;
    }
    public void addComponent(Component component) {
        components.add(component);
    }
    public List<Component> getComponents() {
        return components;
    }
    public int getDrugPower() {
        int power = 0;
        for (Component component: components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(IterableDrug o) {
        if (this.getDrugPower() > o.getDrugPower()) return 1;
        return (this.getDrugPower() == o.getDrugPower()) ? 0 : -1;
    }


    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n", this.getClass().getSimpleName(), components, getDrugPower());
    }
//    @Override
//    public IterableDrug compareT(IterableDrug E) {
//        HashSet h = new HashSet<>();
//        for (Component component: E) {
//            h.add.E.components;
//            h.add.this.getClass().getSimpleName(), components;
//
//            System.out.println(component);
//        };



}
