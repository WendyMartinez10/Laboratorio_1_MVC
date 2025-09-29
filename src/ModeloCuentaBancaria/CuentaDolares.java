/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloCuentaBancaria;

/**
 *
 * @author gipsy
 */
public class CuentaDolares extends CuentaBancaria {

    public CuentaDolares(String NumeroCuenta, String Titular, double saldo, boolean activa, double saldoInicial) {
        super(NumeroCuenta, Titular, saldo, activa, saldoInicial);
    }

    public CuentaDolares(String numeroCuenta, String titular, double saldo) {
        // Asume que la cuenta está activa y el saldo inicial es igual al saldo proporcionado
        super(numeroCuenta, titular, saldo, true, saldo);
    }

    

    @Override
    public String getModena() {
      return "USD";
    }
    
}


  