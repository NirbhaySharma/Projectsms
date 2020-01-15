package org.deloitte.sms.studentregistration.utils;

import org.deloitte.sms.studentregistration.beans.Fees_Info;
import org.deloitte.sms.studentregistration.beans.Student_Info;

public class CalculateNetFees {
	public static double calculateNetFees(Fees_Info fees_Info,Student_Info student){
		if(student.getTransport()=='N')
			return (fees_Info.getStdFees());
		else return(fees_Info.getStdFees()+fees_Info.getTransport_Fee());
	}
	
}
