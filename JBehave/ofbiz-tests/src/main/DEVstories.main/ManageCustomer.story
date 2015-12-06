
Scenario: Assist Customer with Order.

Given that I logged into alfred site as Customer Service Manager
When I search for christy2@tpg.com.au on "Customer Search Page"
Then I see Christy Burrows  - christy2@tpg.com.au
And I click "Christy Burrows" link
And I verify the value of "Personal Details" as "9621 8208 christy2@tpg.com.au"
And I verify the value of ".*?" as ".*?"



Scenario: Assist Customer with Credits.

Given that I logged into alfred site as Customer Service Manager
When I search for Christy on "Customer Search Page"
Then I see Christy Burrows  - christy2@tpg.com.au
And I click "Christy Burrows" link
And I verify the value of "Personal Details" as "9621 8208 christy2@tpg.com.au"
And I verify the value of "Customer Credit" as "$ 100 Credit Expires on 31/01/2013"
And I verify the value of ".*?" as ".*?"
