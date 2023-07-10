package Sem3_HW;

import java.util.Comparator;

public class ContainerCountComparator implements Comparator<Container> {


    @Override
    public int compare(Container o1, Container o2) {
        int countContainer1 = o1.getBoxes().size();
        int countConrainer2 = o2.getBoxes().size();
        return Integer.compare(countContainer1, countConrainer2);
    }
}
