package generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegerMatrixTests {
    private final Integer[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
    private final Integer[][] mat2 = {{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};
    private IntegerMatrix integerMatrix;

    @BeforeEach
    public void beforeTest() {
        integerMatrix = new IntegerMatrix();
    }

    @Test
    public void testMatrixAddition() {
        Integer[][] result = {{2, 3, 4}, {6, 7, 8}, {1, 1, 1}};
        Assertions.assertTrue(integerMatrix.isEqual(result, integerMatrix.addMatrix(mat1, mat2)));
    }

    @Test
    public void testMatrixMultiplication() {
        Integer[][] result = {{5, 5, 5}, {14, 14, 14}, {3, 3, 3}};
        Assertions.assertTrue(integerMatrix.isEqual(result, integerMatrix.multiplyMatrix(mat1, mat2)));
    }
}
