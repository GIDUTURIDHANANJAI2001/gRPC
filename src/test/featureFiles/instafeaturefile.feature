@instafeature

Feature: insta feature file

  @insta_signup
  Scenario: giving credentials to the user
    Given I have an Instagram client
    When create account with firstname as "dhanu" and secondname as "lucky" and middlename as "lovely" email as "dhanulucky545@gmail.com" and phoneno as "770" and dob as "02jan" and country as "INDIA" and mothername as "sudha"
    Then validate the user created or not

