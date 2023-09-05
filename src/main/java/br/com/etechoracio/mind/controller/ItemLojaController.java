package br.com.etechoracio.mind.controller;

import br.com.etechoracio.mind.entity.ItemLoja;
import br.com.etechoracio.mind.repository.ItemLojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/itens")
public class ItemLojaController {

    @Autowired
    private ItemLojaRepository repository;

    @GetMapping
    public List<ItemLoja> buscarTodos() { return repository.findAll(); }

    @GetMapping("/{id}")
    public Optional<ItemLoja> buscarPorId(@PathVariable Integer id) { return repository.findById(id); }
}
