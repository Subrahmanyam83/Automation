Scenario: Create user in RB and test in Alfred

Given that I logged into Ting site
And I click on "Clients" link
And I click the Add User Button
And I add "USER" as Customer First Name
And I add "TING" as Customer Surname
And I add "ting@auat.com" as Customer Email
And I add "8536487" as Customer Phone
And I add "TING" as Customer Company
And I add "13/05/1928" as Birthday
And I select Australia as Country
And I click Add User
And I see New user created
And I wait for "10" seconds


Given that I logged into alfred site as Customer Service Manager
When I click "Search" link 
And I add "USER" as Search String
And I click on search
And I click "USER TING" link
And I click "Edit" link
Then I should see "USER" as First Name
And I should see "TING" as Last Name 
And I should see "ting@auat.com" as Email Address 
And I should see "13/05/1928" as Birthday 
And I should see "8536487" as Phone 
And I should see "TING" as Company 



