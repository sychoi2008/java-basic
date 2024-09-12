package class1;

public class ClassStart3 {
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

        System.out.println("name : "+student1.name + " age : "+student1.age+" grade : "+student1.grade);
        System.out.println(student2);

    }
}
