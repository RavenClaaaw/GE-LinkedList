public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(70);

        list.insertAt(1, 30);
        list.display();
    }
}
