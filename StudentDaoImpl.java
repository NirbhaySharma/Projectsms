package org.deloitte.sms.studentregistration.dao.impl;

import java.util.List;

import org.deloitte.sms.studentregistration.beans.Fees_Info;
import org.deloitte.sms.studentregistration.beans.Student_Info;
import org.deloitte.sms.studentregistration.dao.StudentDao;
import org.deloitte.sms.studentregistration.utils.CalculateNetFees;
import org.deloitte.sms.studentregistration.utils.StudentID;
import org.deloitte.sms.studentregistration.utils.StudentStandardCategory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Fees_Info getFeeObj(String standard) {
		Session session = sessionFactory.openSession();
		Fees_Info fees_Info = (Fees_Info) session.get(Fees_Info.class, standard);
		return fees_Info;
	}

	@Override
	public int retrieveTotalRegistrations() {
		Session session = sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Student_Info> studentList = session.createQuery("from Student_Info").list();
		return studentList.size();
		
	}

	@Override
	public void insertStudent(Student_Info student) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		student.setStudent_ID(StudentID.generateStudentID());
		student.setStandard_Category(StudentStandardCategory.getStandardCategory(student.getStandard()));
		Fees_Info fees_Info=new StudentDaoImpl().getFeeObj(student.getStandard());
		student.setNet_Fees(CalculateNetFees.calculateNetFees(fees_Info, student));
		session.save(student);
		tx.commit();
		session.close();
	}
	
	
}
