import classes.Player;
import classes.weapons.Knife;
import classes.weapons.Pistol;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        
        // Criar um jogador
        Player player = new Player("Leo", true, new Knife(), new Pistol(), 0, null);
        Player player2 = new Player("Fulano", false, new Knife(), new Pistol(), 25, null);

        // Exibe informações iniciais
        System.out.println("Bem-vindo, " + player.getName());
        
        // Instanciar as armas disponíveis
        //Pistol pistol = new Pistol();
        //Knife knife = new Knife();
        //Spyke spyke = new Spyke();

        // O jogador começa com a pistola
        //player.change_weapon();

        player.setAttacker(true);

        // Menu de interação
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        while (gameRunning) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1) Atacar com Left Click");
            System.out.println("2) Usar Right Click");
            System.out.println("3) Trocar de arma");
            System.out.println("4) Inspecionar arma");
            System.out.println("5) Sair");
            
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    // O jogador realiza uma ação de Left Click
                    player.left_click(player2);
                    break;
                case 2:
                    // O jogador realiza uma ação de Right Click
                    player.right_click(player2);
                    break;
                case 3:
                    // Trocar de arma
                    player.change_weapon();
                    break;
                case 4:
                    // Inspecionar arma atual
                    player.inspect();
                    break;
                case 5:
                    // Sair do jogo
                    System.out.println("Saindo do jogo...");
                    gameRunning = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}
