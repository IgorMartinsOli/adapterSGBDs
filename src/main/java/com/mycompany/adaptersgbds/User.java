/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 */
package com.mycompany.adaptersgbds;

import com.mycompany.adaptersgbds.interfaces.ConexaoBD;
import com.mycompany.adaptersgbds.models.Paradox;

/**
 *
 * @author igor_
 */
public class User{
    private String name;
    private String password;
    private final ConexaoBD conexBD;
    
    public User(String name, String password){
        this.name = name;
        this.password = password;
        this.conexBD = new Paradox();
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public ConexaoBD getConexBD() {
        return conexBD;
    }
}
