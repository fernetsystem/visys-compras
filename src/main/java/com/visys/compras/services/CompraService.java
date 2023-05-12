package com.visys.compras.services;

import com.visys.compras.models.Compras;

import java.util.List;

public interface CompraService {

    public Compras saveCompra(Compras compras);
    public List<Compras> findAllComprasOfUser(Long userId);
}
