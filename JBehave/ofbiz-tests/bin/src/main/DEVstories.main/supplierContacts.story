

Scenario: Add existing customer as a supplier contact
Given that I logged into ofbiz site
And a customer exists with email address "vincent@test.com"
And I'm on supplier "Test Rafting Manly" page in Alfred
When I clicks "Add contact"
And I type in customer email address "vincent@@test.com"
And I search the contact
And I add "Manager" as "Job Tittle"
And I save to add contact
Then I can see "Manager" in contact list of supplier page
And I can see "vincent@test.com" in contact list of supplier page