
public class Borrower {

	private String borrowerName; //
	private String filingDate; //
	private String borrowerAddress;//
	private String maritalStatus;//
	private double spouseWork;//
	private int numberOfChildren;//
	private boolean citizenship;//
	private String loanReason;//
	private String Borrowergender;//
	private int borrowerAge;//
	private int borrowerCreditScore;//
	private int numberOfLinesOfCredit;//
	private boolean recommendationsFromPeers;
	private double carDebtOwed;//
	private double mortgageDebtOwed;//
	private double mortgageInterest;//
	private double mortgageYearsLength;//
	private double mortgageDebtPaid;//
	private double OtherDebtOwed;//
	private boolean previousBusinesses;//
	private double mortgageYearsLeft;
	private double loanScore;
	private double loanAmount;//
	private int desiredLoanLength;//
	private double borrowerIncome; //
	private double risk;
	

	public Borrower() {
		borrowerName = null;
		filingDate = null;
		risk = 0.0;
		borrowerAddress = null;
		maritalStatus = null;
		spouseWork=0.0;
		numberOfChildren = 0;
		citizenship = true;
		loanReason = null;
		Borrowergender = null;
		borrowerAge = 0;
		borrowerCreditScore = 0;
		numberOfLinesOfCredit = 0;
		recommendationsFromPeers = false;
		carDebtOwed = 0.0;
		mortgageDebtOwed = 0.0;
		mortgageDebtPaid = 0.0;
		mortgageInterest = 0.0;
		mortgageYearsLength = 0.0;
		mortgageYearsLeft=0.0;
		OtherDebtOwed = 0.0;
		previousBusinesses = false;
		loanScore = 0;
		loanAmount = 0.0;
		desiredLoanLength = 0;
		borrowerIncome = 0.0;
	}
	public double getMortgageInterest() {
		return mortgageInterest;
	}

	public void setMortgageInterest(double mortgageInterest) {
		this.mortgageInterest = mortgageInterest;
	}

	public double getMortgageYearsLength() {
		return mortgageYearsLength;
	}

	public void setMortgageYearsLength(double mortgageYearsLength) {
		this.mortgageYearsLength = mortgageYearsLength;
	}
	
	public double getMortgageYearsLeft() {
		return mortgageYearsLeft;
	}
	public void setMortgageYearsLeft(double mortgageYearsLeft) {
		this.mortgageYearsLeft = mortgageYearsLeft;
	}
	public double getMortgageDebtPaid() {
		return mortgageDebtPaid;
	}

	public void setMortgageDebtPaid(double mortgageDebtPaid) {
		this.mortgageDebtPaid = mortgageDebtPaid;
	}
	
	public double getLoanScore() {
		return loanScore;
	}

	public void setLoanScore(double base, double businessScore, double peerScore) {
		//this.loanScore = loanScore;
		double assetExpenses;
		double creditScoreScale;
		double recommendedScore=0;
		
		double yearlyMortgage =mortgageDebtOwed/mortgageYearsLeft;

		double mortageScore=yearlyMortgage/1000;
		double annualCar=carDebtOwed/8;
		double annualOther =OtherDebtOwed/8;
		double childExpenses = (double)(numberOfChildren)*10000;

		assetExpenses = borrowerIncome+spouseWork-mortageScore-annualCar-annualOther-childExpenses;
		if(borrowerCreditScore>=750) {
			creditScoreScale=9;
		}
		else if(borrowerCreditScore<750 && borrowerCreditScore>=650){
			creditScoreScale=5;
		}
		else {
			creditScoreScale=0;
		}
		
		if(peerScore>=100000) {
			recommendedScore=2;
		}
		if(peerScore<100000&&peerScore>=50000) {
			recommendedScore = 1;
		}
		else {
			recommendedScore=0;
		}
		double temp =(base+assetExpenses+creditScoreScale+numberOfLinesOfCredit+
				(borrowerAge/15)+recommendedScore+businessScore);
		
		this.risk=(loanAmount/100000)/(temp/10000);
		this.loanScore=temp/1000;
		
	}


	public double getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


	public int getDesiredLoanLength() {
		return desiredLoanLength;
	}


	public void setDesiredLoanLength(int desiredLoanLength) {
		this.desiredLoanLength = desiredLoanLength;
	}


	public double getBorrowerIncome() {
		return borrowerIncome;
	}


	public void setBorrowerIncome(double borrowerIncome) {
		this.borrowerIncome = borrowerIncome;
	}

	
	public String getBorrowerAddress() {
		return borrowerAddress;
	}
	public void setBorrowerAddress(String borrowerAddress) {
		this.borrowerAddress = borrowerAddress;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String materailStatus) {
		this.maritalStatus = materailStatus;
	}
	public int getNumberOfChildren() {
		return numberOfChildren;
	}
	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}
	public boolean isCitizenship() {
		return citizenship;
	}
	public void setCitizenship(boolean citizenship) {
		this.citizenship = citizenship;
	}
	public String getLoanReason() {
		return loanReason;
	}
	public void setLoanReason(String loanReason) {
		this.loanReason = loanReason;
	}
	
	public String getBorrowergender() {
		return Borrowergender;
	}
	public void setBorrowergender(String borrowergender) {
		Borrowergender = borrowergender;
	}
	
	public int getBorrowerAge() {
		return borrowerAge;
	}
	public void setBorrowerAge(int borrowerAge) {
		this.borrowerAge = borrowerAge;
	}
	
	public double getSpouseWork() {
		return spouseWork;
	}
	public void setSpouseWork(double spouseWork) {
		this.spouseWork = spouseWork;
	}
	
	public int getBorrowerCreditScore() {
		return borrowerCreditScore;
	}
	public void setBorrowerCreditScore(int borrowerCreditScore) {
		this.borrowerCreditScore = borrowerCreditScore;
	}
	public int getNumberOfLinesOfCredit() {
		return numberOfLinesOfCredit;
	}
	public void setNumberOfLinesOfCredit(int numberOfLinesOfCredit) {
		this.numberOfLinesOfCredit = numberOfLinesOfCredit;
	}
	public boolean isRecommendationsFromPeers() {
		return recommendationsFromPeers;
	}
	public void setRecommendationsFromPeers(boolean recommendationsFromPeers) {
		this.recommendationsFromPeers = recommendationsFromPeers;
	}
	public double getCarDebtOwed() {
		return carDebtOwed;
	}
	public void setCarDebtOwed(double carDebtOwed) {
		this.carDebtOwed = carDebtOwed;
	}
	public double getMortgageDebtOwed() {
		return mortgageDebtOwed;
	}
	public void setMortgageDebtOwed(double morgageDebtOwed) {
		this.mortgageDebtOwed = morgageDebtOwed;
	}
	public double getOtherDebtOwed() {
		return OtherDebtOwed;
	}
	public void setOtherDebtOwed(double otherDebtOwed) {
		OtherDebtOwed = otherDebtOwed;
	}
	public boolean isPreviousBusinesses() {
		return previousBusinesses;
	}
	public void setPreviousBusinesses(boolean previousBusinesses) {
		this.previousBusinesses = previousBusinesses;
	}
	public void setName(String name) {
		this.borrowerName=name;
	}
	public String getName() {
		return borrowerName;
	}
	public void setfilingDate(String date) {
		this.filingDate=date;
	}
	public String getfilingDate() {
		return filingDate;
	}
	public double getRisk() {
		return risk;
	}
	public String toString() {
		String info="The name of the borrower is: "+ borrowerName + "\n"+ "They are asking for $: " + loanAmount + "\n" + "For a: "+ loanReason+
						"\n"+ "They have a loan score of: "+ loanScore + "\n"+ "This borrower has an calculated risk of:" + risk;
		return info;	 
	}
}
