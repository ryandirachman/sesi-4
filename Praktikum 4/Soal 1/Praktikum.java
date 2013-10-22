public class Praktikum{
	public static void main(String[] args){
		int number1, number2, results;
		boolean number;
		number1=20;
		number2=10;
		
		results = number1 / number2; //nilai dari number1 dibagi dengan nilai dari number2 (20/10) = 2
			System.out.println(results);
		results = number1 + number2; //nilai dari number1 ditambah dengan nilai dari number2 (20+10) = 30
			System.out.println(results);
		number = (20 != 10); //pernyataan bahwa nilai dari number1 tidak sama dengan nilai number2 dan pernyataan tersebut adalah benar/true
			System.out.println(number);
		number = (20 == 10); //pernyataan bahwa nilai dari number1 adalah sama dengan nilai number2 dan pernyataan tersebut adalah salah/false
			System.out.println(number);	
	}
}