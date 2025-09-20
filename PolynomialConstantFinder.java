import org.json.JSONObject;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class PolynomialConstantFinder {

    public static void main(String[] args) {
        // This code is designed to read a file path from the command line.
        if (args.length == 0) {
            System.err.println("Usage: java PolynomialConstantFinder <path_to_json_file>");
            return;
        }

        String filePath = args[0];
        String jsonString = "";

        try {
            // Read the entire content of the specified file into a string
            jsonString = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            System.err.println("Error reading the file: " + filePath);
            e.printStackTrace();
            return;
        }

        try {
            // Parse the JSON input from the file content
            JSONObject jsonData = new JSONObject(jsonString);

            // Extract k and determine the polynomial degree 'm' (m = k - 1)
            int k = jsonData.getJSONObject("keys").getInt("k");
            int m = k - 1;

            // Initialize the product of roots using BigInteger
            BigInteger productOfRoots = BigInteger.ONE;

            // Loop through the first 'm' roots to calculate their product
            for (int i = 1; i <= m; i++) {
                JSONObject rootData = jsonData.getJSONObject(String.valueOf(i));
                int base = Integer.parseInt(rootData.getString("base"));
                String value = rootData.getString("value");
                BigInteger rootValue = new BigInteger(value, base);
                productOfRoots = productOfRoots.multiply(rootValue);
            }

            // Apply Vieta's formula for the constant term 'c'
            BigInteger constantC = productOfRoots;
            if (m % 2 != 0) {
                constantC = constantC.negate();
            }

            // Print the final constant 'c'
            System.out.println(constantC);

        } catch (Exception e) {
            System.err.println("An error occurred during JSON parsing or calculation.");
            e.printStackTrace();
        }
    }
}
