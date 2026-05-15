package classwork_16;

public class Temperature {
	    double celsius;
	    public Temperature(double celsius) {
	        this.celsius = celsius;
	    }

	    static Temperature fromCelsius(double c) {
	        return new Temperature(c);
	    }

	    static Temperature fromFahrenheit(double f) {
	        double c = (f - 32) * 5 / 9;
	        return new Temperature(c);
	    }

	    static Temperature fromKelvin(double k) {
	        double c = k - 273.15;
	        return new Temperature(c);
	    }

	    double toCelsius() {
	        return this.celsius;
	    }

	    double toFahrenheit() {
	        return this.celsius * 9 / 5 + 32;
	    }

	    double toKelvin() {
	        return this.celsius + 273.15;
	}
}