package com.company;

public class Main {

    public static void main(String[] args) {
        Abiturient a1 = new Abiturient("Андрей", "Витальевич", "Кравченко", "Тополь", 0506164774, new int[] {3, 3, 5});
        Abiturient a2 = new Abiturient("Кирилл", "Викторович", "Шевченко", "Тополь", 0506453774, new int[] {2, 2, 3});
        Abiturient a3 = new Abiturient("Владимир", "Владимирович", "Шмалько", "Центральный", 0504443574, new int[] {4, 4, 5});
        Abiturient a4 = new Abiturient("Анастасия", "Владимировка", "Швыдкая", "Слобожанское", 0506333374, new int[] {5, 5, 5});
        Abiturient a5 = new Abiturient("Сергей", "Юрьевич", "Колягин", "Титово", 0503224774, new int[] {2, 3, 3, 4});

        AbiturientList newList = new AbiturientList();
        newList.addAbiturient(a1);
        newList.addAbiturient(a2);
        newList.addAbiturient(a3);
        newList.addAbiturient(a4);
        newList.addAbiturient(a5);
        newList.unsatisfactoryEvaluation(new int[] {});
    }
}
