import java.util.*;
public class main {
    public static void main(String[] args) {
        Node root;
        operation obj=new operation();
       // Scanner sc=new Scanner(System.in);
      //  int n=sc.nextInt();
       // root=obj.CreatenewNode(n);
        //ode Root=root;

        root=obj.CreatenewNode(10);
        root.left=obj.CreatenewNode(20);
        root.right=obj.CreatenewNode(40);
        root.left.left=obj.CreatenewNode(30);
        root.left.right=obj.CreatenewNode(50);
        root.right.left=obj.CreatenewNode(60);
        root.right.right=obj.CreatenewNode(70);
        obj.display(root);
    }
}
