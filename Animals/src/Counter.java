public class Counter implements AutoCloseable {

    static int sum = 0;

    public void riseSum() {
        sum += 1;
    }

    public int getSum() {
        return sum;
    }

//    public void add() {
//        System.out.println("Счетчик = " + sum++);
//    }

    @Override
    public void close() {
        System.out.println("Счетчик закрыт");
    }
}
