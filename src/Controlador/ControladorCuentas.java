    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import IVistaCuentas.IVistaCuenta;
import ModeloCuentaBancaria.CuentaBancaria;
import ModeloCuentaBancaria.ServicioCuenta;
import javax.swing.JTextField;

/**
 *
 * @author gipsy
 */
public class ControladorCuentas {
    private final ServicioCuenta servicio;
    private final IVistaCuenta vista;

    public ControladorCuentas(ServicioCuenta servicio, IVistaCuenta vista) {
        this.servicio = servicio;
        this.vista = vista;
    }
    public void CrearCuenta(CuentaBancaria cuenta) {
        try {
            servicio.RegistrarCuenta(cuenta);
            vista.mostrarMensaje("Cuenta creada exitosamente");
        } catch (Exception e){
            vista.mostrarError(e.getMessage());
        }
    }
    public void depositar(String NumeroCuenta,double monto){
        try{
            servicio.depositar(NumeroCuenta, monto);
            vista.mostrarMensaje("Deposito realizado");
        } catch (Exception e ) {
            vista.mostrarError(e.getMessage());
        }
    }
   public void retirar(String NumeroCuenta, double monto){
       try{
           servicio.retirar(NumeroCuenta,monto);
           vista.mostrarMnesaje("Retiro realizado");
       } catch (Exception e){
           vista.MostrarError(e.getMessage());
       }
   }
   public void transferir(String Origen,String Destino, double monto){
       try {
           servicio.tranferir(Origen, Destino, monto);
           vista.mostrarMensaje("Transferencia realizada");
       } catch (Exception e) {
           vista.mostrarError(e.getMessage());
       }
   }

    public void retirar(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void transferir(JTextField txtCuentaOrigen, JTextField txtCuentaDestino, double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
