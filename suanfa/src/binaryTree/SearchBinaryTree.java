package binaryTree;
/*
 * ���Ҷ�����
 */

public class SearchBinaryTree {

	public static void main(String[] args) {
		SearchBinaryTree binaryTree = new SearchBinaryTree();
		int[] intArray = new int[]{50,30,20,44,88,16,7,77};
		for(int i:intArray){
			binaryTree.put(i);
		}
		binaryTree.midOrder(binaryTree.root);
	}
	private TreeNode root;
	
	public SearchBinaryTree(){
		
	}
	/*
	 * �������
	 */
	public void midOrder(TreeNode node){
		if(node == null){
			return  ;
		}else{
			midOrder(node.leftChild);
			System.out.println(node.data);
			midOrder(node.rightChild);
		}
	}
	
	/*
	 * �������Ҷ�����  ��ӽ��
	 */
	public TreeNode put(int data){
		TreeNode node = null;
		TreeNode parent= null;
		
		//rootΪnull��ʾ�ǿ���
		if(root == null){
			node = new TreeNode(0,data);
			root = node;
			return node;
		}
		node = root;
		while(node!=null){
			parent = node;
			if(data>node.data){
				node = node.rightChild;
			}else if(data<node.data){
				node = node.leftChild;
			}else{
				return node;
			}
		}
		//��ʾ���˽����ӵ���Ӧλ��
		node = new TreeNode(0,data);
		if(data<parent.data){
			parent.leftChild = node;
		
		}else{
			parent.rightChild = node;
		}
		node.parent = parent;
		return node;
		
	}
	
	
	class TreeNode{
		private int key;
		private TreeNode leftChild;
		private TreeNode rightChild;
		private TreeNode parent;
		private int data;
		public TreeNode(int key, int data) {
			super();
			this.key = key;
			this.data = data;
			this.leftChild=null;
			this.rightChild=null;
			this.parent=null;
		}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public TreeNode getLeftChild() {
			return leftChild;
		}
		public void setLeftChild(TreeNode leftChild) {
			this.leftChild = leftChild;
		}
		public TreeNode getRightChild() {
			return rightChild;
		}
		public void setRightChild(TreeNode rightChild) {
			this.rightChild = rightChild;
		}
		public TreeNode getParent() {
			return parent;
		}
		public void setParent(TreeNode parent) {
			this.parent = parent;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		
		
	}
	
}
