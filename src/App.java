public class App {

  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(500);
    ICMS icms = new ICMS();
    ISS iss = new ISS();

    CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
    calculadorDeImposto.realizaCalculo(orcamento, icms);
    calculadorDeImposto.realizaCalculo(orcamento, iss);
  }
}