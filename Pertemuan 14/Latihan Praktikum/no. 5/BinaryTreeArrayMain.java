public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.add(7);
        bta.add(6);
        bta.add(5);
        bta.traverseInOrder(0);
        System.out.println(" ");
        bta.traversePreOrder(0);
        System.out.println(" ");
        bta.traversePostOrder(0);
        System.out.println(" ");
    }
}
