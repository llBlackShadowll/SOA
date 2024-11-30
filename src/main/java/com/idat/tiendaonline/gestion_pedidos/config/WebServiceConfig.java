package com.idat.tiendaonline.gestion_pedidos.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class WebServiceConfig {
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet() {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    @Bean
    public XsdSchema productosSchema() {
        return new SimpleXsdSchema(new org.springframework.core.io.ClassPathResource("productos.xsd"));
    }
}