package sumon;

public class Student {
    int id;
    String name;
    static String universityName;

    Student() //Default Constructor
    {
        universityName = "Leading University";
    }

    Student(String name)
    {
        this.name = name;
        System.out.println("Student's Name: " +name);
    }

    Student(int id)
    {
        this.id = id;
        System.out.println("Student's ID: " +id);
    }

    void display()
    {
        System.out.println("University Name: "+universityName);
    }
}

/*
    Name: Md. Atikul Islam Sumon
    ID: 2012020122
    Section: C
    Email: cse_2012020122@lus.ac.bd
    Date: 07-08-2021
 */
