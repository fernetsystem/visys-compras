package com.visys.compras.controllers;

import com.visys.compras.models.Compras;
import com.visys.compras.services.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/compras")
public class ComprasController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public ResponseEntity<?> saveCompra(@RequestBody Compras compras){
        return new ResponseEntity<>(compraService.saveCompra(compras), HttpStatus.CREATED);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllComprasByUserId(@PathVariable Long userId){
        return ResponseEntity.ok(compraService.findAllComprasOfUser(userId));
    }
}
