/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Matheus Rosal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcao = 0;
        int indice = 0;
        Scanner input = new Scanner(System.in);

        List<Jogador> lista = new ArrayList<>();

        Jogador a = new Jogador(17, "Kevin De Bruyne", "Meio campista", 20000, 31);
        lista.add(a);
        Jogador b = new Jogador(10, "Jack Grealish", "Meio campista", 25000, 27);
        lista.add(b);
        Jogador c = new Jogador(47, "Phil Foden", "Meio campista", 15000, 22);
        lista.add(c);
        Jogador d = new Jogador(8, "Ilkay Gundogan", "Meio campista", 13000, 32);
        lista.add(d);
        Jogador e = new Jogador(20, "Bernardo Silva" ,"Meio campista", 13000, 28);
        lista.add(e);
        Jogador f = new Jogador(22, "Joao Cancelo", "Defensor", 13000, 28);
        lista.add(f);
        Jogador g = new Jogador(3, "Ruben Dias", "Defensor", 13000, 26);
        lista.add(g);
        Jogador h = new Jogador(2, "Kyle Walker", "Defensor", 13000, 32);
        lista.add(h);
        Jogador i = new Jogador(19, "Julian Alvarez", "Atacante", 13000, 23);
        lista.add(i);
        Jogador j = new Jogador(9, "Erling Haaland", "Atacante", 13000, 22);
        lista.add(j);
        Jogador k = new Jogador(16, "Rodrigo Hernandez", "Meio campista", 13000, 26);
        lista.add(k);
        Jogador l = new Jogador(31, "Ederson Moraes", "Goleiro", 13000, 29);
        lista.add(l);
        
        while (opcao != 5){
            
            System.out.println("- - - - - BEM VINDO AO MANCHESTER CITY - - - - -");
            System.out.println("1. Ver o elenco atual");
            System.out.println("2. Adicionar jogador");
            System.out.println("3. Remover jogador");
            System.out.println("4. Atualizar status");
            System.out.println("5. Sair do sistema");
         
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("- - - - - ELENCO ATUAL - - - - -");
                    for (Jogador jogador : lista) {
                        System.out.println("Id "+ (indice+1) + " " +jogador); 
                        indice++;
                        if(indice >= lista.size()){
                            indice = 0;
                        }
                    }
                    System.out.println();
               }
                    
                case 2 -> {                                  
                    Jogador atleta = new Jogador();
                    lista.add(atleta);
               }
                    
                case 3 -> {
                    System.out.println("Indique o id do jogador que deseja remover: ");
                    int remover = input.nextInt();
                    remover -= 1;
                    System.out.println("Jogador "+ lista.get(remover).getNome() +" removido!");
                    System.out.println();
                    lista.remove(remover);
               }
                  
                case 4 -> {
                    System.out.println("Escolha uma das opcoes: ");
                    System.out.println("1. Jogador lesionado");
                    System.out.println("2. Jogador fez aniversario");
                    opcao = input.nextInt();
                    if(opcao == 1){
                        System.out.println("Id do jogador que se lesionou: ");
                        indice = input.nextInt();
                        lista.get(indice-1).lesionar();
                    }else{
                        System.out.println("Id do jogador que fez aniversario: ");
                        indice = input.nextInt();
                        lista.get(indice-1).envelhecer();
                    }
                    opcao = 0;
                    indice = 0;
               }
                
                case 5 -> System.out.println("Saindo do sistema...");
                
            }
        }
        
        input.close();
  }
}