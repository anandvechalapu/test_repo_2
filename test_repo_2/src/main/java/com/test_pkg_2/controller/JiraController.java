package com.test_pkg_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test_pkg_2.model.Jira;
import com.test_pkg_2.service.JiraService;

@RestController
@RequestMapping("/jira")
public class JiraController {
	
	@Autowired
	JiraService jiraService;
	
	//Login API
	@PostMapping("/login")
    public boolean login(@RequestParam("username") String username, @RequestParam("password") String password) {
        return jiraService.login(username, password);
    }
	
	//Configure Jira API
	@PostMapping("/configure")
    public void configureJira(@RequestParam("username") String username, @RequestParam("password") String password, 
    		@RequestParam("url") String URL, @RequestParam("repositoryName") String repositoryName) {
		jiraService.configureJira(username, password, URL, repositoryName);
    }
	
	//Authenticate Jira credentials API
	@PostMapping("/authenticate")
    public boolean authenticate(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("url") String URL, 
    		@RequestParam("repositoryName") String repositoryName) {
		return jiraService.authenticate(username, password, URL, repositoryName);
    }
	
	//Display the list of Jira Software API
	@GetMapping("/list")
    public List<Jira> listJiraSoftware() {
        return jiraService.listJiraSoftware();
    }
	
	//Edit Jira Software API
	@PostMapping("/edit")
    public void editJiraSoftware(@RequestParam("title") String title, @RequestParam("username") String username, @RequestParam("url") String URL) {
		jiraService.editJiraSoftware(title, username, URL);
    }
	
	//Delete Jira Software API
	@PostMapping("/delete")
    public void deleteJiraSoftware(@RequestParam("title") String title) {
		jiraService.deleteJiraSoftware(title);
    }
	
	//Change number of entries API
	@PostMapping("/changeNumberOfEntries")
    public void changeNumberOfEntries(@RequestParam("numberOfEntries") int numberOfEntries){
		jiraService.changeNumberOfEntries(numberOfEntries);
    }
	
	//Display pagination API
	@GetMapping("/pageNumber")
    public void pageNumber() {
		jiraService.pageNumber();
    }
	
	//Add more Jira Software API
	@PostMapping("/addMoreJiraSoftware")
    public void addMoreJiraSoftware(@RequestParam("username") String username, @RequestParam("password") String password, 
    		@RequestParam("url") String URL, @RequestParam("repositoryName") String repositoryName) {
		jiraService.addMoreJiraSoftware(username, password, URL, repositoryName);
    }

}