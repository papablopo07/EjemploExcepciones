package ejemploexcepciones;

class CuentaInexistenteException extends RuntimeException {
    public CuentaInexistenteException(String mensaje) {
        super(mensaje);
    }
}
