package ejemploexcepciones;

import java.util.ArrayList;

public class GestorCuentas {
    private ArrayList cuentas = new ArrayList();
    
    public void agregarCuenta (Cuenta cuenta){
        cuentas.add(cuenta);
    }
    public void debitar(String numero,Float importe) throws SaldoInsuficienteException, CuentaInexistenteException{
        for (Object obj:cuentas){
            Cuenta cuenta =(Cuenta)obj;
            if (cuenta.getNumero().equals(numero)){
                cuenta.debitar(importe);
                return;
            }            
        }
        throw new CuentaInexistenteException("Cuenta Inexistente:"+numero);
    }
    public void acreditar(String numero,Float importe) throws CuentaInexistenteException {
        for (Object obj:cuentas){
            Cuenta cuenta =(Cuenta)obj;
            if (cuenta.getNumero().equals(numero)){
                cuenta.acreditar(importe);
                return;
            }            
        }     
        throw new CuentaInexistenteException("Cuenta Inexistente:"+numero);
    }
    
}
