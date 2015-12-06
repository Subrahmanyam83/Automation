

Scenario: Edit credit expiry in Ting and Test in AlfRED


Given that I logged into Ting site
When I navigate to the customer search page
And I add "Simon" as Customer First Name
And I add "Fuller" as Customer Surname
And I add "simon@moshtix.com.au" as field
And I click "Search" button
And I click "Change Expiry Date" field
And I select the "07" as "creditAddExpiryDate_day"
And I select the "December" as "creditAddExpiryDate_month"
And I select the "2016" as "creditAddExpiryDate_year"
And I type "Credit Amount Changed By Prachi" in the "Credit Add Notes"
And I click the "Change Date" button

And I wait for "10" seconds

Given that I logged into alfred site as Customer Experience Manager
When I type "Simon" in the "Search"
Then I click on search
And I wait for "10" seconds
And I click on the customer "Simon Fuller" link
And I wait for "10" seconds
And I click "Edit" link
And I wait for "10" seconds
And I see $ 2000 expires on 07/12/2016











