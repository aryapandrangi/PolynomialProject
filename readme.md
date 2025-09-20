# Polynomial Constant Finder 🧮

This project is a Java application that calculates the constant term 'c' of a polynomial. It reads the polynomial's roots from a structured `input.json` file and computes the result based on established mathematical principles.

---
## 💡 Methodology

The solution is based on **Vieta's formulas**, a fundamental theorem in algebra that relates a polynomial's coefficients to the sums and products of its roots.

For a monic polynomial (where the leading coefficient is 1) of degree **`m`**, the constant term **`c`** is given by the formula:
**`c = (-1)^m * (product of all roots)`**

The degree `m` is determined from the input value `k` using the formula **`m = k - 1`**. The program uses Java's `BigInteger` class to handle calculations and convert values from different number bases accurately.

---
## 🧪 Test Case Analysis

This section provides a manual walkthrough for the provided `input.json` file to verify the program's logic.

### Input JSON
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
     },
     "6": {
         "base": "4",
         "value": "213"
     }
 }
## 🧪 Test Case Explanation

1.  **Determine Degree:** The input gives `k = 3`. Therefore, the degree of the polynomial is `m = k - 1 = 2`.

2.  **Identify Roots:** We need the first `m=2` roots to find the constant.
    * **Root 1:** `value: "4"`, `base: "10"` → **4** (in base 10).
    * **Root 2:** `value: "111"`, `base: "2"` → **7** (in base 10), since `(1 * 2²) + (1 * 2¹) + (1 * 2⁰) = 4 + 2 + 1 = 7`.

3.  **Calculate Product:** The product of these roots is `4 * 7 = 28`.

4.  **Apply Formula:** Since the degree `m=2` is an **even** number, the factor is `(-1)² = 1`.

5.  **Final Constant:** The final constant `c` is `1 * 28 = 28`.

### Output
You can put that information into a .md file by formatting it with Markdown syntax. This will make the headings, lists, and code blocks look clean and professional on GitHub.

Here is the complete text you can copy and paste directly into your README.md file.

Markdown

## 🧪 Test Case Explanation

1.  **Determine Degree:** The input gives `k = 3`. Therefore, the degree of the polynomial is `m = k - 1 = 2`.

2.  **Identify Roots:** We need the first `m=2` roots to find the constant.
    * **Root 1:** `value: "4"`, `base: "10"` → **4** (in base 10).
    * **Root 2:** `value: "111"`, `base: "2"` → **7** (in base 10), since `(1 * 2²) + (1 * 2¹) + (1 * 2⁰) = 4 + 2 + 1 = 7`.

3.  **Calculate Product:** The product of these roots is `4 * 7 = 28`.

4.  **Apply Formula:** Since the degree `m=2` is an **even** number, the factor is `(-1)² = 1`.

5.  **Final Constant:** The final constant `c` is `1 * 28 = 28`.

### Output
28


---
## 📁 Project Structure

* **`pom.xml`**: The Maven project configuration file. It manages the `org.json` dependency.
* **`PolynomialConstantFinder.java`**: The main Java source code that contains the calculation logic.
* **`input.json`**: The input data file containing the polynomial's roots.

---
## 🚀 How to Run

This project uses Maven to manage dependencies and execution.

**Prerequisites:** Ensure you have Java and Maven installed.

**Run Command:** From the project's root directory (where the `pom.xml` is located), run the following command in your terminal. This command compiles the code, runs it, and passes the `input.json` filename to the program.

```bash
mvn exec:java -Dexec.mainClass="PolynomialConstantFinder" -Dexec.args="input.json"
