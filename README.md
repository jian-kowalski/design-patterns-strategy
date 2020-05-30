# design-patterns-strategy

O strategy pode ser usado para a diminuição de ifs e condições, no caso desse projeto 
temos o exemplo dos impostos sobre uma ordem de serviço.
A ordem de serviço esta sujeita a cobrança de n impostos, e cada um desse tem suas particularides, para diminuir os ifs, temos a classe CalculadorDeImpostos que recebe uma ordem e um imposto, 
e apenas e assim realiza o calculo do valor de impostos a ser pago. 

Caso alguma regra venha a ser altarada ou um novo imposto seja criado, a implementação será menor
e não afeta os outros calculos.
