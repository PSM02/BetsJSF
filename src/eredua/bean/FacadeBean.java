package eredua.bean;

import businessLogic.BLFacade;
import businessLogic.BLFacadeImplementation;

public class FacadeBean {
	private static FacadeBean singleton = new FacadeBean();
	private static BLFacade facadeInterface;

	private FacadeBean() {
		try {
			facadeInterface = new BLFacadeImplementation();
		} catch (Exception e) {
			System.out.println("FacadeBean: negozioaren logika sortzean errorea: " + e.getMessage());
		}
	}

	public static BLFacade getBusinessLogic() {
		return facadeInterface;
	}

	public static FacadeBean getSingleton() {
		return singleton;
	}

	public static void setSingleton(FacadeBean singleton) {
		FacadeBean.singleton = singleton;
	}
}
