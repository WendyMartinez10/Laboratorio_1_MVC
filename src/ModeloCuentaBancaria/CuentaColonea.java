/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloCuentaBancaria;

/**
 *
 * @author gipsy
 */
public class CuentaColonea extends CuentaBancaria{
    public CuentaColonea(String NumeroCuenta, String Titular, double saldo, boolean activa, double saldoInicial) {
        super(NumeroCuenta, Titular, saldo, activa, saldoInicial);
    }

    public CuentaColonea(String numero, String titular, double saldo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    @Override
    public String getModena() {
       return "CRC";
    }
    
}
