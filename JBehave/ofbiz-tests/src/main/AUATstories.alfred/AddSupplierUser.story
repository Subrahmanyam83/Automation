Scenario: Add a new supplier user (not exist as a customer )

Given that I logged into alfred site as Product Analyst
And I'm on supplier "Test Rafting Manly" page in Alfred
When I clicks "Add contact"
And I add customer email address "emery@test.com"
And I go to the contact next step
Then I get "Add contact" screen with email "emery@test.com" pre-filled
When I add "Emery" as First Name
And I add "Johnathon" as Last Name
And I add "0421128028" as Phone
And I add "Manager" as new Job Tittle
And I save the new contact
Then I can see "Emery Johnathon" in contact list of supplier page
And I can see "Manager" in contact list of supplier page
And I can see "0421128028" in contact list of supplier page
And I can see "emery@test.com" in contact list of supplier page
