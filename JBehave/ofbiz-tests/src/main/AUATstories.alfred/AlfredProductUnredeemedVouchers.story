
Scenario: Unredeemed Vouchers in Alfred
Given that I logged into alfred site as Product Manager
When I click on "publishedButton" button
Then I wait for "10" seconds
And I press "friendlyURL-OK" button
Then I wait for "10" seconds
And I press "publish-confirm-Yes" button
Then I wait for "10" seconds
And I click on country "Transfer all unredeemed vouchers to this product code."
And I wait for "10" seconds
And I type "WID955" in the "Voucher Code"
And I wait for "10" seconds
And I press "honour-confirm-Yes" button
And I wait for "10" seconds
And I press "turnOnSpecialSave" button
And I wait for "15" seconds
And I see The product has been unpublished.
And I wait for "10" seconds

Given that I logged into alfred site as Product Manager and go to unredeemed product
When I click on "publishedButton" button
Then I press "publish-confirm-Yes" button
And I wait for "10" seconds
And I see Transfer all unredeemed vouchers to this product code.







