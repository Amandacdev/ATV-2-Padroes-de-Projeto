## Atividade 2 - Padrões de Projeto

  Uma empresa que trabalha com locação de veículos está precisando de um software para gerenciar os empréstimos realizados. Por depender precisamente do tipo, o principal problema é calcular o valor da diária de cada veículo.
Atualmente essa empresa trabalha com: Avião, carro, helicóptero, moto e ônibus.

  Sobre cada veículo, as seguintes informações devem ser registradas:

<table>
  <tr>
    <th>Tipo</th>
    <th>Informações</th>
  </tr>
  <tr>
    <td>Avião</td>
    <td>Identificação, tempo de vôo, valor de compra e velocidade de cruzeiro.</td>
  </tr>
  <tr>
    <td>Carro</td>
    <td>Identificação, Autonomia, identificação, motor, placa e valor de compra.</td>
  </tr>
  <tr>
    <td>Helicóptero</td>
    <td> Identificação, quantidade de rotores, tempo de vôo e valor de compra.</td>
  </tr>
  <tr>
    <td>Moto</td>
    <td>Identificação, motor, placa, sistema de partida [elétrico ou manual] e valor de compra.</td>
  </tr>
  <tr>
    <td>Ônibus</td>
    <td>Identificação, motor, placa, quantidade de passageiros e valor de compra.</td>
  </tr>
</table>

  Cada veículo tem sua forma particular para calcular o valor da diária, a seguir:

<table>
  <tr>
    <th>Tipo</th>
    <th>Cálculo da Diária</th>
  </tr>
  <tr>
    <td>Avião</td>
    <td>20% do valor de compra + 1000 * velocidade de cruzeiro</td>
  </tr>
  <tr>
    <td>Carro</td>
    <td>2% do valor de compra</td>
  </tr>
  <tr>
    <td>Helicóptero</td>
    <td>10% do valor de compra * quantidade de rotores</td>
  </tr>
  <tr>
    <td>Moto</td>
    <td>2% do valor de compra + sistema de partida(elétrico: R$ 20,00, manual: R$ 5,00)</td>
  </tr>
  <tr>
    <td>Ônibus</td>
    <td>4% do valor de compra + 100 * quantidade de passageiros.</td>
  </tr>
</table>

  Sabendo que não podem existir dois veículos com a mesma identificação e seguindo os princípios da programação orientada a objetos, desenvolva um sistema que permita armazenar os veículos dessa empresa (que são vários), calcular e exibir:
1. Valor da diária de um determinado veículo (de acordo com a identificação);
2. Quantidade de veículos cadastrados;
3. Veículos cadastrados de determinado tipo, em ordem alfabética da identificação;
4. Veículo com diária mais cara.

  Essa empresa está pensando em expandir seus “horizontes”, o próximo passo é trabalhar com trens. Implemente o sistema de forma que o acréscimo de novos veículos aconteça com o menor esforço possível.
