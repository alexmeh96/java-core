package com.mehcoder.core.reflection.example;

import java.lang.reflect.*;

public class ReflectionApiExample {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        User user = new User(25L, "Alex");
        testConstructor();
        testFields(user);
        testMethods(user);
        testMethods2(user);
    }

    private static void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        System.out.println("################## testConstructor ######################3");
        Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
        User user = constructor.newInstance(5L, "Petr");
        System.out.println(user);
    }

    private static void testFields(Object object) throws IllegalAccessException {
        System.out.println("################## testFields ######################3");
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                Object value = field.get(object);
                System.out.println(value);
                field.set(object, "Tom");
                System.out.println(object);

                // определённое целое число обозначает свой модификатор(private, final и т.п.)
                int modifiers = field.getModifiers();
                // по этому целому числу, можно проверить на true/false какой это модификатор
                boolean aPrivate = Modifier.isPrivate(modifiers);
                System.out.println(aPrivate);
            }
        }
    }

    private static void testMethods(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("################## testMethods ######################3");
        Method method = user.getClass().getDeclaredMethod("getName");
        Object invoke = method.invoke(user);
        System.out.println(invoke);
    }

    private static void testMethods2(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("################## testMethods2 ######################3");
        Method method = user.getClass().getDeclaredMethod("setName", String.class);
        method.invoke(user, "Sveta");
        System.out.println(user);
    }
}
