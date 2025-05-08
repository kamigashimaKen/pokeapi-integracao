package com.model.pokemon.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
public class PokemonResponse {

    private String name;

    @JsonProperty(value = "types")
    private List<TypeSlot> typeSlots;

    public List<String> getTypesName() {
        return this.typeSlots.stream()
                .map(TypeSlot::getTypeName)
                .collect(Collectors.toList());
    }

}
