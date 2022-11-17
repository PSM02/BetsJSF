package eredua.bean;

import java.util.Date;

import businessLogic.BLFacade;
import businessLogic.BLFacadeImplementation;
import dataAccess.DataAccess;
import domain.Event;
import domain.extendedIterator;

public class Bean {
	
	BLFacade facadeBL=FacadeBean.getBusinessLogic();
	
	extendedIterator<Event> gertaerak=facadeBL.getEvents(new Date());

}
