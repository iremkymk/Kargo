package cargo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//burada kullanýcýmýzýn instance'ýný oluþturuyoruz. (normal þartlarda bu veri tabanýndan gelir.)
		
				User user1 = new User();
				user1.id = 1;
				user1.FirstName = "irem";
				user1.LastName = "kaymak";
				user1.phoneNumber = "05322548565";
				user1.Adress = "selahattin çakýr cad. alim sokak no:42 erenler/bilecik";
				user1.email = "iremkaymak@gmail.com";
				user1.password = "12345";
				user1.CustomerType = "CIP";
				
				
				Cargo cargo1 = new Cargo();
				cargo1.id = 1;
				cargo1.cargoNo = "A554F56A8";
				cargo1.cargoType = "Evrak";
				cargo1.cargoWeight = 2000;
				cargo1.cargoStatus = "0";
				
				
				//burada kargomuzun durumuna göre sorgulama yapýyoruz.
				
				/*
				if(cargo1.cargoStatus == "1") {
					System.out.print("Kargonuz Yolda");
				}else if(cargo1.cargoStatus == "2"){
					System.out.print("Kargonuz Geldi");
				}else {
					System.out.print("Kargo Yola Çýkmadý");
				}
				*/
				
				
				/*
				
				
				System.out.print("------------------------------Sisteme Giriþ Yapmak Ýçin Bilgilerinizi Giriniz---------------------------------------\n");

				
				//burada kullanýcýdan bilgilerini alýyoruz
				
				Scanner girdi = new Scanner(System.in);
				System.out.print("Email	  : ");
			    String KullaniciMail = girdi.next();
				System.out.print("Þifre	  : ");
				String KullaniciPassword = girdi.next();
				

				
				// burada verdiði bilgileri bizde var olan bilgilerle karþýlaþtýrýyoruz. eðer sonuç doðru olursa giriþ baþarýlý oluyor.

				if(KullaniciMail.equals(user1.email) && KullaniciPassword.equals(user1.password)) {
					System.out.print("Sisteme Baþarýyla Giriþ Yaptýnýz");
				}else {
					System.out.print("Giriþ Bilgileriniz Hatalý");
				}
				*/
				
				
				
			    System.out.print("------------------------------Kargo Bilgilerini Giriniz---------------------------------------\n");
				  
			    //burada kargoya ait bilgileri alýyoruz.
			    
				Scanner girdi = new Scanner(System.in);
				System.out.print("id	  : ");
				String cargoId = girdi.next();
				System.out.print("Cargo no : ");
				String cargoNo = girdi.next();
				System.out.print("Kargo tipi : ");
				String cargoType = girdi.next();
				System.out.print("Kargo Aðýrlýðý : ");
				String cargoWeight = girdi.next();
				
				System.out.print("------------------------------Kullanýcý Bilgilerini Giriniz---------------------------------------\n");
				
				//burada kullanýcýya ait bilgileri alýyoruz.
				System.out.print(" ");
				System.out.print("Ýsim : ");
				String FirstName = girdi.next();
				System.out.print("Soyisim : ");
				String LastName = girdi.next();
				System.out.print("Telefon Numarasý : ");
				String phoneNumber = girdi.next();
				System.out.print("Adres : ");
				String Adress = girdi.next();
				System.out.print("Email : ");
				String email = girdi.next();
				System.out.print("Müþteri Tipi : ");
				String customerType = girdi.next();
				
				
				
				double musteriKargoAgýrlýk = Double.parseDouble(cargoWeight);
				double kargoBedeli = 5;
				double indirimYuzdesiVIP = 0.10;
				double indirimYuzdesiCIP = 0.05;
				if(musteriKargoAgýrlýk < 5) {
					System.out.print("Kargonuz 5 Kilodan düþük olduðu için bisiklet ile gönderilecektir.\n");

					if(customerType.equals("VIP")) {
						 //burada kargoya verilecek olan indirim tutarýný hesaplýyoruz
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiVIP;
						 //burada hesaplanan indirim tutarýný normal tutardan çýkararak indirimli tutarý buluyoruz.
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz VIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz CIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk;
						System.out.print("Kargo Fiyatýnýz " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					System.out.print("Kargonuz Alýnmýþtýr. Kullanýcý Bilgileri : " + "Kullanýcý Adý : "+FirstName+" Kullanýcý Soyadý : "+LastName+" Telefon Numarasý : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo aðýrlýðý :"+ cargoWeight);
					
					
				}
				else if(musteriKargoAgýrlýk < 20 ) {
					System.out.print("Kargonuz 20 Kilodan düþük olduðu için motorsiklet ile gönderilecektir.\n");

					if(customerType.equals("VIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiVIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz VIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz CIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk;
						System.out.print("Kargo Fiyatýnýz " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					System.out.print("Kargonuz Alýnmýþtýr. Kullanýcý Bilgileri : " + "Kullanýcý Adý : "+FirstName+" Kullanýcý Soyadý : "+LastName+" Telefon Numarasý : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo aðýrlýðý :"+ cargoWeight);
					
					
				}
				else if(musteriKargoAgýrlýk < 50 ) {
					System.out.print("Kargonuz 50 Kilodan düþük olduðu için taksi ile gönderilecektir.\n");

					if(customerType.equals("VIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiVIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz VIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz CIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk;
						System.out.print("Kargo Fiyatýnýz " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					System.out.print("Kargonuz Alýnmýþtýr. Kullanýcý Bilgileri : " + "Kullanýcý Adý : "+FirstName+" Kullanýcý Soyadý : "+LastName+" Telefon Numarasý : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo aðýrlýðý :"+ cargoWeight);
					
					
				}
				else if(musteriKargoAgýrlýk < 100 ) {
					System.out.print("Kargonuz 100 Kilodan düþük olduðu için kamyon ile gönderilecektir.\n");

					if(customerType.equals("VIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiVIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz VIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz CIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk;
						System.out.print("Kargo Fiyatýnýz " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					System.out.print("Kargonuz Alýnmýþtýr. Kullanýcý Bilgileri : " + "Kullanýcý Adý : "+FirstName+" Kullanýcý Soyadý : "+LastName+" Telefon Numarasý : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo aðýrlýðý :"+ cargoWeight);
					
					
				}
				else if(musteriKargoAgýrlýk < 500 ) {
					System.out.print("Kargonuz 500 Kilodan düþük olduðu için TIR ile gönderilecektir.\n");

					if(customerType.equals("VIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiVIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz VIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz CIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk;
						System.out.print("Kargo Fiyatýnýz " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					System.out.print("Kargonuz Alýnmýþtýr. Kullanýcý Bilgileri : " + "Kullanýcý Adý : "+FirstName+" Kullanýcý Soyadý : "+LastName+" Telefon Numarasý : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo aðýrlýðý :"+ cargoWeight);
					
					
				}
				else if(musteriKargoAgýrlýk < 5000 ) {
					System.out.print("Kargonuz 500 Kilodan düþük olduðu için Uçak ile gönderilecektir.\n");

					if(customerType.equals("VIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiVIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz VIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz CIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk;
						System.out.print("Kargo Fiyatýnýz " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					System.out.print("Kargonuz Alýnmýþtýr. Kullanýcý Bilgileri : " + "Kullanýcý Adý : "+FirstName+" Kullanýcý Soyadý : "+LastName+" Telefon Numarasý : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo aðýrlýðý :"+ cargoWeight);
					
					
				}
				else if(musteriKargoAgýrlýk < 25000 ) {
					System.out.print("Kargonuz 25000 Kilodan düþük olduðu için Gemi ile gönderilecektir.\n");

					if(customerType.equals("VIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiVIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz VIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else if(customerType.equals("CIP")) {
						 double toplamIndirim = kargoBedeli * musteriKargoAgýrlýk * indirimYuzdesiCIP;
						 
						 double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk -toplamIndirim;
						 
						 System.out.print("Kargo Fiyatýnýz CIP Olduðunuz Için Ýndirimli Olarak " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					else {
						double sonucFiyat = kargoBedeli * musteriKargoAgýrlýk;
						System.out.print("Kargo Fiyatýnýz " + sonucFiyat + " TL Yansýtýlmýþtýr.\n");
					}
					System.out.print("Kargonuz Alýnmýþtýr. Kullanýcý Bilgileri : " + "Kullanýcý Adý : "+FirstName+" Kullanýcý Soyadý : "+LastName+" Telefon Numarasý : "+phoneNumber+" Adres :"+ Adress+" Mail Adresi : "+ email +"\n");
					System.out.print("Kargo Bilgileri : " + "cargo id : "+cargoId+" cargo no : "+cargoNo+" cargo tipi : "+cargoType+" cargo aðýrlýðý :"+ cargoWeight);
					
					
				}else {
					System.out.print("UYARI : 25000 kilodan fazla gönderim yapýlmamaktadýr.");
				}
	}

}
