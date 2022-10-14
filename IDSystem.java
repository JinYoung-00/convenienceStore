package convenienceStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IDSystem implements MemberInfo{
	private int usernum=0;
	private static User user[] = new User[10];
	private String inputid;
	private String inputpw;
	private String inputname;
	boolean login=true;
	Scanner scanner =new Scanner(System.in);
	@Override
	public void register() {
		// TODO Auto-generated method stub
		for (int i=0;i<10;i++)
        { user[i] = new User(); } 
		
		while (login) {
			System.out.println("1. 새로 가입하기 | 2. 기존 계정으로 로그인");
			int selectnum = scanner.nextInt();
			if(selectnum==1) {
				System.out.println("가입할 아이디를 입력해주세요 :");
				inputid = scanner.next(); user[usernum].setId(inputid);
				System.out.println("비밀번호를 입력해주세요 :");
				inputpw = scanner.next(); user[usernum].setPw(inputpw);
				System.out.println("이름을 입력해주세요 :");
				inputname = scanner.next(); user[usernum].setname(inputname);
				System.out.println("아이디: "+inputid+" 비밀번호: "+inputpw+" 이름: "+inputname);
				System.out.println("가입되셨습니다");
				usernum++;

			}else if(selectnum==2) {
				System.out.println("아이디: ");
				inputid = scanner.next();
				System.out.println("비밀번호: ");
				inputpw = scanner.next();
				int loginSuccess = 0;
		        for (int i=0;i < user.length;i++){
		            if (inputid.equals(user[i].getId())&&inputpw.equals(user[i].getPw()))
		            {
		                System.out.println("로그인 성공");
		                System.out.println(user[i].getname()+"님 안녕하세요.");
		                loginSuccess = 1;
		                login=false;
		                break;
		            }
		        }
		        if (loginSuccess == 0)
		            System.out.println("로그인 실패");
				
				}
				
			}
		}
			
	
	
	
}