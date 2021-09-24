package Sekcja9.Exercise.Exercise49;

public class TestEx49 {

    public static void main(String[] args) {

//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());
//
//        String stringData = "7 5 4 2 8 5 2 9 0 1";
//        String[] data = stringData.split(" ");
//
//        for (String s: data) {
//            list.addItem(new Node(s));
//        }
//
//        list.traverse(list.getRoot());
//        System.out.println();
//
//        list.removeItem(new Node("9"));
//        list.traverse(list.getRoot());
//        System.out.println();
//
//        list.removeItem(new Node("1"));
//        list.removeItem(new Node("0"));
//        list.removeItem(new Node("5"));
//        list.removeItem(new Node("7"));
//        list.removeItem(new Node("4"));
//        list.traverse(list.getRoot());
//        System.out.println();
//
//        list.removeItem(new Node("8"));
//        list.removeItem(new Node("2"));
//        list.traverse(list.getRoot());

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "7 5 4 2 8 5 2 9 0 1";
        String[] data = stringData.split(" ");

        for (String s: data) {
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());

        System.out.println();

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());
        System.out.println();

        tree.removeItem(new Node("1"));
        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("5"));
        tree.removeItem(new Node("7"));
        tree.removeItem(new Node("4"));
        tree.traverse(tree.getRoot());
        System.out.println();

        tree.removeItem(new Node("8"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

    }
}
