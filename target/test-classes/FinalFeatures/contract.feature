Feature: This is Contract page Project
@Parvin
Scenario:Verify user can Contract by sending message
Given Open Demoblaze <"URL"> Application
Then Click Contract link
Then Enter Contract email
Then Enter Contract name
Then Enter Contract message
Then Click and  Send Contract
Then User can Contract by sending message
