package convenienceStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class InventoryControl implements Inventory{
	Scanner in = new Scanner(System.in);
	List<Stuff> IC = new ArrayList<>();
	@Override
	public void inventoryInput() {
		// TODO Auto-generated method stub
		System.out.println("추가할 품목의 이름을 입력해주세요 :");
		String name=in.next();
		System.out.println("바코드를 입력해주세요 :");
		String barcode=in.next();
		System.out.println("수량을 입력해주세요(숫자만) :");
		int quantity=in.nextInt();
		System.out.println("가격을 입력해주세요 :");
		int price=in.nextInt();
		System.out.println("생산지를 입력해주세요 :");
		String region=in.next();
		System.out.println("폐기날짜를 입력해주세요(0000-00-00) :");
		String disposalDate=in.next();
		System.out.println("성인용 여부를 입력해주세요(o x) :");
		String ox = in.next();
		boolean adult = false;
		if(ox.equals("o")) {
			adult=true;
		}else if(ox.equals("x")) {
			adult=false;
		}
		IC.add(new Stuff(name, barcode, quantity, price, region, disposalDate, adult));
		currentInven();
		
		
	}
	public void currentInven() {
		IC.add(new Stuff("하리보젤리","haribo",7,1000,"독일","2023-08-10",false));
		IC.add(new Stuff("불닭볶음면","buldak",10,1600,"한국","2022-12-10",false));
		IC.add(new Stuff("참이슬","soju",5,2500,"한국","2022-09-01",true));
		IC.add(new Stuff("새우깡","shrimpkkang",15,1200,"한국","2022-12-10",false));
		IC.add(new Stuff("호로요이","horoyoi",4,1500,"일본","2022-09-10",true));
		IC.add(new Stuff("삼각김밥","samgakkimbab",8,1200,"한국","2022-08-03",false));
		IC.add(new Stuff("초코에몽","chocoemong",6,1000,"한국","2022-08-11",false));
		IC.add(new Stuff("포켓몬빵","pokemonpang",1,1500,"한국","2023-09-10",false));
		IC.add(new Stuff("우산","umbrella",3,5000,"중국",null,false));
		IC.add(new Stuff("이어폰","earphone",4,12000,"중국",null,false));
		IC.add(new Stuff("비타500","vita500",8,700,"한국","2023-02-10",false));
		IC.add(new Stuff("오로나민C","oronaminc",7,1200,"일본","2022-08-16",false));
		IC.add(new Stuff("초코쿠키","chococookie",5,900,"한국","2022-09-09",false));
		IC.add(new Stuff("블루베리쿠키","bbcookie",5,900,"한국","2022-08-09",false));
		IC.add(new Stuff("츄파츕스","chupa",20,200,"미국","2023-09-09",false));
		IC.add(new Stuff("종이컵","papercup",4,3000,"중국",null,false));
		IC.add(new Stuff("담배","dambae",20,5000,"중국",null,false));
		IC.add(new Stuff("초코파이","chocopie",10,4000,"한국","2022-11-09",false));
		IC.add(new Stuff("콜라","cola",15,1200,"미국","2022-12-31",false));
		IC.add(new Stuff("볼펜","pen",8,700,"중국",null,false));
		
		
	}
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("바코드를 입력해주세요: ");
		String search=in.next();
		while(true) {
			if(search.equals(IC)) {
				System.out.println(IC);
				break;
			}else {
				System.out.println("원하시는 상품을 찾을 수 없습니다");
				break;
			}
		}
		
	}
	@Override
	public void wholething() {
		// TODO Auto-generated method stub
		currentInven();
		int sum=0;
		System.out.println("제품명 / 바코드 / 수량 / 가격 / 원산지 / 폐기날짜 / 성인용 유무");
		for(int i=0;i<IC.size();i++) {
			System.out.print(IC.get(i).name+",");
			System.out.print(IC.get(i).barcode+",");
			System.out.print(IC.get(i).quantity+",");
			System.out.print(IC.get(i).price+",");
			System.out.print(IC.get(i).region+",");
			System.out.print(IC.get(i).disposalDate+",");
			System.out.print(IC.get(i).adult+",");
			System.out.print("\n");
		}
	}
	@Override
	public void searching() {
		// TODO Auto-generated method stub
		currentInven();
		String search=in.next();
		System.out.println("찾을 물건의 바코드를 입력해주세요: ");
		long count = IC.stream().filter(str -> search.equals(str)).count();        
		System.out.println("Count : " + count);        
		if (count > 0) {System.out.println(".");}
		
	}

}