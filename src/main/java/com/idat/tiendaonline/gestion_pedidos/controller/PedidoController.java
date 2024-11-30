package com.idat.tiendaonline.gestion_pedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.idat.tiendaonline.gestion_pedidos.entity.Pedido;
import com.idat.tiendaonline.gestion_pedidos.service.PedidoService;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido crearPedido(@RequestBody Pedido pedido) {
        return pedidoService.crearPedido(pedido);
    }

    @GetMapping("/{id}")
    public Pedido obtenerPedido(@PathVariable Long id) {
        return pedidoService.obtenerPedido(id);
    }

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

    @PutMapping("/{id}")
    public Pedido actualizarEstado(@PathVariable Long id, @RequestBody String estado) {
        return pedidoService.actualizarEstado(id, estado);
    }
}