package com.visys.compras.repository;

import com.visys.compras.models.Compras;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRepository extends JpaRepository<Compras, Long> {
    List<Compras> findAllByUserId(Long userId);
}
