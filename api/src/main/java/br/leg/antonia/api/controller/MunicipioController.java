package br.leg.antonia.api.controller;

import br.leg.antonia.api.model.Municipio;
import br.leg.antonia.api.service.MunicipioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/municipios")
@RequiredArgsConstructor
public class MunicipioController {

    private final MunicipioService municipioService;

    @GetMapping
    public List<Municipio> listarTodos() {
        return municipioService.listarTodos();
    }
}