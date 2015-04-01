package View;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import Entity.CMember;

public class CLoginView {

	
	
	public CMember login(){
		
		Scanner scan = new Scanner(System.in);
		
		String userID, password;
		CMember member = new CMember(null, null);
		System.out.print("아이디를 입력하세요: ");
		userID = scan.next();
		member.setUserID(userID);
				
		System.out.print("비밀번호를 입력하세요: ");
		password=scan.next();
		member.setPassword(password);
		
		
		
		return member;
		
	}

//	private Vector<CMember> memberArr = new Vector<CMember>();
//		
//		
//	public  Vector<CMember> createMemberArr() {									
//
//		BufferedReader br = null;
//		
//		try {
//			br = new BufferedReader(new FileReader("input.txt"));
//		} catch (FileNotFoundException e1) {				//예외처리(데이터가 없을때)
//			
//			e1.printStackTrace();
//		}
//		
//		String str;
//
//		try {
//			while ((str = br.readLine()) != null){			// 파일에서 한줄 읽어오기
//				String tok[] = str.split(" ");				// 스페이스 문자를 구분자로 단어 추출
//				CMember member = new CMember(tok[0], tok[1]); 
//				memberArr.addElement(member);
//			}
//		} catch (IOException e) {							// 예외처리
//			e.printStackTrace();
//		}
//
//		try {
//			br.close();										// 버퍼리더 종료
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//
//		return memberArr;									//회원정보(ID,PW) 반환
//	}
}