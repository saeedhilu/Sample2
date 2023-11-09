package org.example;

class Student {
    int number;
    int rollnumber;
    String name;

    Student(int i, int j, String k)

    {
        number = i;
        rollnumber = j;
        name = k;
    }

    public void display() {
        System.out.println("NUMBER" + number);
        System.out.println("ROLL NUMBER" + rollnumber);
        System.out.println("NAME" + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student(12, 23, "john");
        s1.display();
    }
}