package aeroporto;

import java.util.Random;

/**
 * @author Carol
 * @author Jenni
 */
public class Aviao {

    private int combustivel;
    private PlanoDeVoo x;
    private String identificador;

    public Aviao(int combustivel, PlanoDeVoo x) {
        Random random = new Random();
        
        combustivel = random.nextInt(300000);
        this.combustivel = combustivel;
        this.x = x;
               
        this.identificador = x.getOrigem();
        this.identificador +=  x.getDestino();
        
      
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public PlanoDeVoo getX() {
        return x;
    }

    public void setX(PlanoDeVoo x) {
        this.x = x;
    }

    private String toString(Aeroporto origem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
