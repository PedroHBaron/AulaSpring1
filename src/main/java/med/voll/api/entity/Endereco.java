package med.voll.api.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import med.voll.api.endereco.DadosEndereco;

@Embeddable
@Getter
public class Endereco {
	protected Endereco() {}

	public Endereco(DadosEndereco endereco) {
		this.logradouro = endereco.logradouro();
		this.bairro = endereco.bairro();
		this.cep = endereco.cep();
		this.cidade = endereco.cidade();
		this.uf = endereco.uf();
		this.complemento = endereco.complemento();
		this.numero = endereco.numero();
	}

	String logradouro;
	String bairro;
	String cep;
	String cidade;
	String uf;
	String complemento;
	String numero;
}
