package www.member;

import java.util.Map;

import www.DAOSTDInter;

public interface IMemberDAO extends DAOSTDInter{

		boolean loginCkeck(Map map);
		boolean idCheck(Map map);
}
