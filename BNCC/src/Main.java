import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	Vector<karyawan> karya = new Vector<karyawan>();
	Scanner scan = new Scanner (System.in);
	
	
	
	public Main() {
		
		int menu = 0 ;
		do {
		System.out.println("PT. Mentol");
		System.out.println("======================");
        System.out.println("1. INSERT DATA KARYAWAN");
        System.out.println("2. VIEW DATA KARYAWAN");
        System.out.println("3. UPDATE DATa KARYAWAN");
        System.out.println("4. DELETE DATA KARYAWAN");
        System.out.println("5. Exit ");
        try {
        	menu = scan.nextInt();
		} catch (Exception e) {
			System.out.println("INTEGER ONLY!!!!");
		}
         scan.nextLine();
        switch(menu) {
        case 1 :String kode = "";
        		String alpha = "" ;
        		String beta = "" ;
        		String nama= "";
        		String jenis;
        		String jabatan = "";
        		int gaji = 0;
        		Random rand = new Random();
    			// generate
        		String chars = "abcxyz";
        		Random rnd = new Random();
        		for(int i = 0; i < 2; i++) {
        		char c = chars.charAt(rnd.nextInt(chars.length()));
        		alpha = alpha + c;
        		}
    			for(int i = 0; i < 3; i++) {
    				// 0 - 9
    				int x = rand.nextInt(9);
    				
    				// append studentId with random numbers
    				beta = beta + x;
    				
    			}
    			kode = alpha + "-" + beta;
        	do {
				System.out.println("Input nama karyawan");
				nama = scan.nextLine();
			} while (nama.length() <= 3);
        	
        	do {
        		System.out.println("Input jenis kelamin karyawan(Laki-laki/Perempuan)");
        		jenis = scan.nextLine();
        	}while(!jenis.equals("Laki-laki") && !jenis.equals("Perempuan"));
        	
        	do {
        		System.out.println("Input Jabatan (Manager / Supervisor / Admin)");
        		jabatan = scan.nextLine();
        	}while(!jabatan.equals("Manager") && !jabatan.equals("Supervisor") && !jabatan.equals("Admin"));
        	if(jabatan.equals("Manager")){
        	 gaji = 8000000;}
        	else if(jabatan.equals("Supervisor")) {
        		gaji = 6000000;
        	}else if(jabatan.equals("Admin")) {
        		gaji = 4000000;
        	}
       
        	karyawan ash = new karyawan(kode, nama, jenis, jabatan, gaji);
        	karya.add(ash);
        
        break;
			
        case 2:{ 	
        	if (karya.isEmpty()) {
        		System.out.println("data karyawan kosong");
        		System.out.println("");
        		System.out.println("press Enter >>>");
        		scan.nextLine();
    			
        	}else { 
        		display();
        		System.out.println("press Enter to countinue");
        		scan.nextLine();
        		
        	}	
        }
         break;
        case 3:{
        	if(karya.isEmpty()) {
        		System.out.println("Data karyawan kosong");
        		System.out.println("");
        		System.out.println("Press Enter >>>");
        		scan.nextLine();
        	}else {
        	
        	
        	int upd = -1;
        	display();
        
		do { 
			System.out.print("Input index to be updated[1 - " + karya.size() + "]: ");
			try {
				upd = scan.nextInt();
			} catch (Exception e) {
				System.out.println("please input index integer");
			}
			scan.nextLine();
		} while (upd < 1 || upd > karya.size());
		
		
		// generate
		
		int gaji1 = 0;
		String alpha1 = "";
		String Beta1 ="";
		Random rand1 = new Random();
		// generate
		String chars1 = "abcxyz";
		Random rnd1 = new Random();
		for(int i = 0; i < 2; i++) {
		char c = chars1.charAt(rnd1.nextInt(chars1.length()));
		alpha1 = alpha1 + c;
		}
		for(int i = 0; i < 3; i++) {
			// 0 - 9
			int x = rand1.nextInt(9);
			
			// append studentId with random numbers
			Beta1 = Beta1 + x;
			
		}
		kode = alpha1 + "-" + Beta1;
		
	do {
		System.out.println("Input nama karyawan");
		nama = scan.nextLine();
	} while (nama.length() <= 3);
	
	do {
		System.out.println("Input jenis kelamin karyawan(Laki-laki/Perempuan)");
		jenis = scan.nextLine();
	}while(!jenis.equals("Laki-laki") && !jenis.equals("Perempuan"));
	
	do {
		System.out.println("Input Jabatan (Manager / Supervisor / Admin)");
		jabatan = scan.nextLine();
	}while(!jabatan.equals("Manager") && !jabatan.equals("Supervisor") && !jabatan.equals("Admin"));
	if(jabatan.equals("Manager")){
   	 gaji1 = 8000000;}
   	else if(jabatan.equals("Supervisor")) {
   		gaji1 = 6000000;
   	}else if(jabatan.equals("Admin")) {
   		gaji1 = 4000000;
   	}
	
	 ash = karya.get(upd - 1);
	 ash.setKode(kode);
	 ash.setNama(nama);
	 ash.setJenis(jenis);
	 ash.setJabatan(jabatan);
	 ash.setGaji(gaji1);
	 } }
        
        break;
        case 4:
        	
			if(karya.isEmpty()) {
    		System.out.println("Data karyawan kosong");
    		System.out.println("");
    		System.out.println("Press Enter >>>");
    		scan.nextLine();
    	}else {
    		int del = -1;
    		display();
    		do { 
    			System.out.print("Input index to be Deleted[1 - " + karya.size() + "]: ");
    			try {
    				del = scan.nextInt();
    			} catch (Exception e) {
    				System.out.println("please input index integer");
    			}
    			scan.nextLine();
    		} while (del < 1 || del > karya.size());
    		karya.remove(del - 1);
    	}
        	break;
        }
        }while(menu !=5);
	
        
	}

	public static void main(String[] args) {
	new Main();
	
	}
	public void display() {
		System.out.println("|----|-----------------|------------------------------|---------------|---------------|-------------|");
		System.out.println("|No  |kode karyawan    |Nama Karyawan                 |Jenis Kelamin  |Jabatan        |Gaji Karyawan|");
		System.out.println("|----|-----------------|------------------------------|---------------|---------------|-------------|");
	
		for(karyawan s: karya) {
		System.out.printf("|    |%17s|%30s|%15s|%15s|%13d|\n",s.kode,s.nama,s.jenis,s.jabatan,s.gaji);
		}System.out.println("|----|-----------------|------------------------------|---------------|---------------|-------------|");
		System.out.println("");
	}
	


}
