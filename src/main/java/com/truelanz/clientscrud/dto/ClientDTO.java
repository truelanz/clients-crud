package com.truelanz.clientscrud.dto;

import java.time.LocalDate;

import com.truelanz.clientscrud.entities.Client;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ClientDTO {

    private Long id;
    private String name;
    private String cpf;
    private Double income;
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
