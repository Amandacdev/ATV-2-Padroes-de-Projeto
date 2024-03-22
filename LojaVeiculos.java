package atividade_empresa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LojaVeiculos {
    //variaveis para geração dos id's automaticamente.
    private static int proximoID = 1;
    private int id;

    public List<Veiculo> veiculos = new ArrayList<>();

    public void imprimirVeiculos() {
        for (Veiculo veiculo: veiculos) {
            System.out.println(veiculo);
        }
    }

    public String obterValorDiaria(int identificação){
        for (Veiculo veiculo: veiculos) {
          if(veiculo.getID() == identificação){
                return("O veículo de id " + veiculo.getID() + " tem valor de diária: " + veiculo.ValorDiaria());
          }
        }
        return ("Veículo não localizado.");
    }

    public String maiorDiaria(){
        double maiorDiaria = 0.0;
        String veiculoMaiorDiaria = "";
        for (Veiculo veiculo: veiculos) {
            if(veiculo.ValorDiaria()>maiorDiaria){
                maiorDiaria = veiculo.ValorDiaria();
                veiculoMaiorDiaria = veiculo.toString();
            }
        }
        return veiculoMaiorDiaria;
    }

    public String veiculosPorTipo(String categoria){
        System.out.println("Veículos da categoria: " + categoria);
        for (Veiculo veiculo: veiculos) {
            if(veiculo.getTipo()==categoria){
                System.out.println(veiculo.toString());
            }
        }
        return "";
    }

    public Veiculo construirAviao(String tempo, double velocidade, double valorDeCompra){
        this.id = proximoID;
        proximoID++;
        Aviao av = new Aviao(id,"",tempo,velocidade,valorDeCompra);
        return av; 
    }

    public Veiculo construirCarro(Double autonomia, String motor, String placa, Double valor_de_compra){
        this.id = proximoID;
        proximoID++;
        Carro car = new Carro(id,"",autonomia,motor,placa,valor_de_compra);
        return car; 
    }

    public Veiculo construirHelicoptero(Double qtd_rotores, Double tempo_voo, Double valor_de_compra){
        this.id = proximoID;
        proximoID++;
        Helicoptero hel = new Helicoptero(id,"", qtd_rotores, tempo_voo, valor_de_compra);
        return hel; 
    }

    public Veiculo construirMoto(String sistema_partida, String motor, String placa, Double valor_de_compra){
      this.id = proximoID;
      proximoID++;
      Moto mt = new Moto(id,"",sistema_partida,motor,placa,valor_de_compra);
      return mt;
    }

    public Veiculo construirOnibus(int qtd_passageiros, String motor, String placa, Double valor_de_compra){
        this.id = proximoID;
        proximoID++;
        Onibus on = new Onibus(id, "", qtd_passageiros, motor, placa, valor_de_compra);
        return on;     
    }

    public static void main(String[] args){ 
    
        LojaVeiculos loja = new LojaVeiculos();

        //Instaciar avioes  
        loja.veiculos.add(loja.construirAviao("2", 1224.0, 2000.0));
        loja.veiculos.add(loja.construirAviao("3", 9824.0, 9824.0));

        //Instanciar Carros
        loja.veiculos.add(loja.construirCarro(500.0, "Híbrido", "ABC-1234", 60.000));
        loja.veiculos.add(loja.construirCarro(600.0, "Eletrico", "DEF-5634", 70.000));
        loja.veiculos.add(loja.construirCarro(700.0, "Híbrido", "GHI-7834", 80.000));

        //Instanciar Helicopteros
        loja.veiculos.add(loja.construirHelicoptero(4.0, 2.5, 84521.0));
        loja.veiculos.add(loja.construirHelicoptero(3.0, 5.5, 99521.0));
        loja.veiculos.add(loja.construirHelicoptero(2.0, 7.5, 754521.0));


        //Instanciar Motos
        loja.veiculos.add(loja.construirMoto("sis 1", "abc", "POL-12121", 7458.0));
        loja.veiculos.add(loja.construirMoto("sis 2", "QWQc", "LÇS-12121", 2458.0));


        //Instanciar Onibus
        loja.veiculos.add(loja.construirOnibus(21,"motor BW" , "LAL-12121", 7458.0));
    
      
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Visualizar veículos cadastrados");
            System.out.println("2 - Obter valor da diária de um veículo");
            System.out.println("3 - Quantidade de veículos cadastrados");
            System.out.println("4 - Veículo com maior diaria");
            System.out.println("5 - Veículos organizados por tipo");
            System.out.println("6 - Sair");
        
            int opcao = scanner.nextInt();
        
            switch (opcao) {
                case 1:
                    loja.imprimirVeiculos();
                    break;
                case 2:
                    System.out.println("Informe o id do veículo:");
                    int idVeiculo = scanner.nextInt();
                    System.out.println(loja.obterValorDiaria(idVeiculo));
                    break;
                case 3:
                    System.out.println("Quantidade de veículos cadastrado: " + loja.veiculos.size());
                    break;
                case 4:
                    System.out.println("Maior diária: " + loja.maiorDiaria());
                    break;
                case 5:
                    System.out.println("Informe o tipo do veículo(carro, aviao, helicoptero):");
                    String tipoVeiculo = scanner.next();
                    loja.veiculosPorTipo(tipoVeiculo);
                    break;  
                default:
                    scanner.close();
                    return;
            }
        }
    }
}

/*

classe concreta/abstrata/interface

desenvolva um sistema que permita armazenar os veículos
dessa empresa (que são vários), calcular e exibir:
1. Valor da diária de um determinado veículo (de acordo com a identificação);
2. Quantidade de veículos cadastrados;
3. Veículos cadastrados de determinado tipo, em -------ordem alfabética------------ da identificação;
4. Veículo com diária mais cara.
*/