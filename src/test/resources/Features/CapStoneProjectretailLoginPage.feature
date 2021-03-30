@Test
Feature: - for this feature you have to have an existing account


Background:
Given User is on Retail website
And User click on MyAccount
When User clicks on Login
And User enter username 'zohal@gmail.com' and password '1298'
And User click on Login button'
And  User should be logged in to MyAccounts dashboard

@Test1
Scenario: Register as an Affiliate user with Cheque Payment Method 
When User click on ‘Register for an Affiliate Account’ link
And User fill affiliate form with below information 
|company|website|taxID|paymentMethod|
|Metropolitan|www.metro-protect.com|888|Savings|
And User check on About us check box 
And User click Continue button 
Then User should see a success message

@Test2
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer 
When User click on ‘Edit your affiliate informationlink
And user click on Bank Transfer radio button
And User fill Bank information with below information 
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|Capital One|5555|8888|12345678910|Savings|
And User clicks on Continue button
Then User should see a success's message

@Test3
Scenario: Edit your account Information 
	When User click on ‘Edit your account information’ link 
	And User modify below information 
		|firstname|lastName|email|telephone| 
		|nabi|karim|nami@gmail.com|345678|
		
	And User click on continue button 
	Then User should see a message ‘Success: 'Your account has been successfully updated'