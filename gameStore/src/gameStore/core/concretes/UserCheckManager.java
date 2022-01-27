package gameStore.core.concretes;

import java.rmi.RemoteException;

import gameStore.core.abstracts.UserCheckService;
import gameStore.entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(User user) {
		KPSPublicSoapProxy kpsPublicSoapProxy=new KPSPublicSoapProxy();
		try {
			return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getName().toUpperCase(),user.getLastName().toUpperCase(),user.getBirthYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

}
