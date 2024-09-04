Feature: Find Doctors
Scenario: Find Doctors
    Given I am on the Practo home page
    When I click on Find doctors
    And I select a location as <"<Chennai>">
    And I choose Clinics as <"<General Physician>">
    And I should see a list of doctors
    And I select a specific location
    And I select a gender
    And I select on book clinic visits
    Then I Successfully Book clinic visit

Scenario: Select Time Slot
    Given I book clinic visit
    When I select a date
    And I select a time slot
    And I enter phone number
    Then the time slot should be successfully selected
        

 
   