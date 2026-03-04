package practicePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable{
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Id: "+ this.id+ " "+ "Name: "+ this.name;
    }
    @Override
    public int compareTo(Object studs) {
        Student std = (Student) studs;
        if(this.id > std.id) return 1;
        else return -1;
    }
}

public class SortStudent {
    public static void main(String[] args) {
        Student student = new Student(1,"Viraj");
        Student student2 = new Student(2,"Raj");
        Student student4 = new Student(2,"Navya");
        Student student3 = new Student(3,"Manish");
        List<Student> students = new ArrayList<>();
        students.add(student4);
        students.add(student3);
        students.add(student);
        students.add(student2);
        students.add(student);
        System.out.println(students);
//        Comparator<Student> comp = new Comparator<Student>() {
//          public int compare(Student s1, Student s2) {
//              if(s1.id > s2.id) {
//                  return 1;
//              }else{
//                  return -1;
//              }
//          }
//        };
//        students.sort(comp);
        Collections.sort(students);
        System.out.println(students);

    }
}
