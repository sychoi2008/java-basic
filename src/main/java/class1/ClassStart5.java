package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student(); // 학생을 실제 메모리를 만든다
        student1.name = "stu1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "stu2";
        student2.age = 16;
        student2.grade = 80;

        Student [] students = {student1, student2};

        for(int i=0; i< students.length; i++) {
            Student s = students[i];
            System.out.println("name : "+s.name + " age : "+s.age+" grade : "+s.grade);
        }

        for(Student s : students) {
            System.out.println("name : "+s.name + " age : "+s.age+" grade : "+s.grade);

        }




    }
}
