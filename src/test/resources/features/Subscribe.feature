Feature: Subscribe for Hair care tips
Background: Accessing Find Doctors
Given User is on Practo home page
When User clicks on Find Doctors

@Tag5
Scenario: Subscribe for Haircare tips
    
    When User clicks on Read articles
    And User clicks on healthy hair
    And User Enters email address
    And User selects the arrow button
    Then User has successfully subscribed for health tips