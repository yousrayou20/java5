//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = 9 - i;
        }


        System.out.println("Array elements:");
        for (int num : array) {
            System.out.println(num);
        }
    }
}
