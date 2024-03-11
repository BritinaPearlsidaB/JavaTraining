    class BinaryTree {

        private Node root;
    
        public BinaryTree() {
            root = null;
        }
    
        public void add(int value) {
            Node newNode = new Node(value);
            if (root == null) {
                root = newNode;
            } else {
                Node currentNode = root;
                while (true) {
                    if (value < currentNode.value) {
                        if (currentNode.left == null) {
                            currentNode.left = newNode;
                            break;
                        } else {
                            currentNode = currentNode.left;
                        }
                    } else {
                        if (currentNode.right == null) {
                            currentNode.right = newNode;
                            break;
                        } else {
                            currentNode = currentNode.right;
                        }
                    }
                }
            }
        }
    
        public void print() {
            print(root);
        }
    
        void print(Node node) {
            if (node == null) {
                return;
            }
            print(node.left);
            System.out.println(node.value);
            print(node.right);
        }
    
        private class Node {
    
            private int value;
            private Node left;
            private Node right;
    
            public Node(int value) {
                this.value = value;
                left = null;
                right = null;
            }
        }
    }
    