/**
 * Cria um veículo do tipo Avião que herda de Veículo.
 * Dentro do Avião, há métodos e atributos específicos.
 * 
 * @author Thiago Mendes de Almeida
 */
public class Avião extends Veículo{
    
    /**
     * Atributos que armazena o registro aeronáutico do avião
     * e o estado de decolagem do avião.
     */
    private String registro_aeronaútico;
    private boolean decolar;
    
    /**
     * Construtor padrão para criar um avião sem informações.
     * Inicializa os atributos com valores padrão.
     */
    public Avião() {
    }

    /**
     * Construtor que recebe o registro aeronáutico do avião.
     * 
     * @param registro_aeronaútico
     */
    public Avião(String registro_aeronaútico) {
        this.registro_aeronaútico = registro_aeronaútico;
    }

    /**
     * Método para decolar o avião.
     * Verifica se o avião está ligado antes de decolar.
     * Se já tiver decolado, informa que não é possível decolar novamente.
     * Se o avião estiver desligado, informa que não é possível decolar.
     * 
     * @return void
     */
    public void decolar(){

        if (isOn() == true) {
            if (decolar == false){
                System.out.println("\nO aviao decolou!!");
                decolar = true;
            }
            else {
                System.out.println("\nNao é possivel decolar pois o aviao já decolou!");
            }
        }

        else {
            System.out.println("\nO veículo está desligado, nao é possível decolar!");
        }
        
    }

    /**
     * Método para pousar o avião.
     * Verifica se o avião está ligado antes de pousar.
     * Se já tiver pousado, informa que não é possível pousar novamente.
     * Se o avião estiver desligado, informa que não é possível pousar.
     * 
     * @return void
     */
    public void pousar(){

        if (isOn() == true) {
            if (decolar == true){
                System.out.println("\nO aviao pousou!");
                decolar = false;
            }
            else {
                System.out.println("\nNao é possivel pousar pois o aviao já está em pouso!");
            }
        }
        else {
            System.out.println("\nO veículo está desligado, nao é possível pousar!");
        }
        
    }

    /**
     * Retorna o registro aeronáutico do avião.
     * 
     * @return
     */
    public String getRegistro_aeronaútico() {
        return registro_aeronaútico;
    }

    public void setRegistro_aeronaútico(String registro_aeronaútico) {
        this.registro_aeronaútico = registro_aeronaútico;
    }

    
    
    
}
