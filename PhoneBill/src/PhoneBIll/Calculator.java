package PhoneBIll;

public class Calculator {
	double usage;
	int linenumber;
	double exceedUsage;
	String type;
	
	public Calculator(double usage,double linenumber,String type){
		this.useage=usage;
		this.linenumber=linenumber;
		this.exceedUsage=0;
		this.type=type
	}
	public double calculation{
		double exceedUsageFee=0;
		double lineNumberFee=0;
		if(type=="gold"){
			Plan gold = new GoldPlan();
			exceedUsage = usage-gold.getbasicMin;
			if(exceedUsage>0){
				exceedUsageFee=exceedUsage*gold.getExcessFareRate;
			}
			if(linenumber>1){
				lineNumberFee=(lineNumber-1)*21.5
			}
			totalFee=gold.basicFee+exceedUsageFee+lineNumberFee
			return totalFee
		}
		if(type=="sliver"){
			Plan silver = new SilverPlan;
			exceedUsage = userUsage-silver.getbasicMin;
			if(exceedUsage>0){
				exceedUsageFee=exceedUsage*silver.getExcessFareRate;
			}
			if(linenumber>1){
				lineNumberFee=(lineNumber-1)*14.5
			}
			totalFee=silver.basicFee+exceedUsageFee+lineNumberFee
			return totalFee
		}
	}
}

