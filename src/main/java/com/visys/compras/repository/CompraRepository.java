package com.visys.compras.repository;

import com.visys.compras.models.Compras;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository extends JpaRepository<Compras, Long> {
}
