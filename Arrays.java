import java.util.Scanner;

/**
 * Arrays
 */
public class Arrays {
    public static void main(String[] args) {
        // 1d array
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 2d array
        int[][] arr2 = new int[3][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // 3d array
        int[][][] arr3 = new int[3][3][3];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    arr3[i][j][k] = sc.nextInt();
                }
            }
        }
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                for(int k = 0; k < arr3[i][j].length; k++){
                    System.out.print(arr3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}