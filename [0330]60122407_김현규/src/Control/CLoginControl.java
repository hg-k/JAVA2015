package Control;

import Entity.CMember;

public class CLoginControl {

	private CMember member;

	public CMember login(CMember member) {
		
		this.member = member;
		return this.member;
	}

}