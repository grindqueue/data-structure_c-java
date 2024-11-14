public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] array = {27, 14, 35, 10, 19, 31, 42};

        for (int data : array) {
            bst.insert(data);
        }

        int i = 31;
        Node temp = bst.search(i);

        if (temp != null) {
            System.out.println("\n[" + temp.data + "] Element found.");
        } else {
            System.out.println("\n[x] Element not found (" + i + ").");
        }

        i = 15;
        temp = bst.search(i);

        if (temp != null) {
            System.out.println("\n[" + temp.data + "] Element found.");
        } else {
            System.out.println("\n[x] Element not found (" + i + ").");
        }

        System.out.print("\nPreorder traversal: ");
        bst.preOrderTraversal(bst.getRoot());

        System.out.print("\nInorder traversal: ");
        bst.inOrderTraversal(bst.getRoot());

        System.out.print("\nPostorder traversal: ");
        bst.postOrderTraversal(bst.getRoot());
    }
}
