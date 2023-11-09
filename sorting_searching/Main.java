package sorting_searching;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(10);
        number.add(3);
        number.add(2);
        number.add(0);
        System.out.println(number);

        bubbleSort(number, true); // using buble short algorithm
        // sorting(number); // using collection
        searching(number, 10); // using collection searching
        binarySearch(number, 0); // using binary search algorithm
    }

    private static void sorting(ArrayList<Integer> number) {
        System.out.println("sorting using colection...");
        Collections.sort(number);
        System.out.println("Sorted ArrayList: " + number);
    }

    public static void searching(ArrayList<Integer> obj, int value) {
        System.out.println("searching for "+value+" using collection...");
        int index = Collections.binarySearch(obj, value);
        if (index >= 0) {
            System.out.println(value + " found at index " + (index+1));
        } else {
            System.out.println(value + " not found in the ArrayList");
        }

    }

    public static void bubbleSort(ArrayList<Integer> list, boolean isAscending) {
        int n = list.size();
        System.out.println("sorting within buble sort...");
        if (isAscending) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (list.get(j) > list.get(j + 1)) {
                        int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }

        } else {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (list.get(j) < list.get(j + 1)) {
                        int temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                }
            }
        }
        System.out.println("Sorted ArrayList: " + list);

    }

    public static void binarySearch(ArrayList<Integer> list, int value) {
        int left = 0;
        int right = list.size() - 1;
        boolean condition = false;
         System.out.println("searching for "+value+" using binary sort...");
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == value) {
                condition = true;
                System.out.println(value + " was found at index: " + (mid+1));
                break;
            } else if (list.get(mid) < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!condition) {
            System.out.println(value + " not found :(");
        }

    }

}
