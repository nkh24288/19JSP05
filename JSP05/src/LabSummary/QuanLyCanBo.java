package LabSummary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {

	List<CanBo> canbo = new ArrayList<CanBo>();
	
	public void nhap() {
		int lcn;
		Scanner s = new Scanner(System.in);
		System.out.println("--- --- --- --- ---");
		System.out.println("Lua chon nhap thong tin");
		System.out.println("1.Can bo");
		System.out.println("2.Nhan vien");
		System.out.println("3.Cong nhan");
		System.out.println("4.Ky su");
		System.out.println("--- --- --- --- ---");
		
		lcn = s.nextInt();
		switch(lcn) {
		case 1: 
			Scanner n = new Scanner(System.in);
			System.out.println("Nhap vao thong tin Can bo");
			System.out.println("Ho va ten: ");
			String ht = n.nextLine();
			System.out.println("Nam sinh: ");
			int ns = n.nextInt();
			System.out.println("Gioi tinh: ");
			String gt = n.nextLine();
			System.out.println("Dia chi: ");
			String dc = n.nextLine();
			CanBo canbo1 = new CanBo(ht, ns, gt, dc);
			canbo.add(canbo1);
			
		case 2:
			Scanner m = new Scanner(System.in);
			System.out.println("Nhap vao thong tin Nhan vien");
			System.out.println("Ho va ten: ");
			String ht = n.nextLine();
			System.out.println("Nam sinh: ");
			int ns = n.nextInt();
			System.out.println("Gioi tinh: ");
			String gt = n.nextLine();
			System.out.println("Dia chi: ");
			String dc = n.nextLine();
			System.out.println("Cong viec: ");
			String cv = n.nextLine();
			CanBo canbo1 = new CanBo(ht, ns, gt, dc);
			canbo.add(canbo1);
		}
		/*switch(lcn) {
		case 1:
			for(CanBo ds: canbo) {
				ds.hienThi();
			}
		case 2:
			for(CanBo ds: canbo) {
				if(ds instanceof NhanVien)
					ds.hienThi();
			}
		case 3:
			for(CanBo ds: canbo) {
				if(ds instanceof CongNhan)
					ds.hienThi();
			}
		case 4:
			for(CanBo ds: canbo) {
				if(ds instanceof KySu)
					ds.hienThi();
			}
		}*/
	}
}
