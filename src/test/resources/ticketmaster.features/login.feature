Feature: Login
@Login
Scenario: Login to ticketmaster

     Given I go to ticketmaster
     And   I log in with valid credentials
    Then   I should able to see log in 
    
