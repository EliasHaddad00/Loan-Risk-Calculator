import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		UnboundedStackInterface<Borrower> stackOfApplicants = new NodeBasedStack<Borrower>();
		UnboundedStackInterface<Borrower> stackOfPastApplicants = new NodeBasedStack<Borrower>();		
		int option;
		do {
			System.out.println("Welcome Banker, Please Follow Options Below:");
			System.out.println("Enter 1 to add a potential borrower to the stack");
			System.out.println("Enter 2 to remove a potential borrower off the top of the stack and see loan score");
			System.out.println("Enter 3 to look at the top of the stack");
			System.out.println("Enter 4 to get the size of the stack");
			System.out.println("Enter 5 to get the contents of the stack");
			System.out.println("Enter 6 to end program");
			option=keyboard.nextInt();
			keyboard.nextLine();

			if(option==1) {
				Borrower currentBorrower= new Borrower();
				
				System.out.println("Enter name: ");
				String borrowerName= keyboard.nextLine();
				currentBorrower.setName(borrowerName);
				
				System.out.println("Enter today's Date: ");
				String filingDate=keyboard.nextLine();
				currentBorrower.setfilingDate(filingDate);
				
				System.out.println("Enter Permanent home address: ");
				String borrowerAddress=keyboard.nextLine();
				currentBorrower.setBorrowerAddress(borrowerAddress);
				
				System.out.println("Enter your age: ");
				int borrowerAge=keyboard.nextInt();
				keyboard.nextLine();
				currentBorrower.setBorrowerAge(borrowerAge);
				
				System.out.println("Enter gender: ");
				String borrowerGender=keyboard.nextLine();
				currentBorrower.setBorrowergender(borrowerGender);
				
				System.out.println("Enter materail status: ");
				String maritalStatus=keyboard.nextLine();
				currentBorrower.setMaritalStatus(maritalStatus);
				if (maritalStatus.equalsIgnoreCase("Yes") || maritalStatus.equalsIgnoreCase("Married") || maritalStatus.equalsIgnoreCase("M") ||maritalStatus.equalsIgnoreCase("joint")) {
					System.out.println("Enter spouse annual income: $");
					Double spouseIncome=keyboard.nextDouble();
					currentBorrower.setSpouseWork(spouseIncome);
				}
					
				System.out.println("Enter number of dependents: ");
				int dependents=keyboard.nextInt();
				keyboard.nextLine();
				currentBorrower.setNumberOfChildren(dependents);
				
				System.out.println("Enter your annual Income: $");
				double annualIncome=keyboard.nextDouble();
				keyboard.nextLine();
				currentBorrower.setBorrowerIncome(annualIncome);
				
				System.out.println("Are you a United States Citizen (Y/N): ");
				String citizenship=keyboard.nextLine();
				boolean isCitizen;
				if(citizenship.equalsIgnoreCase("Yes") || citizenship.equalsIgnoreCase("Y") || citizenship.equalsIgnoreCase("True")){
					isCitizen=true;
				}
				else {
					isCitizen=false;
				}
				currentBorrower.setCitizenship(isCitizen);
				
				System.out.println("Enter reason for loan: ");
				String loanReason=keyboard.nextLine();
				currentBorrower.setLoanReason(loanReason);
				
				System.out.println("Enter desired loan amount: $");
				double loanAmount=keyboard.nextDouble();
				keyboard.nextLine();
				currentBorrower.setLoanAmount(loanAmount);
				
				System.out.println("Enter desired loan repayment length in years: ");
				int loanLength=keyboard.nextInt();
				keyboard.nextLine();
				currentBorrower.setDesiredLoanLength(loanLength);
				
				System.out.println("Enter Credit Score: ");
				int creditScore=keyboard.nextInt();
				keyboard.nextLine();
				currentBorrower.setBorrowerCreditScore(creditScore);
				
				System.out.println("Enter number of lines of credit:");
				int linesOfCredit=keyboard.nextInt();
				keyboard.nextLine();
				currentBorrower.setNumberOfLinesOfCredit(linesOfCredit);
				
				System.out.println("Enter car debt amount you owe: $");
				double carDebt=keyboard.nextDouble();
				keyboard.nextLine();
				currentBorrower.setCarDebtOwed(carDebt);
				
				System.out.println("Enter mortgage debt amount you owe: $");
				double mortgageOutstanding=keyboard.nextDouble();
				keyboard.nextLine();
				currentBorrower.setMortgageDebtOwed(mortgageOutstanding);
				
				System.out.println("Enter years left on mortgage: ");
				double mortgageOutstandingLength=keyboard.nextDouble();
				keyboard.nextLine();
				currentBorrower.setMortgageYearsLeft(mortgageOutstandingLength);
				
				System.out.println("Enter mortgage debt amount you have paid: $");
				double mortgagePaid=keyboard.nextDouble();
				keyboard.nextLine();
				currentBorrower.setMortgageDebtPaid(mortgagePaid);
				
				System.out.println("Enter mortgage interest Rate, in percentage (%): ");
				double mortgageInterest=keyboard.nextDouble();
				keyboard.nextLine();
				currentBorrower.setMortgageInterest(mortgageInterest);
				
				System.out.println("Enter any other debt amount you owe: $");
				double otherDebt=keyboard.nextDouble();
				keyboard.nextLine();
				currentBorrower.setOtherDebtOwed(otherDebt);
				
				Business currentBusiness = new Business();
				System.out.println("Do you own or have owned any businesses (Y/N): ");
				
				String otherBusinesses=keyboard.nextLine();
				boolean pastBusinesses;
				if(otherBusinesses.equalsIgnoreCase("Yes") || otherBusinesses.equalsIgnoreCase("Y") || otherBusinesses.equalsIgnoreCase("True")){
					pastBusinesses=true;
					
					System.out.println("Enter business description/plan: ");
					String description = keyboard.nextLine();
					currentBusiness.setBusinessDescription(description);
					
					System.out.println("Enter business type: ");
					String businessType = keyboard.nextLine();
					currentBusiness.setBusinessType(businessType);
					
					System.out.println("Enter all current business asset worth: $");
					double totalAssets = keyboard.nextDouble();
					keyboard.nextLine();
					currentBusiness.setTotalAssets(totalAssets);
					
					System.out.println("Enter all current business debt worth: $");
					double totalDebt = keyboard.nextDouble();
					keyboard.nextLine();
					currentBusiness.setTotalDept(totalDebt);
					
					System.out.println("Enter total business revenue for past five years: $");
					double totalRevenue = keyboard.nextDouble();
					keyboard.nextLine();
					currentBusiness.setFiveYearRevenue(totalRevenue);
					
					System.out.println("Enter total business profits for past five years: $");
					double totalProfit = keyboard.nextDouble();
					keyboard.nextLine();
					currentBusiness.setFiveYearProfit(totalProfit);
					
					System.out.println("Enter total business expensis for past five years: $");
					double totalExpenses = keyboard.nextDouble();
					keyboard.nextLine();
					currentBusiness.setFiveYearExpenses(totalExpenses);
					
					System.out.println("Enter all current business number of employees: ");
					int numEmployees = keyboard.nextInt();
					keyboard.nextLine();
					currentBusiness.setTotalAssets(numEmployees);
					
					System.out.println("Enter all current business number of customers: ");
					int customerBase = keyboard.nextInt();
					keyboard.nextLine();
					currentBusiness.setCustomerBase(customerBase);
					
									
				}
				else {
					pastBusinesses=false;
				}
				currentBorrower.setPreviousBusinesses(pastBusinesses);
				
				System.out.println("Would you have a recommendation (Y/N): ");
				String peerRecommendation=keyboard.nextLine();
				double peerScore = 0;
				if(peerRecommendation.equalsIgnoreCase("Yes") || peerRecommendation.equalsIgnoreCase("Y") || peerRecommendation.equalsIgnoreCase("True")){
					peerScore=0;
					System.out.println("how many recommendations do you have:");
					int numberofRec=keyboard.nextInt();
					keyboard.nextLine();
					for(int i=0; i<numberofRec;i++) {
						System.out.println("enter recomendation name:");
						String recName=keyboard.nextLine();
						System.out.println("enter recomendation phone number:");
						String recPhoneNumber=keyboard.nextLine();
						System.out.println("enter recomendation estimated income:");
						double recIncome=keyboard.nextDouble();
						keyboard.nextLine();
						peerScore=recIncome;
					}
					peerScore=peerScore/numberofRec;
				}
				double businessScore = currentBusiness.getBusinessScore();
				currentBorrower.setLoanScore(50, businessScore, peerScore);
				stackOfApplicants.push(currentBorrower);
				System.out.println("thank you for entering in the information");
				double finalLoanScore = currentBorrower.getLoanScore();

				System.out.println("your loan score is "+finalLoanScore);

			}
			
			else if(option==2) {
					try {
						Borrower inHand = stackOfApplicants.pop();
						stackOfPastApplicants.push(inHand);
					}catch(StackEmptyException e) {
						System.out.println(e.getMessage());
					}
				
			}
			else if(option==3) {
				System.out.println("Choose from the following stacks that you would like to peek at:"+"\n"+
						"Current Applicants\n"+"Past Applicants");
					String look=keyboard.nextLine();
				
				if(look.equalsIgnoreCase("Current Applicants")) {
					try {
						System.out.println(stackOfApplicants.peek());
					}catch(StackEmptyException e) {
						System.out.println(e.getMessage());
					}
				}
				else if(look.equalsIgnoreCase("Past Applicants")) {
					try {
						System.out.println(stackOfPastApplicants.peek());
					}catch(StackEmptyException e) {
						System.out.println(e.getMessage());
					}
				}
			}
			else if(option==4) {
				System.out.println("Choose from the following stacks that you would like to see the size of:"+"\n"+
						"Current Applicants\n"+"Past Applicants");
					String look=keyboard.nextLine();
					if(look.equalsIgnoreCase("Current Applicants")) {
						System.out.println(stackOfApplicants.size());
					}
					else if(look.equalsIgnoreCase("Past Applicants")) {
						System.out.println(stackOfPastApplicants.size());
					}
				
			}
			else if(option==5) {
				System.out.println("Choose from the following stacks that you would like to see the contents of:"+"\n"+
						"Current Applicants\n"+"Past Applicants");
					String look=keyboard.nextLine();
					if(look.equalsIgnoreCase("Current Applicants")) {
						System.out.println(stackOfApplicants.toString());
					}
					else if(look.equalsIgnoreCase("Past Applicants")) {
						System.out.println(stackOfPastApplicants.toString());
					}
			}
			
			else if(option==6) {
				System.out.println("Goodbye");
			}
			else {
				System.out.println("Error, please try again");
			}
				
		}while(option!=6);				
	}
}
