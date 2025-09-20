# Polynomial Constant Finder 🧮

This project is a Java application that calculates the constant term 'c' of a polynomial. It reads the polynomial's roots from a structured `input.json` file and computes the result based on established mathematical principles.

---
## 💡 Methodology

The solution is based on **Vieta's formulas**, a fundamental theorem in algebra that relates a polynomial's coefficients to the sums and products of its roots.

For a monic polynomial (where the leading coefficient is 1) of degree **`m`**, the constant term **`c`** is given by the formula:
**`c = (-1)^m * (product of all roots)`**

The degree `m` is determined from the input value `k` using the formula **`m = k - 1`**. The program uses Java's `BigInteger` class to handle calculations involving very large numbers and to convert values from different number bases.

---
## 🧪 Test Case Analysis

### Test Case 1 (Sample)

#### Input JSON
```json
 {
     "keys": {
         "n": 4,
         "k": 3
     },
     "1": {
         "base": "10",
         "value": "4"
     },
     "2": {
         "base": "2",
         "value": "111"
     },
     "3": {
         "base": "10",
         "value": "12"
     }
 }
