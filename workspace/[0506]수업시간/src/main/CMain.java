package main;

import view.CView;

public class CMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CView mainView = new CView("메인");
		CView haksaengView = new CView("학생메뉴");
		CView gyosuView = new CView("교수메뉴");
		CView sugangsincheongView = new CView("수강신청");
		CView sugangneayeokView = new CView("수강내역조회");
		CView seongjeokView = new CView("성적조회");
		
		
		mainView.add(haksaengView);
		mainView.add(gyosuView);
		haksaengView.add(sugangsincheongView);
		haksaengView.add(sugangneayeokView);
		haksaengView.add(seongjeokView);
		mainView.show();
	}
}
