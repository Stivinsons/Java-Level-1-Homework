public class HomeWorkTwo {
    public static void main(String[] args){
        doTaskFive(2, 18);
    }

    static void doTaskOne() {
        int[] array = {0,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,0};
        for (int i = 0; i < array.length; i++){
            switch (array[i]){
                case 0: {
                    array[i] = 1;
                    break;
                }
                case 1: {
                    array[i] = 0;
                    break;
                }
            }
            System.out.println(array[i]);
        }
    }

    static void doTaskTwo() {
        int[] arrayTwo = new int[100];
        for (int i = 0; i < arrayTwo.length; i++){
            arrayTwo[i] = i + 1;
            System.out.println(arrayTwo[i]);
        }
    }

    static void doTaskThree() {
        int[] arrayThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayThree.length; i++){
            if (arrayThree[i] < 6 ) {
                arrayThree[i] = arrayThree[i] * 2;
            }
            System.out.println(arrayThree[i]);
        }
    }

    static void doTaskFour(){
        int[][] arrayFour = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        for (int i = 0; i < arrayFour.length; i++){
            for (int j = 0; j < arrayFour[i].length; j++) {
                if (i == j) {
                    arrayFour[i][j] = 1;
                }else if (i == 2 -j ){
                    arrayFour[i][j] = 1;
                }
                System.out.print(arrayFour[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //int len = 10;
    //int initialValue = 111;

    static void doTaskFive(int len,int initialValue) {
        int[] arrayFive = new int[len];
        for (int i = 0; i < arrayFive.length; i++){
            arrayFive[i] = initialValue;
            System.out.println(arrayFive[i]);
        }
    }
}

