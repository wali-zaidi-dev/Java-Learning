package arrayOfObject;

class Students {
    String name;
    int age;
    int grade;
}

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.age = 22;
        s1.grade = 99;
        s1.name = "John";

        Students s2 = new Students();
        s2.age = 24;
        s2.grade = 98;
        s2.name = "Jane";

        Students s3 = new Students();
        s3.age = 28;
        s3.grade = 94;
        s3.name = "Mary";

        Students students[] = new Students[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student Name = " + students[i].name + " & "  + "Student Age = " + students[i].age + " & " + "Student Grade = " + students[i].grade);
        }

    }
}
