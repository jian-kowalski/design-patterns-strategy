public class ISS implements Imposto{

  @Override
  public double Calcula(Orcamento orcamento) {
    return orcamento.getValor() * 0.6;
  }

}