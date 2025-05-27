/**
 * Classe que cria um barco, estendendo a classe Veículo.
 * Possui atributos e métodos específicos.
 * 
 * @author Thiago Mendes de Almeida
 */
public class Barco extends Veículo{

    /**
     * Atributos que armazenam o registro da embarcação,
     * o estado de navegação e ancoragem do barco.
     */
    private String registro_embarcação;
    private boolean navegar;
    private boolean ancorar = true;
    
    /**
     * Construtor padrão para criar um barco sem informações.
     * Inicializa os atributos com valores padrão.
     */
    public Barco() {
    }

    /**
     * Construtor que recebe o registro da embarcação.
     *
     * @param registro_embarcação
     */
    public Barco(String registro_embarcação) {
        this.registro_embarcação = registro_embarcação;
    }

    /**
     * Método para navegar com o barco.
     * Verifica se o barco está ligado antes de navegar.
     * Se já estiver navegando, informa que não é possível navegar novamente.
     * Se o barco estiver ancorado, informa que não é possível navegar.
     * Se o barco estiver desligado, informa que não é possível navegar.
     * 
     * @return void
     */
    public void navegar(){

        if (isOn() == true) {
            if ((navegar == false) && (ancorar == false)){
                System.out.println("\nO barco está em navegaçao!!");
                navegar = true;
            }
            else if (ancorar == true){
                System.out.println("\nO barco está ancorado, nao é possivel navegar! ");
            }
            else {
                System.out.println("\nO barco já está navegando!");
            }
        }

        else {
            System.out.println("\nO veículo está desligado, nao é possível navegar!");
        }
        
    }

    /**
     * Método para ancorar o barco.
     * Verifica se o barco está ligado antes de ancorar.
     * Se já estiver ancorado, informa que não é possível ancorar novamente.
     * Se o barco estiver navegando, informa que não é possível ancorar.
     * Se o barco estiver desligado, informa que não é possível ancorar.
     * 
     * @return void
     */
    public void ancorar(){

        if (isOn() == true) {
            if (ancorar == false){
                System.out.println("\nO barco ancorou!");
                ancorar = true;
                navegar = false;
            }
            else {
                System.out.println("\nO barco já está ancorado!");
            }
        }
        
        else {
            System.out.println("\nO veículo está desligado, nao é possível ancorar!");
        }
    }

    /**
     * Método para desancorar o barco.
     * Verifica se o barco está ligado antes de desancorar.
     * Se já estiver desancorado, informa que não é possível desancorar novamente.
     * Se o barco estiver ancorado, informa que não é possível desancorar.
     * Se o barco estiver desligado, informa que não é possível desancorar.
     * 
     * @return void
     */
    public void desancorar(){
        if (isOn() == true) {
            if (ancorar == true){
                System.out.println("\nO barco desancorou!");
                ancorar = false;
            }
            else {
                System.out.println("\nO barco já está desancorado!");
            }
        }
        
        else {
            System.out.println("\nO veículo está desligado, nao é possível passar desancorar!");
        }
    }

    /**
     * Retorna o registro da embarcação.
     * 
     * @return registro_embarcação
     */
    public String getRegistro_embarcação() {
        return registro_embarcação;
    }

    /**
     * Define o registro da embarcação.
     * 
     * @param registro_embarcação
     */
    public void setRegistro_embarcação(String registro_embarcação) {
        this.registro_embarcação = registro_embarcação;
    }
    
}
