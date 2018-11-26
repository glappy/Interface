package com.biz.interfaces.remocon;

public class RemoconExec {
	public static void main(String[] args) {
		TvRCom tvRCom = new TvRCom();

		tvRCom.volUp();
		tvRCom.volDown();
		tvRCom.chUp();
		tvRCom.chDown();
		tvRCom.power();

	}
}
