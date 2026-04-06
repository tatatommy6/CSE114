// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class TicTacLab {
    public TicTacLab() {
    }

    public static void printBoard(char[][] var0) {
        System.out.println("Current board:");

        for(int var1 = 0; var1 < 3; ++var1) {
            for(int var2 = 0; var2 < 3; ++var2) {
            System.out.print(var0[var1][var2]);
            if (var2 < 2) {
                System.out.print('|');
            } else {
                System.out.println();
            }
            }

            if (var1 < 2) {
            System.out.println("–––––");
            }
        }

        System.out.println();
        }

        public static void printCodes() {
        System.out.println("These are the codes for the board positions");
        System.out.println("1|2|3");
        System.out.println("–––––");
        System.out.println("4|5|6");
        System.out.println("–––––");
        System.out.println("7|8|9\n");
        }

        public static boolean checkWin(char[][] var0, char var1) {
        @SuppressWarnings("unused")
        boolean var2 = false;

        for(int var3 = 0; var3 < 3; ++var3) {
            boolean var5 = true;

            for(int var4 = 0; var4 < 3; ++var4) {
            if (var0[var3][var4] != var1) {
                var5 = false;
                break;
            }
            }

            if (var5) {
            return true;
            }
        }

        for(int var7 = 0; var7 < 3; ++var7) {
            boolean var8 = true;

            for(int var6 = 0; var6 < 3; ++var6) {
            if (var0[var6][var7] != var1) {
                var8 = false;
                break;
            }
            }

            if (var8) {
            return true;
            }
        }

        if (var0[0][0] == var1 && var0[1][1] == var1 && var0[2][2] == var1) {
            return true;
        } else if (var0[0][2] == var1 && var0[1][1] == var1 && var0[2][0] == var1) {
            return true;
        } else {
            return false;
        }
        }

        public static void main(String[] var0) {
        char[][] var1 = new char[][]{{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        @SuppressWarnings("resource")
        Scanner var2 = new Scanner(System.in);
        char var3 = 'X';
        int var7 = 0;
        System.out.println("Let's play Tic Tac Toe. Players ready?");
        printCodes();

        for(@SuppressWarnings("unused")
        int var8 = 0; var7 < 9; ++var8) {
            printBoard(var1);
            System.out.print("Enter move for " + var3 + ": ");
            int var6 = var2.nextInt();
            int var4 = (var6 - 1) / 3;
            int var5 = (var6 + 2) % 3;
            if (var1[var4][var5] == ' ') {
            var1[var4][var5] = var3;
            printBoard(var1);
            if (checkWin(var1, var3)) {
                System.out.println("Congratulations, " + var3 + ", you win!");
                return;
            }

            if (var3 == 'X') {
                var3 = 'O';
            } else {
                var3 = 'X';
            }

            ++var7;
            } else {
            System.out.println("Try again, that square is occupied");
            }
        }

        System.out.println("Tie game");
        }
        }
