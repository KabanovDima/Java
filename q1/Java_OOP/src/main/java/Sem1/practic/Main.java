package Sem1.practic;

public class Main {
    public static void main(String[] args) {
        //    Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
        //    содержащий в себе методы initProducts (List <Product>) сохраняющий
        //    в себе список исходных продуктов и getProduct(String name)

        VendingMachine vendingMachine = new FruitVendingMachine();
        vendingMachine.addFruits(new Banana(1L,12, "Yellow"));
        vendingMachine.addFruits(new Blueberry(2L,546, "Blue"));
        vendingMachine.addFruits(new Apple(3L,23, "Red"));

        System.out.println(vendingMachine.getFruif(2L));

//        Реализуйте конструкторы, get/set методы, постройте логику
//        ТорговогоАвтомата на основе кода сделанного в предыдущем задании.

        System.out.println(vendingMachine);

//        Сделайте класс Товар абстрактным, создайте нескольких наследников
//        (к примеру: БутылкаВоды), сделайте интерфейсом ТорговыйАвтомат
//        и реализуйте класс какого-то одного типа
//        ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)

    }
}
