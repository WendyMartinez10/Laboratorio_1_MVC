/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloCuentaBancaria;

/**
 *
 * @author user
 */
public class CuentaColones extends CuentaBancaria{
    public CuentaColones(String NumeroCuenta, String Titular, double saldo, boolean activa, double saldoInicial) {
        super(NumeroCuenta, Titular, saldo, activa, saldoInicial);
    }

    public CuentaColones(String numero, String titular, double saldo) {
        // Llama al constructor de la superclase
        super(NumeroCuenta, Titular, saldo, true, saldo);
    
    }

    
    @Override
    public String getModena() {
       return "CRC";
    }
    
}

