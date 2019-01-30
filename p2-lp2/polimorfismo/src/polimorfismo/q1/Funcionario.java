package polimorfismo.q1;

import java.time.LocalDateTime;

public class Funcionario {
	private String nome;
	private String cpf;
	private String email;
	private String registro;
	private DataNascimento nascimento;
	private String funcao;
	private String senha;
	
	public Funcionario() {}
		
	public Funcionario(String nome, String cpf, String email, String registro, DataNascimento nascimento, String funcao,
			String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.registro = registro;
		this.nascimento = nascimento;
		this.funcao = funcao;
		this.senha = senha;
	}

	public int getIdade() {
		int idade;
		
		LocalDateTime currDate = LocalDateTime.now();
		
		idade = currDate.getYear() - nascimento.getAno();
		
		if(nascimento.getMes() <= currDate.getMonthValue()) {
			if(nascimento.getDia() <= currDate.getDayOfMonth()) {
				return idade;
			}
		}
		
		return idade-1;
	}
	
	public void realizarLogin(String usuario, String senha) {
		if(usuario == this.email || usuario == this.registro) {
			if(senha == this.senha) {
				System.out.printf("Login efetuado com sucesso.\n%s é %s\n",
						this.nome, this.funcao);
			} else {
				// raise exception
			}
		} else {
			// raise exception
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public DataNascimento getNascimento() {
		return nascimento;
	}

	public void setNascimento(DataNascimento nascimento) {
		this.nascimento = nascimento;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Maria", "1231231", "fsdjfsd", "123",
				new DataNascimento(27, 8, 1998),"Gerente", "123");
		
		System.out.println(f.getIdade());
		f.realizarLogin("123", "123");
	}
}
