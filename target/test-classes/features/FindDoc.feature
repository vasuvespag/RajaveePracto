Feature: Find Doctors
Scenario: Find Doctors
    Given I am on the Practo home page
    When I click on Find doctors
    And I select a location
    And I choose Clinics
    Then I should see a list of doctors

 
Scenario: Select Doctor
    Given I have searched for doctors
    When I select a specific location
    And I select a gender
    Then I should be able to click Book clinic visit

Scenario: Select Time Slot
    Given I have clicked "Book clinic visit"
    When I select a date
    And I select a time slot
    Then the time slot should be successfully selected
    
Scenario: Unable to Schedule demo
    When I click For Corporates
    And I click on Health & Wellness plans
    And I enter Name as <"<name>">
    And I enter Organization name as <"<organization name>">
    And I enter Phone number as <"<name>">
    And I enter Official Email ID as <"<email id>">
    And I select Organization size 
    And I select Interested in
    Then I am Unable to Schedule a demo
    
    Examples:
     | name | organization name | name | email Id |
     | Poovarasan | Capgemini | Poovarasan | poovarasandl2002@gmail.com |
     | Rajavee | Capgemini | Rajavee | rajaveerajan@gmail.com |
     
    
    
    
Scenario: Successfully scheduled a demo
    When I click For Corporates
    And I click on Health & Wellness plans
    And I enter Name as <"<name>">
    And I enter Organization name as <"<organization name>">
    And I enter Phone number as <"<phone number>">
    And I enter Official Email ID as <"<email id>">
    And I select Organization size 
    And I select Interested in
    And I select Schedule a demo
    Then I Successfully Scheduled a demo
    
    Examples:
     | name | organization name | phone number | email Id |
     | Poovarasan | Capgemini | 7890654321 | poovarasandl2002@gmail.com |
     | Rajavee | Capgemini | 8976543210 | rajaveerajan@gmail.com |
    
    
    
    
    
    

    
    
    
    