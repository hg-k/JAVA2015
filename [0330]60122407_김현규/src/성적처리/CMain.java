package 성적처리;

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
			
			
//			CLoginView loginView = new CLoginView();						//회원 ID,password 읽어들이기
//			CMember member = loginView.login();
//			Vector<CMember> serveArr = loginView.createMemberArr();
//					
//			CLoginControl loginControl= new CLoginControl();				//로그인한 정보를 control
//			String tok1 = null,tok2 = null;
//			CMember member = new CMember(tok1, tok2);
//			member = loginControl.login(member);
//			
			
			//DAO memberDAO = new DAO();						
			//memberDAO.makeFile(serveArr);															
			
			// 과목개설 
			CGwamokView gwamokView = new CGwamokView();
			CGwamok gwamok = gwamokView.getGwamok();
			CGwamokControl gwamokControl = new CGwamokControl();
			gwamok = gwamokControl.processGwamok(gwamok);
			DAO gwamokDAO= new DAO();
			gwamokDAO.write(gwamok,"gwamok");
			gwamok = (CGwamok) gwamokDAO.read("gwamok"); 					//부모클래스를 자식클래스의 object로 강제로 변경시킴
			System.out.println("과목: "+gwamok.getName());
			System.out.println("번호: "+gwamok.getID());
			
			//강좌개설
			CGangjwaView gangjwaView = new CGangjwaView();
			CGangjwa gangjwa = gangjwaView.getGangjwa();
			CGangjwaControl gangjwaControl = new CGangjwaControl();
			gangjwa = gangjwaControl.processGangjwa(gangjwa);
			DAO gangjwaDAO= new DAO();
			gangjwaDAO.write(gangjwa,"gangjwa");
			gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
			System.out.println("강좌: "+gangjwa.getName());
			System.out.println("번호: "+gangjwa.getID());
			
			
			//수강신청
			CSugang sugang = new CSugang();
			CSugangControl sugangControl = new CSugangControl();
			sugang = sugangControl.processSugang(sugang);
			sugangControl.result(sugang);			
		}
}


	