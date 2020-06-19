
public class Kakao_Test {

	public static void main(String[] args) {
		int[][] key = {{0, 0, 0}, 
    		    	   {1, 0, 0}, 
    		    	   {0, 1, 1}};
		int[][] lock = {{1, 1, 1}, 
						{1, 1, 0}, 
						{1, 0, 1}};

	System.out.println(solution(key,lock));
	}
	
	/*
	public static boolean solution(int[][] key, int[][] lock) {
		boolean answer = false;
		for(int i=0; i<4; i++) {
			if(match(key,lock))
				return true;
			key = rotate(key);// arr ������ key ����
		}		
		return answer;
	}
	
	public static int[][] rotate(int[][] arr){
		int[][] temp = new int[arr.length][arr.length];
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				temp[i][j] = arr[2-j][i];
			}
		}
		return temp; //Ű ������ match�Լ����ٰ� temp�� ��
	}

	public static boolean match(int[][]key,int[][]lock) {
		for(int i = (1-key.length); i<lock.length; i++) {
			for(int j = (1-key.length); j<lock.length; j++) {
				int[][] temp = move(key,lock.length,i,j);
				if(isUnlock(temp,lock)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static int[][] move(int[][]key, int length, int row, int col){
		int[][] temp = new int[length][length];
		for(int i = 0; i<key.length; i++) {
			for(int j = 0; j<key.length; j++) {
				if((i + row >= 0 ) && (i + row < length) && (j + col >= 0) && (j + col < length)) {
					temp[i+row][j+col] = key[i][j];
				}
			}
		}
		return temp;
	}

	public static boolean isUnlock(int[][] key, int[][] lock) {
		for(int i=0; i<lock.length; i++) {
			for(int j=0; j<lock.length; j++) {
				if((key[i][j] + lock[i][i] != 1)) {
					return false;
				}
			}
		}
		return true;
		*/
	
	public static boolean solution(int[][] key, int[][] lock) {
		boolean answer = false;
		for(int i=0;i<4;i++) {
			if(match(key, lock)) {
				return true;
			}
			key = rotate(key);
		}
		return answer;
	}
	static int[][] rotate(int[][] arr){
		int[][] tmp = new int[arr.length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				tmp[i][j]=arr[j][arr.length-1-i];
			}
		}
		return tmp;
	}
	
	static int[][] move(int[][] key, int len, int row, int col){
		int[][] tmp = new int[len][len];
		for(int i=0;i<key.length;i++) {
			for(int j=0;j<key.length;j++) {
				if((i+row>=0) && (i+row<len) && (j+col>=0) && (j+col<len)) {
					tmp[i+row][j+col]=key[i][j];
				}
			}
		}
		return tmp;
	}
	
	static boolean unlock(int[][] key, int[][] lock) {
		for(int i=0;i<lock.length;i++) {
			for(int j=0;j<lock.length;j++) {
				if((key[i][j]+lock[i][j])!=1) {
					return false;
				}
			}
		}
		return true;
	}
	
	static boolean match(int[][] key, int[][] lock) {
		for(int i=(1-key.length);i<lock.length;i++) {
			for(int j=(1-key.length);j<lock.length;j++) {
				int[][] tmp = move(key, lock.length,i,j);
				if(unlock(tmp, lock)) {
					return true;
				}
			}
		}
		return false;
	}
	
}


