package com.company;
class Person {
    private String fornavn;
    private String etternavn;
    private int alder ;
    private String addresse;

    public Person(String fornavn, String etternavn, int alder,String addresse) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;
        this.addresse = addresse;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }
}
class Student extends Person{

    private int StudentId;

    public Student(String fornavn, String etternavn, int alder, int studentId,String addresse) {
     super(fornavn,etternavn,alder,addresse);
        StudentId = studentId;
    }



    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }
}
class Lærer extends Person {

    private int lønn;

    public Lærer(String fornavn, String etternavn, int alder, int lønn,String address) {
        super(fornavn,etternavn,alder,address);
       this.lønn = lønn;
    }

    public int getLønn() {
        return lønn;
    }

    public void setLønn(int lønn) {
        this.lønn = lønn;
    }
}



public class Main {

    public static void main(String[] args) {
        // write your code here

        Student student = new Student("ali", "Zedan", 26, 1234,"trimveien 6");
        System.out.println(student.getFornavn());
        Lærer lærer = new Lærer("ali", "Zedan", 26, 20000,"Osloveien 67");
        System.out.println(lærer.getLønn()+""+lærer.getFornavn());


    }
}