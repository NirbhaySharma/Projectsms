package org.deloitte.sms.studentregistration.utils;

import org.deloitte.sms.studentregistration.beans.Student_Info;

public class RegistrationBO {

	private RegistrationBO() {
		
	}
	
	public static boolean registerStudent(Student_Info student) {
		char tempValue='A';
		String tempName=student.getStudent_Name();
		int tempLength=tempName.length();
		boolean tempBoolean;
		try {
			for(int i=0;i<tempLength;i++) {
				tempValue=tempName.charAt(i);
				if(!((tempValue>64&&tempValue<91)||(tempValue>96&&tempValue<123)||tempValue==32))
					throw new BusinessException("Error code 501");
			}
		tempValue='A';
		tempName=student.getMail_Id();
		tempLength=tempName.length();
		for(int i=0;i<tempLength;i++) {
			tempValue=tempName.charAt(i);
			if(tempValue==64)
				for(i=++i;i<tempLength;i++) {
					if(tempValue==46);
					else
						throw new BusinessException("Error code 502");
				}
			
		}
			
		} catch (BusinessException e) {
			
		}
		
		return true;
	}
	
	
	
}
