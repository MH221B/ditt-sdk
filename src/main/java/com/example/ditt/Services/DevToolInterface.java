package com.example.ditt.Service;

public interface DevToolInterface<I, O> {
    String getName();
    String getCategory();
    O execute(I input);
}
