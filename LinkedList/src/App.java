public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(70);
        list.insertAt(0, 30);
        list.insertAt(0, 56);

        list.display();
    }
}
