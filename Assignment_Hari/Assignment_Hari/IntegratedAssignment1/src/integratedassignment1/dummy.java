package integratedassignment1;

import java.util.Scanner;

public class dummy {
	private String assetId;
	public void setAssetId(String assetId) {
		if (((assetId.startsWith("DLK-")||assetId.startsWith("LTP-")||
				assetId.startsWith("IPH-")) && (assetId.endsWith("H") || assetId.endsWith("L")))) {
			for (int i = 4; i < 10; i++ ) {
				System.out.println("Hi");
				if (assetId.charAt(i) >= 0 && assetId.charAt(i) <= 9){
					this.assetId = assetId;

				}
			}
	}
		else {
			new InvalidAssetsException("Invalid");
		}
		System.out.println(assetId);
	}
	public String getAssetId() {
		return assetId;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			dummy d=new dummy();
			d.setAssetId(s);
			
	}

}
