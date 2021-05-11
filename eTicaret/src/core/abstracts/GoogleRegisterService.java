package core.abstracts;

import entities.concretes.User;

public interface GoogleRegisterService {

	User register ( String eMail,String password);
}
