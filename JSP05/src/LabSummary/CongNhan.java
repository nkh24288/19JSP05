package LabSummary;

public class CongNhan extends CanBo{

	String bac;
	public CongNhan(String hoten, int namsinh, String gioitinh, String diachi, String bac) {
		super(hoten, namsinh, gioitinh, diachi);
		this.bac = bac;
		// TODO Auto-generated constructor stub
	}
	public String getBac() {
		return bac;
	}
	public void setBac(String bac) {
		this.bac = bac;
	}

	public void hienThi() {
		System.out.println("-------------------");
        System.out.println("Cong nhan");
        System.out.println("Ten cong nhan: " + hoten);
        System.out.println("Nam sinh: " + namsinh);
        System.out.println("Gioi tinh: " + gioitinh);
        System.out.println("Dia chi: " + diachi);
        System.out.println("Bac: " + bac);
        System.out.println("-------------------");
	}
}
