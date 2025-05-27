/**
 * Classe MAIN (PRINCIPAL) que executa o programa.
 * Exibe um menu para o usuário escolher entre Automovél, Barco ou Avião,
 * e permite interagir com os objetos dessas classes.
 * 
 * @author Thiago Mendes de Almeida
 */
import java.util.Scanner;

public class Main {
    
    /**
     * Método principal que executa o programa.
     * 
     * @param args
     */
    public static void main(String[] args) {

        
        @SuppressWarnings("resource")
        /**
         * Scanner para ler a entrada do usuário.
         */
        Scanner in = new Scanner (System.in);

        /**
         * Objetos das classes Automovél, Avião e Barco,
         * que serão utilizados para interagir com o usuário.
         */
        Automovél automovél = new Automovél("27645898723", "SFG7823");

        /**
         * Objeto da classe Barco, que representa um avião com um registro específico.
         */
        Avião avião = new Avião("3439845");

        /**
         * Objeto da classe Barco, que representa um barco com um registro específico.
         */
        Barco barco = new Barco("2345678");

        /**
         * Variáveis de controle para o menu principal e submenus.
         * cont: controla o menu principal,
         * aut: controla o submenu do automovél,
         * b: controla o submenu do barco,
         * av: controla o submenu do avião.
         */
        int cont = 0;
        int aut = 0;
        int b = 0;
        int av = 0;


        /**
         * Loop principal que exibe o menu e permite ao usuário escolher uma opção.
         * O loop continua até que o usuário escolha a opção de sair (4).
         */
        while (cont != 4) {
            /**
             * Exibe o menu principal com opções para Automovél, Barco, Avião ou Sair.
             */
            System.out.println("\n+-----------------------------+");
            System.out.println("|            MENU             |");
            System.out.println("+-----------------------------+");
            System.out.println("1 - Automovél");
            System.out.println("2 - Barco");
            System.out.println("3 - Aviao");
            System.out.println("4 - Sair");
            System.out.println("+-----------------------------+\n");

            /**
             * Lê a opção escolhida pelo usuário.
             */
            cont = in.nextInt();

            /**
             * Switch case para controlar o rumo do programa
             * com base na opção escolhida pelo usuário.
             */
            switch (cont) {
                
                /**
                 * Caso 1: Automovél
                 */
                case 1:
                    /**
                     * Loop para o submenu do automovél,
                     * que continua até que o usuário escolha a opção de sair (8).
                     */
                    while (aut != 8) {
                        
                        System.out.println("\n+-----------------------------+");
                        System.out.println("|          AUTOMOVEL          |");
                        System.out.println("+-----------------------------+");
                        System.out.println(" Renavan: " + automovél.getRenavam());
                        System.out.println(" Placa: " + automovél.getPlaca());
                        System.out.println("+-----------------------------+");
                        System.out.println("1 - Ligar");
                        System.out.println("2 - Movimentar para frente");
                        System.out.println("3 - Movimentar de ré");
                        System.out.println("4 - Parar");
                        System.out.println("5 - Passar marcha");
                        System.out.println("6 - Frear");
                        System.out.println("7 - Desligar");
                        System.out.println("8 - Sair");
                        System.out.println("+-----------------------------+\n");
                        aut = in.nextInt();

                        /**
                         * Switch case para controlar as ações do automovél
                         * com base na opção escolhida pelo usuário.
                         * Cada case corresponde a uma ação específica, como ligar, mover, parar, passar marcha, frear e desligar.
                         */
                        switch (aut) {
                            case 1:
                                automovél.ligar();
                                break;
                            case 2:
                                automovél.mover_frente();
                                break;
                            case 3:
                                automovél.mover_re();
                                break;
                            case 4:
                                automovél.parar();
                                break;
                            case 5:
                                automovél.passar_marcha();
                                break;
                            case 6: 
                                automovél.frear();
                                break;
                            case 7:
                                automovél.desligar();
                                break;
                            case 8:
                                break;
                            default: 
                                System.out.println("Número inválido!");
                        }
                    }
                    aut = 0;
                    break;
                

                /**
                 * Caso 2: Barco
                 */
                case 2:

                /**
                 * Loop para o submenu do barco,
                 * que continua até que o usuário escolha a opção de sair (9).
                 */
                while (b != 9) {
                        
                    System.out.println("\n+-----------------------------+");
                    System.out.println("|            BARCO            |");
                    System.out.println("+-----------------------------+");
                    System.out.println(" Registro embarcaçao: " + barco.getRegistro_embarcação());
                    System.out.println("+-----------------------------+");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Movimentar para frente");
                    System.out.println("3 - Movimentar de ré");
                    System.out.println("4 - Parar");
                    System.out.println("5 - Navegar");
                    System.out.println("6 - Ancorar");
                    System.out.println("7 - Desancorar");
                    System.out.println("8 - Desligar");
                    System.out.println("9 - Sair");
                    System.out.println("+-----------------------------+\n");
                    b = in.nextInt();

                    /**
                     * Switch case para controlar as ações do barco
                     * com base na opção escolhida pelo usuário.
                     * Cada case corresponde a uma ação específica, como ligar, mover, parar, navegar, ancorar, desancorar e desligar.
                     */
                    switch (b) {
                        case 1:
                            barco.ligar();
                            break;
                        case 2:
                            barco.mover_frente();
                            break;
                        case 3:
                            barco.mover_re();
                            break;
                        case 4:
                            barco.parar();
                            break;
                        case 5:
                            barco.navegar();
                            break;
                        case 6: 
                            barco.ancorar();
                            break;
                        case 7:
                            barco.desancorar();
                            break;
                        case 8:
                            barco.desligar();
                            break;
                        case 9:
                            break;
                        default: 
                            System.out.println("Número inválido!");
                    }
                }
                b = 0;
                break;

                /*
                 * Caso 3: Avião
                 */
                case 3:

                /**
                 * Loop para o submenu do avião,
                 * que continua até que o usuário escolha a opção de sair (8).
                 */
                while (av != 8) {
                        
                    System.out.println("\n+-------------------------------+");
                    System.out.println("|             AVIAO             |");
                    System.out.println("+-------------------------------+");
                    System.out.println(" Registro aeronaútico: " + avião.getRegistro_aeronaútico());
                    System.out.println("+-------------------------------+");
                    System.out.println("1 - Ligar");
                    System.out.println("2 - Movimentar para frente");
                    System.out.println("3 - Movimentar de ré");
                    System.out.println("4 - Parar");
                    System.out.println("5 - Decolar");
                    System.out.println("6 - Pousar");
                    System.out.println("7 - Desligar");
                    System.out.println("8 - Sair");
                    System.out.println("+-----------------------------+\n");
                    av = in.nextInt();

                    /**
                     * Switch case para controlar as ações do avião
                     * com base na opção escolhida pelo usuário.
                     * Cada case corresponde a uma ação específica, como ligar, mover, parar, decolar, pousar e desligar.
                     */
                    switch (av) {
                        case 1:
                            avião.ligar();
                            break;
                        case 2:
                            avião.mover_frente();
                            break;
                        case 3:
                            avião.mover_re();
                            break;
                        case 4:
                            avião.parar();
                            break;
                        case 5:
                            avião.decolar();
                            break;
                        case 6: 
                            avião.pousar();
                            break;
                        case 7:
                            avião.desligar();
                            break;
                        case 8:
                            break;
                        default: 
                            System.out.println("Número inválido!");
                    }
                }
                av = 0;
                break;

                /**
                 * Caso 4: Sair
                 */
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                /*
                 * Caso insira um valor que não está listado, aparece: Número inválido
                 */
                default: 
                    System.out.println("Número inválido!");
            }
        }
    }
}
