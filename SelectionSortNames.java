import java.util.Scanner;

public class SelectionSortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // Selection Sort
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (names[j].compareTo(names[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = names[minIndex];
            names[minIndex] = names[i];
            names[i] = temp;
        }

        System.out.println("Sorted names (A-Z):");
        for (String name : names) {
            System.out.print(name + " ");
        }
        sc.close();
    }
}
