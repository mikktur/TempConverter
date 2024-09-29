package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.TemperatureConverter;
class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();


    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.01);
        assertEquals(100, converter.fahrenheitToCelsius(212), 0.01);
        assertEquals(-40, converter.fahrenheitToCelsius(-40), 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32, converter.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, converter.celsiusToFahrenheit(100), 0.01);
        assertEquals(-40, converter.celsiusToFahrenheit(-40), 0.01);
    }
    @Test
    public void testKelvinToCel() {
        assertEquals(0.0, TemperatureConverter.kelvinToCel((float)273.15), 0.001);
    }
    @Test
    public void testIsExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-50));
        assertFalse(converter.isExtremeTemperature(20));
        assertTrue(converter.isExtremeTemperature(60));
    }

    @Test
    public void testKelvinToFah() {
        assertEquals(32, TemperatureConverter.kelvinToFah(273.15), 0.01);
    }
}