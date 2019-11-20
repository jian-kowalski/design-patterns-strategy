public class CalculadorDeImposto {
  public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
    double valor = imposto.Calcula(orcamento);

    System.out.println(valor);
  }
}