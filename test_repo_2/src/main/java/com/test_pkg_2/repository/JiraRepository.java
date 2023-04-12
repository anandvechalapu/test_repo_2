package com.test_pkg_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JiraRepository extends JpaRepository<Jira, Long> {
    //Method to login
    public boolean login(String username, String password);

    //Method to configure Jira
    public void configureJira(String username, String password, String URL, String repositoryName);

    //Method to authenticate Jira credentials
    public boolean authenticate(String username, String password, String URL, String repositoryName);

    //Method to display the list of Jira Software with Title, User Name, URL, Action
    public List<Jira> listJiraSoftware();

    //Method to edit Jira Software credentials
    public void editJiraSoftware(String title, String username, String URL);

    //Method to delete Jira Software
    public void deleteJiraSoftware(String title);

    //Method to change number of entries to display in the list
    public void changeNumberOfEntries(int numberOfEntries);

    //Method to display pagination under the list
    public void pageNumber();

    //Method to add more Jira Software
    public void addMoreJiraSoftware(String username, String password, String URL, String repositoryName);

}