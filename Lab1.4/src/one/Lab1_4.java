package one;

public class Lab1_4 {
    public static void main(String args[]) {
        List1 list1 = new List1();
        list1.add(new Unit(9876543));
        list1.add(new Unit(1234567));
        list1.add(new Unit(1235467));
        list1.add(new Unit(104));
        list1.add(new Unit(2345678));
        list1.add(new Unit(4567890));
        list1.add(new Unit(102));
        list1.add(new Unit(101));
        list1.add(new Unit(3456789));
        System.out.println("Элементы двунаправленного неупорядоченного списка:");
        do {
            System.out.println(list1.getCurrent().getNumber());
            list1.setCurrent(list1.getCurrent().getNext());
        } while (list1.getCurrent() != list1.getHead());
        System.out.println();
        List list = new List();
        list1.setCurrent(list1.getHead().getPrev());
        do {
            if (list1.getCurrent().getNumber() > 999)
                list.add(new Node(list1.getCurrent().getNumber()));
            list1.setCurrent(list1.getCurrent().getPrev());
        } while (list1.getCurrent() != list1.getHead().getPrev());

        list.reset();
        System.out.println("Элементы однонаправленного упорядоченного списка\n(без номеров спец слуб):");
        do {
            System.out.println(list.getCurrent().getNumber());
            list.setCurrent(list.getCurrent().getNext());
        } while (list.getCurrent() != null);
    }
}
