package com.ibm.btt.testsuite;

import com.ibm.btt.common.function.mail.AutomationResultReportMail;

public class testmail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mailBody = " <font color=red>BTT �Զ������Խ������</font> <a href=\"file:///C:/BTT_IDE/8200_1013/BTTAutomation/junit/index.html\">����</a>";

		new AutomationResultReportMail().sendMailToAllTester(mailBody);

	}

}
