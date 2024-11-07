package com.devsuperior.desafiocrudclientes.services;

import com.devsuperior.desafiocrudclientes.dtos.ClienteDTO;
import com.devsuperior.desafiocrudclientes.entities.Cliente;
import com.devsuperior.desafiocrudclientes.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Transactional
    private ClienteDTO insertClient(ClienteDTO dto){
        Cliente entity = new Cliente();
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new ClienteDTO(entity);
    }

    private void copyDtoToEntity(ClienteDTO dto, Cliente entity) {
        entity.setName(dto.getName());
        entity.setBirthDate(dto.getBirthDate());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setChildren(dto.getChildren());
    }
}
