package binaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 二叉树的遍历
 */
public class BinaryTree {
	private TreeNode root = null;
	//根
	public BinaryTree( ) {
		root = new TreeNode(1,"A");
	}
	/*
	 * 构建二叉树
	 *           A
	 *        B     C
	 *    D      E      F   
	 */
	public void createBinaryTree(){
		TreeNode nodeB = new TreeNode(2, "B");
		TreeNode nodeC = new TreeNode(3, "C");
		TreeNode nodeD = new TreeNode(4, "D");
		TreeNode nodeE = new TreeNode(5, "E");
		TreeNode nodeF = new TreeNode(6, "F");
		root.leftChild = nodeB;
		root.rightChild=nodeC;
		nodeB.leftChild=nodeD;
		nodeB.rightChild=nodeE;
		nodeC.rightChild=nodeF;
	}
	/*
	 * 求二叉树高度
	 */
	public int getHeight( ){
		return getHeight(root);
	}
	private int getHeight(TreeNode node) {
		 if(node == null){
			 return 0;
		 }else{
			 int i =getHeight(node.leftChild);
			 int j = getHeight(node.rightChild);
			 return (i<j)?j+1:i+1;
		 }
	}
	/*
	 * 获取二叉树的结点数
	 */
	public int getSize(){
		return getSize(root);
	}
	private int getSize(TreeNode node) {
		 if(node == null){
			 return 0;
		 }else{
			 return 1+getSize(node.leftChild)+getSize(node.rightChild);
		 }
	}
	
	/*
	 * 通过前序遍历的数据序列反向生成二叉树
	 * 
	 *              A
	 *       B                  C
	 *  D        E         #          F
	 * # #    #      #             #     #   
	 *    A B D## E## C# F##     
	 * 
	 */
	public void createBinaryTreePre( ArrayList<String> data){
		createBinaryTree(data.size(),data);
	}
	private TreeNode createBinaryTree(int size, ArrayList<String> data) {
		 if(data.size()==0){
			 return null;
		 }
		 String d = data.get(0);
		 TreeNode node;
		 int index = size-data.size();
		 if(d.equals("#")){
			 node = null;
			 data.remove(0);
			 return node;
		 }
		 node = new TreeNode(index,d);
		 if(index==0){
			 //创建根结点
			 root = node;
			// data.remove(0);
		 } 
			 data.remove(0);
			 node.leftChild = createBinaryTree(size, data);
			 node.rightChild=createBinaryTree(size, data);
		  
		return node;
	}
	
	
	
	
	
	/*
	 * 前序遍历
	 */
	public void preOrder(TreeNode node){
		if(node == null){
			return;
		}else{
			System.out.println("preOrder data:"+node.getData());
			preOrder(node.leftChild);
			preOrder(node.rightChild);
		}
	}
	/*
	 * 中序遍历
	 */
	public void midOrder(TreeNode node){
		if(node ==null){
			return ;
		}
		else{
			midOrder(node.leftChild);
			System.out.println("midOrder data:"+node.getData());
			midOrder(node.rightChild);
		}
	}
	/*
	 * 后序遍历
	 */
	public void postOrder(TreeNode node){
		if(node == null){
			return;
		}else{
			postOrder(node.leftChild);
			postOrder(node.rightChild);
			System.out.println("postOrder data:"+node.getData());
		}
	}
	public class TreeNode {
		private int index;
		private String data;
		private TreeNode leftChild;
		private TreeNode rightChild;
		private TreeNode parent;
		
		public TreeNode getParent() {
			return parent;
		}
		public void setParent(TreeNode parent) {
			this.parent = parent;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public TreeNode(int index, String data) {
			super();
			this.index = index;
			this.data = data;
		}
	}
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
//		binaryTree.createBinaryTree();
//		int height = binaryTree.getHeight();
//		System.out.println("treeHeight= "+height);
//		int size = binaryTree.getSize();
//		System.out.println("treeSize= "+size);
//		binaryTree.preOrder(binaryTree.root);
//		binaryTree.midOrder(binaryTree.root);
//		binaryTree.postOrder(binaryTree.root);
		ArrayList<String> data = new ArrayList<String>();
		String[] dataArray = new String[]{"A","B","D","#","#","E","#","#","C","#","F","#","#"};
		for(String d:dataArray){
			data.add(d);
		}
		binaryTree.createBinaryTreePre(data);
		binaryTree.preOrder(binaryTree.root);
	}
}
