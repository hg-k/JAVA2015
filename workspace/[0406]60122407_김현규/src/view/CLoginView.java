package view;

import java.util.Scanner;

import entity.CMember;

public class CLoginView extends CView {

	public CMember login() {
		Scanner scanner = new Scanner(System.in);
		CMember member = new CMember();
		
		
		
		System.out.print("���̵� �Է��ϼ���: ");
		String userID = scanner.next();
		member.setUserID(userID);
		System.out.println("");
		
		System.out.print("�н����带 �Է��ϼ���: ");
		String password = scanner.next();
		member.setPassword(password);
		System.out.println("");
		scanner.close();
		
		return member = (CMember) getControl().process(member);
	}

}
