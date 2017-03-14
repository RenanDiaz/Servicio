package com.rdiaz.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientesController extends ControllerBase
{
    @RequestMapping(value = "/clientes", method = RequestMethod.GET)
    public String clientes()
    {
        return "clientes";
    }
}
