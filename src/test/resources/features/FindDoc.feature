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
    And I select on book clinic visits
    Then I Successfully Book clinic visit

Scenario: Select Time Slot
    Given I book clinic visit
    When I select a date
    And I select a time slot
    Then the time slot should be successfully selected
        
Scenario Outline: Unable to Schedule demo
    Given I am on the time slot page
    When I click For Corporates
    And I click on Health & Wellness plans
    And I enter Name as <"<Uname>">
    And I enter Organization name as <"<organizationname>">
    And I enter Phone number as <"<Uname>">
    And I enter Official Email ID as <"<email>">
    And I click Organization size 
    And I select 10000+
    And I click Interested in
    And I select taking a demo
    Then I am Unable to Schedule a demo
    
    Examples:
     | Uname | organizationname | Uname | email |
     | Poovarasan | Capgemini | Poovarasan | poovarasandl2002@gmail.com |
     | Rajavee | Capgemini | Rajavee | rajaveerajan@gmail.com |
     
    
    
    
Scenario Outline: Successfully scheduled a demo
    When I click For Corporates
    And I click on Health & Wellness plans
    And I enter Name as <"<Uname>">
    And I enter Organization name as <"<organizationname>">
    And I enter Phone number as <"<Phone>">
    And I enter Official Email ID as <"<email>">
    And I select Organization size 
    And I select 10000+
    And I select Interested in
    And I select taking a demo
    And I select Schedule a demo
    Then I Successfully Scheduled a demo
    
    Examples:
     | Uname | organizationname | Phone | email |
     | Poovarasan | Capgemini | 7890654321 | poovarasandl2002@gmail.com |
     | Rajavee | Capgemini | 8976543210 | rajaveerajan@gmail.com |
    