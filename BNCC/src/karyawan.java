
public class karyawan {
	String kode; 
	String nama= "";
	String jenis;
	String jabatan;
	int gaji;
	public karyawan(String kode,String nama,String jenis, String jabatan, int gaji) {
		this.kode = kode;
		this.nama = nama;
		this.jenis = jenis;
		this.jabatan = jabatan;
		this.gaji =gaji;
		
	}
	public String getKode() {
		return kode;
	}
	public void setKode(String kode) {
		this.kode = kode;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getJenis() {
		return jenis;
	}
	public void setJenis(String jenis) {
		this.jenis = jenis;
	}
	public String getJabatan() {
		return jabatan;
	}
	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	public int getGaji() {
		return gaji;
	}
	public void setGaji(int gaji) {
		this.gaji = gaji;
	}

}
