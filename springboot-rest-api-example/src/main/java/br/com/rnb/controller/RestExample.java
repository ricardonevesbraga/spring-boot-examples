package br.com.rnb.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rnb.model.User;

@RestController("/rest")
public class RestExample {

	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello I'm the REST API EXAMPLE!";
    }
    @RequestMapping(value = "/nome/{name}", method = RequestMethod.GET)
    public String index(@PathVariable String name) {
        return "Hello "+name+". I'm the REST API EXAMPLE!" + name;
    }
   
    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
    public User index(@RequestBody User user) {
        return user;
    }
    @RequestMapping(value = "/usuario", method = RequestMethod.PUT)
    public User indexPut(@RequestBody User user) {
        return user;
    }
    @RequestMapping(value = "/usuario", method = RequestMethod.DELETE)
    public User indexDelete(@RequestBody User user) {
        return user;
    }
	
}
