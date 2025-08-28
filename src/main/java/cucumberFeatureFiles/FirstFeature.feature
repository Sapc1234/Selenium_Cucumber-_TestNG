Feature: Application Login

  
  
  Background:
  Given setup the entries in  database
  When  launch the browser from config variables
  And Hit the home page url og banking site

  @RegressionTest
  Scenario: Admin Page Default Login
  Given the user is on the NetBanking landing page
  When the user logs in with a username "admin" and password "1234"
  Then the home page is displayed
  And the cards are displayed
  
  #ResUsable

  @SmokeTest
  Scenario: User Page Default Login
  Given the user is on the NetBanking landing page
  When the user logs in with a username "user" and password "2568"
  Then the home page is displayed
  And the cards are displayed
    
  @SmokeTest @RegressionTest
  Scenario Outline: User Page Default Login
  Given the user is on the NetBanking landing page
  When the user logs in with a username <User_Name> and password <Password> combination
  Then the home page is displayed
  And the cards are displayed
  
  Examples:
  | User_Name  |  Password  |
  | debitUser  | Hello@1234 |
  | creditUser | Hello@1235 |
  
  @RegressionTest
  Scenario: User Page Default sign up
  Given the user is on the practice landing page
  When the user sign up into application
  |rahul|
  |Handrale|
  |contact@gmail.com|
  |12457893|
  Then the home page is displayed
  And the cards are displayed
  
  