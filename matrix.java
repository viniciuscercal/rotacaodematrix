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
        int arr[][] = { { 1, 2, 3 },
                        { 5, 6, 7 },
                        { 9, 10, 11 } };
        rotar90horario(arr);
    }
}
