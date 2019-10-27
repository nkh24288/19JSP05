package LabSummary;

public class NhanVien extends CanBo {
	String congviec;
	public NhanVien(String hoten, int namsinh, String gioitinh, String diachi, String congviec) {
		super(hoten, namsinh, gioitinh, diachi);
		this.congviec = congviec;
		// TODO Auto-generated constructor stub
	}
	public String getCongviec() {
		return congviec;
	}
	public void setCongviec(String congviec) {
		this.congviec = congviec;
	}
	
	public void hienThi() {
		System.out.println("-------------------");
        System.out.println("Nhan vien");
        System.out.println("Ten nhan vien: " + hoten);
        System.out.println("Nam sinh: " + namsinh);
        System.out.println("Gioi tinh: " + gioitinh);
        System.out.println("Dia chi: " + diachi);
        System.out.println("Cong viec " + congviec);
        System.out.println("-------------------");
	}
}
