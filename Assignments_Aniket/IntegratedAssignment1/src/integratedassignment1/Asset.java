//lex_auth_0130008620764692481835
//do not modify the above line

package integratedassignment1;

public class Asset {
	//Implement your code here
	
	private String assetId;
	private String assetName;
	private String assetExpiry;
	
	public String getAssetId() {
		return assetId;
	}
	public void setAssetId(String assetId) {
		
		this.assetId = assetId;
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
	
	//Do not modify the code given below
	public Asset(String assetId, String assetName, String assetExpiry)
	{
		int n = assetId.length();
		if((assetId.startsWith("DSK-")||assetId.startsWith("LTP-")||assetId.startsWith("IPH-")) && (Character.toUpperCase(assetId.charAt(n-1))=='H'|| Character.toUpperCase(assetId.charAt(n-1))=='L'))
		{
			this.assetId = assetId;
			this.assetName = assetName;
			this.assetExpiry = assetExpiry;
		}
	}
	@Override
	public String toString() {
		return "Asset Id: "+getAssetId()+", Asset Name: "+getAssetName()+", Asset Expiry: "+getAssetExpiry();
	}
}