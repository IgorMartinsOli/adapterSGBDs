/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adaptersgbds.models;

import com.mycompany.adaptersgbds.interfaces.ConexaoBD;

/**
 *
 * @author igor_
 */
public class MySQL extends ConexaoBD{

    @Override
    public void insert() {
        System.out.println("insert into paradox");
    }

    @Override
    public void update() {
        System.out.println("update into paradox");
    }

    @Override
    public void delete() {
        System.out.println("delete into paradox");
    }
}