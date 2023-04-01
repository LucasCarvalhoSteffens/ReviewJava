import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Veiculo fuca = new Veiculo();
        fuca.setModelo("VW fusca");
        fuca.setCor("Preto");
        fuca.setPlaca("ARY 1987");

        Veiculo fuca2 = new Veiculo();
        fuca2.setModelo("VW fusca");
        fuca2.setCor("Azul");
        fuca2.setPlaca("ARY 1963");

        Carreta carreta = new Carreta();
        carreta.setCor("Azul");
        carreta.setModelo("113");
        carreta.setPlaca("ABC 1133");

        List<Veiculo> estacionamento = new LinkedList<>();  //criando lista de Veiculos carreta e filho de veiculo por isso lista de veiculos
        estacionamento.add(fuca);
        estacionamento.add(fuca2);
        estacionamento.add(carreta);

        
        for (Veiculo item:estacionamento){
            System.out.println(item);
        }

        /*if( fuca2 == fuca ){
            System.out.println("Mesmo Carro");
        } else{
            System.out.println("Outro Carro");
        }*/
        /* if( fuca2.getCor().equals(fuca.getCor()) &&
            fuca2.getModelo().equals(fuca.getModelo()) &&
            fuca2.getPlaca().equals(fuca.getPlaca())){
            System.out.println("Mesmo Carro");
        } else{
            System.out.println("Outro carro");
        }*/

       /* if ( fuca2.equals(fuca)){
            System.out.println("Mesmo Carro");
        } else{
            System.out.println("Outro Carro");
        }
        System.out.println(fuca.hashCode());
        System.out.println(fuca2.hashCode());*/

    }
}