package com.babyboom.controllers;


import com.babyboom.dtos.ProductoDTO;
import com.babyboom.entities.Producto;
import com.babyboom.services.IProductoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private IProductoService pS;

    //insert
    @PostMapping
    public void insert(@RequestBody ProductoDTO dto) {
        ModelMapper m= new ModelMapper();
        Producto p = m.map(dto, Producto.class);
        pS.insert(p);
    }

    //list
    @GetMapping
    public List<ProductoDTO> list(){
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ProductoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {pS.delete(id);}

    @GetMapping("/{id}")
    public ProductoDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ProductoDTO dto = m.map(pS.listId(id), ProductoDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ProductoDTO dto){
        ModelMapper m=new ModelMapper();
        Producto p=m.map(dto,Producto.class);
        pS.insert(p);
    }
    @GetMapping("/precios")
    public List<ProductoDTO> findByPrecioUBetween(@RequestParam("minPrecioU") int minPrecioU,
                                                  @RequestParam("maxPrecioU") int maxPrecioU) {
        List<Producto> productos = pS.findByPrecioUBetween(minPrecioU, maxPrecioU);
        ModelMapper modelMapper = new ModelMapper();
        return productos.stream()
                .map(producto -> modelMapper.map(producto, ProductoDTO.class))
                .collect(Collectors.toList());
    }
}