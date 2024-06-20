public class VerificarCliente extends Cliente{
  
  public VerificarCliente(Cliente cliente){
    super();
  }

  public void verificacao(int senhaConta){
    System.out.println((senhaConta == super.getSenhaConta()) ? "Transação sendo processada" : "Senha Incorreta");
  }
}
