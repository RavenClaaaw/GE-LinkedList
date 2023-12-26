public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.insertAt(-1, 30);
        list.insertAt(-1, 70);

        list.display();
    }
}
