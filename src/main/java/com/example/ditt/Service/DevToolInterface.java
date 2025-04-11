package com.example.ditt.Services;

public interface DevToolInterface<I, O> {
    String getName();
    String getCategory();
    O execute(I input);
}
