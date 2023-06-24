package com.truelanz.clientscrud.dto;

import java.time.LocalDate;

import com.truelanz.clientscrud.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ClientDTO {

    private Long id;
    @Size(min = 3, max = 50, message = "o campo deve ter de 3 a 50 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;
    @Size(min = 11, max = 11, message = "O cpf deve ter 11 números")
    @NotBlank(message = "Campo requerido")
    private String cpf;
    @Positive(message = "O valor deve ser positivo")
    private Double income;
    @NotNull(message = "Campo obrigatório")
    @Past(message = "A data de aniversário deve ser anterior à data atual")
    private LocalDate birthDate;
    private Integer children;

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }
}
