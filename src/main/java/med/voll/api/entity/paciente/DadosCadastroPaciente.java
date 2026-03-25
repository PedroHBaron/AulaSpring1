package med.voll.api.entity.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.entity.Endereco;
import med.voll.api.entity.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @NotBlank
        String telefone,

        @NotBlank
        String cpf,

        @NotBlank
        @Email
        String email,

        @NotNull
        @Valid
        DadosEndereco endereco
) {
}
