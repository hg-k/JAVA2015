package ����ó��;

import Control.CGangjwaControl;
import Control.CGwamokControl;
import Control.CSugangControl;
import DAO.DAO;
import Entity.CGangjwa;
import Entity.CGwamok;
import Entity.CMember;
import Entity.CSugang;
import View.CGangjwaView;
import View.CGwamokView;
import View.CLoginView;

//import java.util.Scanner;


public class CMain {

		public static void main(String[] args) {
			
			
//			CLoginView loginView = new CLoginView();						//ȸ�� ID,password �о���̱�
//			CMember member = loginView.login();
//			Vector<CMember> serveArr = loginView.createMemberArr();
//					
//			CLoginControl loginControl= new CLoginControl();				//�α����� ������ control
//			String tok1 = null,tok2 = null;
//			CMember member = new CMember(tok1, tok2);
//			member = loginControl.login(member);
//			
			
			//DAO memberDAO = new DAO();						
			//memberDAO.makeFile(serveArr);															
			
			// ���񰳼� 
			CGwamokView gwamokView = new CGwamokView();
			CGwamok gwamok = gwamokView.getGwamok();
			CGwamokControl gwamokControl = new CGwamokControl();
			gwamok = gwamokControl.processGwamok(gwamok);
			DAO gwamokDAO= new DAO();
			gwamokDAO.write(gwamok,"gwamok");
			gwamok = (CGwamok) gwamokDAO.read("gwamok"); 					//�θ�Ŭ������ �ڽ�Ŭ������ object�� ������ �����Ŵ
			System.out.println("����: "+gwamok.getName());
			System.out.println("��ȣ: "+gwamok.getID());
			
			//���°���
			CGangjwaView gangjwaView = new CGangjwaView();
			CGangjwa gangjwa = gangjwaView.getGangjwa();
			CGangjwaControl gangjwaControl = new CGangjwaControl();
			gangjwa = gangjwaControl.processGangjwa(gangjwa);
			DAO gangjwaDAO= new DAO();
			gangjwaDAO.write(gangjwa,"gangjwa");
			gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
			System.out.println("����: "+gangjwa.getName());
			System.out.println("��ȣ: "+gangjwa.getID());
			
			
			//������û
			CSugang sugang = new CSugang();
			CSugangControl sugangControl = new CSugangControl();
			sugang = sugangControl.processSugang(sugang);
			sugangControl.result(sugang);			
		}
}


	