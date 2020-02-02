package io.github.floyd.di;

/**
 * @author floyd
 */
public class DefaultContainer implements Container {
    private static final String MY_DEPENDENCY = "myDependency";
    @Override
    public Object getDependency(String key) {
        if (MY_DEPENDENCY.equals(key)) {
            return new Dependency();
        }

        throw new RuntimeException("Unknown dependency: " + key);
    }
}
