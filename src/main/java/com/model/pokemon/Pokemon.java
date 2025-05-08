package com.model.pokemon;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Pokemon {
    private String name;
    private List<String> types;

}
