package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String [] studentNames = {"stu1", "stu2"};
        int [] studentAges = {15,16};
        int [] studentGrades = {90, 80};

        for(int i=0; i< studentNames.length; i++) {
            System.out.println("name : "+studentNames[i] + " age : "+studentAges[i]+" grade : "+studentGrades[i]);

        }
    }
}
