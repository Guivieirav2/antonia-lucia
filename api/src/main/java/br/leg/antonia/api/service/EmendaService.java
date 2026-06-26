package br.leg.antonia.api.service;

import br.leg.antonia.api.model.Emenda;
import br.leg.antonia.api.repository.EmendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmendaService {

    private final EmendaRepository emendaRepository;

    public List<Emenda> listarTodas() {
        return emendaRepository.findAll();
    }

    public Emenda salvar(Emenda emenda) {
        return emendaRepository.save(emenda);
    }

    public Emenda atualizar(Long id, Emenda dados) {
        Emenda emenda = emendaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Emenda não encontrada"));
        emenda.setMunicipio(dados.getMunicipio());
        emenda.setOrgao(dados.getOrgao());
        emenda.setObjeto(dados.getObjeto());
        emenda.setValor(dados.getValor());
        emenda.setStatus(dados.getStatus());
        emenda.setAno(dados.getAno());
        emenda.setNumeroProcesso(dados.getNumeroProcesso());
        return emendaRepository.save(emenda);
    }

    public void excluir(Long id) {
        emendaRepository.deleteById(id);
    }
}