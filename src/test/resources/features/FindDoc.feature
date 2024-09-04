Feature: Find Doctors
Scenario: Find Doctors
    Given I am on the Practo home page
    When I click on Find doctors
    And I select a location
    And I choose Clinics
    And I should see a list of doctors
    And I select a specific location
    And I select a gender
    And I select on book clinic visits
    Then I Successfully Book clinic visit

Scenario: Select Time Slot
    Given I book clinic visit
    When I select a date
    And I select a time slot
    Then the time slot should be successfully selected
        
Scenario: Unsuccessfull in Schedule demo
    Given I am on the time slot page
    When I click For Corporates
    And I click on Health & Wellness plans
    And I enter Name
    And I enter Organization name
    And I enter invalid Phone number
    And I enter invalid Official Email ID
    And I click Organization size 
    And I select 10000+
    And I click Interested in
    And I select taking a demo
    Then Scheduling a Demo is Unclickkable
 
        
Scenario Outline: Successfully scheduled a demo
    Given I click For Corporates
    When I click on Health & Wellness plans
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
 
 
 Scenario: Subscribe for Haircare tips
    Given I am on Find doctors page
    When I click on Read articles
    And I click on healthy hair
    And I Enter email address
    And I select the arrow button
    Then I successfully subscribed for health tips
    
    
   