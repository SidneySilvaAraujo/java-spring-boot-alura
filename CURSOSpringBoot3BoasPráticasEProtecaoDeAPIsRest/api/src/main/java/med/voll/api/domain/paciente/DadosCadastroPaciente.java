package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        @NotBlank(message = "nome não pode ficar em branco")
        String nome,

        @NotBlank(message = "email não pode ficar em branco")
        @Email(message = "formato do email é inválido")
        String email,

        @NotBlank(message = "telefone não pode ficar em branco")
        String telefone,

        @NotBlank(message = "cpf não pode ficar em branco")
        @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}", message = "formato do cpf é inválido")
        String cpf,

        @NotNull(message = "dados do endereço são obrigatórios")
        @Valid
        DadosEndereco endereco) {
}
