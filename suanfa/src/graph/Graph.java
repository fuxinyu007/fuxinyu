package graph;

public class Graph {

	private int vertexSize; //顶点数量
	private int[] vertexs;   //顶点数据
	private int[][] matrix;
	private static final int MAX_WEIGHT = 1000;

	public Graph(int vertexSize ){
		this.vertexSize = vertexSize;
		matrix = new int[vertexSize][vertexSize];
		vertexs = new int[vertexSize];
		for(int i =0;i<vertexSize;i++){
			vertexs[i]= i;
		}
	}
	
	//获取某个顶点的出度
	public int getOutDegree(int index){
		int degree = 0;
		for(int j=0;j<matrix[index].length;j++){
			int weight = matrix[index][j];
			if(weight!=0&&weight!=MAX_WEIGHT){
				degree++;
			}
		}
		return degree;
	}
	
	
	
	
	
	public int[] getVertexs() {
		return vertexs;
	}
	public void setVertexs(int[] vertexs) {
		this.vertexs = vertexs;
	}

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		int[] a1 = new int[]{0,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,6};
		int[] a2 = new int[]{9,0,3,MAX_WEIGHT,MAX_WEIGHT};
		int[] a3 = new int[]{2,MAX_WEIGHT,0,5,MAX_WEIGHT};
		int[] a4 = new int[]{MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,0,1};
		int[] a5 = new int[]{MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,0};
		graph.matrix[0] =a1;
		graph.matrix[1] =a2;
		graph.matrix[2] =a3;
		graph.matrix[3] =a4;
		graph.matrix[4] =a5;
		int outDegree = graph.getOutDegree(1);
		System.out.println(outDegree);
		
	}
}
