(ns mafia-votecount.scraper.t-team-liquid
  (:use [midje.sweet]
        [midje.util :only [testable-privates]]
        [mafia-votecount.scraper.t-data-void])
  (:require [mafia-votecount.scraper.team-liquid :as liquid]))

(testable-privates mafia-votecount.scraper.team-liquid to-day-ranges analyze-vote cycle-changes enumerate)

(fact "to-day-ranges groups sequence of message ids into day ranges"
      (to-day-ranges []) => []
      (to-day-ranges [10]) => [[11]]
      (to-day-ranges [10 43]) => [[11 42]]
      (to-day-ranges [10 43 60]) => [[11 42] [61]])

(fact "analyze-vote reads posts with ##vote or ##unvote gets the part after ##vote"
      ;; The correct input
      (analyze-vote "##Vote Qatol") => {:target "Qatol" :vote true}
      ;; Lowercase vote and :
      (analyze-vote "##vote: KSC") => {:target "KSC" :vote true}
      ;; Spaces in name
      (analyze-vote "##Vote: Half the Sky") => {:target "Half the Sky" :vote true}
      ;; : and space. Trailing spaces after name
      (analyze-vote "##vote: liancourt   ") => {:target "liancourt" :vote true}
      ;; No spacing at all
      (analyze-vote "##vote:alakaslam") => {:target "alakaslam" :vote true}
      ;; Normal use of ##Unvote
      (analyze-vote "##Unvote") => {:unvote true}
      ;; Included username with ##Unvote
      (analyze-vote "##unvote marvolosity") => {:unvote true}
      ;; One # missing
      (analyze-vote "#vote:alakaslam") => {:target "alakaslam" :vote true})

(fact "cycle changes gives the post id's where admin has changed cycle"
      (keys (cycle-changes (enumerate data-void) #{"Artanis[Xp]" "GlowingBear"}))
      => '(60 1541 1968 2332 2476 2913 2985 3122))
