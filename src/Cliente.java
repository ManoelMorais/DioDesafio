public class Cliente {
  private String nome;
  private String cpf;
  private int senhaConta;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

  public String getCpf(){
    return cpf;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;
  }

  public int getSenhaConta() {
    return senhaConta;
  }

  public void setSenhaConta(int senhaConta) {
    this.senhaConta = senhaConta;
  }
}
