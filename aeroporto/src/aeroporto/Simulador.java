package aeroporto;
/**
 * @author Carol
 * @author Jenni
 */
public class Simulador {
    
    public static void main(String[] args) {
        PlanoDeVoo pv = new PlanoDeVoo(10,"DES","ORI");
        Aviao av = new Aviao(20,pv);
        System.out.println(av.getIdentificador());
        System.out.println(av.getCombustivel() + " litros");
        System.out.println(pv.getDuracao() + " horas");
     
    }
}
