# OOP Final Project – Carbon Emission Tax Calculator

## 🚀 Overview

This project simulates a system that calculates the **energy consumption and carbon emissions** of households and firms based on their use of appliances and vehicles. If their emissions exceed a defined threshold, the system calculates and applies a carbon tax. It also generates a summary report of emissions and taxes for each entity.

The project uses **Object-Oriented Programming (OOP)** principles including abstraction, inheritance, interfaces, encapsulation, and polymorphism.

---

## 🧠 Features

- Calculate total carbon emissions from:
  - Household/firms’ appliances (e.g. fridges, cookers)
  - Vehicles using fossil fuels
- Apply a carbon tax if emissions exceed a set threshold
- Display tax and emission reports
- Use of an interface and abstract class to demonstrate OOP principles
- Uses an `ArrayList` to store appliance and vehicle data

---

## 🏗️ Class Structure

| Class / Interface | Description |
|------------------|-------------|
| `Sector` *(abstract)* | Base class for `Household` and `Firm`; holds appliance and vehicle data |
| `Taxable` *(interface)* | Requires `calculateCarbonEmission()` and `calculateTax()` methods |
| `Household` / `Firm` | Inherit from `Sector` and implement `Taxable` |
| `Appliance` | Represents an appliance with energy usage and price |
| `Vehicle` | Represents a vehicle and its carbon emissions per km |
| `Tax` | Static methods to compute tax based on carbon threshold |

---

## 🔁 How It Works

1. Create a `Household` or `Firm` object.
2. Add `Appliance` and `Vehicle` objects to it.
3. The entity calculates:
   - Total carbon emissions
   - Tax amount (if emissions exceed the threshold)
4. The tax amount is printed using the test files.

---

## 📂 How to Run

1. Clone or download the project.
2. Open it in your preferred IDE (e.g., IntelliJ, Eclipse, VS Code with Java).
3. Run the following test files:
   - `testFirm.java`
   - `testHousehold.java`

These test files will:
- Create example households/firms
- Add appliances and vehicles
- Output emission and tax calculations

---

## ✅ Example Output

