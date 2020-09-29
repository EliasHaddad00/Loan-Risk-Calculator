
public class Business {
	
	private double totalAssets;//
	private double totalDept;//
	private int numberOfEmployees;//
	private boolean newBusiness;
	private double fiveYearRevenue;//
	private double fiveYearProfit;//
	private double fiveYearExpenses;//
	private int customerBase;//
	private String businessDescription;//
	private String businessType;
	
	public Business(){
		totalAssets = 0.0;
		totalDept =0.0;
		numberOfEmployees = 0;
		newBusiness = true;
		fiveYearRevenue = 0.0;
		businessDescription = null;
		businessType = null;
		fiveYearProfit = 0.0;
		fiveYearExpenses = 0.0;
		customerBase = 0;
		businessDescription = null;
		businessType = null;
	}
	
	
	public double getFiveYearProfit() {
		return fiveYearProfit;
	}

	public void setFiveYearProfit(double fiveYearProfit) {
		this.fiveYearProfit = fiveYearProfit;
	}

	public double getFiveYearExpenses() {
		return fiveYearExpenses;
	}

	public void setFiveYearExpenses(double fiveYearExpenses) {
		this.fiveYearExpenses = fiveYearExpenses;
	}

	public int getCustomerBase() {
		return customerBase;
	}

	public void setCustomerBase(int customerBase) {
		this.customerBase = customerBase;
	}
	
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public double getTotalAssets() {
		return totalAssets;
	}
	public void setTotalAssets(double totalAssets) {
		this.totalAssets = totalAssets;
	}
	public double getTotalDept() {
		return totalDept;
	}
	public void setTotalDept(double totalDept) {
		this.totalDept = totalDept;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public boolean isNewBusiness() {
		return newBusiness;
	}
	public void setNewBusiness(boolean newBusiness) {
		this.newBusiness = newBusiness;
	}
	public double getFiveYearRevenue() {
		return fiveYearRevenue;
	}
	public void setFiveYearRevenue(double fiveYearRevenue) {
		this.fiveYearRevenue = fiveYearRevenue;
	}
	public String getBusinessDescription() {
		return businessDescription;
	}
	public void setBusinessDescription(String businessDescription) {
		this.businessDescription = businessDescription;
	}
	public double getBusinessScore() {
		double customerScore=0;
		if(customerBase>1000) {
			customerScore=1;
		}
		double businessScore=(totalAssets/10000) + (totalDept/10000) +(numberOfEmployees/100) + (fiveYearRevenue/5)
				+ (fiveYearProfit/5)-(fiveYearExpenses/5) + customerScore;
		return businessScore;
	}
	
}
