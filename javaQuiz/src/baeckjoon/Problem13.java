package baeckjoon;

public class Problem13 {
	class Solution {
	    public int solution(int storage, int usage, int[] change) {
	        int total_usage = 0;
	        for(int i=0; i<change.length; i++){
	            usage = total_usage * change[i] / 100;
	            total_usage += usage;
	            if(total_usage > storage){
	                return i;
	            }
	        }
	        return -1;
	    }
	}
	
	public static void main(String[] args) {
		
	}
}
