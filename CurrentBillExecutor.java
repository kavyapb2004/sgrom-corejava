class CurrentBillExecutor{

	public static void main(String[] args){
	
	
	CurrentBill currentbill = new CurrentBill();
	currentbill.billId = 1;
	int billId = currentbill.billId;
	currentbill.billAmount = 534.99;
	double billAmount = currentbill.billAmount;
	currentbill.isFinalBill = true;
	boolean isFinalBill = currentbill.isFinalBill;
	currentbill.isLatestBill = true;
	boolean isLatestBill = currentbill.isLatestBill;
	currentbill.billIssueDate = "03-02-2025";
	String billIssueDate = currentbill.billIssueDate;
	currentbill.billDueDate = "12-02-2025";
	String billDueDate = currentbill.billDueDate;
	currentbill.isBillOver = false;
	boolean isBillOver = currentbill.isBillOver;
	currentbill.billInvoiceNo ="A123";
	String billInvoiceNo = currentbill.billInvoiceNo;
	
	
	
	
	    System.out.println("the bill id is :" + billId);
		System.out.println("the bill amount is :" + billAmount );
		System.out.println("is the final is :" + isFinalBill);
		System.out.println("is the latest date is :" + isLatestBill);
		System.out.println("the bill issued date is :" + billIssueDate);
		System.out.println("the bill due date is :" + billDueDate);
		System.out.println("the bill invoice no is :" + billInvoiceNo);
	    System.out.println("current bill");
	}
}