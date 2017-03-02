package com.layila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.layila.dao.PersonDao;
import com.layila.model.Person;


@Scope("request")
@Controller
public class BaseController {
   
	@Autowired
	private PersonDao personDao;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
    public @ResponseBody List<Person> home() {
        List<Person> listPersons = personDao.getAllPersons();
        /*ModelAndView model = new ModelAndView("home");
        model.addObject("personsList", listPersons);*/
        return listPersons;
    }

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
}
