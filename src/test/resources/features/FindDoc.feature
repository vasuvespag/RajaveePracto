Feature: Find Doctors
Scenario: Find Doctors
    Given I am on the Practo home page
    When I click on Find doctors
    And I select a location as <"<location>">
    And I choose Clinics as <"<clinics>">
    Then I should see a list of doctors
    
Examples:
     | location | clinics |
     | Chennai | General Physician |
     | Bangalore | Dentist |
     | Hyderabad | Ayurveda |
 
Scenario: Select Doctor
    Given I have searched for doctors
    When I enter a specific location as <"<location>">
    And I select a gender as <"<gender>">
    Then I should be able to click Book clinic visit
    
Examples:
     | location | gender |
     | Annanagar | Female |
     | Velachery | Male |
     | Adyar |
    
 
Scenario: Select Time Slot
    Given I have clicked "Book clinic visit"
    When I select a date
    And I select a time slot
    Then the time slot should be successfully selected
    
    
    
    