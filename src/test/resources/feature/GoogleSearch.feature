Feature: Google Search
  I want to perform a quick search.
	
  @done	
  Scenario: Search for word
    Given I access the google page
    When I search for word
    And I click enter
    Then I should see a text on screen
