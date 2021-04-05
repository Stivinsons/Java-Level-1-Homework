import java.util.Random;
import java.util.Scanner;

public class HomeWorkFour {
    static void main() {
        char[][] field = createfield();
        PaintField(field);

        while (true) {
            PlayerMove(field);
            if (Win(field, 'X') || FullField(field)) {
                break;
            }
            System.out.println();
            AiMove(field);
            if (Win(field, 'O') || FullField(field)) {
                break;
            }
        }
    }

    static char[][] createfield() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }

    static void PaintField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void PlayerMove(char[][] field) {
        int horizontal;
        int vertical;
        do {
            horizontal = GetCoord("horizontal");
            vertical = GetCoord("vertical");
        } while (CheckBusy(field, vertical, horizontal));
        field[horizontal][vertical] = 'X';
        PaintField(field);
    }

    static void AiMove(char[][] field) {
        Random random = new Random();
        int horizontal;
        int vertical;
        do {
            horizontal = random.nextInt(field.length);
            vertical = random.nextInt(field.length);
        } while (CheckBusy(field, vertical, horizontal));
        field[horizontal][vertical] = 'O';
        PaintField(field);
    }

    static int GetCoord(String CoordType) {
        Scanner scan = new Scanner(System.in);
        int coord;
        do {
            System.out.printf("Enter %s coordinate [1-3]%n", CoordType);
            coord = scan.nextInt() - 1;
        } while (coord < 0 || coord >= 3);
        return coord;
    }

    static boolean CheckBusy(char[][] field, int vertical, int horizontal) {
        return field[horizontal][vertical] != '-';
    }

    static boolean CheckFree(char[][] field, int horizontal, int vertical) {
        return !CheckBusy(field, horizontal, vertical);
    }

    static boolean FullField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (CheckFree(field, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean Win(char[][] field, char sign) {
        /*// horizontal
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == sign && field[i][1] == sign && field[i][2] == sign) {
                return true;
            }
        }

        // vertical
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign) {
                return true;
            }
        }

        // diagonals
        if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) {
            return true;
        }
        if (field[0][2] == sign && field[1][1] == sign && field[2][0] == sign) {
            return true;
        }

        return false;*/

        //horizontal
        for (int i = 0; i < field.length; i++) {
            int x = 0;
            for (int j = 0; j < field.length; j++) {
                if(field[i][j] == sign){
                    x++;
                    if( x == 3 ){return true;}
                }//Для поля 5х5 необходимо добавить else {x = 0;}
            }
        }

        //verticals
        for (int i = 0; i < field.length; i++) {
            int x = 0;
            for (int j = 0; j < field.length; j++) {
                if(field[j][i] == sign){
                    x++;
                    if( x == 3 ){return true;}
                }//Для поля 5х5 необходимо добавить else {x = 0;}
            }
        }

        //diagonalOne
        int x = 0;
        for (int i = 0; i < field.length; i++) { ;
            for (int j = 0; j < field.length; j++) {
                if (i == j && field[i][j] == sign) {
                    x++;
                    if( x == 3 ){return true;}
                }//Для поля 5х5 необходимо добавить else {x = 0;}
            }
        }

        //diagonalTwo
        int y = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (i == field.length -1 -j && field[i][j] == sign){
                    y++;
                    if( y == 3 ){return true;}
                }//Для поля 5х5 необходимо добавить else {y = 0;}
            }
        }return false;
    }
}
