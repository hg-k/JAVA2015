package main;

import view.CView;

public class CMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CView mainView = new CView("����");
		CView haksaengView = new CView("�л��޴�");
		CView gyosuView = new CView("�����޴�");
		CView sugangsincheongView = new CView("������û");
		CView sugangneayeokView = new CView("����������ȸ");
		CView seongjeokView = new CView("������ȸ");
		
		
		mainView.add(haksaengView);
		mainView.add(gyosuView);
		haksaengView.add(sugangsincheongView);
		haksaengView.add(sugangneayeokView);
		haksaengView.add(seongjeokView);
		mainView.show();
	}
}
