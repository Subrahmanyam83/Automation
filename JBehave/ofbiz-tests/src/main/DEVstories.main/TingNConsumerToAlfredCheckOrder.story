Scenario: Check Order in Ting

Given that I logged into Ting site
Then I click "Products"
When I add "SSD001" as Product Code in textbox
And I click "Search" button
Then I click Edit for product code "SSD001"
And I wait for "15" seconds
Then I click supplier "14,000ft Tandem Skydive - Midweek" link
And I wait for "20" seconds
And I click Edit under "Details"
And I wait for "20" seconds
And I enter supplier "Company Name" as "Sydney Skydivers Pty Ltd"
And I click "Save" button
And I go to product details page for order
And I click Edit under "Details "
And I edit the "Description" to "Sky diving is an experience"
And I select "Description Change" as Update Reason
And I click "Update" button
And I "Logout"

And I wait for "10" seconds


Scenario: Create Order in consumer
Given that I logged into Ting site
Then I click "Clients"
Then I click "Customer"
When I click "Create New User" button
And I add "JimBTest037" as "First name"
And I add "PeterB" as "Surname"
And I add "jimtest037.peterbb@jim.com" as "Email"
And I click "Add User" button
Then I wait for "10" seconds
Then I see New user created
And I get Customer ID
And I "Logout"

And I wait for "10" seconds


Given that I log into consumer site
When I click on "Abseiling" under Adventure Sports category
Then I open a gift product
And I click "addToCart" to buy
And I "Checkout" to shopping cart
And I see Delivery Options
And I select "Standard E-Voucher" as Delivery option
And I wait for "10" seconds
And I click "Use My Email Details" button
And I click "Next" button
And I select "Bpay, Direct Deposit, Cheque, or Money Order" as payment option
And I select "I understand and accept the " terms and conditions
And I click place order "submit"
And I get the Order reference








