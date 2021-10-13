public class HomeWorkApp {
    public static void main(String[] args) {
        replacement();
        System.out.println("---- sout ----");
        array();
        System.out.println("---- sout ----");
        multiplication();
        System.out.println("---- sout ----");
        completion();
        System.out.println("---- sout ----");
        acceptingTwoArguments(5, 2);
    }

    public static void replacement() {
        int[] arrOne = {1, 0, 1, 0, 1, 0};
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] == 1) {
                arrOne[i] = 0;
            } else {
                arrOne[i] = 1;
            }
            System.out.println(arrOne[i] + " ");
        }
    }

    public static void array() {
        int[] arrTwo = new int[100];
        for (int i = 1; i < arrTwo.length; i++) {
            arrTwo[i] = i;
            System.out.println(arrTwo[i]);
        }
    }


    public static void multiplication() {
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] *= 2;
            }
            System.out.println(arrThree[i]);
        }


    }

    public static void completion() {
        int[][] arrFour = new int[3][3];
        for (int i = 0; i <= arrFour[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arrFour.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < arrFour[i].length; j++) {
                if (i == j) {
                    arrFour[i][j] = 1;
                }
                System.out.print(arrFour[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[] acceptingTwoArguments(int len, int initialValue) {
        int[] arrFive = {len};
        for (int i = 0; i < arrFive.length; i++) {
            arrFive[i] = initialValue;
        }
        return arrFive;

    }
}
