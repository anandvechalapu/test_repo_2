package com.test_pkg_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test_pkg_2.model.Jira;
import com.test_pkg_2.repository.JiraRepository;

@Service
public class JiraService {
	
	@Autowired
	JiraRepository jiraRepository;
	
	//Method to login
    public boolean login(String username, String password) {
    	return jiraRepository.login(username, password);
    }

    //Method to configure Jira
    public void configureJira(String username, String password, String URL, String repositoryName) {
    	jiraRepository.configureJira(username, password, URL, repositoryName);
    }

    //Method to authenticate Jira credentials
    public boolean authenticate(String username, String password, String URL, String repositoryName) {
    	return jiraRepository.authenticate(username, password, URL, repositoryName);
    }

    //Method to display the list of Jira Software with Title, User Name, URL, Action
    public List<Jira> listJiraSoftware() {
    	return jiraRepository.listJiraSoftware();
    }

    //Method to edit Jira Software credentials
    public void editJiraSoftware(String title, String username, String URL) {
    	jiraRepository.editJiraSoftware(title, username, URL);
    }

    //Method to delete Jira Software
    public void deleteJiraSoftware(String title) {
    	jiraRepository.deleteJiraSoftware(title);
    }

    //Method to change number of entries to display in the list
    public void changeNumberOfEntries(int numberOfEntries) {
    	jiraRepository.changeNumberOfEntries(numberOfEntries);
    }

    //Method to display pagination under the list
    public void pageNumber() {
    	jiraRepository.pageNumber();
    }

    //Method to add more Jira Software
    public void addMoreJiraSoftware(String username, String password, String URL, String repositoryName) {
    	jiraRepository.addMoreJiraSoftware(username, password, URL, repositoryName);
    }

}