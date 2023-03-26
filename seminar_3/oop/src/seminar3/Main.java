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

        System.out.println(" ��� ���������� �������� ");
        Drug AllComponents = new AllComponents();
        AllComponents.addComponent(new Water("����������", "150 ��", 2));
        AllComponents.addComponent(new Tetracyklin("����������", "250 ��", 60));
        AllComponents.addComponent(new Azitronite("���������", "5 ��", 20));
        AllComponents.addComponent(new Azitronite("���������", "10 ��", 28));
        AllComponents.addComponent(new VitaminC("�������_�", "500 ��", 10));
        AllComponents.addComponent(new VitaminC("�������_�", "250 ��", 7));
        AllComponents.addComponent(new Penicillin("���������", "200 ��", 30));

        while (((Iterator<Component>) AllComponents).hasNext()) {
            System.out.println(((Iterator<Component>) AllComponents).next());
        }
        System.out.println();

        HashSet<Component> result = new HashSet<>();
        while (((Iterator<Component>) AllComponents).hasNext()){
            result.add(((Iterator<Component>) AllComponents).next());
            System.out.print(result);

        }
        System.out.println(" ����������, ������� �� ����� ��������� �� ���� ����� ");
        Set<Component> result3 = new HashSet<>(result);
        for (Component elem: result) {
            //Objects.equals(elem.getName(), result.getClass().getName());
            System.out.println(result3);
        }
        System.out.println();
        IterableDrug catDrug = new CatDrug();
        catDrug.addComponent(new Water("����������", "150 ��", 2));
        catDrug.addComponent(new Tetracyklin("����������", "250 ��", 60));  // �������� ��������� 4
        catDrug.addComponent(new Azitronite("���������", "5 ��", 20));
        catDrug.addComponent(new Azitronite("���������", "10 ��", 28));
        catDrug.addComponent(new VitaminC("�������_�", "500 ��", 10));  // �������� ��������� 3
        catDrug.addComponent(new VitaminC("�������_�", "250 ��", 7));
        catDrug.addComponent(new Penicillin("���������", "200 ��", 30));

        for (Component component: catDrug) {
            System.out.println(component);
        }

        System.out.println();
        IterableDrug catDrug1 = new CatDrug();
        IterableDrug catDrug2 = new CatDrug();
        IterableDrug catDrug3 = new CatDrug();
        IterableDrug catDrug4 = new CatDrug(); // ��������� ������������ ����������

        catDrug1.addComponent(new Water("����������", "150 ��", 2));
        catDrug1.addComponent(new Azitronite("���������", "10 ��", 28));

        catDrug2.addComponent(new Water("����������", "150 ��", 2));
        catDrug2.addComponent(new Azitronite("���������", "10 ��", 28));
        catDrug2.addComponent(new Tetracyklin("����������", "250 ��", 60));

        catDrug3.addComponent(new Water("����������", "150 ��", 2));
        catDrug3.addComponent(new VitaminC("�������_�", "500 ��", 10));
        catDrug3.addComponent(new Azitronite("���������", "10 ��", 28));

        catDrug4.addComponent(new Water("����������", "150 ��", 2));
        catDrug4.addComponent(new Azitronite("���� ���������", "5 ��", 15));
        catDrug4.addComponent(new Penicillin("���������", "200 ��", 30));

        List<IterableDrug> drugs = new ArrayList<>();
        drugs.add(catDrug1);
        drugs.add(catDrug2);
        drugs.add(catDrug3);
        drugs.add(catDrug4);

        System.out.println("������ �������� �� ����������: ");
        System.out.println(drugs);

        System.out.println();
        System.out.println("������ �������� ����� ����������: ");
        Collections.sort(drugs);
        System.out.println(drugs);

        Set<IterableDrug> result2 = new HashSet<>(drugs);
        System.out.println("����� ���-�� �������� ��� ����:  ");
        System.out.println(result2.size());
        for (Component component: catDrug) {
            System.out.println(component);
        }
    }
}
