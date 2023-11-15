package br.uniceub.dianome.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EntregadorDto(@NotBlank String nome,
                            @NotBlank String cpf,
                            @NotNull Double capacidade) {
}
