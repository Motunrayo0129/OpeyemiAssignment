 public class LoopPattern2 {
	public static void main(String[] args) { 

		int num = 6;
	for(int row =1; row <= num; row++) {
	int p = 1;
	for(int column = row; column <= num; column++) {
	System.out.print(p++ +" "); }
	for(int rc = row; rc <= num; rc++ ) {
	System.out.print(p++ +" "); }
	}

}
}