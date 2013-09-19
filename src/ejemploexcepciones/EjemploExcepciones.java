package ejemploexcepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploExcepciones {

    public static void main(String[] args)  {
        GestorCuentas gestor = new GestorCuentas();
        gestor.agregarCuenta(new Cuenta("1", "haberes", 0f));
        gestor.agregarCuenta(new Cuenta("2", "ventas", 0f));
        gestor.agregarCuenta(new Cuenta("3", "ventas", 0f));
    //    try {
            gestor.acreditar("1", 100.00f);
            gestor.acreditar("2", 330.00f);
            gestor.acreditar("1131", 540.00f);
         //    gestor.debitar("4", 50.00f);
            gestor.debitar("1", 50.00f);
            gestor.debitar("2", 130.00f);
            gestor.debitar("3", 140.00f);
      //  } catch (SaldoInsuficienteException ex) {
      //      System.out.println(ex);
      //  } catch (CuentaInexistenteException ex) {
      //      System.out.println(ex);
      //  } finally {
            System.out.println("Otras operaciones");
       // }
    }
}
