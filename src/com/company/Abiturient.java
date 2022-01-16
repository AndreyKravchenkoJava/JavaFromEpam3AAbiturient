package com.company;

import javax.lang.model.element.Name;

public class Abiturient {
    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private int id = idGenerator;
    private String name;
    private String name2;
    private String name3;
    private String address;
    private int phoneNumbers;
    private int[] evaluation;

    public Abiturient (String name, String name2, String name3, String address, int phoneNumbers, int[] evaluation) {
        this.name = name;
        this.name2 = name2;
        this.name3 = name3;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
        this.evaluation = evaluation;
    }
    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName2 () {
        return name2;
    }
    public void setName2 (String name2) {
        this.name2 = name2;
    }
    public String getName3 () {
        return name3;
    }
    public void setName3 (String name3) {
        this.name3 = name3;
    }
    public String getAddress () {
        return address;
    }
    public void setAddress (String address) {
        this.address = address;
    }
    public int getPhoneNumbers () {
        return phoneNumbers;
    }
    public void setPhoneNumbers (int phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    public int[] getEvaluation () {
        return evaluation;
    }
    public void setEvaluation (int[] evaluation) {
        this.evaluation = evaluation;
    }
    private String printArry (int [] evaluation) {
        String str = "";
        for (int i : evaluation) {
            str += i + " ";
        }
        return str;
    }
    public int avg (int [] evaluation) {
        int result = 0;
        for (int i : evaluation) {
            result += 1;
        }
        return result/ evaluation.length;
    }
    public String toString() {
        return "Abiturient {" + " ID " + id + ", name = " + name + ", name2 = " + name2 + ", name3 = " + name3 + ", address = " + address + ", phoneNumbers = " + phoneNumbers
        + ", evalution = " + evaluation + "}";
    }
    public String fullName() {
        return name + " " + name2 + " " +name3;
    }
}
