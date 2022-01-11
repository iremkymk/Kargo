package cargo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//burada kullan�c�m�z�n instance'�n� olu�turuyoruz. (normal �artlarda bu veri taban�ndan gelir.)
		
				User user1 = new User();
				user1.id = 1;
				user1.FirstName = "irem";
				user1.LastName = "kaymak";
				user1.phoneNumber = "05322548565";
				user1.Adress = "selahattin �ak�r cad. alim sokak no:42 erenler/bilecik";
				user1.email = "iremkaymak@gmail.com";
				user1.password = "12345";
				user1.CustomerType = "CIP";
				
				
				Cargo cargo1 = new Cargo();
				cargo1.id = 1;
				cargo1.cargoNo = "A554F56A8";
				cargo1.cargoType = "Evrak";
				cargo1.cargoWeight = 2000;
				cargo1.cargoStatus = "0";
				
				
				//burada kargomuzun durumuna g�re sorgulama yap�yoruz.
				
				/*
				if(cargo1.cargoStatus == "1") {
					System.out.print("Kargonuz Yolda");
				}else if(cargo1.cargoStatus == "2"){
					System.out.print("Kargonuz Geldi");
				}else {
					System.out.print("Kargo Yola ��kmad�");
				}
				*/
				
				
				/*
				
				
				System.out.print("------------------------------Sisteme Giri� Yapmak ��in Bilgilerinizi Giriniz---------------------------------------\n");

				
				//burada kullan�c�dan bilgilerini al�yoruz
				
				Scanner girdi = new Scanner(System.in);
				System.out.print("Email	  : ");
			    String KullaniciMail = girdi.next();
				System.out.print("�ifre	  : ");
				String KullaniciPassword = girdi.next();
				

				
				// burada verdi�i bilgileri bizde var olan bilgilerle kar��la�t�r�yoruz. e�er sonu� do�ru olursa giri� ba�ar�l� oluyor.

				if(KullaniciMail.equals(user1.email) && KullaniciPassword.equals(user1.password)) {
					System.out.print("Sisteme Ba�ar�yla Giri� Yapt�n�z");
				}else {
					System.out.print("Giri� Bilgileriniz Hatal�");
				}
				*/
				
				
				
			    System.out.print("------------------------------Kargo Bilgilerini Giriniz---------------------------------------\n");
				  
			    //burada kargoya ait bilgileri al�yoruz.
			    
				Scanner girdi = new Scanner(System.in);
				System.out.print("id	  : ");
				String cargoId = girdi.next();
				System.out.print("Cargo no : ");
				String cargoNo = girdi.next();
				System.out.print("Kargo tipi : ");
				String cargoType = girdi.next();
				System.out.print("Kargo A��rl��� : ");
				String cargoWeight = girdi.next();
				
				System.out.print("------------------------------Kullan�c� Bilgilerini Giriniz---------------------------------------\n");
				
				//burada kullan�c�ya ait bilgileri al�yoruz.
				System.out.print(" ");
				System.out.print("�sim : ");
				String FirstName = girdi.next();
				System.out.print("Soyisim : ");
				String LastName = girdi.next();
				System.out.print("Telefon Numaras� : ");
				String phoneNumber = girdi.next();
				System.out.print("Adres : ");
				String Adress = girdi.next();
				System.out.print("Email : ");
				String email = girdi.next();
				System.out.print("M��teri Tipi : ");
				String customerType = girdi.next();
				
				
				
				double musteriKargoAg�rl�k = Double.parseDouble(cargoWeight);
				double kargoBedeli = 5;
				double indirimYuzdesiVIP = 0.10;
				double indirimYuzdesiCIP = 0.05;
				if(musteriKargoAg�rl�k < 5) {
					System.out.print("Kargonuz 5 Kilodan d���k oldu�u i�in bisiklet ile g�nderilecektir.\n");

					if(customerType.equals("VIP")) {
						 //burada kargoya verilecek olan indirim tutar�n� hesapl�yoruz
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiVIP;
						 //burada hesaplanan indirim tutar�n� normal tutardan ��kararak indirimli tutar� buluyoruz.
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z VIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z CIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k;
						System.out.print("Kargo Fiyat�n�z " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					System.out.print("Kargonuz Al�nm��t�r. Kullan�c� Bilgileri : " + "Kullan�c� Ad� : "+FirstName+" Kullan�c� Soyad� : "+LastName+" Telefon Numaras� : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo a��rl��� :"+ cargoWeight);
					
					
				}
				else if(musteriKargoAg�rl�k < 20 ) {
					System.out.print("Kargonuz 20 Kilodan d���k oldu�u i�in motorsiklet ile g�nderilecektir.\n");

					if(customerType.equals("VIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiVIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z VIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z CIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k;
						System.out.print("Kargo Fiyat�n�z " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					System.out.print("Kargonuz Al�nm��t�r. Kullan�c� Bilgileri : " + "Kullan�c� Ad� : "+FirstName+" Kullan�c� Soyad� : "+LastName+" Telefon Numaras� : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo a��rl��� :"+ cargoWeight);
					
					
				}
				else if(musteriKargoAg�rl�k < 50 ) {
					System.out.print("Kargonuz 50 Kilodan d���k oldu�u i�in taksi ile g�nderilecektir.\n");

					if(customerType.equals("VIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiVIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z VIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z CIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k;
						System.out.print("Kargo Fiyat�n�z " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					System.out.print("Kargonuz Al�nm��t�r. Kullan�c� Bilgileri : " + "Kullan�c� Ad� : "+FirstName+" Kullan�c� Soyad� : "+LastName+" Telefon Numaras� : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo a��rl��� :"+ cargoWeight);
					
					
				}
				else if(musteriKargoAg�rl�k < 100 ) {
					System.out.print("Kargonuz 100 Kilodan d���k oldu�u i�in kamyon ile g�nderilecektir.\n");

					if(customerType.equals("VIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiVIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z VIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z CIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k;
						System.out.print("Kargo Fiyat�n�z " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					System.out.print("Kargonuz Al�nm��t�r. Kullan�c� Bilgileri : " + "Kullan�c� Ad� : "+FirstName+" Kullan�c� Soyad� : "+LastName+" Telefon Numaras� : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo a��rl��� :"+ cargoWeight);
					
					
				}
				else if(musteriKargoAg�rl�k < 500 ) {
					System.out.print("Kargonuz 500 Kilodan d���k oldu�u i�in TIR ile g�nderilecektir.\n");

					if(customerType.equals("VIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiVIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z VIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z CIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k;
						System.out.print("Kargo Fiyat�n�z " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					System.out.print("Kargonuz Al�nm��t�r. Kullan�c� Bilgileri : " + "Kullan�c� Ad� : "+FirstName+" Kullan�c� Soyad� : "+LastName+" Telefon Numaras� : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo a��rl��� :"+ cargoWeight);
					
					
				}
				else if(musteriKargoAg�rl�k < 5000 ) {
					System.out.print("Kargonuz 500 Kilodan d���k oldu�u i�in U�ak ile g�nderilecektir.\n");

					if(customerType.equals("VIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiVIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z VIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z CIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k;
						System.out.print("Kargo Fiyat�n�z " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					System.out.print("Kargonuz Al�nm��t�r. Kullan�c� Bilgileri : " + "Kullan�c� Ad� : "+FirstName+" Kullan�c� Soyad� : "+LastName+" Telefon Numaras� : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo a��rl��� :"+ cargoWeight);
					
					
				}
				else if(musteriKargoAg�rl�k < 25000 ) {
					System.out.print("Kargonuz 25000 Kilodan d���k oldu�u i�in Gemi ile g�nderilecektir.\n");

					if(customerType.equals("VIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiVIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z VIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAg�rl�k * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k -toplamIndirim;
						 
						 System.out.print("Kargo Fiyat�n�z CIP Oldu�unuz I�in �ndirimli Olarak " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAg�rl�k;
						System.out.print("Kargo Fiyat�n�z " + sonucFiyat + " TL Yans�t�lm��t�r.\n");
					}
					System.out.print("Kargonuz Al�nm��t�r. Kullan�c� Bilgileri : " + "Kullan�c� Ad� : "+FirstName+" Kullan�c� Soyad� : "+LastName+" Telefon Numaras� : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo a��rl��� :"+ cargoWeight);
					
					
				}else {
					System.out.print("UYARI : 25000 kilodan fazla g�nderim yap�lmamaktad�r.");
				}
	}

}
