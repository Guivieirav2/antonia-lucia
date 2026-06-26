package br.leg.antonia.api.controller;

import br.leg.antonia.api.model.Emenda;
import br.leg.antonia.api.service.EmendaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/emendas")
@RequiredArgsConstructor
public class EmendaController {

    private final EmendaService emendaService;

    @GetMapping
    public List<Emenda> listarTodas() {
        return emendaService.listarTodas();
    }

    @PostMapping
    public Emenda criar(@RequestBody Emenda emenda) {
        return emendaService.salvar(emenda);
    }

    @PutMapping("/{id}")
    public Emenda atualizar(@PathVariable Long id, @RequestBody Emenda emenda) {
        return emendaService.atualizar(id, emenda);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        emendaService.excluir(id);
    }
}