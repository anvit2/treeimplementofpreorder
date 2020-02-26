public class operation {
    public Node CreatenewNode(int data)
    {
        Node newNode=new Node();
        newNode.data=data;
        return newNode;
    }
    public void display(Node root)
    {
        if(root ==null)
        {
            return;
        }
        else
        {
            System.out.println(root.data);
            display(root.left);
            display(root.right);
        }
    }
}
