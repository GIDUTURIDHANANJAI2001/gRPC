@login
#  Tagname

  Feature: we are login with credentials
    Scenario: giving crendentials to user
      Given i have a login client
      When give crendetials for the user as username as "dhanu" and password as "dhan7"
      Then validate user created or not
