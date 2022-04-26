import java.io.*;
 
class matrix {
    static int N = 3;
 
    static void rotar90horario(int arr[][]){
        for (int j = 0; j < N; j++){
            for (int i = N - 1; i >= 0; i--)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[][] = { { 10, 33, 9 },
                        { 13, 17, 88 },
                        { 8, 3, 99 } };
        rotar90horario(arr);
    }
}
