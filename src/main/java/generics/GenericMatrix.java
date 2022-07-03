package generics;

public abstract class GenericMatrix<E extends Number> {

    protected abstract E add(E obj1, E obj2);

    protected abstract E multiply(E obj1, E obj2);

    protected abstract E zero();

    public E[][] addMatrix(E[][] mat1, E[][] mat2) {

        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            throw new RuntimeException("Two matrices must have the same size");
        }

        E[][] result = (E[][]) new Number[mat1.length][mat1[0].length];

        for (int i = 0; i < result.length; i++)
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = add(mat1[i][j], mat2[i][j]);
            }
        return result;
    }

    public E[][] multiplyMatrix(E[][] mat1, E[][] mat2) {

        if (mat1[0].length != mat2.length) {
            throw new RuntimeException("The matrices must have compatible size");
        }

        E[][] result = (E[][]) new Number[mat1.length][mat2[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = zero();
                for (int k = 0; k < mat1[0].length; k++) {
                    result[i][j] = add(result[i][j], multiply(mat1[i][k], mat2[k][j]));
                }
            }
        }
        return result;
    }

    public boolean isEqual(E[][] mat1, E[][] mat2) {

        if ((mat1.length != mat2.length) || (mat1[0].length != mat2[0].length))
            throw new RuntimeException("Matrices do not have the same size");

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                if (mat1[i][j] != mat2[i][j]) return false;
            }
        }
        return true;
    }
}