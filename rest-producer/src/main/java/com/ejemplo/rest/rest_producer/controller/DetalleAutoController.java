package com.ejemplo.rest.rest_producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.rest.rest_producer.bean.AutoBean;

@RestController
@RequestMapping("/api/auto")
public class DetalleAutoController {

    @GetMapping("")
    public AutoBean getDetalle(){
        AutoBean auto = new AutoBean("Toyota", "Corolla", "Gris", 2020);
        return auto;
    }
}
