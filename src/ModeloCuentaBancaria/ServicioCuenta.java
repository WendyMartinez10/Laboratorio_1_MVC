/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloCuentaBancaria;

import java.util.HashMap;

/**
 *
 * @author gipsy
 */
public class ServicioCuenta {
    private final HashMap<String, CuentaBancaria> cuentas = new HashMap<>();
    
    public void RegistrarCuenta(CuentaBancaria cuenta){
        if(cuentas.containsKey(cuenta.getNumeroCuenta()))
            throw new IllegalArgumentException("Cuenta ya Registrada");
        cuentas.put(cuenta.getNumeroCuenta(), cuenta);
        
    }
    public CuentaBancaria buscar(String NumeroCuenta) {
        CuentaBancaria cuenta = cuentas.get(NumeroCuenta);
        if(cuenta == null ) throw new IllegalArgumentException("Cuenta No encontraa");
        return cuenta;
    }
    public void depositar(String NumeroCuenta, double monto){
        buscar(NumeroCuenta).retirar(monto);
    }
    public void retirar(String NumeroCuenta,double monto){
        buscar(NumeroCuenta).retirar(monto);
        
    }
    public void tranferir(String Origen, String Destino,double monto){
      CuentaBancaria CuentaOrigen = buscar(Origen);
      CuentaBancaria CuentaDestino = buscar(Destino);
    }
    
}