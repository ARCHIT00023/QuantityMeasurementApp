# QuantityMeasurementApp
A Java-based Quantity Measurement Application implementing multiple use cases for unit equality comparison and unit conversion using Object-Oriented Programming principles, DRY principle, Enums, and Unit Testing.

 Features Implemented
UC1 – Feet Measurement Equality
Compare two feet measurements for equality
Proper implementation of equals() method
Floating-point comparison using Double.compare()
Example
1.0 ft == 1.0 ft → true
UC2 – Feet and Inches Equality
Added support for Inches
Separate comparison methods for Feet and Inches
Maintains complete test coverage
Example
1.0 inch == 1.0 inch → true
1.0 ft == 1.0 ft → true
UC3 – Generic Quantity Class (DRY Principle)
Replaced separate Feet and Inches classes with a generic Quantity class
Added LengthUnit enum
Supports cross-unit comparison
Example
1.0 ft == 12.0 inch → true
UC4 – Extended Unit Support

Added:

Yards
Centimeters

Supports:

Yard ↔ Feet
Yard ↔ Inches
CM ↔ Inches
CM ↔ Feet
Example
1.0 yard == 3.0 feet → true
1.0 cm == 0.393701 inch → true
UC5 – Unit-to-Unit Conversion API

Added explicit conversion functionality:

convert(value, sourceUnit, targetUnit)
Supported Conversions
Feet ↔ Inches
Inches ↔ Yards
Yards ↔ Feet
CM ↔ Inches
CM ↔ Feet
Example
convert(1.0, FEET, INCH) → 12.0
convert(1.0, YARD, INCH) → 36.0
convert(2.54, CM, INCH) → 1.0
🛠 Technologies Used
Java
JUnit 5
Git
GitHub
📂 Project Structure
QuantityMeasurementApp
│
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── bridgelabz
│   │               └── QuantityMeasurementApp.java
│   │
│   └── test
│       └── java
│           └── com
│               └── bridgelabz
│                   └── QuantityMeasurementAppTest.java
│
└── README.md
🌿 Git Branch Strategy

Each Use Case is implemented in a separate branch.

Branch Name	Description
UC1-feet-equality	Feet equality implementation
UC2-feet-inch-equality	Added inches support
UC3-generic-quantity	Generic Quantity class with DRY principle
UC4-extended-units	Added Yards and Centimeters
UC5-unit-conversion	Added conversion API
dev	Integrated branch containing UC1–UC5
🧠 OOP Concepts Used
Encapsulation
Abstraction
Polymorphism
Method Overriding
Method Overloading
Immutability
Enums
DRY Principle
Value Object Semantics
🧪 Unit Testing

Implemented comprehensive JUnit test coverage for:

Equality checks
Cross-unit equality
Unit conversion
Invalid inputs
Null handling
Precision testing
Symmetry and transitive properties
