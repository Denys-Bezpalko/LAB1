import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        for(;;) {


            BufferedReader check =
                    new BufferedReader(new InputStreamReader(System.in));
            int chk = Integer.parseInt(check.readLine());
            if(chk == 0){break;};

            int[] arrayInt = new int[10];
            int[] arrayInt2 = new int[]{100, 200, 300};
            String[] arrayStr = new String[]{"FIRST", "SECOND", "THIRD"};

            for (int i = 0; i < arrayInt.length; i++) {
                arrayInt[i] = i * 10;
                System.out.print(arrayInt[i] + " ");

            }
            System.out.println();


            int index = 0;
            while (true) {
                arrayInt2[index] = 200 * index;
                index++;
                if (index > 2) {
                    break;
                }

            }

            for (int elem : arrayInt) {
                System.out.print(elem + " ");
            }
            System.out.println();

            for (int i = 7; i > 0; i--) {
                if (i == 3) {
                    continue;
                } else if (i == 1) break;
                System.out.println(i);
            }

            System.out.println("__________________________________________________________________");

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(System.in));
            int[] arr = new int[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }

            System.out.println("__________________________________________________________________");

            System.out.println(Arrays.toString(arr));

            Arrays.sort(arr);

            System.out.println(Arrays.toString(arr));

            System.out.println("__________________________________________________________________");

            BufferedReader reader2 =
                    new BufferedReader(new InputStreamReader(System.in));
            int[] arr2 = new int[10];
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = Integer.parseInt(reader2.readLine());
            }

            Set<Integer> set1 = new TreeSet<>();

            for (int el : arr2) {
                set1.add(el);
            }

            System.out.println(Arrays.toString(arr2));
            System.out.println(set1);

            List<String> list1 = new ArrayList<>();
            list1.add("ONE");
            list1.add("TWO");
            list1.add("THREE");
            list1.add(0, "NULL");
            list1.remove(0);
            System.out.println("? : " + list1.contains("THREE"));

            System.out.println(list1);

            List<User> list2 = new ArrayList<>();
            list2.add(new User("DENYS", 27));
            list2.add(new User("VLADIMIR", 24));
            list2.add(new User("ROMAN", 47));

            System.out.println(list2);
            System.out.println(list2.contains(new User("DENYS", 37)));
            System.out.println(list2.contains(new User("DENYS", 27)));
            break;
        }
        //Домашняя работа, Сортировка пузырьком и поиск числа

        for(;;) {

            BufferedReader SortTest =
                    new BufferedReader(new InputStreamReader(System.in));

            int chk = Integer.parseInt(SortTest.readLine());
            if (chk == 0) {
                break;
            }
            ;

            int[] arrsort = new int[5];
            System.out.println("ENTER THE NUMBER:");
            for (int i = 0; i < arrsort.length; i++) {
                arrsort[i] = Integer.parseInt(SortTest.readLine());
            }
            System.out.println("ARRAY LENGTH = " + arrsort.length);


            int j = 0;
            while (j <= arrsort.length) {
                int i = 0;
                while (i <= arrsort.length) {
                    if (i == arrsort.length - 1) {
                        break;
                    }
                    if (arrsort[i] > arrsort[i + 1]) {
                        int buf = arrsort[i];
                        arrsort[i] = arrsort[i + 1];
                        arrsort[i + 1] = buf;
                    }
                    System.out.println(i + 1);
                    System.out.println(Arrays.toString(arrsort));

                    i++;
                }
                j++;
            }

            System.out.println("NUMBER SEARCH. ENTER THE NUMBER");

            BufferedReader SearchTest =
                    new BufferedReader(new InputStreamReader(System.in));
            int search = Integer.parseInt(SearchTest.readLine());

            int i = 0;
            boolean check = true;
            while (i <= arrsort.length - 1) {
                if (search == arrsort[i]) {
                    System.out.println("NUMBER EXIST, #" + ++i);
                    check = false;
                }
                i++;
            }
            if (check == true) {
                System.out.println("NUMBER NOT EXIST");
            }

            //Бинарный поиск
            System.out.println("BINSEARCH");
            int[] binsearch = new int[16];

            for (i = 0; i < binsearch.length; i++) {
                binsearch[i] = Integer.parseInt(SortTest.readLine());
            }

            Arrays.sort(binsearch);

            int low = 0;
            int high = binsearch.length;
            int key = 0;

            System.out.println(Arrays.toString(binsearch));

            System.out.println("ENTER NUMBER ONE");

            key = Integer.parseInt(SortTest.readLine());

            while (low <= high) {
                int mid = (low + high) / 2;
                if (binsearch[mid] < key) {
                    low = mid + 1;
                } else if (binsearch[mid] > key) {
                    high = mid - 1;
                } else if (binsearch[mid] == key) {
                    System.out.println(mid + 1);
                    break;
                }


            }

            int iteration;
            System.out.println("ENTER THE SIZE");
            iteration = Integer.parseInt(SearchTest.readLine());
            String[] ArrayString = new String[iteration];

            System.out.println("ENTER THE STRINGS");
            for (int n = 0; n < ArrayString.length; n++) {
                ArrayString[n] = SearchTest.readLine();
            }

            for (int n = 0; n < ArrayString.length; n++) {
                System.out.println(ArrayString[n]);
            }

            Arrays.sort(ArrayString);

            for (int n = 0; n < ArrayString.length; n++) {
                System.out.println(ArrayString[n]);
            }

            break;
        }

    }
}



