Feature: Google Search
  As an User
  I want to be able to perform a search.
  
@done 	
Scenario: Search for word
 Given the user accesses the search page 
 When the user enter cheese into search field 
 And the user clicks enter
 Then the system should display a text on screen

@done 	
Scenario: Advanced search
 And the user clicks on advance search icon
 And the user clicks on advance search link
 And the user clicks on advance search button
 Then the system should display a text on screen 

@wip	
Scenario: Test Tag
 Given bla
 When bla ble
 Then bla ble bli 