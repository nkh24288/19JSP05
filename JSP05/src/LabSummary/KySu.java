package LabSummary;

public class KySu extends CanBo{
	
	String nganhdaotao;
	public KySu(String hoten, int namsinh, String gioitinh, String diachi, String nganhdaotao) {
		super(hoten, namsinh, gioitinh, diachi);
		this.nganhdaotao = nganhdaotao;
		// TODO Auto-generated constructor stub
	}
	public String getNganhdaotao() {
		return nganhdaotao;
	}
	public void setNganhdaotao(String nganhdaotao) {
		this.nganhdaotao = nganhdaotao;
	}

	public void hienThi() {
		System.out.println("-------------------");
        System.out.println("Ky su");
        System.out.println("Ten ky su: " + hoten);
        System.out.println("Nam sinh: " + namsinh);
        System.out.println("Gioi tinh: " + gioitinh);
        System.out.println("Dia chi: " + diachi);
        System.out.println("Nganh dao tao: " + nganhdaotao);
        System.out.println("-------------------");
	}
	
}
