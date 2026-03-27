@Test
void testEquality_YardToFeet() {
    QuantityMeasurementApp.Quantity q1 =
            new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARD);
    QuantityMeasurementApp.Quantity q2 =
            new QuantityMeasurementApp.Quantity(3.0, QuantityMeasurementApp.LengthUnit.FEET);

    assertTrue(q1.equals(q2));
}

@Test
void testEquality_YardToInch() {
    QuantityMeasurementApp.Quantity q1 =
            new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARD);
    QuantityMeasurementApp.Quantity q2 =
            new QuantityMeasurementApp.Quantity(36.0, QuantityMeasurementApp.LengthUnit.INCH);

    assertTrue(q1.equals(q2));
}

@Test
void testEquality_CmToInch() {
    QuantityMeasurementApp.Quantity q1 =
            new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.CM);
    QuantityMeasurementApp.Quantity q2 =
            new QuantityMeasurementApp.Quantity(0.393701, QuantityMeasurementApp.LengthUnit.INCH);

    assertTrue(q1.equals(q2));
}

@Test
void testEquality_CmToFeet_NotEqual() {
    QuantityMeasurementApp.Quantity q1 =
            new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.CM);
    QuantityMeasurementApp.Quantity q2 =
            new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.FEET);

    assertFalse(q1.equals(q2));
}

@Test
void testEquality_TransitiveProperty() {
    QuantityMeasurementApp.Quantity yard =
            new QuantityMeasurementApp.Quantity(1.0, QuantityMeasurementApp.LengthUnit.YARD);
    QuantityMeasurementApp.Quantity feet =
            new QuantityMeasurementApp.Quantity(3.0, QuantityMeasurementApp.LengthUnit.FEET);
    QuantityMeasurementApp.Quantity inch =
            new QuantityMeasurementApp.Quantity(36.0, QuantityMeasurementApp.LengthUnit.INCH);

    assertTrue(yard.equals(feet));
    assertTrue(feet.equals(inch));
    assertTrue(yard.equals(inch));
}