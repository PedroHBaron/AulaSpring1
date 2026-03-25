package med.voll.api.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.entity.endereco.DadosEndereco;

@Embeddable
@NoArgsConstructor
@Getter
public class Endereco {

	public Endereco(DadosEndereco endereco) {
		this.logradouro = endereco.logradouro();
		this.bairro = endereco.bairro();
		this.cep = endereco.cep();
		this.cidade = endereco.cidade();
		this.uf = endereco.uf();
		this.complemento = endereco.complemento();
		this.numero = endereco.numero();
	}
	
	public void atualizarInformacoes(DadosEndereco endereco) {
		if(endereco.logradouro() != null) {
			this.logradouro = endereco.logradouro();
		}
		if(endereco.bairro() != null) {
			this.bairro = endereco.bairro();
		}
		if(endereco.cep() != null) {
			this.cep = endereco.cep();
		}
		if(endereco.cidade() != null) {
			this.cidade = endereco.cidade();
		}
		if(endereco.uf() != null) {
			this.uf = endereco.uf();
		}
		if(endereco.complemento() != null) {
			this.complemento = endereco.complemento();
		}
		if(endereco.numero() != null) {
			this.numero = endereco.numero();
		}		
	}

	String logradouro;
	String bairro;
	String cep;
	String cidade;
	String uf;
	String complemento;
	String numero;
}
