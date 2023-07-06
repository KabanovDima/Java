package Sem2_HW;

import java.lang.reflect.Method;

public class Render{



    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */
    public void showIndicator(Object object) {
//        VAR1
//        Method[] method = object.getClass().getMethods();
//        for (Method m: method) {
//            if(m.getName().equals("getMana")){
//                System.out.println(object.getClass().getSimpleName());
//                System.out.println(object);
//            }
//              if(m.getName().equals("getHealth")){
//                System.out.println(object.getClass().getSimpleName());
//                System.out.println(object);
//              }
//        }
//        VAR2
        System.out.println(object.getClass().getSimpleName());
        System.out.println(object);

    }

}
