package med.voll.api.entity.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.entity.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(	
		@NotNull
		Long id,
		
		String nome,
		
		String telefone,

		DadosEndereco endereco) {
	
} 
