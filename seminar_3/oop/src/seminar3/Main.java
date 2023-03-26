package seminar3;

import seminar3.drugstore.Drug;
import seminar3.drugstore.IterableDrug;
import seminar3.drugstore.components.Component;
import seminar3.drugstore.components.child.*;
import seminar3.drugstore.drug.CatDrug;
import java.util.Collections;

import seminar3.drugstore.drug.AllComponents;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Все компоненты лекарств ");
        Drug AllComponents = new AllComponents();
        AllComponents.addComponent(new Water("физраствор", "150 мл", 2));
        AllComponents.addComponent(new Tetracyklin("Антибиотик", "250 мг", 60));
        AllComponents.addComponent(new Azitronite("азитронит", "5 мг", 20));
        AllComponents.addComponent(new Azitronite("азитронит", "10 мг", 28));
        AllComponents.addComponent(new VitaminC("Витамин_С", "500 мг", 10));
        AllComponents.addComponent(new VitaminC("Витамин_С", "250 мг", 7));
        AllComponents.addComponent(new Penicillin("Пеницилин", "200 мг", 30));

        while (((Iterator<Component>) AllComponents).hasNext()) {
            System.out.println(((Iterator<Component>) AllComponents).next());
        }
        System.out.println();

        HashSet<Component> result = new HashSet<>();
        while (((Iterator<Component>) AllComponents).hasNext()){
            result.add(((Iterator<Component>) AllComponents).next());
            System.out.print(result);

        }
        System.out.println(" Компоненты, которые не имеют свпадений по всем полям ");
        Set<Component> result3 = new HashSet<>(result);
        for (Component elem: result) {
            //Objects.equals(elem.getName(), result.getClass().getName());
            System.out.println(result3);
        }
        System.out.println();
        IterableDrug catDrug = new CatDrug();
        catDrug.addComponent(new Water("физраствор", "150 мл", 2));
        catDrug.addComponent(new Tetracyklin("Антибиотик", "250 мг", 60));  // Добавлен компонент 4
        catDrug.addComponent(new Azitronite("азитронит", "5 мг", 20));
        catDrug.addComponent(new Azitronite("азитронит", "10 мг", 28));
        catDrug.addComponent(new VitaminC("Витамин_С", "500 мг", 10));  // Добавлен компонент 3
        catDrug.addComponent(new VitaminC("Витамин_С", "250 мг", 7));
        catDrug.addComponent(new Penicillin("Пеницилин", "200 мг", 30));

        for (Component component: catDrug) {
            System.out.println(component);
        }

        System.out.println();
        IterableDrug catDrug1 = new CatDrug();
        IterableDrug catDrug2 = new CatDrug();
        IterableDrug catDrug3 = new CatDrug();
        IterableDrug catDrug4 = new CatDrug(); // Добавлены конструкторы компоненты

        catDrug1.addComponent(new Water("физраствор", "150 мл", 2));
        catDrug1.addComponent(new Azitronite("азитронит", "10 мг", 28));

        catDrug2.addComponent(new Water("физраствор", "150 мл", 2));
        catDrug2.addComponent(new Azitronite("азитронит", "10 мг", 28));
        catDrug2.addComponent(new Tetracyklin("Антибиотик", "250 мг", 60));

        catDrug3.addComponent(new Water("физраствор", "150 мл", 2));
        catDrug3.addComponent(new VitaminC("Витамин_С", "500 мг", 10));
        catDrug3.addComponent(new Azitronite("азитронит", "10 мг", 28));

        catDrug4.addComponent(new Water("физраствор", "150 мл", 2));
        catDrug4.addComponent(new Azitronite("мини азитронит", "5 мг", 15));
        catDrug4.addComponent(new Penicillin("Пеницилин", "200 мг", 30));

        List<IterableDrug> drugs = new ArrayList<>();
        drugs.add(catDrug1);
        drugs.add(catDrug2);
        drugs.add(catDrug3);
        drugs.add(catDrug4);

        System.out.println("Список лекарств до сортировки: ");
        System.out.println(drugs);

        System.out.println();
        System.out.println("Список лекарств после сортировки: ");
        Collections.sort(drugs);
        System.out.println(drugs);

        Set<IterableDrug> result2 = new HashSet<>(drugs);
        System.out.println("Общее кол-во лекарств для кота:  ");
        System.out.println(result2.size());
        for (Component component: catDrug) {
            System.out.println(component);
        }
    }
}
