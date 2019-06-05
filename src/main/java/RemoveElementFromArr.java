import java.util.Scanner;

public class RemoveElementFromArr {
    public static void main(String[] args) {
        int[] array;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        System.out.println("Have to put 1 more element with value='0' as last element of array");
        int size = input.nextInt();

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            array[i] = input.nextInt();
        }

        System.out.println("Enter element to remove from array: ");
        int x = input.nextInt();

        int index_del = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == x) {
                index_del = i;
                System.out.println("Position of element which expect to remove from array is: " + index_del);
            }
        }
        for (int i = index_del; i < array.length - 1; i++) {
            array[i] = array[i + 1];
//            array[array.length - 1] = 0;
        }
        for (int value : array) {
            System.out.println(value + " \t ");
        }
    }
}
