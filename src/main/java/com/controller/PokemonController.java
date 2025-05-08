package com.controller;


import com.model.pokemon.Pokemon;
import com.service.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    private final PokemonService service;

    public PokemonController(PokemonService service) {
        this.service = service;
    }

    @GetMapping("/{name}")
    public ResponseEntity<Pokemon> getPokemon(@PathVariable String name) {
        return ResponseEntity.ok(service.getPokemon(name));
    }

}
