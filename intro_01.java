package OOPS.introducntion;

public class intro_01 {
    public static void main(String[] args) {
        /*
        //stores roll numbers of the student
        int[] rllno = new int[5];

        //stores the names of the student
        String[] names = new String[5];

        //stores the student data (name, roll , marks)
        //you will do manually for all the student --right 
        */
        //Creating object
        Student chandan = new Student();
        Student rabi = new Student(23, "Rabi sah",99.02f);

        //Calling object
        System.out.println(rabi.name);
        // rabi.greatin();
         chandan.greatin();


        // int a = chandan.rllno = 123;
        // chandan.name = "Chandan";
        // chandan.marks = 99.89f;
        // chandan.salary = 1234;
        System.out.println(chandan.rllno);
        System.out.println(chandan.name);
        System.out.println(chandan.marks);
        // rabi.greatin();
       
    }
}  

class Student{
        int rllno;
        String name;
        float marks;

    void greatin(){
        System.out.println("Hii, My name is"+ this.name);
    }

    Student(){// constructor without parameter 
        this.rllno = 123;// this refers to the current object 
        this.name = "Chandan Sah";
        this.marks = 98.76f;
    }
    /* 
    Student(){
    //This will internally call another constructor 
        this(13,"chandan",234.f);
    }
    */
    //when this Studnet(.....) constructor will call 
    //this will replace with then object name 
    Student(int rllno, String name, float marks){
        this.rllno = rllno;
        this.name = name;
        this.marks = marks;

    }

}


