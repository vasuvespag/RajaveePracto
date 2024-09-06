Feature: Find Doctors
Background: Accessing Find Doctors
Given User is on Practo home page
When User clicks on Find Doctors

@Tag1
Scenario: Book dentist clinic visit
    
    When User selects a location
    And User chooses Clinics as <"Dentist">
    And User selects a specific location
    And User select a gender
    And User Selects Male
    And User selects on book clinic visits
    And User selects a date
    And User selects a time slot
    And User enters phone number
    Then the time slot should be successfully selected
#@Tag2  
#Scenario: Contact us
    #When User clicks on Security & Help
    #And User clicks on Data Security
    #And User clicks on For Providers
    #And User clicks on Learn more
    #And User clicks on Contact Us
    #And User enters valid Name
    #And User enters valid mobile number
    #And User enters valid email
    #And User selects a country
    #And User enters city
    #And User selects Interested In
    #And User selects I am a
    #And User enters a message
    #And User clicks submit
    #Then User has successfully reached out to practo
        #
#
 #
   