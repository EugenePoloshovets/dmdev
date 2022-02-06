package payau.core.blockwit.lesson1;

public class MyIntArrayList {

    int size = 0;
    int[] array = new int[10];

    public void add(int value) {
        if (size == array.length) {
            int[] array1 = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                array1[i] = array[i];
            }
            array = array1;
        }
        array[size] = value;
        size += 1;
    }

    public int get(int index) {
        return array[index];
    }

    public int size() {
        return size;
    }

    public void clear(int[] array) {
        System.out.println("Чистим массив!!!!!");
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        size = 0;
    }
}
