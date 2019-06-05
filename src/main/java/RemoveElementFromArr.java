import java.util.Scanner;

public class RemoveElementFromArr {
    public static void main(String[] args) {
        int[] array;
        Scanner input = new Scanner(System.in);
        System.out.println("Have to put 1 more element with value='0' as last element of array");
        System.out.println("Enter size of array: ");
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
        //            array[array.length - 1] = 0;
        if (array.length - 1 - index_del >= 0)
            System.arraycopy(array, index_del + 1, array, index_del, array.length - 1 - index_del);
        for (int value : array) {
            System.out.println(value + " \t ");
        }
    }
}
