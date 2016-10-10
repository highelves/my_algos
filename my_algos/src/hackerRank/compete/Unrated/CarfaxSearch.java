package hackerRank.compete.Unrated;

public class CarfaxSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = new String();
		int flag=0;
		for(int i=0;i<args.length;i++){
			if(key.equals(args[i])){
				System.out.println("Found");
				flag=1;
				break;
			}
		}
		if (flag==0)
			System.out.println("Not Found");
	}
}
