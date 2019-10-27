package LabSummary;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
				
		/*CanBo canbo1 = new CanBo("Nguyen Van A", 1985,"Nam","Da Nang");
		CanBo canbo2 = new CanBo("Nguyen Thi B", 1988, "Nu", "Quang Nam");
		CanBo canbo3 = new CanBo("Tran Nhat Nam", 1979, "Nam", "Da Nang");
		
		List<CanBo> canbo = new ArrayList<CanBo>();
		canbo.add(canbo1);
		canbo.add(canbo2);
		canbo.add(canbo3);
		
		//in danh sach canbo
		int i=0;
		for (CanBo item:canbo) {
			print(item, i+1);
			i++;
		}*/
		
		nhap();
	}
	
	public static void print(CanBo canbo, int id) {
		System.out.println("CanBo"+id+": " +canbo.getHoten()+" "+canbo.getNamsinh()+ " " +canbo.getGioitinh()+ " " +canbo.getDiachi());
	}
	
	public static void nhap() {
		System.out.println("--- Nhap thong tin Can bo ---");
		System.out.println("Ho va ten: ");
		//them phan bat loi nhap vao
		Scanner sc = new Scanner(System.in);
		String ht = sc.nextLine();
		System.out.println("Nam sinh: ");
		int ns = sc.nextInt();
		System.out.println("Gioi tinh: ");
		String gt = sc.nextLine();
		System.out.println("Que quan: ");
		String qq = sc.nextLine();
		
		//luu thong tin nhap tu ban phim vao ArrayList
		List<CanBo> canbo = new ArrayList<CanBo>();
		CanBo canbo1 = new CanBo(ht,ns,gt,qq);
		canbo.add(canbo1);
	}
}
