/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *  |_IDBManager
 *
 * 1. 개요 :
 * 2. 작성일  : 2017. 5. 25.
 * <pre>
 *
 * @author : SJY
 * @version : 1.0
 */
public interface IDBManager {
	
	public static final String ORACLE_DATABASE="ORACLE";
	public static final String SYBASE_DATABASE="SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	public static IDBManager getDBObject(String database){
		if(database.equals(ORACLE_DATABASE)){
			return new OracleDB();
		}
		if(database.equals(SYBASE_DATABASE)){
			return new SybaseDB();
		}
		return null;
		
	};
	
}
