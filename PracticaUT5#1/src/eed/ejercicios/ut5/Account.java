/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eed.ejercicios.ut5;

/**
 *
 * @author Nayra Deniz
 */
public class Account {


    // Atributos de la clase Account
    String titular;
    String ccc;
    double balance = 0;

 
    // Constructor
    public Account (String nom, String cuenta)
    {
        this.titular = nom;
        this.ccc = cuenta;
    }
    
 
    // Método que me devuelve el saldo disponible en cada momento
     public double disponible()
    {
        return balance;
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
       */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        balance = balance + cantidad;
    }



    /* Metodo para retirar cantidades en la cuenta. Modifica el saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad < 0)
            throw new Exception ("No se puede retirar una cantidad negativa.");
        if (disponible()< cantidad)
            throw new Exception ("No hay suficiente saldo para retirar la cantidad solicitada.");
        balance = balance - cantidad;
    }

 
}
