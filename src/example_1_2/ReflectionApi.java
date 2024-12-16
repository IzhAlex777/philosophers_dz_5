package example_1_2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApi {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> str = Class.forName("java.lang.String");
        Method[] met = str.getDeclaredMethods();
        for (Method method : met) {
            System.out.println(method);
        }
    }
}
