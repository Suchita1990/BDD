Feature: Signin Feature


Scenario Outline: Check the behaviour when user enters valid username and invalid password
       When User enters "<username>" and "<password>"
       Then User should be able to login
       Examples:
           |username|password|
           |suchita_mulik@yahoo.com|s43V57m@|
         