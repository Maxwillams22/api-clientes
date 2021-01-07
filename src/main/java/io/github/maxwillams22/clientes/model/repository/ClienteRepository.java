package io.github.maxwillams22.clientes.model.repository;

import io.github.maxwillams22.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
