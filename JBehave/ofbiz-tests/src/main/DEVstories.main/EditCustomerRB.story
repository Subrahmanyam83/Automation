
Scenario: Edit user in RB and test in RB

Given that I logged into Ting site
And I click on "Clients" link
And I click the Add User Button
And I add "AUATRB" as Customer First Name
And I add "USER" as Customer Surname
And I add "rb@auat.com" as Customer Email
And I add "8536487" as Customer Phone
And I add "TINGRB" as Customer Company
And I add "13/05/1942" as Birthday
And I select Australia as Country
And I click Add User
And I see New user created

And I add "TESTRB" as Customer First Name
And I add "USER1" as Customer Surname
And I add "rbtest@auat.com" as Customer Email
And I add "1234566" as Customer Phone
And I add "RBPANTHA" as Customer Company
And I click Update User
And I see User details updated

Then I should see "TESTRB" as Customer First Name
And I should see "USER1" as Customer Surname 
And I should see "rbtest@auat.com" as Customer Email 
And I should see "1234566" as Customer Phone 
And I should see "RBPANTHA" as Customer Company
 



