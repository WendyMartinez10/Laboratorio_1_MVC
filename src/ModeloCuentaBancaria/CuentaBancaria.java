/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloCuentaBancaria;

/**
 *
 * @author gipsy
 */
public abstract class CuentaBancaria {
    protected String NumeroCuenta;
    protected String Titular;
    protected double saldo;
    protected boolean activa;

    public CuentaBancaria(String NumeroCuenta, String Titular, double saldo, boolean activa, double saldoInicial) {
        this.NumeroCuenta = NumeroCuenta;
        this.Titular = Titular;
        this.saldo = saldoInicial;
        this.activa = true;
    }
    public abstract String getModena();
    
    public void depositar(double monto) {
        if(!activa) throw new IllegalStateException("Cuenta inactiva");
        if(monto <= 0) throw new IllegalArgumentException("Monto Invalido");
         saldo += monto;
    }
    public void retirar(double monto){
              if(!activa) throw new IllegalStateException("Cuenta inactiva");
        if(monto <= 0) throw new IllegalArgumentException("Fondos insuficientes");
         saldo += monto;
    }
    public void transferir(CuentaBancaria destino, double monto) {
        if (!this.getModena().equals(destino.getModena())) 
        throw new IllegalArgumentException("Moneda Incompatibles");
        this.retirar(monto);
        destino.depositar(monto);
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public String getTitular() {
        return Titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isActiva() {
        return activa;
    }
    
}
