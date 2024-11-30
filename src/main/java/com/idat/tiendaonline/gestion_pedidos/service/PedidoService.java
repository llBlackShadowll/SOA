package com.idat.tiendaonline.gestion_pedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.idat.tiendaonline.gestion_pedidos.entity.Pedido;
import com.idat.tiendaonline.gestion_pedidos.repository.PedidoRepository;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido crearPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido obtenerPedido(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido actualizarEstado(Long id, String estado) {
        Pedido pedido = pedidoRepository.findById(id).orElse(null);
        if (pedido != null) {
            pedido.setEstado(estado);
            return pedidoRepository.save(pedido);
        }
        return null;
    }
}