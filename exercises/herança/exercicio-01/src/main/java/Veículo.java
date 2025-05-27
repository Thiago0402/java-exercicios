/**
 * Classe veículo que representa um veículo genérico.
 * Contém métodos para ligar, desligar, mover para frente, mover de ré e parar (TODOS OS TIPOS DE VEÍCULOS CONTÉM).
 * 
 * @author Thiago Mendes de Almeida
 */
public class Veículo {

    /**
     * Atributos que armazenam o estado do veículo (ligado/desligado)
     * e se está se movendo para frente ou de ré.
     */
    private boolean on;
    private boolean frente;
    private boolean re;

    /**
     * Construtor padrão para criar um veículo sem informações.
     * Inicializa os atributos com valores padrão.
     */
    public void ligar(){

        if (on == false){
            System.out.println("\nVeículo ligado!");
            on = true;
        }
        else {
            System.out.println("\nO veículo já está ligado!");
        }
    }

    /**
     * Método para desligar o veículo.
     * Verifica se o veículo já está desligado antes de desligar novamente.
     * Se o veículo já estiver desligado, informa que não é possível desligar novamente.
     */
    public void desligar(){

        if (on == true){
            System.out.println("\nVeículo desligado!");
            on = false;
        }
        else {
            System.out.println("\nO veículo já está desligado!");
        }
    }

    /**
     * Método para mover o veículo para frente.
     * Verifica se o veículo está ligado antes de mover.
     * Se já estiver se movendo para frente, informa que não é possível mover novamente.
     * Se o veículo estiver desligado, informa que não é possível se locomover.
     */
    public void mover_frente(){

        if (on == true) {
            if (frente == false){
                System.out.println("\nVeículo em movimento para frente!");
                frente = true;
                re = false;
            }
            else {
                System.out.println("\nO veículo já está se movendo para frente!");
            }
        }
        else {
            System.out.println("\nO veículo está desligado, nao é possível se locomover para frente!");
        }
        
    }

    /**
     * Método para mover o veículo de ré.
     * Verifica se o veículo está ligado antes de mover.
     * Se já estiver se movendo de ré, informa que não é possível mover novamente.
     * Se o veículo estiver desligado, informa que não é possível se locomover de ré.
     */
    public void mover_re(){

        if (on == true) {
            if (re == false){
                System.out.println("\nVeículo em movimento de ré!");
                re = true;
                frente = false;
            }
            else {
                System.out.println("\nO veículo já está se movendo de ré!");
            }
        }
        else {
            System.out.println("\nO veículo está desligado, nao é possível se locomover de ré!");
        }

        
    }

    /**
     * Método para parar o veículo.
     * Verifica se o veículo está ligado antes de parar.
     * Se já estiver parado, informa que não é possível parar novamente.
     * Se o veículo estiver desligado, informa que não é possível parar.
     */
    public void parar(){

        if (on == true) {
            if ((re == false) && (frente == false)) {
                System.out.println("\nO veículo já está parado!");
            }
            else {
                System.out.println("\nO veículo parou!");
                re = false;
                frente = false;
            }
        }
        else {
            System.out.println("\nO veículo está desligado, nao é possível parar!");
        }
    }

    /**
     * Método para verificar se o veículo está ligado.
     * TRUE para ligado, FALSE para desligado.
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Método para definir o estado do veículo (ligado/desligado).
     * TRUE para ligado, FALSE para desligado.
     * 
     * @param on
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * Método que VERIFICA se o veículo está se movendo para frente.
     * TRUE para se movendo para frente, FALSE caso contrário.
     */
    public boolean isFrente() {
        return frente;
    }

    /**
     * Método que DEFINE se o veículo está se movendo para frente.
     * TRUE para se movendo para frente, FALSE caso contrário.
     * 
     * @param frente
     */
    public void setFrente(boolean frente) {
        this.frente = frente;
    }

    /**
     * Método que VERIFICA se o veículo está se movendo de ré.
     * TRUE para se movendo de ré, FALSE caso contrário.
     */
    public boolean isRe() {
        return re;
    }

    /**
     * Método que DEFINE se o veículo está se movendo de ré.
     * TRUE para se movendo de ré, FALSE caso contrário.
     * 
     * @param re
     */
    public void setRe(boolean re) {
        this.re = re;
    }

    
    
    
}
