package Sem2_HW;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Render{
    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */
    public void showIndicator(Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method[] methods = object.getClass().getMethods();
        for (Method m: methods) {
            if (m.getName().equals("getHealth")) {
                System.out.println(object.getClass().getSimpleName());
                Method methodGetHealth = object.getClass().getDeclaredMethod("getHealth");
                System.out.println(methodGetHealth.invoke(object));
            }
            if (m.getName().equals("getMana")) {
                System.out.println(object.getClass().getSimpleName());
                Method methodGetMana = object.getClass().getDeclaredMethod("getMana");
                System.out.println(methodGetMana.invoke(object));
            }
        }
    }

}
