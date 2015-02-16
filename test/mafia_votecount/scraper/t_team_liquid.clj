(ns mafia-votecount.scraper.t-team-liquid
  (:use [midje.sweet]
        [midje.util :only [testable-privates]])
  (:require [mafia-votecount.scraper.team-liquid :as liquid]))

(testable-privates mafia-votecount.scraper.team-liquid day-ranges)

(fact "day-ranges groups sequence of message ids into day ranges"
      (day-ranges []) => []
      (day-ranges [10]) => [[11]]
      (day-ranges [10 43]) => [[11 42]]
      (day-ranges [10 43 60]) => [[11 42] [61]])
