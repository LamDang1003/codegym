package test;

public class CustomBTS<T extends Comparable<T>> {
    private Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    private class Node<T>{
        private T val;
        private Node<T> left;
        private Node<T> right;

        public Node(T val){
            this.val= val;
        }
    }

    public void add(T t){
        root= addRecursive(root, t);
    }

    private Node addRecursive(Node<T> cur, T t){
        if(cur==null)
            return new Node<>(t);

        if(t.compareTo(cur.val)<0) cur.left= addRecursive(cur.left, t);
        else cur.right= addRecursive(cur.right, t);

        return cur;
    }

    public void traversePreOrder(Node node){
        if(node!=null){
            System.out.println(node.val);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node node){
        if(node!=null){
            traverseInOrder(node.left);
            System.out.println(node.val);
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node node){
        if(node!=null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.println(node.val);
        }
    }

    public boolean contain(T t){
        return containRecursive(root, t);
    }

    private boolean containRecursive(Node<T> cur, T t){
        if(cur==null) return false;

        if(t.compareTo(cur.val)==0) return true;

        return t.compareTo(cur.val)>0? containRecursive(cur.right, t): containRecursive(cur.left, t);
    }

    public void delete(T t){
        root= deleteRecursive(root, t);
    }

    private Node deleteRecursive(Node<T> cur, T t){
        if(cur==null)
        return null;

        if(t.compareTo(cur.val)== 0){
            if (cur.left == null && cur.right == null) {
                return null;
            }

            if(cur.right==null)
                return cur.left;
            if(cur.left==null)
                return cur.right;

            T smallestValue = findSmallestValue(cur.right);
            cur.val = smallestValue;
            cur.right = deleteRecursive(cur.right, smallestValue);
            return cur;
        }

        if(t.compareTo(cur.val)<0) cur.left = deleteRecursive(cur.left, t);
        else cur.right= deleteRecursive(cur.right, t);

        return cur;
    }

    private T findSmallestValue(Node<T> cur) {
        return cur.left == null ? cur.val : findSmallestValue(cur.left);
    }
}

class Test{
    public static void main(String[] args){
        CustomBTS<Integer> customBTS= new CustomBTS<>();
        customBTS.add(6);
        customBTS.add(4);
        customBTS.add(8);

        customBTS.delete(4);
        customBTS.traversePostOrder(customBTS.getRoot());
    }
}
