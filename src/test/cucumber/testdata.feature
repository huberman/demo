@Sprint2
Feature: check Cucumber works

  Background: lots of interesting explanation about this feature and its
    various associated scenarios

  @Sprint3 @LowPriority
  Scenario: foo
    Given something
    When something else
    Then amazing

  @Ignore
  Scenario: wibble
    Given something
    When something bad happens
    Then we say ouch
