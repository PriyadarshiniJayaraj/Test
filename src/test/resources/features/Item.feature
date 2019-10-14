Feature: Create Item

  Scenario: Create an Account
    Given Launch the Application
    When "AliExpress" Dashboard is Launched
    And Change the Currency to "USD"
    And Search for Product "Laptop" in SearchBar
    And Provide the Min Price as "10000" and Max Price as "50000"
    Then Validate that  Categories List "Laptop" and Shows Count of Product
