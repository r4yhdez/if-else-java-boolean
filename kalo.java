import java.util.Scanner;

class logika {
	public static void main(String args[]) {
		
	// variable untuk tipe data
		boolean result;
		
	 Scanner userInput = new Scanner(System.in);
	
    // meminta data dari user 	
       System.out.print("masukan angka kebenaran: ");
       int data = userInput.nextInt();

   //logika if 
   
   if ( data == 1) {
	   // jika user menulis angka 1 maka akan keluar true
	   result = true;
	   System.out.println( result);
	   
   } else {
	   //jika user mengetik selain angka 1 maka false
	   result = false;
	   System.out.println(result);
     }
   }
}
	   
   	   