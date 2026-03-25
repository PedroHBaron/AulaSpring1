package med.voll.api.entity.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.entity.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,

        String nome,

        String telefone,

        DadosEndereco endereco
) {
}
