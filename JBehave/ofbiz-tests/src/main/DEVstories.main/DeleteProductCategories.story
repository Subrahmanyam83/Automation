
Scenario: Delete and Add new Product Categories - Verify Updated Categories on AlfRed

Given that I logged into ofbiz site
When I click "Add" link
Then I see Add Product
And I enter "newtestskydiving" as "Name"
And I enter the supplier as "Crazy April Fool Experiences (APR)"
And I select "Experience" as "Product Type"
And I select "Gold Voucher" as "Voucher Level"

And I enter the Primary category as "Adventure Sports > Abseiling"

And I enter the Category as "Gift Boxes > Baby Gift Boxes"
And I enter the Category as "Gift Boxes > Couples Gift Boxes"
And I enter the Occassion as "Birthday Gifts > 18th Birthday"
And I enter the Occassion as "Father's Day Gifts > All Gifts"
And I enter the recipient as "Gifts for Him > Husband"
And I enter the recipient as "Gifts for Her > Baby Girl"

And I click save button
And I see Congratulations. You just added a new product

And I get the product ID

And I check the value of "Name" as "newtestskydiving"
And I check the value of "Supplier" as "Crazy April Fool Experiences"
And I verify value of "Product Type" as "Experience"
And I verify value of "Voucher Level" as "Gold Voucher"

And I check the value "Primary Category" as "Adventure Sports > Abseiling"
And I confirm "Occasion Tags" value as "Birthday Gifts > 18th Birthday"
And I confirm "Occasion Tags" value as "Father's Day Gifts > All Gifts"
And I confirm "Recipient Tags" value as "Gifts for Him > Husband"
And I confirm "Recipient Tags" value as "Gifts for Her > Baby Girl"
And I confirm "Category Tags" value as "Gift Boxes > Baby Gift Boxes"
And I confirm "Category Tags" value as "Gift Boxes > Couples Gift Boxes"

And I enter the Primary category as "Outdoor Activities > Cycling Tours"
And I delete the "Category" "Gift Boxes > Baby Gift Boxes" tag
And I enter the Category as "Platinum > Fine Wine Tasting"
And I delete the "Occasion" "Birthday Gifts > 18th Birthday" tag
And I enter the Occassion as "Holidays > New Year's"
And I delete the "Recipient" "Gifts for Him > Husband" tag
And I enter the recipient as "Gifts for Her > Girls & Tee"

And I check the value "Primary Category" as "Outdoor Activities > Cycling Tours"

And I confirm "Occasion Tags" value as "Holidays > New Year's"
And I confirm "Occasion Tags" value as "Father's Day Gifts > All Gifts"
And I confirm "Recipient Tags" value as "Gifts for Her > Girls & Tee"
And I confirm "Recipient Tags" value as "Gifts for Her > Baby Girl"
And I confirm "Category Tags" value as "Platinum > Fine Wine Tasting"
And I confirm "Category Tags" value as "Gift Boxes > Couples Gift Boxes"


