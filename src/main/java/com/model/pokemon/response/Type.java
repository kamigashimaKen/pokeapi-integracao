package com.model.pokemon.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Type {
    private String name;
    private String url;

    public String getName() {
        return this.name;
    }
}
