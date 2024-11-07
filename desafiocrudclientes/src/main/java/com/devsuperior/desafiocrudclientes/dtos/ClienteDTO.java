package com.devsuperior.desafiocrudclientes.dtos;

import com.devsuperior.desafiocrudclientes.entities.Cliente;

import java.time.LocalDate;

public class ClienteDTO {

    private String name;

    private String cpf;

    private Double income;

    private LocalDate birthDate;

    private Integer children;

    public ClienteDTO(String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClienteDTO(Cliente cliente){
        name = cliente.getName();
        cpf = cliente.getCpf();
        income = cliente.getIncome();
        birthDate = cliente.getBirthDate();
        children = cliente.getChildren();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }
}
