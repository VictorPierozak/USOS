package com.example.usos.Model.Another;

public class Messenger<T> {
    private T value;
    public  Messenger()
    {
        this.value = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
