
Scenario: Add credit from AlfRED and see in view page/edit page 
Given that I logged into alfred site and search Simon Fuller
When I click "Edit" link
And I see Credit
And I see Add Credit
And I see Australia
And I see  (Current Balance:$ 1000)
And I see $ 1000 expires on 12/12/2012
And I should not see "New Zealand"

And I hover edit credit link