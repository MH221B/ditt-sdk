package com.example.ditt_sdk.Service;

public interface DevToolInterface<I, O> {
    String getName();
    String getCategory();
    O execute(I input);
}
