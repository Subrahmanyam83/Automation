Scenario: Editing existing supplier contact
Given that I logged into alfred site as Product Analyst
And I'm on supplier "Test Rafting Manly" page in Alfred
And I can see "Ainsley Lachlan" in contact list of supplier page
When I edit "Ainsley Lachlan" in contact list of supplier page
And I change the current Job Tittle to "CEO"
And I save the existing contact
Then can see contact "Ainsley Lachlan" changed with job tittle "CEO"