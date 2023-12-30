/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixcalculator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class MatrixCalculator {

    private static Object integer;
    private static String determinant1;

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int choice;
        
       
        

        Scanner keyboard = new Scanner (System.in);
        System.out.println("==================================");
        System.out.println("UAS ALGEO");
        System.out.println("==================================");
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Hitung Matriks");
            System.out.println("2. Matriks Transpose");
            System.out.println("3. Matriks Balikan");
            System.out.println("4. Determinan");
            System.out.println("5. Sistem Persamaan Linear");
            System.out.println("6. keluar");

            System.out.print("Pilih menu (1-6): ");
            choice = scanner.nextInt();
            System.out.println("==================================");
            switch (choice) {
                case 1:
                    System.out.println("Menu Hitung Matriks:");
                    System.out.println("1. Penjumlahan");
                    System.out.println("2. Pengurangan");
                    
                    System.out.print("Pilih menu (1-2): ");
                    choice = scanner.nextInt();
                    
                    switch (choice) {
                        case 1:
                         // Masukan dimensi matriks
                        System.out.println("Masukan Jumlah Kolom dan Baris Matriks :");
                        int rows = scanner.nextInt();
                        int cols = scanner.nextInt();

                        // Masukan matriks pertama
                        System.out.println("Masukan Matriks Pertama :");
                        int[][] matrix1 = new int[rows][cols];
                        for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                        matrix1[i][j] = scanner.nextInt();
                        }
                    }

                        // Masukan matriks kedua
                        System.out.println("Masukan Matriks Kedua :");
                        int[][] matrix2 = new int[rows][cols];
                        for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                        matrix2[i][j] = scanner.nextInt();
                        }
                        }

                        // Lakukan penjumlahan matriks
                        int[][] resultMatrix = new int[rows][cols];
                        for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                        resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                        }
                    }

                        // Menampilkan hasil matriks
                        System.out.println("Hasil dari Penjumlahan Matriks :");
                        for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                        System.out.print(resultMatrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                        System.out.println("==================================");
                        break;
                    
                            
                        case 2:
                        // Masukan dimensi matriks
                        System.out.println("Masukan Jumlah Kolom dan Baris Matriks :");
                        int rws = scanner.nextInt();
                        int cls = scanner.nextInt();

                        // Masukan matriks pertama
                        System.out.println("Masukan Matriks Pertama :");
                        int[][] matrix3 = new int[rws][cls];
                        for (int i = 0; i < rws; i++) {
                        for (int j = 0; j < cls; j++) {
                        matrix3[i][j] = scanner.nextInt();
                        }
                    }
                        // Masukan matriks kedua
                        System.out.println("Masukan Matriks Kedua :");
                        int[][] matrix4 = new int[rws][cls];
                        for (int i = 0; i < rws; i++) {
                        for (int j = 0; j < cls; j++) {
                        matrix4[i][j] = scanner.nextInt();
                        }
                        }
                        // Melakukan pengurangan matriks
                        int[][] resultMatrix3 = new int[rws][cls];
                        for (int i = 0; i < rws; i++) {
                        for (int j = 0; j < cls; j++) {
                        resultMatrix3[i][j] = matrix3[i][j] - matrix4[i][j];
                        }
                    }
                        // Menampilkan hasil matriks
                        System.out.println("Hasil dari Pengurangan Matriks :");
                        for (int i = 0; i < rws; i++) {
                        for (int j = 0; j < cls; j++) {
                        System.out.print(resultMatrix3[i][j] + " ");
                        }
                        System.out.println();
                    }
                        System.out.println("==================================");
                    break;
                    
                    }
                            
                
                case 2:
                    
                    System.out.println("Menu Transpose ");
                    System.out.println("Pilih Dimensi yang anda inginkan");
                    System.out.println("1. 2 x 2");
                            
                    System.out.println("2. 3 x 3");
                    
                    System.out.print("Pilih menu (1-2): ");
                    choice = scanner.nextInt();
                    
                    switch (choice) {
                         case 1:
                             int i, j, m, n,jumlah = 0;
                             int matriks[][] = new int[10][10];
                             int transpose[][] = new int[10][10];
                             
                         Scanner scan = new Scanner(System.in);
                         System.out.println("Masukan jumlah baris matriks : ");
                         m = scan.nextInt();
                         System.out.println("Masukan jumlah kolom matriks : ");
                         n = scan.nextInt();
                         System.out.println("Masukan elemen matriks : ");
                         for (i=0; i<m; i++){
                             for(j=0; j<n; j++){
                              matriks[i][j] = scan.nextInt();
                         }
                         }  for (i=0; i<m; i++){
                             for(j=0; j<n; j++){
                               transpose[j][i] = matriks[i][j];  
                             }
                         } System.out.println("Hasil Tranpose Matriks : ");
                         for(i=0; i<n; i++){
                             for(j=0; j<m; j++){
                                 System.out.print(transpose[i][j] + "\t");
                             }
                             System.out.println();
                         }
                         System.out.println("==================================");
                        break;
                    
                        case 2:
                         int matriks1[][] = new int[10][10];
                         int transpose1[][] = new int[10][10];
                         scan = new Scanner(System.in);
                         System.out.println("Masukan jumlah baris matriks : ");
                         m = scan.nextInt();
                         System.out.println("Masukan jumlah kolom matriks : ");
                         n = scan.nextInt();
                         System.out.println("Masukan elemen matriks : ");
                         for (i=0; i<m; i++){
                             for(j=0; j<n; j++){
                              matriks1[i][j] = scan.nextInt();
                         }
                         }  for (i=0; i<m; i++){
                             for(j=0; j<n; j++){
                               transpose1[j][i] = matriks1[i][j];  
                             }
                         } System.out.println("Hasil Tranpose Matriks : ");
                         for(i=0; i<n; i++){
                             for(j=0; j<m; j++){
                                 System.out.print(transpose1[i][j] + "\t");
                             }
                             System.out.println();
                         }
                         System.out.println("==================================");
                        break;
                    }
                    
        break;
                case 3:
                 System.out.println("Menu Invers");
                 // Masukan elemen matriks
                 System.out.println("Masukan elemen matriks 2x2 :");
                 System.out.print("a: ");
                 int a = scanner.nextInt();
                 System.out.print("b: ");
                 int b = scanner.nextInt();
                 System.out.print("c: ");
                 int c = scanner.nextInt();
                 System.out.print("d: ");
                 int d = scanner.nextInt();

                // hitung determinan
                int determinant = a * d - b * c;

                // peiksa apakah matirksnya dapat dibalik
                if (determinant == 0) {
                System.out.println("Matriks Tidak bisa dibalik.");
                } else {
                // Hitung Matriks invers nya 
                int temp = a;
                a = d;
                d = temp;
                b = -b;
                c = -c;

                // Menampilkan matriks invers
                System.out.println("\n matrik inversnya adalah :");
                System.out.println(a + "/" + determinant + "\t" + b + "/" + determinant);
                System.out.println(c + "/" + determinant + "\t" + d + "/" + determinant);
        }
                System.out.println("==================================");
                    break;
                case 4:
                    System.out.println("Menu Determinan:");
                    System.out.println("Pilih Dimensi yang anda inginkan");
                    System.out.println("1. 2 x 2");
                    System.out.println("2. 3 x 3");
                    
                    System.out.print("Pilih menu (1-2): ");
                    choice = scanner.nextInt();
                    switch (choice) {
                    case 1:
                    
                     // Masukan element matriks
                     System.out.println("Masukkan element matriks 2x2 :");
                     System.out.print("Masukan element a11: ");
                     double a11 = scanner.nextDouble();
                     System.out.print("Masukan element a12: ");
                     double a12 = scanner.nextDouble();
                     System.out.print("Masukan element a21: ");
                     double a21 = scanner.nextDouble();
                     System.out.print("Masukan element a22: ");
                     double a22 = scanner.nextDouble();

                     // Hitung Determinan
                     determinant = (int) ((a11 * a22) - (a12 * a21));

                    // Menampilkan hasil
                    System.out.println("Determinan matriks adalah : " + determinant);
                    System.out.println("==================================");
                    break;
                    case 2:
                        System.out.println("Masukkan elemen matriks 3x3:");

                    double[][] matrix = new double[3][3];

                    for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                    matrix[i][j] = scanner.nextDouble();
                        }
                    }

                    determinant = 0;
                    determinant += (int)matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]);
                    determinant -= (int)matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
                    determinant += (int)matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        
                    //Menampilkan hasil
                    System.out.println("Determinan matriks adalah: " + determinant);
        
                    }
                    System.out.println("==================================");
                    break;
                case 5:
                System.out.println("Menu Sistem Persamaan Linear");
                // Masukan koefesien untuk persamaan pertama
                System.out.println("Masukan koefesien persamaan pertama (ax + by = c):");
                System.out.print("Input a: ");
                double a1 = scanner.nextDouble();
                System.out.print("Input b: ");
                double b1 = scanner.nextDouble();
                System.out.print("Input c: ");
                double c1 = scanner.nextDouble();

                // Masukan koefesien untuk persamaan kedua
                System.out.println("Masukan koefisien persamaan kedua  (dx + ey = f):");
                System.out.print("Input d: ");
                double a2 = scanner.nextDouble();
                System.out.print("Input e: ");
                double b2 = scanner.nextDouble();
                System.out.print("Input f: ");
                double c2 = scanner.nextDouble();

                // menyelesaikan sistem persamaan linear
                determinant = (int) ((int) a1 * b2 - a2 * b1);

                if (determinant == 0) {
                System.out.println("Sistem tidak memiliki solusi unik.");
                } else {
                // Hitung solusinya
                double x = (c1 * b2 - c2 * b1) / determinant;
                double y = (a1 * c2 - a2 * c1) / determinant;

                // Tampilkan solusinya
                System.out.println("Solusinya adalah: ");
                System.out.println("x = " + x);
                System.out.println("y = " + y);
        }
                System.out.println("==================================");
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (choice != 6);

        scanner.close();
    }

    
    }

    
    
