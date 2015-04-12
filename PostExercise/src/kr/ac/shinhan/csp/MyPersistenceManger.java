package kr.ac.shinhan.csp;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;

public class MyPersistenceManger {


	public static PersistenceManager getManger()
	{
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		return pm;
	}
}
