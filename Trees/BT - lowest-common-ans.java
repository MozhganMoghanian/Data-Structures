 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2)
    {
        Stack<Node> s1 = search(root, v1);
        Stack<Node> s2 = search(root, v2);
        
        Stack<Node> s11 = new Stack();
        Stack<Node> s22 = new Stack();

        while(!s1.empty()){
            s11.push(s1.pop());
        }
    
        while(!s2.empty()){
            s22.push(s2.pop());
        }
        
        Node ans= new Node();
        While(s22.peek() == s11.peek()){
            ans = s22.peek();
            s22.pop();
            s11.pop();
        }
    
        return ans;
    
        Stack search(Node root, int v){
            Stack<Node> s = new Stack();
            s.push(n);
            while(!s.empty()){
                Node m = s.peek();
                if(m.data != v){
                    if(m.left != null){
                        s.push(m.left);
                        m = m.left;
                    }else if(m.right != null){
                        s.push(m.right);
                        m = m.right;
                    }else{
                        s.pop();
                    }
                }else{
                   return s; 
                }
            }
        }
       
    }

