package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("before the method, dataA.value = "+dataA.value);
        changeReference(dataA);
        System.out.println("after the method, dataA.value = "+dataA.value);


    }
    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
