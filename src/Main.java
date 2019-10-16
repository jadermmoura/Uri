
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jader
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList guarda = new ArrayList();
        while (in.hasNext()) {
    String w[] = new String(in.nextLine()).split(" ");
    int numero = Integer.parseInt(w[0]);
        
            char[] palavra = w[1].toCharArray();
            for (char c : palavra) {
                if (true) {
                    
                }
            }
            System.out.println(guarda);
        }
    
    
    }
}
//SELECT CODIGO, NOME FROM CLIENTES
//SELECT * FROM CLIENTES