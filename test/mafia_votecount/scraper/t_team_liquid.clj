(ns mafia-votecount.scraper.t-team-liquid
  (:use [midje.sweet]
        [midje.util :only [testable-privates]]
        [mafia-votecount.scraper.t-data-void])
  (:require [mafia-votecount.scraper.team-liquid :as liquid]))

(testable-privates mafia-votecount.scraper.team-liquid
                   to-day-ranges analyze-vote cycle-changes enumerate
                   get-votes-in-range)

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
      (analyze-vote "##Unvote") => {:unvote true}
      ;; Included username with ##Unvote
      (analyze-vote "##unvote marvolosity") => {:unvote true}
      ;; One # missing
      (analyze-vote "#vote:alakaslam") => {:target "alakaslam"}
      ;; Stuff before ##vote
      (analyze-vote "whatever ##vote Wile E. Coyote") => {:target "Wile E. Coyote"}
      ;; Target not immediate
      (analyze-vote "#vote:") => {:target nil})

(fact "cycle changes gives the post id's where admin has changed cycle"
      (keys (cycle-changes (enumerate data-void) #{"Artanis[Xp]" "GlowingBear"}))
      => '(61 1542 1969 2333 2477 2914 2986 3123))

(fact "get-votes-in-range gets votes that happened between start and end"
      (get-votes-in-range (enumerate data-void) [2987 3122])
      => '({:index 3044 :target "batsnacks" :user "Vivax"}
           {:index 3062 :unvote true :user "Vivax"}
           {:index 3062, :target "Wile E. Scum", :user "Vivax"}
           {:index 3070 :target "batsnacks" :user "sicklucker"}
           {:index 3096 :target "Bats" :user "Oatsmaster"}
           {:index 3119 :target "Wile E. Coyote" :user "batsnacks"}))
