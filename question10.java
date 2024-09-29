//10.Develop a java application to inherit currency converter (Dollar to INR, EURO to INR, Yen to INR and vice versa), distance converter (meter to KM, miles to KM and vice versa) , time converter (hours to minutes, seconds and vice versa) from a base class Converter.
// Base class Converter
abstract class Converter {
    abstract void convert();
}

// Currency Converter class
class CurrencyConverter extends Converter {
    private double amount;
    private String fromCurrency;
    private String toCurrency;

    public CurrencyConverter(double amount, String fromCurrency, String toCurrency) {
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    @Override
    void convert() {
        double convertedAmount = 0;

        if (fromCurrency.equalsIgnoreCase("Dollar") && toCurrency.equalsIgnoreCase("INR")) {
            convertedAmount = amount * 75.0; // Example rate
        } else if (fromCurrency.equalsIgnoreCase("EURO") && toCurrency.equalsIgnoreCase("INR")) {
            convertedAmount = amount * 85.0; // Example rate
        } else if (fromCurrency.equalsIgnoreCase("Yen") && toCurrency.equalsIgnoreCase("INR")) {
            convertedAmount = amount * 0.57; // Example rate
        } else if (fromCurrency.equalsIgnoreCase("INR") && toCurrency.equalsIgnoreCase("Dollar")) {
            convertedAmount = amount / 75.0;
        } else if (fromCurrency.equalsIgnoreCase("INR") && toCurrency.equalsIgnoreCase("EURO")) {
            convertedAmount = amount / 85.0;
        } else if (fromCurrency.equalsIgnoreCase("INR") && toCurrency.equalsIgnoreCase("Yen")) {
            convertedAmount = amount / 0.57;
        } else {
            System.out.println("Invalid currency conversion");
            return;
        }

        System.out.printf("%.2f %s = %.2f %s\n", amount, fromCurrency, convertedAmount, toCurrency);
    }
}

// Distance Converter class
class DistanceConverter extends Converter {
    private double distance;
    private String fromUnit;
    private String toUnit;

    public DistanceConverter(double distance, String fromUnit, String toUnit) {
        this.distance = distance;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    @Override
    void convert() {
        double convertedDistance = 0;

        if (fromUnit.equalsIgnoreCase("meters") && toUnit.equalsIgnoreCase("kilometers")) {
            convertedDistance = distance / 1000.0;
        } else if (fromUnit.equalsIgnoreCase("kilometers") && toUnit.equalsIgnoreCase("meters")) {
            convertedDistance = distance * 1000.0;
        } else if (fromUnit.equalsIgnoreCase("miles") && toUnit.equalsIgnoreCase("kilometers")) {
            convertedDistance = distance * 1.60934;
        } else if (fromUnit.equalsIgnoreCase("kilometers") && toUnit.equalsIgnoreCase("miles")) {
            convertedDistance = distance / 1.60934;
        } else {
            System.out.println("Invalid distance conversion");
            return;
        }

        System.out.printf("%.2f %s = %.2f %s\n", distance, fromUnit, convertedDistance, toUnit);
    }
}

// Time Converter class
class TimeConverter extends Converter {
    private double time;
    private String fromUnit;
    private String toUnit;

    public TimeConverter(double time, String fromUnit, String toUnit) {
        this.time = time;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    @Override
    void convert() {
        double convertedTime = 0;

        if (fromUnit.equalsIgnoreCase("hours") && toUnit.equalsIgnoreCase("minutes")) {
            convertedTime = time * 60.0;
        } else if (fromUnit.equalsIgnoreCase("minutes") && toUnit.equalsIgnoreCase("hours")) {
            convertedTime = time / 60.0;
        } else if (fromUnit.equalsIgnoreCase("seconds") && toUnit.equalsIgnoreCase("minutes")) {
            convertedTime = time / 60.0;
        } else if (fromUnit.equalsIgnoreCase("minutes") && toUnit.equalsIgnoreCase("seconds")) {
            convertedTime = time * 60.0;
        } else {
            System.out.println("Invalid time conversion");
            return;
        }

        System.out.printf("%.2f %s = %.2f %s\n", time, fromUnit, convertedTime, toUnit);
    }
}

// Main class to test the converters
public class ConverterApp {
    public static void main(String[] args) {
        // Currency Conversion
        Converter currencyConverter = new CurrencyConverter(100, "Dollar", "INR");
        currencyConverter.convert();

        // Distance Conversion
        Converter distanceConverter = new DistanceConverter(1000, "meters", "kilometers");
        distanceConverter.convert();

        // Time Conversion
        Converter timeConverter = new TimeConverter(2, "hours", "minutes");
        timeConverter.convert();
    }
}
