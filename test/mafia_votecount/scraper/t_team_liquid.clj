(ns mafia-votecount.scraper.t-team-liquid
  (:use [midje.sweet]
        [midje.util :only [testable-privates]]
        [mafia-votecount.scraper.t-data-void])
  (:require [mafia-votecount.scraper.team-liquid :as liquid]))

(testable-privates mafia-votecount.scraper.team-liquid
                   to-day-ranges analyze-vote cycle-changes enumerate
                   get-votes-in-range last-cycle-number)

(def enumerated-data-void-1 (enumerate data-void 1))

(fact "to-day-ranges groups sequence of message ids into day ranges"
      (to-day-ranges []) => []
      (to-day-ranges [10]) => [[11]]
      (to-day-ranges [10 43]) => [[11 42]]
      (to-day-ranges [10 43 60]) => [[11 42] [61]])

(fact "analyze-vote reads posts with ##vote or ##unvote gets the part after ##vote"
      ;; The correct input
      (analyze-vote "##Vote Qatol") => {:target "Qatol"}
      ;; Lowercase vote and :
      (analyze-vote "##vote: KSC") => {:target "KSC"}
      ;; Spaces in name
      (analyze-vote "##Vote: Half the Sky") => {:target "Half the Sky"}
      ;; : and space. Trailing spaces after name
      (analyze-vote "##vote: liancourt   ") => {:target "liancourt"}
      ;; No spacing at all
      (analyze-vote "##vote:alakaslam") => {:target "alakaslam"}
      ;; Normal use of ##Unvote
      (analyze-vote "##Unvote") => {:target ""}
      ;; Included username with ##Unvote
      (analyze-vote "##unvote marvolosity") => {:target ""}
      ;; One # missing
      (analyze-vote "#vote:alakaslam") => {:target "alakaslam"}
      ;; Stuff before ##vote
      (analyze-vote "whatever ##vote Wile E. Coyote") => {:target "Wile E. Coyote"}
      ;; Target not immediate
      (analyze-vote "#vote:") => {:target nil})

(fact "cycle changes gives the post id's where admin has changed cycle"
      (keys (cycle-changes (enumerate data-void 1) #{"Artanis[Xp]" "GlowingBear"}))
      => '(61 1542 1969 2333 2477 2914 2986 3123))

(fact "get-votes-in-range gets votes that happened between start and end"
      (get-votes-in-range enumerated-data-void-1 [2987 3122])
      => '({:index 3044 :target "batsnacks" :voter "Vivax"}
           {:index 3062 :target "" :voter "Vivax"}
           {:index 3062 :target "Wile E. Scum" :voter "Vivax"}
           {:index 3070 :target "batsnacks" :voter "sicklucker"}
           {:index 3096 :target "Bats" :voter "Oatsmaster"}
           {:index 3119 :target "Wile E. Coyote" :voter "batsnacks"})
      (get-votes-in-range {} '(1262)) => '())

(fact "last-cycle-number determines new cycle number"
      (last-cycle-number 2 :day [[1000]]) => 2
      (last-cycle-number 2 :night [[1000]]) => 3
      (last-cycle-number 2 :day [[1000 2000] [3000]]) => 3
      (last-cycle-number 0 :none [[11 42] [61]]) => 2)
