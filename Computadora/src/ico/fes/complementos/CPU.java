/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.complementos;

/**
 *
 * @author melbe
 */
public class CPU {
    String marca;
    String modelo;
    float velocidadProcesador;

    public CPU() {
    }

    public CPU(String marca, String modelo, float velocidadProcesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadProcesador = velocidadProcesador;
        
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public void setVelocidadProcesador(float velocidadProcesador) {
        this.velocidadProcesador = velocidadProcesador;
    }

    @Override
    public String toString() {
        return "CPU:  " +  marca + "   " + modelo + "  " + velocidadProcesador + " GHz";
    }
    
    
}
