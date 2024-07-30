package Generic;

public class MyGenericClass<T> {// Common convention to use T . You can use anything 
    T x;

    MyGenericClass(T x) {
        this.x = x;
    }

    public T getValue() {
        return x;
    }

}
