public class SumNaturalNos {
	public int limit;

	public SumNaturalNos(int limit) {
		this.limit = limit;
	}

	public static void main(String args[]) {
		SumNaturalNos n1 = new SumNaturalNos(10);
		int cal = n1.sumTillLimit(10);
		System.out.println(cal);

	}

	public int sumTillLimit(int limit) {

		if (limit <= 1) {
			return 1;
		} else {
			return sumTillLimit(limit - 1) + limit;
			
		}
	}
}
