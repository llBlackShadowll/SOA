package com.idat.tiendaonline.gestion_pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.idat.tiendaonline.gestion_pedidos.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}