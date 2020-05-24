package fr.uvsq.pglp;

import java.sql.Connection;

public class DAOFactory {

	private static final Connection conn=entrepriseConnection.getInstanceConnexion();
	
	
	public static PersonnelsDAO getPersonnelsDAO(){
		return new PersonnelsDAO(conn);
	}
	
	public static CompositePersoDAO getCompositePerso(){
		return new CompositePersoDAO(conn);
	}

}
