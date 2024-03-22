package atividade_empresa;

public class Helicoptero implements Veiculo {
    public int id;
    public String tipo; 
    public Double qtd_rotores;
    public Double tempo_voo;
    public Double valor_de_compra;

    public Helicoptero(int id,String tipo, Double qtd_rotores, Double tempo_voo, Double valor_de_compra){
        this.id = id;
        this.tipo = "helicopetero";
        this.qtd_rotores = qtd_rotores;
        this.tempo_voo = tempo_voo;
        this.valor_de_compra = valor_de_compra;
    }

    public Double ValorDiaria(){
        return ((valor_de_compra*0.01)*qtd_rotores);
        //10% do valor de compra * quantidade de rotores.
    }
    
    public String getTipo(){
        return tipo;
    }

    public int getID() {
        return id;
    }

    public String toString() {
        return "Tipo: " + tipo +" || ID:" + id + " | Qtd Rotores:" + qtd_rotores + " | Tempo:" + tempo_voo + " | Valor de compra:" + valor_de_compra;
  }
}
