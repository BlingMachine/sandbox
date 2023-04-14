package org.example.generics;

public class Box<T, S> {
    private T value;
    private S s;

    public Box(){
        value = null;
    }

    public T getContents() {
        return value;
    }

    public void setContents(T value) {
        this.value = value;
    }

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Box{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
