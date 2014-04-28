package aeroporto;

/**
 * @author Carol
 * @author Jenni
 */
import java.util.Random;

public class PlanoDeVoo {
    
    private int duracao;
    private String destino;
    private String origem;
    private String tipo;
    private String empresa;

    public PlanoDeVoo(int duracao, String destino, String origem) {
        
        Random gerador = new Random();
        
        duracao = gerador.nextInt(30);
        
        this.duracao = duracao;
        this.destino = destino;
        this.origem = origem;
        
        
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
}
