/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.adaptersgbds;

/**
 *
 * @author igor_
 */
public class client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User gratuito = new User("Igor", "123");
        UserBasic basico = new UserBasic("Igor2", "123");
        UserUltimate ultimate = new UserUltimate("Igor3", "123");
        
        gratuito.getConexBD().insert();
        gratuito.getConexBD().update();
        gratuito.getConexBD().delete();
        
        basico.getConexBD().insert();
        basico.getConexBD().update();
        basico.getConexBD().delete();
        
        ultimate.getConexBD().insert();
        ultimate.getConexBD().update();
        ultimate.getConexBD().delete();
    }
    
}
