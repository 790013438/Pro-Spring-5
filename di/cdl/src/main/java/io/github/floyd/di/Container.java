package io.github.floyd.di;

public interface Container {
    Object getDependency(String key);
}
