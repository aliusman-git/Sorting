import java.util.*;

public class LinkedListSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);  // Sort the linked list

        System.out.println("Sorted Linked List:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
