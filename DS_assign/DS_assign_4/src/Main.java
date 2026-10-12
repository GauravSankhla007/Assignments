public class Main {
    public static void main(String[] args) {

        BST tree = new BST();
       tree.root =  tree.insert(tree.root,100);
        tree.root = tree.insert(tree.root,50);
        tree.root = tree.insert(tree.root,150);
        tree.root = tree.insert(tree.root,25);
        tree.root = tree.insert(tree.root,75);
        tree.root = tree.insert(tree.root,125);
        tree.root = tree.insert(tree.root,175);

        tree.post_order(tree.root);
        System.out.println("");
        tree.pre_order(tree.root);
        System.out.println("");
        tree.in_order(tree.root);

    }
}