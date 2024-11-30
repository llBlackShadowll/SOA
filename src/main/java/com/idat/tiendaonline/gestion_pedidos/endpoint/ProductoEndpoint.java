package com.idat.tiendaonline.gestion_pedidos.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.idat.tiendaonline.ConsultarProductoRequest;
import com.idat.tiendaonline.ConsultarProductoResponse;

@Endpoint
public class ProductoEndpoint {
    private static final String NAMESPACE_URI = "http://idat.com/tiendaonline";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ConsultarProductoRequest")
    @ResponsePayload
    public ConsultarProductoResponse consultarProducto(@RequestPayload ConsultarProductoRequest request) {
        ConsultarProductoResponse response = new ConsultarProductoResponse();
        response.setDisponibilidad(true); // Simulación de disponibilidad
        return response;
    }
}