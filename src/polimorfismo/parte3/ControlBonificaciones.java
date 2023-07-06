package parte3;

public class ControlBonificaciones {
    private double suma;

    // Aunque este metodo toma como argumento un Funcionario
    // también va a funcionar con todas las clases hijas.
    // El elemento más genérico puede adaptarse al más específico.
    public double registrarBono(Funcionario funcionario) {
        // Al llamar el metodo getBonificacion,
        // utilizará el más específico en caso de sobreescritura o sobrecarga
        double bono = funcionario.getBonificacion();
        this.suma = this.suma + bono;
        System.out.println("= " + bono);
        System.out.println("Suma: " + this.suma);
        return this.suma;
    }
}
