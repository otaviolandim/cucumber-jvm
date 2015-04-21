Feature: Google Search
  As an User
  I want to be able to perform a search.
  
@done @start	
Scenario: Search for word
 Given the user accesses the search page 
 When the user enter cheese into search field 
 And the user clicks enter
 Then the system should display a text on screen

@done @finish	
Scenario: Advanced search
 And the user click on advance search icon
 And the user click on advance search link
 And the user click on advance search button
 Then the system should display a text on screen 