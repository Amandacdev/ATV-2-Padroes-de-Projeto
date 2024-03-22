package atividade_empresa;

public class Aviao implements Veiculo {
    public int id;
    public String tipo; 
    public String tempo;
    public Double velocidade;
    public Double valor_de_compra;

    public Aviao(int id, String tipo, String tempo, Double velocidade , Double valor_de_compra) {
        this.id = id;
        this.tipo = "aviao";
        this.tempo = tempo;
        this.velocidade = velocidade;
        this.valor_de_compra = valor_de_compra;
    }
    
    public int getID() {
        return id;
    }
    
    public String getTipo(){
        return tipo;
    }

    public Double ValorDiaria(){
        return ((valor_de_compra*0.2)/100 + (1000*velocidade));
        //20% do valor de compra + 1000 * velocidade de cruzeiro.
    }

	@Override
	public String toString() {
        return  "Tipo: " + tipo +" || ID:" + id + " | Tempo de vôo:" + tempo + " | Velocidade:" + velocidade + " | Valor de compra:" + valor_de_compra;
	}   
}