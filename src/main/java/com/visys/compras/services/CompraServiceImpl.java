package com.visys.compras.services;

import com.visys.compras.models.Compras;
import com.visys.compras.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {

    @Autowired
    private CompraRepository compraRepository;

    @Override
    public Compras saveCompra(Compras compra){
        compra.setDateBuy(LocalDateTime.now());
        return compraRepository.save(compra);
    }

    @Override
    public List<Compras> findAllComprasOfUser(Long userId){
        return compraRepository.findAllByUserId(userId);
    }
}
