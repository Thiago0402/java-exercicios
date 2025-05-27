/**
 * Classe que representa um automóvel, estendendo a classe Veículo.
 * Possui atributos específicos como renavam, placa e marcha.
 * 
 * @author Thiago Mendes de Almeida  
 */
public class Automovél extends Veículo {

    private String renavam;
    private String placa;
    private boolean marcha;
    private int cont = 0;

    /**
     * Construtor padrão para criar um automóvel sem informações.
     * Inicializa os atributos com valores padrão.
     */
    public Automovél() {
    }

    /**
     * Construtor que recebe o renavam e a placa do automóvel.
     * 
     * @param renavam Número do registro do veículo.
     * @param placa Número da placa do veículo.
     */
    public Automovél(String renavam, String placa) {
        this.renavam = renavam;
        this.placa = placa;
    }

    /**
     * Método para ligar o carro.
     * Verifica se o carro já está ligado antes de ligar novamente.
     */
    public void passar_marcha() {
        if ((isOn() == true) && ((isFrente() == true) || (isRe() == true))) {
            if (marcha == false) {
                cont++;
                System.out.println("\nO veículo passou para a " + cont + "ª marcha!");
                marcha = true;
            } else if (cont >= 5) {
                System.out.println("\nJá está na última marcha. Não dá pra passar mais!");
            } else {
                cont++;
                System.out.println("\nO veículo passou para a " + cont + "ª marcha!");
            }
        } else if (isOn() == false) {
            System.out.println("\nO carro está desligado. Não dá pra passar marcha!");
        } else {
            System.out.println("\nO carro está parado. Só dá pra passar marcha andando!");
        }
    }

    /**
     * Método para ligar o carro.
     * Verifica se o carro já está ligado antes de ligar novamente.
     */
    public void frear() {
        if (isOn() == true) {
            if ((marcha == true) && (isFrente() == true) || (isRe() == true)) {
                System.out.println("\nFreando... Reduzindo uma marcha.");
                cont--;
                if (cont == 0) {
                    marcha = false;
                }
            } else {
                System.out.println("\nO carro já está em ponto morto.");
            }
        } else {
            System.out.println("\nO carro está desligado. Não dá pra frear!");
        }
    }

    /**
     * Retorna o número do renavam do carro.
     * 
     * @return O renavam cadastrado.
     */
    public String getRenavam() {
        return renavam;
    }

    /**
     * Define um novo renavam para o carro.
     * 
     * @param renavam Número do registro do veículo.
     */
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    /**
     * Retorna o número da placa do carro.
     * 
     * @return A placa cadastrada.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define uma nova placa para o carro.
     * 
     * @param placa Número da placa do veículo.
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
}