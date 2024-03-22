package atividade_empresa;

public class Carro implements Veiculo {
    public int id;
    public String tipo; 
    public Double autonomia;
    public String motor;
    public String placa;
    public Double valor_de_compra;

    public Carro(int id, String tipo, Double autonomia, String motor, String placa, Double valor_de_compra){
        this.id = id;
        this.tipo = "carro";
        this.autonomia = autonomia;
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
        return (valor_de_compra*0.02);
        //2% do valor de compra.
    }

    public String toString() {
        return "Tipo: " + tipo +" || ID:" + id + " | Autonomia:" + autonomia + " | Motor:" + motor + " | Placa:" + placa + " | Valor de compra:" + valor_de_compra;
	}

   

 
}

