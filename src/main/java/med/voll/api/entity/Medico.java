package med.voll.api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {
	public Medico(DadosCadastroMedico dados) {
		this.nome = dados.nome();
		this.email = dados.email();
		this.telefone = dados.telefone();
		this.crm = dados.crm();
		this.endereco = new Endereco(dados.endereco());
		this.especialidade = dados.especialidade();
		}
	
	protected Medico() {}
	
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome; 
	private String email;
	private String telefone;
	private String crm;
	
	@Enumerated(EnumType.STRING)
	private Especialidade especialidade;
	@Embedded
	private Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getCrm() {
		return crm;
	}
	public Long getId() {
		return id;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
}
