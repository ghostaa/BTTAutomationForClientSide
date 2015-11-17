package com.ibm.btt.testsuite;

import com.ibm.btt.common.function.mail.AutomationResultReportMail;

public class Sendmail {
	
	/**
	 * ant中发邮件用这个
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mailBody = " <font color=red>BTT Automation test result</font> <a href=http://9.115.33.83:8085/job/BTT_Automation/ws/junit/index.html>Click here for more detailed</a>";
		new AutomationResultReportMail().sendMailToAllTester(mailBody);

	}

}
