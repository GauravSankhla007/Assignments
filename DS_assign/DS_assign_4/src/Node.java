public class Node {

    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}

class BST{
    Node root;

    static Node insert(Node root,int value){
        if (root==null){
            Node newNode = new Node(value);
            return newNode;
        }
        else if (root.data>value){
            root.left = insert(root.left,value);

        }
        else {
            root.right = insert(root.right ,value);
        }
        return root;
    }

    void in_order(Node root){

       if (root==null){
           return;
       }
       in_order(root.left);
        System.out.print(root.data + " ");
        in_order(root.right);
    }

    void pre_order(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        pre_order(root.left);
        pre_order(root.right);
    }

    void post_order(Node root){
        if(root==null){
            return;
        }
        post_order(root.left);
        post_order(root.right);
        System.out.print(root.data + " ");
    }
}
