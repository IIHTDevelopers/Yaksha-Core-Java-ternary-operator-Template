package testutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.expr.ConditionalExpr; // Corrected import

public class AutoGrader {

    // Test if the code uses only ternary operators and not 'if-else-if'
    public boolean testTernaryOperatorOnly(String filePath) throws IOException {
        System.out.println("Starting testTernaryOperatorOnly with file: " + filePath);

        File participantFile = new File(filePath); // Path to participant's file
        if (!participantFile.exists()) {
            System.out.println("File does not exist at path: " + filePath);
            return false;
        }

        FileInputStream fileInputStream = new FileInputStream(participantFile);
        JavaParser javaParser = new JavaParser();
        CompilationUnit cu;
        try {
            cu = javaParser.parse(fileInputStream).getResult()
                    .orElseThrow(() -> new IOException("Failed to parse the Java file"));
        } catch (IOException e) {
            System.out.println("Error parsing the file: " + e.getMessage());
            throw e;
        }

        System.out.println("Parsed the Java file successfully.");

        boolean hasTernaryOperator = false;

        // Log the parsed ternary operator expressions
        System.out.println("------ Ternary Operator Statements ------");
        for (ConditionalExpr ternary : cu.findAll(ConditionalExpr.class)) { // Corrected class usage
            System.out.println("Ternary operator found: " + ternary);
            hasTernaryOperator = true;
        }

        // Check if only ternary operators are used and no 'if-else-if'
        System.out.println("Has ternary operators: " + hasTernaryOperator);

        boolean result = hasTernaryOperator;
        System.out.println("Test result: " + result);

        return result;
    }
}
