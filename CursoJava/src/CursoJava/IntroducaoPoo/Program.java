package CursoJava.IntroducaoPoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CursoJava.IntroducaoPoo.Users;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Users> user = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Users pessoa = new Users("Pessoa " + i + " - ", 20 + i);
            user.add(pessoa);
            System.out.print(user.get(i).getNome());
            System.out.println(user.get(i).getIdade());

     
        }

        // Trabalhando com matrizes

        System.out.println("Digite o valor referente ao tamanho da matriz quadrada: ");
        int n = scan.nextInt();

       int [][] matriz = new int[n][n];
       
       for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Digite o valor na posição " + i + "-" + j);
                matriz[i][j] = scan.nextInt();
            }
       }

       scan.close();
    }
}