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
And I wait for "15" seconds
And I click "Use My Email Details" button
And I click "Next" button
And I select "Credit Card" as payment option
And I select "I understand and accept the " terms and conditions
And I click place order "submit"
And I get the Order reference








