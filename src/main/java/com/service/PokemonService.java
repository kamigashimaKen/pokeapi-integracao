package com.service;

import com.client.PokeApiClient;
import com.model.pokemon.Pokemon;
import com.model.pokemon.response.PokemonResponse;
import feign.FeignException;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    private final PokeApiClient client;

    public PokemonService(PokeApiClient client) {
        this.client = client;
    }

    public Pokemon getPokemon(String name) {
        PokemonResponse response;
        try {
            response = client.getPokemon(name);
        } catch (FeignException ex) {
            throw new RuntimeException(ex.getMessage());
        }

        return responseToDto(response);
    }

    private Pokemon responseToDto(PokemonResponse response) {
        return Pokemon.builder()
                .name(response.getName())
                .types(response.getTypesName())
                .build();
    }
}
