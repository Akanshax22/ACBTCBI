package com.example.unit_converter;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ConversionActivity extends AppCompatActivity {

    private EditText inputValue;
    private Spinner fromUnit, toUnit;
    private Button convertButton;
    private TextView outputValue;
    private String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        category = getIntent().getStringExtra("CATEGORY");

        inputValue = findViewById(R.id.inputValue);
        fromUnit = findViewById(R.id.fromUnit);
        toUnit = findViewById(R.id.toUnit);
        convertButton = findViewById(R.id.convertButton);
        outputValue = findViewById(R.id.outputValue);

        setupSpinners();

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double input = Double.parseDouble(inputValue.getText().toString());
                String from = fromUnit.getSelectedItem().toString();
                String to = toUnit.getSelectedItem().toString();

                double result = convertUnits(input, from, to);
                outputValue.setText(String.valueOf(result));
            }
        });
    }

    private void setupSpinners() {
        ArrayAdapter<CharSequence> adapter;
        switch (category) {
            case "Length":
                adapter = ArrayAdapter.createFromResource(this, R.array.length_units, android.R.layout.simple_spinner_item);
                break;
            case "Weight":
                adapter = ArrayAdapter.createFromResource(this, R.array.weight_units, android.R.layout.simple_spinner_item);
                break;
            case "Volume":
                adapter = ArrayAdapter.createFromResource(this, R.array.volume_units, android.R.layout.simple_spinner_item);
                break;
            case "Temperature":
                adapter = ArrayAdapter.createFromResource(this, R.array.temperature_units, android.R.layout.simple_spinner_item);
                break;
            case "Speed":
                adapter = ArrayAdapter.createFromResource(this, R.array.speed_units, android.R.layout.simple_spinner_item);
                break;
            case "Area":
                adapter = ArrayAdapter.createFromResource(this, R.array.area_units, android.R.layout.simple_spinner_item);
                break;
            case "Time":
                adapter = ArrayAdapter.createFromResource(this, R.array.time_units, android.R.layout.simple_spinner_item);
                break;
            case "Currency":
                adapter = ArrayAdapter.createFromResource(this, R.array.currency_units, android.R.layout.simple_spinner_item);
                break;
            default:
                adapter = ArrayAdapter.createFromResource(this, R.array.default_units, android.R.layout.simple_spinner_item);
                break;
        }
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromUnit.setAdapter(adapter);
        toUnit.setAdapter(adapter);
    }

    private double convertUnits(double input, String from, String to) {
        switch (category) {
            case "Length":
                return convertLength(input, from, to);
            case "Weight":
                return convertWeight(input, from, to);
            case "Volume":
                return convertVolume(input, from, to);
            case "Temperature":
                return convertTemperature(input, from, to);
            case "Speed":
                return convertSpeed(input, from, to);
            case "Area":
                return convertArea(input, from, to);
            case "Time":
                return convertTime(input, from, to);
            case "Currency":
                return convertCurrency(input, from, to);
            default:
                return 0;
        }
    }

    private double convertLength(double input, String from, String to) {
        if (from.equals("meters") && to.equals("kilometers")) {
            return input / 1000;
        } else if (from.equals("kilometers") && to.equals("meters")) {
            return input * 1000;
        } else if (from.equals("meters") && to.equals("miles")) {
            return input / 1609.34;
        } else if (from.equals("miles") && to.equals("meters")) {
            return input * 1609.34;
        }

        return 0;
    }

    private double convertWeight(double input, String from, String to) {
        if (from.equals("grams") && to.equals("kilograms")) {
            return input / 1000;
        } else if (from.equals("kilograms") && to.equals("grams")) {
            return input * 1000;
        } else if (from.equals("pounds") && to.equals("kilograms")) {
            return input / 2.20462;
        } else if (from.equals("kilograms") && to.equals("pounds")) {
            return input * 2.20462;
        }

        return 0;
    }

    private double convertVolume(double input, String from, String to) {
        if (from.equals("liters") && to.equals("milliliters")) {
            return input * 1000;
        } else if (from.equals("milliliters") && to.equals("liters")) {
            return input / 1000;
        } else if (from.equals("gallons") && to.equals("liters")) {
            return input * 3.78541;
        } else if (from.equals("liters") && to.equals("gallons")) {
            return input / 3.78541;
        }

        return 0;
    }

    private double convertTemperature(double input, String from, String to) {
        if (from.equals("Celsius") && to.equals("Fahrenheit")) {
            return (input * 9/5) + 32;
        } else if (from.equals("Fahrenheit") && to.equals("Celsius")) {
            return (input - 32) * 5/9;
        } else if (from.equals("Celsius") && to.equals("Kelvin")) {
            return input + 273.15;
        } else if (from.equals("Kelvin") && to.equals("Celsius")) {
            return input - 273.15;
        }
        // Add more temperature conversion logic as needed
        return 0;
    }

    private double convertSpeed(double input, String from, String to) {
        if (from.equals("meters per second") && to.equals("kilometers per hour")) {
            return input * 3.6;
        } else if (from.equals("kilometers per hour") && to.equals("meters per second")) {
            return input / 3.6;
        } else if (from.equals("miles per hour") && to.equals("kilometers per hour")) {
            return input * 1.60934;
        } else if (from.equals("kilometers per hour") && to.equals("miles per hour")) {
            return input / 1.60934;
        }

        return 0;
    }

    private double convertArea(double input, String from, String to) {
        if (from.equals("square meters") && to.equals("square kilometers")) {
            return input / 1e6;
        } else if (from.equals("square kilometers") && to.equals("square meters")) {
            return input * 1e6;
        } else if (from.equals("square feet") && to.equals("square meters")) {
            return input / 10.7639;
        } else if (from.equals("square meters") && to.equals("square feet")) {
            return input * 10.7639;
        }

        return 0;
    }

    private double convertTime(double input, String from, String to) {
        if (from.equals("seconds") && to.equals("minutes")) {
            return input / 60;
        } else if (from.equals("minutes") && to.equals("seconds")) {
            return input * 60;
        } else if (from.equals("hours") && to.equals("minutes")) {
            return input * 60;
        } else if (from.equals("minutes") && to.equals("hours")) {
            return input / 60;
        }

        return 0;
    }

    private double convertCurrency(double input, String from, String to) {
        if (from.equals("USD") && to.equals("EUR")) {
            return input * 0.85;
        } else if (from.equals("EUR") && to.equals("USD")) {
            return input / 0.85;
        }
        return 0;
    }
}

