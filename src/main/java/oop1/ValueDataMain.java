package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData data = new ValueData();
        add(data);
        add(data);
        add(data);
        System.out.println("final the value : "+data.value);
    }

    static void add(ValueData data) {
        data.value++;
        System.out.println("increase numbers : " + data.value);

    }
}
