//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public class Asset {
	//Implement your code here
	
	//Uncomment the code given below after implementing the class
	//Do not modify the code given below
	private String assetId,assetName,assetExpiry;
	Asset(String assetId,String assetName,String assetExpiry){
		this.assetId=assetId;
		this.assetName=assetName;
		this.assetExpiry=assetExpiry;
	}

	public String getAssetId() {
		return assetId;
	}

	public void setAssetId(String assetId) {
		if (((assetId.startsWith("DLK-")||assetId.startsWith("LTP-")||
				assetId.startsWith("IPH-")) && (assetId.endsWith("H") || assetId.endsWith("L")))) {
			for (int i = 4; i < 10; i++ ) {
				if (assetId.charAt(i) >= 0 && assetId.charAt(i) <= 9){
					this.assetId = assetId;
				}
			}
	}
		else {
			new InvalidAssetsException("Invalid");
		}
}

	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public String getAssetExpiry() {
		return assetExpiry;
	}

	public void setAssetExpiry(String assetExpiry) {
		this.assetExpiry = assetExpiry;
	}
	@Override
	public String toString() {
		return "Asset Id: "+getAssetId()+", Asset Name: "+getAssetName()+", Asset Expiry: "+getAssetExpiry();
	}
}