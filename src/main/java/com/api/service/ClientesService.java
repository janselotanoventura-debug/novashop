package com.api.service;


import com.api.entity.ClientesEntity;
import com.api.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public ClientesEntity guardarClientes(ClientesEntity clientes){
        return clientesRepository.save(clientes);
    }

    public ClientesEntity buscarClientes(Long id){
        return clientesRepository.findById(id).orElse(null);
    }

    public List<ClientesEntity> listaClientes(){
        return clientesRepository.findAll();
    }

    public void eliminarClientes(ClientesEntity clientes){
        clientesRepository.delete(clientes);

    }


}
