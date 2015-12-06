Scenario: Create user in RB and test in Alfred

Given that I logged into Ting site
And I click on "Clients" link
And I click the Add User Button

And I add "Test" as customer "First name"
And I add "User" as customer "Surname"
And I add "QA" as customer "Job Title"
And I add "testing.user@jim.com" as customer "Email"
And I select " HTML" as Mail format
And I add "0422334334" as customer "Phone"
And I select " Male" as Gender
And I add "22 Dec 1980" as Birthday
And I select "ADMA" as Referrer
And I add "Microsoft" as customer "Company"
And I select "Australia" as Country
And I click "Add User" button
Then I see New user created

And I select "Advertising" as Referrer
And I click "Update User" button
And I see User details updated

And I get Customer ID in RB
And I "Logout"
And I wait for "10" seconds


Given that I logged into alfred site as Customer Service Manager
When I go to earlier customer page in Alfred
Then I should see "Test" as Customer's First Name
And I should see "User" as Customer's Last Name 
And I should see "QA" as Job Title  
And I should see "testing.user@jim.com" as Email Address 
And I should see "0422334334" as Customer's Phone 
And I should see "Microsoft" as Company 
And I verify value of "Referrer" as "Advertising"




