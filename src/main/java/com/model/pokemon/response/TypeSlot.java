package com.model.pokemon.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TypeSlot {
    private Integer slot;
    private Type type;

    public String getTypeName() {
        return this.type != null ? this.type.getName() : null;
    }
}
