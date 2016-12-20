/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.homework.repository;

import com.homework.domain.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author W ANDRADE M
 */
public interface HomeworRepositorio  extends CrudRepository<Producto, Integer>{
    
    
}
