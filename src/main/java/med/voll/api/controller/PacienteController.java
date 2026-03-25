package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.entity.paciente.DadosAtualizacaoPaciente;
import med.voll.api.entity.paciente.DadosCadastroPaciente;
import med.voll.api.entity.paciente.DadosListagemPaciente;
import med.voll.api.entity.paciente.Paciente;
import med.voll.api.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    PacienteRepository pacienteRepository;

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        var paciente = pacienteRepository.getReferenceById(id);
        paciente.excluir();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPaciente dados){
        var paciente = pacienteRepository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);
    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(Pageable paginacao) {
        return  pacienteRepository.findAllByAtivoTrue(paginacao).map(DadosListagemPaciente::new);
    }

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        System.out.println(dados.cpf());
        pacienteRepository.save(new Paciente(dados));
    }

}
