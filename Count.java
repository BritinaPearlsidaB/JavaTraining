
import java.util.Arrays;
class GFG {
	static class node
	{ 
		public int data;
		public node left, right;
		public node(){
			data = 0;
			left = right = null;
		}

	}
    	static int totalNodes(node root)
	{
		if (root == null)
			return 0;
        int currentnode=1;
        int l = totalNodes(root.left);
		int r = totalNodes(root.right);
		return currentnode + l + r;
    }
	static node newNode(int data)
	{
		node temp = new node();
		temp.data = data;
		temp.left = temp.right = null;
		return temp;
	}

	public static void main(String args[])
	{
     
            int[] arr = {7,3,2,1,5,4,6};
            System.out.println(Arrays.toString(arr));
            Arrays.sort(arr);

    }

}