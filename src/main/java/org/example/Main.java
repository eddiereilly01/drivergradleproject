package org.example;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Student student1  = new Student(1, "Jerry Smith", 20, new DateTime("2002-10-14T10:11:12.123"));
        Student student2  = new Student(2, "John Jones", 23, new DateTime("2002-10-14T10:11:12.123"));
        Student student3  = new Student(3, "Ethan Coyne", 21, new DateTime("2002-10-14T10:11:12.123"));
        Student student4  = new Student(4, "Bob Smith", 18, new DateTime("2002-10-14T10:11:12.123"));
        Student student5  = new Student(5, "Ryan Doe", 17, new DateTime("2002-10-14T10:11:12.123"));
        Student student6  = new Student(6, "Joe Mama", 22, new DateTime("2002-10-14T10:11:12.123"));
        Student student7  = new Student(7, "Mike Hunt", 21, new DateTime("2002-10-14T10:11:12.123"));
        Student student8  = new Student(8, "John Jerry", 20, new DateTime("2002-10-14T10:11:12.123"));
        Student student9  = new Student(9, "Beth Smith", 20, new DateTime("2002-10-14T10:11:12.123"));

        Lecturer lecturer1 = new Lecturer(1, "Adrian Burke", 34, new DateTime(1986, 1, 1, 0,0));
        Lecturer lecturer2 = new Lecturer(2, "John Steve", 33, new DateTime(1987, 3, 1, 0,0));

        Module programming = new Module(1, "Programming", lecturer1 );
        Module networks = new Module(2, "Networking", lecturer2 );
        programming.addStudent(student1);
        programming.addStudent(student2);
        networks.addStudent(student3);
        networks.addStudent(student4);
        networks.addStudent(student5);
        networks.addStudent(student6);
        networks.addStudent(student7);
        programming.addStudent(student8);
        programming.addStudent(student9);

        ArrayList moduleList = new ArrayList<Module>();
        CourseProgramme program = new CourseProgramme("Computer Science & IT",  new DateTime("2022-09-10T09:00:00.000"), new DateTime("2023-05-10T09:00:00.000"));
        program.addStudent(student1);
        program.addStudent(student2);
        program.addStudent(student3);
        program.addStudent(student4);
        program.addStudent(student5);
        program.addStudent(student6);
        program.addStudent(student7);
        program.addStudent(student8);
        program.addStudent(student9);
        program.addModule(programming);
        program.addModule(networks);


        System.out.print(program.toString()+"\n");



    }
}