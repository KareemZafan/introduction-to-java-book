package generics;

public class IntegerMatrix extends GenericMatrix<Integer>{

    @Override
    protected Integer add(Integer obj1, Integer obj2) {
        if(obj1 == null || obj2 == null ) throw new IllegalArgumentException("objects musn't be null");
        return obj1 + obj2;
    }

    @Override
    protected Integer multiply(Integer obj1, Integer obj2) {
        if(obj1 == null || obj2 == null ) throw new IllegalArgumentException("objects musn't be null");
        return obj1 * obj2;
    }

    @Override
    protected Integer zero() {
        return null;
    }

}
