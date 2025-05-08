package com.client;

import com.model.pokemon.response.PokemonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokeapi", url = "https://pokeapi.co/api/v2")
public interface PokeApiClient {

    @GetMapping("/pokemon/{pokemonName}")
    PokemonResponse getPokemon(@PathVariable("pokemonName") String pokemonName);

}
