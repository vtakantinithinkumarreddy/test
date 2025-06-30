package test;

import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    int marks;
    public Student(String name,int rollNo,int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }
    public void getGrade(int marks){
        this.marks=marks;
        if(marks>=90){
            System.out.println("A");
        }else if(marks>=75 && marks<=89){
            System.out.println("B");
        }else if(marks>=70 && marks<=79){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}
public class q3 {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String name=sc.nextLine();
      int rollNo=sc.nextInt();
      int marks=sc.nextInt();
      Student student=new Student(name,rollNo,marks);
      student.getGrade(marks);
      Student student1=new Student(name,rollNo,marks);
      student1.getGrade(marks);
      Student student2=new Student(name,rollNo,marks);
      student2.getGrade(marks);
      sc.close();
  }
}
