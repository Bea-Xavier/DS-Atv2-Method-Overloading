public class ConversorTemperatura {

    // Tornar a classe universal
    public ConversorTemperatura() {
    }

    // Methods

    // De Celsius para Fahrenheit
    public double converta(int Celsius) {
        return (Celsius * 1.8) + 32;
    }

    // De Fahrenheit para Celsius
    public double converta(double Fahreinheit) {
        return Math.round((Fahreinheit - 32) / 1.8);
    }

    // De Celsius para Fahrenheit com o ajuste extra
    public double converta(int Celsius, double ajuste) {
        return (Math.round((Celsius * 1.8) + 32)) + ajuste;
    }

}
