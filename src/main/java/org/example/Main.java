package org.example;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Student student1  = new Student(1, "John Smith", 20, new DateTime("2002-10-14T10:11:12.123"));
        Student student2  = new Student(2, "Ron Burgundy", 21, new DateTime("2002-08-11T10:11:12.123"));
        Student student3  = new Student(3, "Alex Jones", 22, new DateTime("2002-03-12T10:11:12.123"));
        Student student4  = new Student(4, "John Bones", 20, new DateTime("2002-10-14T10:11:12.123"));
        Student student5  = new Student(5, "Ron Ron", 21, new DateTime("2002-08-11T10:11:12.123"));
        Student student6  = new Student(6, "Alex Wasabi", 22, new DateTime("2002-04-12T10:11:12.123"));

        Module programming = new Module("Programming", 1, "Adrian Clear");
        Module networking = new Module("Networks", 2, "Desmond Chambers");
        Module cybersecurity = new Module("Cybersecurity", 3, "Michael Schuktat");
        ArrayList moduleList = new ArrayList<Student>();

        CourseProgramme program = new CourseProgramme("Computer Science & IT", moduleList, new DateTime("2022-09-10T09:00:00.000"), new DateTime("2023-05-10T09:00:00.000"));

    }
}