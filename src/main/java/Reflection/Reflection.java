package Reflection;

import java.lang.reflect.*;

public class Reflection {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("Stalle",6);
        Field[] catFields = myCat.getClass().getDeclaredFields();


        for (Field field : catFields) {
            if(field.getName().equals("name")){
                try {
                    field.setAccessible(true);
                    field.set(myCat,"Jimmy McGill");
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }

            }
        }

        Method[] catMethods = myCat.getClass().getDeclaredMethods();
        for (Method method : catMethods) {
            if(method.getName().equals("thisIsAPrivateStaticMethod")){
                method.setAccessible(true);
                method.invoke(null);
            }
        }
    }
}
