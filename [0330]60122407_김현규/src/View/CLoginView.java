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
		System.out.print("���̵� �Է��ϼ���: ");
		userID = scan.next();
		member.setUserID(userID);
				
		System.out.print("��й�ȣ�� �Է��ϼ���: ");
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
//		} catch (FileNotFoundException e1) {				//����ó��(�����Ͱ� ������)
//			
//			e1.printStackTrace();
//		}
//		
//		String str;
//
//		try {
//			while ((str = br.readLine()) != null){			// ���Ͽ��� ���� �о����
//				String tok[] = str.split(" ");				// �����̽� ���ڸ� �����ڷ� �ܾ� ����
//				CMember member = new CMember(tok[0], tok[1]); 
//				memberArr.addElement(member);
//			}
//		} catch (IOException e) {							// ����ó��
//			e.printStackTrace();
//		}
//
//		try {
//			br.close();										// ���۸��� ����
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//
//		return memberArr;									//ȸ������(ID,PW) ��ȯ
//	}
}