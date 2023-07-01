package Sem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        B b1 = new B(1,2,3);
        A b2 = new B(1,2);
        Object b3 = new B(1);
        new B();

        b1.run();
        b1.sing();
        b1.study();

        b2.run();
        b2.sing();
//        b2.study();

//        b3.run();
//        b3.sing();
//        b3.study();

        G g = new G(9,4,5);
        g.run();
        g.sing();

        System.out.println(A.getCount());

//        List<Integer> list = new ArrayList<>();
//        Collections.addAll(list, 1,2,3,4,5);
//        System.out.println(list);
//
//        List<Integer> ourList = new OurList<>();
//        Collections.addAll(ourList, 1,2,3,4,5);
//        System.out.println(ourList);



    }
}
