package greedy;
/*
 * 分治算法：棋盘问题
 */
public class ChessBoradProblem {

	private int[][] board;//棋盘
	private int specialRow;//特殊点的行下标
	private int specialCol;//特殊点的列下标
	private int size;
	private int type=0;
	public ChessBoradProblem(int specialRow, int specialCol,int size) {
		super();
		this.specialRow = specialRow;
		this.specialCol = specialCol;
		this.size = size;
		board = new int[size][size];
	}
/*
 * specialRow 特殊点行下标
 * specialCol 特殊点列下标
 * leftRow 矩阵左边起点行下标
 * leftCol 矩阵左边起点列下标
 * size 矩阵的宽或高
 */
	private void chessBoard(int specialRow,int specialCol,int leftRow,int leftCol,int size ){
		//递归的出口
		if(size==1){
			return;
		}
		int subSize = size/2;
		type= type%4+1;
		int n=type;
		//假设特殊点在左上角区域
		if(specialRow<leftRow+subSize&&specialCol<leftCol+subSize){
			chessBoard(specialRow, specialCol, leftRow, leftCol, subSize);
		}else{
			//不在左上角
			board[leftRow+subSize-1][leftCol+subSize-1]=n;
			chessBoard(leftRow+subSize-1, leftCol+subSize-1, leftRow, leftCol, subSize);
		}
		//特殊点在右上角
		if(specialRow<leftRow+subSize&&specialCol>=leftCol+subSize){
			chessBoard(specialRow, specialCol, leftRow, leftCol+subSize, subSize);
		}else{
			board[leftRow+subSize-1][leftCol+subSize]=n;
			chessBoard(leftRow+subSize-1, leftCol+subSize, leftRow, leftCol+subSize, subSize);
		}
		//特殊点在左下方
		if(specialRow>=leftRow+subSize&&specialCol<leftCol+subSize){
			chessBoard(specialRow, specialCol, leftRow+subSize, leftCol, subSize);
		}else{
			board[leftRow+subSize][leftCol+subSize-1]=n;
			chessBoard(leftRow+subSize, leftCol+subSize-1, leftRow+subSize, leftCol, subSize);
		}
		//特殊点在右下角
		if(specialRow>=leftRow+subSize&&specialCol>=leftCol+subSize){
			chessBoard(specialRow, specialCol, leftRow+subSize, leftCol+subSize, subSize);
		}else{
			board[leftRow+subSize][leftCol+subSize]=n;
			chessBoard(leftRow+subSize, leftCol+subSize, leftRow+subSize, leftCol+subSize, subSize);
		}
	}
	public void pringBoard(int specialRow,int specialCol,int size){
		chessBoard(specialRow, specialCol, 0, 0, size);
		printResult();
	}
	private void printResult() {
		 for(int i=0;i<size;i++){
			 for(int j=0;j<size;j++){
				 System.out.print(board[i][j]+" ");
			 }
			 System.out.println();
		 }
		
	}
	public static void main(String[] args) {
		int N=8;
		int specialRow = 0;
		int specialCol = 1;
		ChessBoradProblem boradProblem = new ChessBoradProblem(specialRow, specialCol, N);
		boradProblem.pringBoard(specialRow, specialCol, N);
	}

}
