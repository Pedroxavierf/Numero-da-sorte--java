import java.util.Random;
import java.util.Scanner;


public class Main

{

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random randomizacao = new Random();
        int tentativas = 0;
        int cpu = randomizacao.nextInt(100);
        System.out.printf("Ola Digite seu nome:");
        String nome = leitor.nextLine();
        int premio = randomizacao.nextInt(100);

        for (int i = 0; i < 20; i++) {

            System.out.printf("Ola %s\n Digite seu numero da sorte:",nome);
            int numsorte = leitor.nextInt();


            //System.out.printf("\nO premio : %d \n",premio);

            if (numsorte == premio ){



                System.out.println(
                        " \n" +
                                "██╗░░░██╗░█████╗░██╗░░░██╗░██╗░░░░░░░██╗██╗███╗░░██╗\n" +
                                "╚██╗░██╔╝██╔══██╗██║░░░██║░██║░░██╗░░██║██║████╗░██║\n" +
                                "░╚████╔╝░██║░░██║██║░░░██║░╚██╗████╗██╔╝██║██╔██╗██║\n" +
                                "░░╚██╔╝░░██║░░██║██║░░░██║░░████╔═████║░██║██║╚████║\n" +
                                "░░░██║░░░╚█████╔╝╚██████╔╝░░╚██╔╝░╚██╔╝░██║██║░╚███║\n" +
                                "░░░╚═╝░░░░╚════╝░░╚═════╝░░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚══╝\n"
                );
                System.out.printf("O numero de tentativas foi : %d \n",tentativas);
                System.out.printf("O numero sorteado foi: %d \n",premio);
                break;
            }


            else {
                System.out.println(
                        "██╗░░░██╗░█████╗░██╗░░░██╗██╗░░░░░░█████╗░░██████╗███████╗" +
                                "╚██╗░██╔╝██╔══██╗██║░░░██║██║░░░░░██╔══██╗██╔════╝██╔════╝" +
                                "░╚████╔╝░██║░░██║██║░░░██║██║░░░░░██║░░██║╚█████╗░█████╗░░" +
                                "░░╚██╔╝░░██║░░██║██║░░░██║██║░░░░░██║░░██║░╚═══██╗██╔══╝░░" +
                                "░░░██║░░░╚█████╔╝╚██████╔╝███████╗╚█████╔╝██████╔╝███████╗" +
                                "░░░╚═╝░░░░╚════╝░░╚═════╝░╚══════╝░╚════╝░╚═════╝░╚══════╝"
                );
                tentativas = tentativas + 1;

            }if(numsorte > premio){
                System.out.println("Voce digitou um valor muito alto");
            }if(numsorte < premio){
                System.out.println("Voce digitou um valor muito baixo");

            }
        }

    }

}