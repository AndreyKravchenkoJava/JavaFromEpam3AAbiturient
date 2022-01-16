package com.company;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class AbiturientList {
    private List<Abiturient> abiturientList = new ArrayList<>();
    public void addAbiturient (Abiturient a) {
        abiturientList.add(a);
    }
    public void unsatisfactoryEvaluation (int[] evaluation) {
        System.out.println("Список абитуриентов, имеющих неудовлетворительные оценки: ");
        for (Abiturient a : abiturientList) {
            for (int i : a.getEvaluation()) {
                if (i <= 3) {
                    System.out.println(a.toString());
                }
            }
        }
    }
}
