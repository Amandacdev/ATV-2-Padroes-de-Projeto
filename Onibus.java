package atividade_empresa;

public class Onibus implements Veiculo {
    public int id;
    public String tipo; 
    public String motor;
    public String placa;
    public int qtd_passageiros;
    public Double valor_de_compra;

    public Onibus(int id, String tipo, int qtd_passageiros, String motor, String placa, Double valor_de_compra){
        this.id = id;
        this.tipo = "onibus";
        this.qtd_passageiros = qtd_passageiros;
        this.motor = motor;
        this.placa = placa;
        this.valor_de_compra = valor_de_compra;
        }

    public int getID() {
        return id;
    }
    public String getTipo(){
        return tipo;
    }

    public Double ValorDiaria(){
        return ((valor_de_compra*0.04) + (100*qtd_passageiros));
    }

    public String toString() {
        return "Tipo: " + tipo +" || ID:" + id + " | Motor:" + motor + " | Placa:" + placa + " |  Qts Passageiros: " + qtd_passageiros + " | Valor de compra:" + valor_de_compra;
  }

}
