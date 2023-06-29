package Sem_6_Set;

import java.util.Objects;

public class TestClass {
    String name;

    @Override
    public String toString() {
        return "TestClass{" +
                "name='" + name + '\'' +
                '}';
    }

    public TestClass(String name) {
        this.name = name;
    }

    public TestClass() {
        //this.name = "Не Мартин";
        this("Не Мартин");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return Objects.equals(name, testClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
