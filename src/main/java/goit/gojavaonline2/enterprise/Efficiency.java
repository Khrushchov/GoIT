package goit.gojavaonline2.enterprise;

import java.util.*;

public class Efficiency <T extends Collection> {
    private List list;
    private int elementNumber;

    public Efficiency(List list, int elementNumber) {
        this.list = list;
        this.elementNumber = elementNumber;
    }

    public static void main(String[] args) {
        ArrayList<Efficiency<List>> effList = new ArrayList<>();

        effList.add(new Efficiency(new ArrayList(), 10000));
        effList.add(new Efficiency(new ArrayList(), 100000));
        effList.add(new Efficiency(new ArrayList(), 1000000));
        effList.add(new Efficiency(new LinkedList(), 10000));
        effList.add(new Efficiency(new LinkedList(), 100000));
        effList.add(new Efficiency(new LinkedList(), 1000000));

        for (Efficiency list : effList) {
             list.executeList();
        }
    }

    public void executeList() {

        long timePopulate = populate();

        System.out.println();
        System.out.println(list.getClass().getSimpleName() + " " + list.size());

        long timeGet1000 = get1000();
        long timeContains1000 = contains1000();
        long timeAdd1000 = add1000();
        long timeRemove1000 = remove1000();
        long timeLiterAdd1000 = literAdd1000();
        long timeLiterRemove1000 = literRemove1000();

        System.out.println("time populate: " + timePopulate + " ms");
        System.out.println("time get1000: " + timeGet1000 + " ms");
        System.out.println("time contains1000: " + timeContains1000 + " ms");
        System.out.println("time add1000: " + timeAdd1000 + " ms");
        System.out.println("time remove1000: " + timeRemove1000 + " ms");
        System.out.println("time iterator add1000: " + timeLiterAdd1000 + " ms");
        System.out.println("time iterator remove1000: " + timeLiterRemove1000 + " ms");
    }

    private long populate() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < elementNumber; i++) {
            list.add(i);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private long add1000() {
        Random rand = new Random(47);
        int index = rand.nextInt(elementNumber);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.add(index, i);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private long get1000() {
        Random rand = new Random(47);
        int index = rand.nextInt(elementNumber);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.get(index);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private long contains1000() {
        Random rand = new Random(47);
        int element = rand.nextInt(elementNumber);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.contains(element);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private long remove1000() {
        Random rand = new Random(47);
        int index = rand.nextInt(elementNumber);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.remove(index);
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private long literAdd1000() {
        ListIterator liter = list.listIterator();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            liter.add(i);
        }
        long finish = System.currentTimeMillis();

        return finish - start;
    }

    private long literRemove1000() {
        ListIterator liter = list.listIterator();
//        Random rand = new Random(47);
//        int index = rand.nextInt(elementNumber);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            if (liter.hasNext()) {
                liter.next();
                liter.remove();
            }
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
