package com.ibm.btt.testsuite;

import com.ibm.btt.common.function.mail.AutomationResultReportMail;

public class testmail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mailBody = " <font color=red>BTT Automation test result</font> <a href=http://9.112.248.246:9090/job/BTT_auto/ws/junit/index.html>Click here for more detailed</a>";
		new AutomationResultReportMail().sendMailToAllTester(mailBody);

	}

}
