Feature: Schedule a demo
Background: Accessing Find Doctors
Given User is on Practo home page
When User clicks on Find Doctors

@Tag3
Scenario: Unsuccessfull in Schedule demo
    When User is on the time slot page
    And User clicks For Corporates
    And User clicks on Health & Wellness plans
    And User enters Name
    And User enters Organization name
    And User enters invalid Phone number
    And User enters invalid Official Email ID
    And User clicks Organization size 
    And User selects 10000+
    And User clicks Interested in
    And User selects taking a demo
    Then Scheduling a Demo is Unclickkable
 
@Tag4       
Scenario Outline: Successfully scheduled a demo
    When User clicks For Corporates
    And User clicks on Health & Wellness plans
    And User enters Name as <"<Uname>">
    And User enters Organization name as <"<organizationname>">
    And User enters Phone number as <"<Phone>">
    And User enters Official Email ID as <"<email>">
    And User selects Organization size 
    And User selects 10000+
    And User selects Interested in
    And User selects taking a demo
    And User selects Schedule a demo
    Then User has Successfully Scheduled a demo
    
    Examples:
     | Uname | organizationname | Phone | email |
     | Poovarasan | Capgemini | 7890654321 | poovarasandl2002@gmail.com |
     | Rajavee | Capgemini | 8976543210 | rajaveerajan@gmail.com |