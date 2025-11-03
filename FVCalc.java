// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		int annualRate = Integer.parseInt(args[1]);
		int years = Integer.parseInt(args[2]);

		double rate = annualRate / 100.0;
		int futureValue = (int) Math.round(currentValue * Math.pow(1 + rate, years));
		System.out.println("After " + years + " years, " + "$" + currentValue + " saved at " + annualRate + "% will yield $" + futureValue);
	}
}