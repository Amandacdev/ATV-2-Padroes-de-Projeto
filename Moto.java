package atividade_empresa;

public class Moto implements Veiculo {
    public int id;
    public String tipo; 
    public String motor;
    public String placa;
    public String sistema_partida;
    public Double valor_de_compra;

    public Moto(int id, String tipo, String sistema_partida, String motor, String placa, Double valor_de_compra){
        this.id = id;
        this.tipo = "moto";
        this.sistema_partida = sistema_partida;
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

  public double valorSistemaPartida(){
    if(this.sistema_partida == "eletrico"){
      return 20.0;
    }
    if(this.sistema_partida == "manual"){
      return 5.0;
    }
    else{
      return 0.0;
    }
  }

    public Double ValorDiaria(){
        return ((valor_de_compra*0.02)+valorSistemaPartida());
        //2% do valor de compra + sistema de partida.
    }

    public String toString() {
        return "Tipo: " + tipo +" || ID:" + id + " | Motor:" + motor + " | Placa:" + placa + " | Sistema de Partida: " + sistema_partida + " | Valor de compra:" + valor_de_compra;
  }

}
