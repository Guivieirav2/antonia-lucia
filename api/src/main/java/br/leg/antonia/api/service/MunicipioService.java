package br.leg.antonia.api.service;

import br.leg.antonia.api.model.Municipio;
import br.leg.antonia.api.repository.MunicipioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MunicipioService {

    private final MunicipioRepository municipioRepository;

    public List<Municipio> listarTodos() {
        return municipioRepository.findAll();
    }
}