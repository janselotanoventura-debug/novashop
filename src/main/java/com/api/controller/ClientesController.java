package com.api.controller;


import com.api.entity.ClientesEntity;
import com.api.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping("/save")
    public ClientesEntity guardarClientes (@RequestBody ClientesEntity clientes){
        return clientesService.guardarClientes(clientes);
    }

    @GetMapping("/search")
    public ClientesEntity buscarClientes (@RequestParam Long id){
        return clientesService.buscarClientes(id);
    }

    @GetMapping("/list")
    public List<ClientesEntity> obtenerClientes(){
        return clientesService .listaClientes();
    }

    @PostMapping("/delete")
    public String eliminarClientes(@RequestParam Long id){

        ClientesEntity clientesEntity = clientesService.buscarClientes(id);
        clientesService.eliminarClientes(clientesEntity);

        return "Cliente eliminado con exito!";

    }

    @PutMapping("/update")
    public ClientesEntity actualizarClientes (@RequestBody ClientesEntity clientes){
        return clientesService.guardarClientes(clientes);
    }



}
