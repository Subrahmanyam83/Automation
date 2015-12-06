Scenario: Add existing customer as a supplier contact
Given that I logged into alfred site as Product Analyst
And I'm on supplier "Test Rafting Manly" page in Alfred
And a customer exists with email address "devin@test.com"
And I'm on supplier "Test Rafting Manly" page in Alfred
When I clicks "Add contact"
And I add customer email address "devin@test.com"
And I search the contact
And I add "Manager" as Job Tittle
And I save the customer as new contact
Then I can see "Manager" in contact list of supplier page
And I can see "devin@test.com" in contact list of supplier page

Scenario: Remove a supplier user
Given that I logged into alfred site as Product Analyst
And I'm on supplier "Test Rafting Manly" page in Alfred
And I can see "Keshawn Graeme" in contact list of supplier page
When I remove the "Keshawn Graeme" from contact list of supplier page
Then I cannot see "Keshawn Graeme" in contact list anymore






