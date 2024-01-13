package Trees;


class TreeNode{
public class Node {
    private int value;
    private Node left;
    private Node right;
    private int height;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
    private Node root;

    public TreeNode() {}
    public int height(Node node){
        if(node==null){
            return -1;
        }
       return node.height;
    }

    public void display(){
        display(this.root,"Root Node: ");
    }

    private void display(Node node, String s) {
        if (node == null){
            return;
        }
        System.out.println(s + node.value);
        display(node.left,"Left Child of "+ node.value +" : ");
        display(node.right,"Right Child of "+ node.value +" : ");
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void convert2Trees(int[] tree){
        for(int i= 0;i < tree.length ;i++)
        {
            this.insert2Trees(tree[i]);
        }
    }
    public void convert2TreesSorted(int[] arr)
    {
        convert2TreesSorted(arr,0,arr.length);
    }
    public void convert2TreesSorted(int[] arr,int start,int end)
    {
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        convert2TreesSorted(arr, start, mid);
        convert2TreesSorted(arr, mid+1, end);
    }
    public void insert2Trees(int value) {
        root = insert2Trees(value,root);
    }
    private Node insert2Trees(int value,Node node){
        if(node ==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
          node.left=insert2Trees(value,node.left);
        }
        if(value> node.value)
        {
            node.right=insert2Trees(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;

    }

public boolean balanced(){
        return balanced(root);
}
public boolean balanced(Node node){
        if(node==null){
            return true;
        }
    System.out.println("balanced "+Math.abs(height(node.left)-height(node.right)));
        return Math.abs(height(node.left)-height(node.right))<=1&&balanced(node.left)&&balanced(node.right);
}

    public static void main(String args[]){
        TreeNode tnode=new TreeNode();
        int[] tree={2,5,6,8,1,5,6};
        tnode.convert2Trees(tree);
        tnode.display();
        tnode.balanced();

    }
}
