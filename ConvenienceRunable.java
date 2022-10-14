package convenienceStore;

import java.util.Scanner;

public class ConvenienceRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDSystem MI = new IDSystem();
		InventoryControl IC = new InventoryControl();
		Scanner scanner = new Scanner(System.in);
		double time1=0.0;
		boolean run= true;
		MI.register();
		while(run) {
			if(MI.login==false) {
				time1=System.currentTimeMillis();
				System.out.println("--------------------------------------------------------");
				System.out.println("1.판매 | 2.상품 입력 |3.총 물품|4.물품찾기|5.판매|6.종료");
				System.out.println("--------------------------------------------------------");
				System.out.println(">>");
				int selectnum=scanner.nextInt();
				switch(selectnum) {
				case 1:
					break;
				case 2:
					IC.inventoryInput();
					break;
				case 3:
					IC.wholething();
					break;
				case 4:
					IC.searching();
					break;
				case 5:
					IC.sell();
					break;
				case 6:
					run=false;
					break;
				}
			}
		}
		double time2=System.currentTimeMillis();
		double time3=Math.floor((time2-time1)*0.01);
		System.out.println("근무시간: "+time3);
	}
	

}
