public class ConversorTemperatura {

    public ConversorTemperatura() {
    }

    // Attributes
    private double CelsiusParaF;
    private double FahrenheitParaC;

    // Methods

    // De Celsius para Fahrenheit
    public double converta(int Grau) {
        return (Grau * 1.8) + 32;
    }

    // De Fahrenheit para Celsius
    public double converta(double Grau) {
        return Math.round((Grau - 32) / 1.8);
    }

    // De Celsius para Fahrenheit com o ajuste extra
    public double converta(int Grau, int ajuste) {
        return Math.round((Grau * 1.8) + 32) + ajuste;
    }

}
