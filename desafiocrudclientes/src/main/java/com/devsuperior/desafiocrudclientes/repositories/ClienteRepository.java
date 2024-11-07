package com.devsuperior.desafiocrudclientes.repositories;

import com.devsuperior.desafiocrudclientes.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
