public class Praktikum{
	public static void main(String args []){
		int a=4,b=6;//variabel a bernilai 4 dan b bernilai 6 yang bertipe data int
		int num=a|b;//variabel num mewakili nilai a atau b
		if(num==4) //jika nilai num==4 akan mencetak "Value is 4"
			System.out.println("Value is 4"); //mencetak "Value is 4"
		else if(num==5) //jika nilai num==5 akan mencetak "Value is 5"
			System.out.println("Value is 5"); //mencetak "Value is 5"
		else if(num==6) //jika nilai num==6 akan mencetak  "Value is 6"
			System.out.println("Value is 6"); //mencetak "Value is 6"
		else if(num==7) //jika nilai num==7 akan mencetak "Value is 7"
			System.out.println("Value is 7"); //mencetak "Value is 7"
		//output menampilkan"Value is 6" karena nilai a or b yang digunakan di tipe data integer menghitung angka binernya
		//4 = 00000100
		//6 = 00000110
		//jika menggunakan pernyataan "or", maka akan menjadi : 00000110 yang bernilai desimal 6
	}
}