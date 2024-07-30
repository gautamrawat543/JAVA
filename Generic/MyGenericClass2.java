package Generic;

public class MyGenericClass2<T extends Number, V> { // Common convention to use T and V. You can use anything 
    T x;
    V y;

    MyGenericClass2(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getValueX() {
        return x;
    }

    public V getValueY() {
        return y;
    }

}
