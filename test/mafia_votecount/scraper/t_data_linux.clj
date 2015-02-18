(ns mafia-votecount.scraper.t-data-linux
  (:gen-class))

(def data-linux
'({:user "Blazinghand",
  :message
  ({:tag :div,
    :attrs {:style "text-align:center"},
    :content
    ({:tag :img,
      :attrs
      {:title "",
       :alt "[image loading]",
       :style "width: 590px; height: 100px;",
       :src
       "http://i110.photobucket.com/albums/n99/chuiu/TLmafia_new.png"},
      :content nil})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content
    ({:tag :b,
      :attrs nil,
      :content
      ("Please read the entire thread before signing up. Thank you.")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "* Cohosts are "
   {:tag :a,
    :attrs
    {:target "_blank", :href "/mytlnet/index.php?view=new&to=Onegu"},
    :content ("Onegu")}
   " and "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/mytlnet/index.php?view=new&to=Batsnacks"},
    :content ("batsnacks")}
   ". All night actions must be sent to both them and me."
   {:tag :br, :attrs nil, :content nil}
   "* There are no coaches in this game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :u, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content
    ({:tag :u,
      :attrs nil,
      :content
      ({:tag :b, :attrs nil, :content ("Linux Mini Mafia")})})}
   {:tag :u, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :a,
    :attrs
    {:onclick "return toggleShowSpoiler2(this, 1)",
     :title "Important Posts",
     :href "#",
     :style
     "text-decoration:none;font-family:monospace;color:#808080"},
    :content
    ({:tag :span, :attrs nil, :content ("+ Show")}
     " Spoiler [Important Posts]"
     {:tag :span, :attrs nil, :content (" +")})}
   {:tag :div,
    :attrs
    {:style
     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
     :id "spoiler_1"},
    :content
    ({:tag :div,
      :attrs {:class "forummsg"},
      :content
      ("D1 "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476878-linux-mini-mafia?page=4#69"},
        :content
        ("http://www.teamliquid.net/forum/mafia/476878-linux-mini-mafia?page=4#69")}
       {:tag :br, :attrs nil, :content nil}
       "N1 "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/viewpost.php?post_id=23687441"},
        :content
        ("http://www.teamliquid.net/forum/viewpost.php?post_id=23687441")}
       {:tag :br, :attrs nil, :content nil}
       "N1 Modkill "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476878-linux-mini-mafia?page=114#2276"},
        :content
        ("http://www.teamliquid.net/forum/mafia/476878-linux-mini-mafia?page=114#2276")}
       {:tag :br, :attrs nil, :content nil}
       "End Game "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476878-linux-mini-mafia?page=120#2391"},
        :content
        ("http://www.teamliquid.net/forum/mafia/476878-linux-mini-mafia?page=120#2391")}
       {:tag :br, :attrs nil, :content nil})})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :hr, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("The Rules")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("The rules for this game are drawn from my model OP here: "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href
         "/forum/viewmessage.php?topic_id=272547&currentpage=4#78"},
        :content ("(link)")}
       ". Read them. ")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Supplemental Rules")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("In addition to the rules outlined in the Model OP, there are a couple changes for this game.")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("1. Night Length:")}
   " Nights will last 24 hours, and you may speak at night. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("2. Day Length:")}
   " Each day lasts 48 hours."
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("3. Lynch Type:")}
   " Plurality: The player with the most votes gets lynched. Ties are resolved by who out of those two was most recently ahead of the other."
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("4. Activity:")}
   " It is required you make at least 2 posts per 72 hours, and ALSO meet the arbitrary activity requirement that exists entirely in my mind and will not be explained. Voting is mandatory."
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("5. Deadline:")}
   " The Lynch Deadline will probably be at 21:00 UTC (+00:00), though if this doesn't work, we can change that."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Credits")}
   ":"
   {:tag :br, :attrs nil, :content nil}
   "Thanks to anyone who has ever hosted a game. This list grows ever longer. Special thanks to myself for going over this setup with me, and to myself, on the balance approval team, for testing this setup for balance. Also thanks to Probulous since I stole this OP from him and modified it to my nefarious needs. Also also thanks to Palmar for helping me with this setup."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ("If you have not read all the rules, go and do so. I might give you candy.")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("I am open to questions any time. If something doesn't make sense, please ask.")})}
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-02 00:10:30")})}
 {:user "Blazinghand",
  :message
  ({:tag :b,
    :attrs nil,
    :content
    ({:tag :br, :attrs nil, :content nil}
     {:tag :font,
      :attrs {:style "color: blue"},
      :content ({:tag :br, :attrs nil, :content nil})})}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content
    ({:tag :b, :attrs nil, :content ("Roles and Setup information")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This is a "
   {:tag :b, :attrs nil, :content ("semi-open")}
   " setup. There are four possible setups, and which setup is chosen will be RNGed. Each setup will then be modified in one of three ways, which will also be RNGed. The chosen setup is not revealed, but it should be deducable as the game goes on."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content
    ({:tag :b,
      :attrs nil,
      :content
      ({:tag :font,
        :attrs {:style "color: green"},
        :content ("Vanguard of the Glorious GNU/Linux Dawn")})})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: green"},
      :content ("Linux Distro (Vanilla Townie):")})}
   " Okay, so there are some configuration issues. Maybe it's time to switch to a distro with a different package management system? Actually, it might be best to compile the kernel from source... "
   {:tag :i,
    :attrs nil,
    :content ("You are a VT. Find and destroy the mafia.")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :font,
    :attrs {:style "color: blue"},
    :content
    ({:tag :b, :attrs nil, :content ("| grep (Parity Cop):")})}
   " You are a command used for filtering things. "
   {:tag :i,
    :attrs nil,
    :content
    ("Each night you target someone, and you're told if the alignment of your target is the same or different as your previous target. Your N1 check doesn't return anything, but is necessary for your N2 check to work. Your checks interact with roleblocks like this: "
     {:tag :a,
      :attrs
      {:rel "nofollow",
       :target "_blank",
       :href "http://pastebin.com/raw.php?i=che7KK7W"},
      :content ("(link)")}
     ". You can't check yourself. Find and destroy the mafia.")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :font,
    :attrs {:style "color: blue"},
    :content ({:tag :b, :attrs nil, :content ("tar (Doctor):")})}
   " Sometimes, people need to save things. You can do that. "
   {:tag :i,
    :attrs nil,
    :content
    ("Each night, you can save someone from the nightkill. You can't protect the same player twice in a row. You can't save yourself. Find and destroy the mafia.")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :font,
    :attrs {:style "color: blue"},
    :content
    ({:tag :b, :attrs nil, :content ("Favored Distro (Named VT):")})}
   " "
   {:tag :i, :attrs nil, :content ("You are a blue with no powers.")}
   " You have a small but fanatical following. "
   {:tag :i, :attrs nil, :content ("Find and destroy the mafia. ")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: green"},
      :content ("Town Win Condition")})}
   " -  The town wins when there are no mafia left in the game or nothing can prevent that from happening."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content
    ({:tag :font,
      :attrs {:style "color: red"},
      :content ({:tag :b, :attrs nil, :content ("Awful Software")})})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: red"},
      :content ("That One Program (Mafia Goon):")})}
   " You're that one piece of software that only runs on Windows that prevents people from switching to Linux. Sometimes you're a piece of a professional software like Origin, sometimes you're something more benign like MS Office. You are a thorn in the side of the glorious GNU Dawn. "
   {:tag :i,
    :attrs nil,
    :content
    ("You are scum. You have no special powers. You win when scum outnumbers town or nothing can prevent that.")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: red"},
      :content
      ("Proprietary, Intermittently-Functional Driver (Mafia RB):")})}
   " Agh, why don't you "
   {:tag :u, :attrs nil, :content ("work?!")}
   " Who writes a driver that doesn't work at all? Fuck it, I'm switching to Nouveau. "
   {:tag :i,
    :attrs nil,
    :content
    ("You are scum. Each night, you can RB someone.. You can RB and send in the factional KP in the same night if you are the last scum. The target, even if he is a VT, is notified of being roleblocked. You win when scum outnumbers town or nothing can prevent that.")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: red"},
      :content ("OS X (Mafia GF):")})}
   " Under the right circumstances, someone might mistake you for a Linux distro. You do a lot of the right things! "
   {:tag :i,
    :attrs nil,
    :content
    ("You are scum. You return green to checks. You win when scum outnumbers town or nothing can prevent that. ")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: red"},
      :content ("Mafia Win condition")})}
   " - The mafia wins when they match or outnumber the remaining townies or nothing can prevent that from happening."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Possible Setups")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Base Setups")}
   " - pick one at random:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ("A) 1 "
     {:tag :font,
      :attrs {:style "color: red"},
      :content ("That One Program")}
     ", 1 "
     {:tag :font,
      :attrs {:style "color: red"},
      :content ("Proprietary, Intermittently-Functional Driver")}
     ", 1 "
     {:tag :font, :attrs {:style "color: red"}, :content ("OS X")}
     ", 1 "
     {:tag :font, :attrs {:style "color: blue"}, :content ("tar")}
     ", 1 "
     {:tag :font, :attrs {:style "color: blue"}, :content ("| grep")}
     ", 8 "
     {:tag :font,
      :attrs {:style "color: green"},
      :content ("Linux Distros")}
     {:tag :br, :attrs nil, :content nil}
     "B) 2 "
     {:tag :font,
      :attrs {:style "color: red"},
      :content ("That One Programs")}
     ", 1 "
     {:tag :font,
      :attrs {:style "color: red"},
      :content ("Proprietary, Intermittently-Functional Driver")}
     ", 1 "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content ("Favored Distro")}
     ", 1 "
     {:tag :font, :attrs {:style "color: blue"}, :content ("tar")}
     ", 8 "
     {:tag :font,
      :attrs {:style "color: green"},
      :content ("Linux Distros")}
     {:tag :br, :attrs nil, :content nil}
     "C) 2 "
     {:tag :font,
      :attrs {:style "color: red"},
      :content ("That One Programs")}
     ", 1 "
     {:tag :font,
      :attrs {:style "color: red"},
      :content ("Proprietary, Intermittently-Functional Driver")}
     ", 1 "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content ("Favored Distro")}
     ", 1 "
     {:tag :font, :attrs {:style "color: blue"}, :content ("| grep")}
     ", 8 "
     {:tag :font,
      :attrs {:style "color: green"},
      :content ("Linux Distros")}
     {:tag :br, :attrs nil, :content nil}
     "D) 1 "
     {:tag :font,
      :attrs {:style "color: red"},
      :content ("That One Program")}
     ", 1 "
     {:tag :font,
      :attrs {:style "color: red"},
      :content ("Proprietary, Intermittently-Functional Driver")}
     ", 1 "
     {:tag :font, :attrs {:style "color: red"}, :content ("OS X")}
     ", 2 "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content ("Favored Distros")}
     ", 8 "
     {:tag :font,
      :attrs {:style "color: green"},
      :content ("Linux Distros")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Modifications")}
   " - pick one at random:"
   {:tag :br, :attrs nil, :content nil}
   "1) Remove one "
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: green"},
      :content ("Linux Distro")})}
   " and add one "
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Favored Distro")})}
   "."
   {:tag :br, :attrs nil, :content nil}
   "2) Use setup as-is."
   {:tag :br, :attrs nil, :content nil}
   "3) Remove one "
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Favored Distro")})}
   " and add one "
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: green"},
      :content ("Linux Distro")})}
   " if possible."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Each Base Setup is equally likely. Each Modification is equally likely. Who gets what role will be RNGed."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Sample PMs:")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Blazinghand",
  :message
  ({:tag :b, :attrs nil, :content ("Player List")}
   {:tag :br, :attrs nil, :content nil}
   "1) Trfel  "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Trfel"},
    :content ("(Filter)")}
   {:tag :br, :attrs nil, :content nil}
   "2) LightningStrike "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href
     "/forum/mafia/476878-linux-mini-mafia?user=LightningStrike"},
    :content ("(Filter)")}
   {:tag :br, :attrs nil, :content nil}
   "3) Chezitwo "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Chezitwo"},
    :content ("(Filter)")}
   {:tag :br, :attrs nil, :content nil}
   "4) Damdred "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Damdred"},
    :content ("(Filter)")}
   {:tag :br, :attrs nil, :content nil}
   "5) "
   {:tag :s,
    :attrs nil,
    :content
    ("IAmRobik "
     {:tag :a,
      :attrs
      {:target "_blank",
       :href "/forum/mafia/476878-linux-mini-mafia?user=IAmRobik"},
      :content ("(Filter)")})}
   " "
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: green"},
      :content ("Linux Distro Modkilled N1")})}
   {:tag :br, :attrs nil, :content nil}
   "6) rsoultin "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=rsoultin"},
    :content ("(Filter)")}
   {:tag :br, :attrs nil, :content nil}
   "7) "
   {:tag :s,
    :attrs nil,
    :content
    ("sicklucker "
     {:tag :a,
      :attrs
      {:target "_blank",
       :href "/forum/mafia/476878-linux-mini-mafia?user=sicklucker"},
      :content ("(Filter)")})}
   " "
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: red"},
      :content ("That One Program modkilled D1")})}
   {:tag :br, :attrs nil, :content nil}
   "8) Half the Sky "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Half the Sky"},
    :content ("(Filter)")}
   {:tag :br, :attrs nil, :content nil}
   "9) "
   {:tag :s,
    :attrs nil,
    :content
    ("Eden1892 "
     {:tag :a,
      :attrs
      {:target "_blank",
       :href "/forum/mafia/476878-linux-mini-mafia?user=Eden1892"},
      :content ("(Filter)")})}
   " "
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: red"},
      :content
      ("Proprietary, Intermittently-Functional Driver lynched D1")})}
   {:tag :br, :attrs nil, :content nil}
   "10) Palmar "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Palmar"},
    :content ("(Filter)")}
   {:tag :br, :attrs nil, :content nil}
   "11) MARVELLOSITY "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=marvellosity"},
    :content ("(Filter)")}
   {:tag :br, :attrs nil, :content nil}
   "12) HolyFlare "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Holyflare"},
    :content ("(Filter)")}
   {:tag :br, :attrs nil, :content nil}
   "13) FecalFeast "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=FecalFeast"},
    :content ("(Filter)")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Cohosts")}
   {:tag :br, :attrs nil, :content nil}
   "1) Onegu"
   {:tag :br, :attrs nil, :content nil}
   "2) Batsnacks"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Replacements")}
   {:tag :br, :attrs nil, :content nil}
   "1) Alakaslam"
   {:tag :br, :attrs nil, :content nil}
   "2) justanothertownie"
   {:tag :br, :attrs nil, :content nil}
   "3)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Shadows")}
   {:tag :br, :attrs nil, :content nil}
   "1) "
   {:tag :br, :attrs nil, :content nil}
   "2)"
   {:tag :br, :attrs nil, :content nil}
   "3)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Sitouts")}
   {:tag :br, :attrs nil, :content nil}
   "1)"
   {:tag :br, :attrs nil, :content nil}
   "2)"
   {:tag :br, :attrs nil, :content nil}
   "3)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Observers")}
   {:tag :br, :attrs nil, :content nil}
   "1)"
   {:tag :br, :attrs nil, :content nil}
   "2)"
   {:tag :br, :attrs nil, :content nil}
   "3)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: green"},
      :content
      ("9 of 10 Vanguards of the Glorious GNU/Linux Dawn Remaining ")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: red"},
      :content ("1 of 3 Awful Softwares Remaining")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :a,
    :attrs
    {:onclick "return toggleShowSpoiler2(this, 2)",
     :title "flips",
     :href "#",
     :style
     "text-decoration:none;font-family:monospace;color:#808080"},
    :content
    ({:tag :span, :attrs nil, :content ("+ Show")}
     " Spoiler [flips]"
     {:tag :span, :attrs nil, :content (" +")})}
   {:tag :div,
    :attrs
    {:style
     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
     :id "spoiler_2"},
    :content
    ({:tag :div,
      :attrs {:class "forummsg"},
      :content
      ({:tag :s,
        :attrs nil,
        :content
        ("Eden1892 "
         {:tag :a,
          :attrs
          {:target "_blank",
           :href "/forum/mafia/476878-linux-mini-mafia?user=Eden1892"},
          :content ("(Filter)")})}
       " "
       {:tag :b,
        :attrs nil,
        :content
        ({:tag :font,
          :attrs {:style "color: red"},
          :content
          ("Proprietary, Intermittently-Functional Driver lynched D1")})}
       {:tag :br, :attrs nil, :content nil}
       {:tag :s,
        :attrs nil,
        :content
        ("sicklucker "
         {:tag :a,
          :attrs
          {:target "_blank",
           :href
           "/forum/mafia/476878-linux-mini-mafia?user=sicklucker"},
          :content ("(Filter)")})}
       " "
       {:tag :b,
        :attrs nil,
        :content
        ({:tag :font,
          :attrs {:style "color: red"},
          :content ("That One Program modkilled D1")})}
       {:tag :br, :attrs nil, :content nil}
       {:tag :s,
        :attrs nil,
        :content
        ("IAmRobik "
         {:tag :a,
          :attrs
          {:target "_blank",
           :href "/forum/mafia/476878-linux-mini-mafia?user=IAmRobik"},
          :content ("(Filter)")})}
       " "
       {:tag :b,
        :attrs nil,
        :content
        ({:tag :font,
          :attrs {:style "color: green"},
          :content ("Linux Distro Modkilled N1")})}
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil})})}
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-01 23:36:11")})}
 {:user "Trfel", :message ("/in")}
 {:user "LightningStrike", :message ("/in")}
 {:user "geript",
  :message ("/in" {:tag :br, :attrs nil, :content nil})}
 {:user "Damdred", :message ("/In")}
 {:user "geript",
  :message ({:tag :b, :attrs nil, :content ("##vote Damdred")})}
 {:user "Damdred",
  :message
  ("You read me right finally geript!"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "IAmRobik", :message ("/in")}
 {:user "Holyflare",
  :message ("urgh majority and mediocre setup thing")}
 {:user "rsoultin",
  :message
  ("/in"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "so I can piss geript off again <3")}
 {:user "sicklucker", :message ("/in")}
 {:user "Onegu",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "At least im a co host so I won't tunnel you all game...")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i don't like having to work around the setup to determine which it is and all of that finicky crap with fake claim galore, rather just play a game of mafia "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Half the Sky",
  :message
  ("Majority lynch? Should be interesting even if different. Hopefully it's not instant like Hammertime though. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "/in "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "<3 everyone playing so far."
   {:tag :br, :attrs nil, :content nil})}
 {:user "Eden1892",
  :message
  ({:tag :b, :attrs nil, :content ("/IN!!!!!!")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "player list looks great")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Something doesn't make sense here.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Eden1892")}
   " and "
   {:tag :b, :attrs nil, :content ("3 others")}
   " like this.")}
 {:user "Blazinghand",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I think the last time this was played, there weren't any fake claims? `"
   {:tag :br, :attrs nil, :content nil})}
 {:user "geript", :message ("Actually I want a break.  /out")}
 {:user "Barakos",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "last time this setup was played (avogadros, i think) scum claimed prime and never got caught. "
   {:tag :br, :attrs nil, :content nil}
   "(http://www.teamliquid.net/forum/mafia/468642-avogadros-number-mini-mafia?page=8#141)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Unless there has been a more relevant game with the same setup, which I did miss..."
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-01-30 09:24:50")})}
 {:user "Blazinghand",
  :message
  ("Oh dang, you're right!!!! Well clearly since scum fakeclaimed last game no way they'd do it this game, since it would be obvious, so definitely trust any claims you see, heuhuehuehue"
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-01-30 09:50:07")})}
 {:user "Chezitwo",
  :message ("/in" {:tag :br, :attrs nil, :content nil} "but who?")}
 {:user "Palmar", :message ("echo /in")}
 {:user "Alakaslam", :message ("/replace")}
 {:user "Blazinghand",
  :message
  ("BTW if nobody actually likes majority lynch we can change things. I prefer it but I'm not the one who'll be playing. In the absence of any comments I'll stick with majority as it's set up in the OP.")}
 {:user "batsnacks", :message ("/subscribe")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Something I said?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "<3!")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "My only question is it's majority at time of deadline, right? Not the instant a majority is achieved?")}
 {:user "Damdred",
  :message
  ("Its not instant majority just majority "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil}
   ". I like all three so i'm fine")}
 {:user "rsoultin",
  :message
  ("Hi damdy! Okies, then I have no objections lol. I just don't want to die while I'm at work again @.@ bastards.")}
 {:user "IAmRobik", :message ("Prefer pluarilty")}
 {:user "Palmar",
  :message
  ("I prefer plurality deadline or instant majority over deadline majority."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also I don't like instant majority with announced host deadlines. Like I think host should be able to end the day whenever the fuck he feels like it as long as it's been at least 36 hours or something.")}
 {:user "Half the Sky",
  :message
  ("I can live with deadline majority. It's something different. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The issue with instant majority as I'm realising now in Hammertime is that people can get hammered in their sleep, and the silent night just compounds the problem as a potential nightkill is unable to get out information they can think before they are likely to be nightkilled. ")}
 {:user "Blazinghand",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "right now it's deadline majority, correct. we can do plurality instead if people prefer")}
 {:user "Holyflare",
  :message
  ("will join if plurality even if setup be whack yo"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "/pendingin")}
 {:user "marvellosity",
  :message
  ("/in"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "plurality")}
 {:user "justanothertownie",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "This."
   {:tag :br, :attrs nil, :content nil}
   "/in if it doesn't start during this weekend.")}
 {:user "Eden1892", :message ("Plurality says plurality")}
 {:user "Eden1892", :message ("I also vote plurality")}
 {:user "Damdred",
  :message
  ("Make it plurality so that we can have an amazing player list")}
 {:user "Half the Sky",
  :message ("Majority or plurality, I can go with either. ")}
 {:user "rsoultin", :message ("no preference!")}
 {:user "Trfel", :message ("Doesn't matter to me either.")}
 {:user "Blazinghand",
  :message
  ({:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("Signups are filled! We're going with plurality. game starts in about 3.5 hours at 21:00 UTC (+00:00).")})}
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-01-30 17:42:14")})}
 {:user "marvellosity",
  :message
  ("i swear every host capitalises my name just to piss me off")}
 {:user "Blazinghand",
  :message
  ("oops, sorry for getting the capitalization wrong, it was a slip of the finger. let me fix that.")}
 {:user "marvellosity", :message ("that is actually better :p")}
 {:user "Chezitwo",
  :message ("Do I need to install Linux for this game?")}
 {:user "Damdred", :message ("OMG OMG OMG GAME STARTS")}
 {:user "justanothertownie",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "/out"
   {:tag :br, :attrs nil, :content nil}
   "/replace")}
 {:user "Blazinghand",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   ">tells me to start the game right away"
   {:tag :br, :attrs nil, :content nil}
   ">I start the game right away"
   {:tag :br, :attrs nil, :content nil}
   ">/outs"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("we still have one more slot!")})}
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-01-30 17:59:30")})}
 {:user "Chezitwo",
  :message ({:tag :br, :attrs nil, :content nil} "Apple?")}
 {:user "justanothertownie",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Friday night is part of the weekend for me.")}
 {:user "Blazinghand",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "ah, gotcha. Well, it's entirely possible this won't fill up until Monday, in which case the slot as all yours"
   {:tag :br, :attrs nil, :content nil})}
 {:user "IAmRobik",
  :message
  ("Why don't we just have a 4-day day 1. Then he can play today/monday and it'll be like the weekend never happened")}
 {:user "justanothertownie",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I think that's rather unlikely but sure, fine with me.")}
 {:user "Fecalfeast",
  :message
  ("/in "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "gimmie that spot")}
 {:user "Half the Sky",
  :message
  ("Yikes, I'm going out right when the game starts too..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eh, guess I'll stay in the game and catch up tomorrow morning then. "
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-01-30 20:31:06")})}
 {:user "Blazinghand",
  :message
  ({:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("We're full. game start in twenty minutes.")})})}
 {:user "Damdred", :message ("##Vote Half the Sky")}
 {:user "LightningStrike",
  :message
  ("You better not touch her since I like her a lot."
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("##Vote: Damdred")})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil} "Kill all white knights")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "fucking racist")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "i know it's not meant to be, but this sounds really creepy :p")}
 {:user "Eden1892",
  :message ({:tag :br, :attrs nil, :content nil} "Fight me honkey")}
 {:user "Blazinghand",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content
    ({:tag :b,
      :attrs nil,
      :content ({:tag :br, :attrs nil, :content nil} "Day 1")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content
    ({:tag :br, :attrs nil, :content nil}
     {:tag :img,
      :attrs
      {:title "",
       :alt "[image loading]",
       :style "width: 230px; height: 165px;",
       :src "http://i.imgur.com/jRLGs9z.gif"},
      :content nil}
     {:tag :br, :attrs nil, :content nil})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("Welcome to Day 1! This day ends in 48 hours at Sunday, Feb 01 9:00pm UTC (GMT+00:00). At that time, the player with the most votes gets lynched."
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Make sure to vote in the voting thread: "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476972-linux-mini-mafia-voting-thread"},
        :content ("(link)")})})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-01-30 20:58:13")})}
 {:user "IAmRobik", :message ("first")}
 {:user "marvellosity",
  :message
  (":D"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Now fish and chips")}
 {:user "Holyflare", :message ("SUP BITCHES")}
 {:user "Damdred",
  :message
  ("third bah."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I wish I had some fish and chips i'm quite hungry")}
 {:user "Damdred", :message ("dammit hf 4th now")}
 {:user "LightningStrike",
  :message
  ("It would be very funny is Marv gets scum this game. So what everyone doing right now?")}
 {:user "Damdred",
  :message
  ("i'm giving marv a prelim town read based on his smiley face!")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "yessssss"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "slowly we will integrate all americans into british linguistics and social norms")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil} "It might be a trap :O")}
 {:user "Holyflare", :message ("bitches come play voice mafia")}
 {:user "IAmRobik",
  :message
  ("Hard claiming "
   {:tag :font,
    :attrs {:style "color: blue"},
    :content ("Favored Distro")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Now you know you can trust/follow me for the rest of the game until mafia put KP on me.")}
 {:user "Eden1892", :message ("I'm voting LS for white knighting")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I never played voice mafia before tbh but I would love to play it.")}
 {:user "Eden1892",
  :message
  ("Reported"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Dci ban")}
 {:user "Chezitwo", :message ("Is Windows evil?")}
 {:user "LightningStrike",
  :message
  ("Eden what's wrong with me liking HTS? I get along with her very well that's all.")}
 {:user "Holyflare", :message ("voted damdred, vote with me!")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Omfg are you Chezinu"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lmfao")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "not sure if this is a joke or if he got defensive for no reason")}
 {:user "Damdred",
  :message
  ("Voting damdred is good especially when i'm motivated to do things."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I feel good this game and will be happy to play town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But yea the other blue named role should probably claim with robik if there is one. ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "no they shouldn't")}
 {:user "Blazinghand",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Vote Count")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Damdred (1):")}
   " Holyflare"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Not Voting (12):")}
   " Trfel, LightningStrike, Chezitwo, Damdred, IAmRobik, rsoultin, sicklucker, Half the Sky, Eden1892, Palmar, Marvellosity, Holyflare, FecalFeast"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Currently,")}
     " Damdred "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("is set to be lynched. Day 1 ends in "
       {:tag :span, :attrs {:id "bbcountdown1"}, :content nil}
       {:tag :script,
        :attrs {:type "text/javascript"},
        :content
        ("$(\"#bbcountdown1\").countdown({until: new Date(Date.UTC(2015, 02-1, 01, 21, 00, 00)), onTick: bbcountdownTick, tickInterval: 1});")}
       " at 21:00 UTC (+00:00)."
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Reminders: Votes are done in the voting thread, make sure to unvote if you want to vote someone new, and voting is mandatory-- you may not abstain.")})})}
 {:user "Damdred",
  :message
  ("Well I guess finding out the setup isn't that important. But anyway")}
 {:user "Chezitwo", :message ("What are distro's?")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Getting our 2nd blue to claim is dumb play...... ")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "the regular ones or the favored ones? The regular ones are VTs (like you). The favored ones are just VTs with names (like me)")}
 {:user "Holyflare", :message ("look at this setup fisher, lynch him")}
 {:user "Trfel",
  :message
  ("Why did Robik claim in the first place anyway?  I have no experience in this area..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm sorry, roleclaims is something I don't understand in the slightest.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I mean what are they normally?")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "GlowingBear hard claimed VT in Student V Day 1 which you just played.")}
 {:user "Damdred",
  :message
  ("Meh scum already knows what the setup is partially and robik helped them figure it out a bit more so theres that. Its not really fishing at this point. If we have a cop or doc never claim though ")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "A+. Blues claim. Nothing bad can happen from this")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil} "Do you run on Linux?")}
 {:user "Damdred",
  :message
  ("Once I did have a laptop that was Linux based but never again")}
 {:user "Eden1892",
  :message ("I'm hard claiming blue townie. Get rekt Robigooby")}
 {:user "Holyflare",
  :message ("damdred why the fuck did you leave voice")}
 {:user "LightningStrike",
  :message
  ("Ya that is bad play by Robik hard claiming a named VT without any pressure at all. It going to allow Scum to PoE on who is the 2nd blue.")}
 {:user "LightningStrike",
  :message
  ("Okay why did both of our blues claim or is Eden joking around?")}
 {:user "IAmRobik",
  :message
  ("Eden, I have some good/bad news for you."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Which do you want to hear first?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "And the reason for that is to generate discussion."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not sure if that is Robik's intent here.  If it is, then my talking about it is good.  If it isn't, it would be nice to know the real reason for why he did this?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I guess, I would think that feeding the mafia a free blue role (even if it is just a named VT) would not offset the benefits of his claim.  In fact, I'm not really convinced that he is town.  Should I be?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "aladeen news")}
 {:user "Damdred",
  :message
  ("I am having to go to work for a bit I should be able to make it back for voice in a bit though."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also people put way to much emphasis on blue play, and if they are claiming named VT or the blue VT it helps narrow down the setup for everyone which scum already knows anyway meh.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Because I'm really good at this game and if we lynch who I want to d1, we'll be down to 1 mafia in no time")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "?")}
 {:user "Damdred",
  :message
  ("Scum will know the setup PARTIALLY by know there own makeup, and when robik claimed they were able to figure out and if edens claim is true they pretty much know it at this point.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "If you are this good at the game, can't you get us to follow you without claiming first?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "dis guy knows what mafia get when it doesn't even say that in op"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "ggggggggg")}
 {:user "Holyflare", :message ("best vote")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Nah...people barely follow what I say even when I'm confirmed cop.")}
 {:user "IAmRobik", :message ("Eden.......")}
 {:user "IAmRobik", :message ("EDEN")}
 {:user "Damdred",
  :message
  ("Oh my god let me explain the setup talk"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "A) 1 That One Program, 1 Proprietary, Intermittently-Functional Driver, 1 OS X, 1 tar, 1 | grep, 8 Linux Distros"
   {:tag :br, :attrs nil, :content nil}
   "B) 2 That One Programs, 1 Proprietary, Intermittently-Functional Driver, 1 Favored Distro, 1 tar, 8 Linux Distros"
   {:tag :br, :attrs nil, :content nil}
   "C) 2 That One Programs, 1 Proprietary, Intermittently-Functional Driver, 1 Favored Distro, 1 | grep, 8 Linux Distros"
   {:tag :br, :attrs nil, :content nil}
   "D) 1 That One Program, 1 Proprietary, Intermittently-Functional Driver, 1 OS X, 2 Favored Distros, 8 Linux Distros"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If scum has a godfather setup (A and D) and has two distros claim the setup is known that it has to be D. If they dont' have a godfather they know its between B and C. And if more than one distro claims it really doesn't matter just the doc or cop know what the setup is just as likely as the scum does at that point."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So yea even when you take in the next part you can rule out setup A for sure. Etc., just logically")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "If anybody entertained any of my posts thus far as being serious they're probably confirmed mafia for not being able to interpret sarcasm"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Except robigooby aka top town 5evr")}
 {:user "IAmRobik", :message ("No one cares Damdred")}
 {:user "IAmRobik",
  :message ({:tag :br, :attrs nil, :content nil} "Eeeeeden")}
 {:user "Damdred",
  :message
  ("Obviously they don't care and i'll get scum read for understanding how it plays out etc etc.")}
 {:user "IAmRobik",
  :message ({:tag :br, :attrs nil, :content nil} ".")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "yes so please ask for the other blue to claim so mafia know what to look for in nk's!"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you gonna lynch mafia with me this game damdy? maybe actually listen to me? "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "Eden1892",
  :message ({:tag :br, :attrs nil, :content nil} "Both bby")}
 {:user "Damdred",
  :message
  ("Of course I always lynch mafia or at least give good thoughts when I can!")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Why would he listen to you if he's scum? Why do you want scum to listen to you?")}
 {:user "Chezitwo",
  :message ({:tag :br, :attrs nil, :content nil} "How do you know?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "well no that's not exactly trueeeeee :/"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "what's changed from last game to this game to make you more motivated?")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm gonna use a play on words here...."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The good NEWS is that you won't die n1 this game....or any other night"
   {:tag :br, :attrs nil, :content nil}
   "The bad NEWS is that I'm going to put a NOOSE around your neck d1 because you've rolled mafia")}
 {:user "IAmRobik",
  :message ({:tag :br, :attrs nil, :content nil} "woman's intuition.")}
 {:user "Damdred",
  :message
  ("A few days off not playing anything, out of a game where unfortunate things happen that made me just want to say fuck mafia. Not the ongoing game obviously."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sometimes you feel meh someimtes you feel good and i'm feeling pretty good about this game.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "never a truer word spoken")}
 {:user "Damdred", :message ("Driving be back")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "because making people play against their win con because they like sheeping me is the ultimate ego boost")}
 {:user "Chezitwo",
  :message ("I have never been linuxed this fast before.")}
 {:user "marvellosity",
  :message ("HF: rough eta to properly playing the game?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "t-15 minutes")}
 {:user "IAmRobik",
  :message ("In before marv claims that he's not sheeping me")}
 {:user "IAmRobik",
  :message
  ("Also, no one called me out for my dumb tell. Kinda disappointing")}
 {:user "marvellosity",
  :message
  ("I never pay attention to anything that you say other than for entertainment value sweetie")}
 {:user "Holyflare", :message ("fucking bh and his awful op's")}
 {:user "Holyflare",
  :message
  ("1) "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Trfel"},
    :content ("Trfel")}
   {:tag :br, :attrs nil, :content nil}
   "2) "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href
     "/forum/mafia/476878-linux-mini-mafia?user=LightningStrike"},
    :content ("LightningStrike")}
   {:tag :br, :attrs nil, :content nil}
   "3) "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Chezitwo"},
    :content ("Chezitwo")}
   {:tag :br, :attrs nil, :content nil}
   "4) "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Damdred"},
    :content ("Damdred")}
   {:tag :br, :attrs nil, :content nil}
   "5) "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=IAmRobik"},
    :content ("IAmRobik")}
   {:tag :br, :attrs nil, :content nil}
   "6) "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=rsoultin"},
    :content ("rsoultin")}
   {:tag :br, :attrs nil, :content nil}
   "7) "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=sicklucker"},
    :content ("sicklucker")}
   {:tag :br, :attrs nil, :content nil}
   "8) "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Half the Sky"},
    :content ("Half the Sky")}
   {:tag :br, :attrs nil, :content nil}
   "9) "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Eden1892"},
    :content ("Eden1892")}
   {:tag :br, :attrs nil, :content nil}
   "10) "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Palmar"},
    :content ("Palmar")}
   {:tag :br, :attrs nil, :content nil}
   "11) "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=marvellosity"},
    :content ("marvellosity")}
   {:tag :br, :attrs nil, :content nil}
   "12) "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Holyflare"},
    :content ("Holyflare")}
   {:tag :br, :attrs nil, :content nil}
   "13) "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=FecalFeast"},
    :content ("FecalFeast")})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Omg. Yes. Pls keep doing this. The more you do it the less likely they shoot me for being unlynchable")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You know I'm a guy right? Every time you call me sweetie, you sound like you're gay. YGOS?")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "hahahaha -- someone else in this game (might even be me) just mentioned that to him")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "can't tell if srs")}
 {:user "Chezitwo", :message ("marvellosity, are you happy?")}
 {:user "marvellosity", :message ("lol. yes, i am")}
 {:user "Chezitwo", :message ("If you are happy, I am happy.")}
 {:user "Holyflare", :message ("why didn't you ask if i'm happy?")}
 {:user "marvellosity", :message ("well that's me pocketed")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "CHEZITWO HAS AN INNO CHECK ON MARV! But that'd be impossible since he's VT. Shit."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "OK, must reconsider"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "HF,"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "No one cares if you're happy."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sincerely,"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The other 12 players in this game")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Because I do not know what your happiness means to me.")}
 {:user "Holyflare", :message (":'(")}
 {:user "IAmRobik",
  :message
  ("Marv, if you had sexual feelings for members of a mafia game, would you have a huge town-boner for chezitwo?")}
 {:user "marvellosity", :message ("not particularly. but i like him")}
 {:user "Eden1892", :message ("But what if marv were sad, Chez?")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "He would have to install a new operating system.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Is it weird adjusting to being town after a few scum games? Is it like a bike where you can just instantly post again, or is it something that you have to relearn, like a language")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I had Void... but it was snatched from me.")}
 {:user "Holyflare",
  :message
  ("super serious time"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "trying to get blues to claim"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "but then says setup isn't important"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "still talks about setup and repeats the same thing"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "explains the same thing AGAIN"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "AND AGAIN!!! :O"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "then he lies right to my face!"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "bro is totally mafia cz role fishing and over explanation after he said it wasn't important at all"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content ({:tag :br, :attrs nil, :content nil} "##vote damdred")})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "fucking geript... we all had void")}
 {:user "marvellosity",
  :message ("it's still going on dear, be quiet")}
 {:user "Holyflare",
  :message
  ("i have to filter myself to filter other people because i cba to type their names")}
 {:user "Blazinghand",
  :message
  ({:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("Warning: Do not discuss ongoing games outside the appropriate threads.")})})}
 {:user "Holyflare", :message ("why aren't you guys voting damdred")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "We won the war for you, and you still blame us for stupid shit....fucking sigh")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Wat. Setup spec isn't role fishing bruh. I didn't think he was actually role fishing ")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Cause your case revolves around him talking about the setup, and while his posts aren't useful, they're not scummy.")}
 {:user "marvellosity",
  :message ("it is an amazingly bad case. it's kinda cute.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "he totally fished for roles until i said not to and then went onto setup speculation after saying it was bad and then continued to talk about it after saying it was bad"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "vote him")}
 {:user "Holyflare",
  :message ("well you're all amazingly boring people")}
 {:user "marvellosity", :message ("<3")}
 {:user "Holyflare",
  :message ("dat sl guy posting in void without saying hi here")}
 {:user "Chezitwo",
  :message
  ("Distro may refer to:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Linux distribution, a specific vendor's package of the GNU/Linux operating system"
   {:tag :br, :attrs nil, :content nil}
   "Software distro, a set of software components (i.e. open source components) assembled into a working whole and distributed to a user community."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I wonder if we are different distros or all the same. Having 8 identical distros is probably not useful."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Can we be edited? Can evil programs take over functions? Oh goodness!")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ive taught you well. Btw this player list is my favorite yet")}
 {:user "Fecalfeast", :message ("Oh right, games. Sup.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Do you think this post makes LS likely to be a linux user?")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "When I first started here, I would say setup speculation was really scummy. But then I realized that most TLers suck at mafia, so I can see why they would default to talking about shit that doesn't matter")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I kind of do you screwed us over")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Why haven't you called me town yet?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "not my most favourite most improved player that I voted for, he would never ever betray me like that")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "No...Literally nobody cares about his setup discussion, aside from HF who wants to lynch him for it......Also, I didn't screw anyone over; but please elaborate on how I \"screwed us over\"")}
 {:user "Fecalfeast",
  :message
  ("So I am thinking scum!damdred wouldn't talk about scum strategy in thread, what's the point as scum to talk about what scum knows and needs to confirm in thread? The over-explaination doesn't feel scummy to me idk")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "we could form a server or just be all on a lan and unite i'm sure our processing power together could defeat a crappy mac os")}
 {:user "IAmRobik",
  :message ({:tag :br, :attrs nil, :content nil} "I wanna lynch you")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "that's exactly what scum damdred wants you to think")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You mean I post in the more ergent game over a game that just started 10 minutes ago?!! Your fascination with people posting more in another game that you use everygame is so unwarranted. If your in the final 5 of another game your probably gonna give it your attention first")}
 {:user "Holyflare", :message ("wow that over reaction or what")}
 {:user "IAmRobik",
  :message ("STOP TALKING ABOUT OTHER GAMES BITCHES")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If linux is town yes. Ive never bothered to read the op yet")}
 {:user "IAmRobik", :message ("SL, why haven't you TR'd me yet")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "No shit its a really bad scum read. And if I was in thread first I would have done the same thing as dandred")}
 {:user "IAmRobik",
  :message ("I think the mod fucked up and rolled too many scum.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "If Robik is an OSX user, how does claiming a favored linux help them PoE other strong linuxes?")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Because you did a really dumb thing and im pissed at you. ")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I have no idea why you think this makes sense, so I'm gonna shitpost with this hilarious Vine instead of responding."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :iframe,
    :attrs
    {:allowfullscreen "1",
     :frameborder "0",
     :src "https://www.youtube.com/embed/-O2g7gqt-00",
     :height "315",
     :width "500",
     :type "text/html",
     :class "youtube-player"},
    :content nil})}
 {:user "Holyflare",
  :message
  ("love those thug life videos, always hilarious"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "also vote sl because he's stupidly angry at people he should be town reading??? \"you do this every game wtf bla bla bla\" overreaction and the \"i'm so pissed\" crap about robik when it really doesn't matter if he claimed or not?")}
 {:user "Eden1892",
  :message
  ("I really love that one because it's happened to me before."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I played it off like I just heard \"pass the salt\" but I don't think they bought it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That sl thing is weird. Probably warrants looking into yeah. sl why so mad? pass the salt daddy lucker")}
 {:user "sicklucker",
  :message
  ("Robik is totally looking town. He just doesint deserve it. When I get townread I dont help mafia in the process.")}
 {:user "Eden1892",
  :message
  ("Back to "
   {:tag :s, :attrs nil, :content ("Deus Ex: Human Revolution before")}
   " work")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Robik sucks for claiming blue instead of letting a weaker townie fakeclaim blue to help POE the game"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That's why I counterclaimed him")}
 {:user "Holyflare",
  :message
  ("wow holy shit this guy is salty for no reason"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 612px; height: 612px;",
     :src
     "http://sayhellovam.com/wp-content/uploads/2014/05/Dont-Be-Salty.jpg"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "FUCK YOU FOR BEING TOWNY ROBIK GODDDDDDDDD")}
 {:user "LightningStrike",
  :message
  ("sicklucker did this the last time he played with me when he was town at New Years Eve Party Mini Mafia.")}
 {:user "Fecalfeast",
  :message
  ("Game's been going for longer than 10 minutes and SL has less than 1 page of filter"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("##vote sicklucker")})}
 {:user "Holyflare",
  :message
  ("also how can bh warn us in the thread but still not update his op with filter links ~_~"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "zzzzzzzzzzzzzzzzzzzzzz")}
 {:user "LightningStrike",
  :message
  ("Fecalfeast just because he have less than a 1 page filter doesn't make him scum............")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil} "Holyflare do you main Fox?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "did what exactly? this is important")}
 {:user "Eden1892",
  :message ({:tag :br, :attrs nil, :content nil} "A++")}
 {:user "Fecalfeast",
  :message ({:tag :br, :attrs nil, :content nil} "Does too")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "this guy is taking this game "
   {:tag :i, :attrs nil, :content ("way")}
   " too seriously rn")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "He called me town and told me not to claim VT Day 1 in that game.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Why? I'm now confirmed town. People can just sheep the shit out of me to victory. Not to mention, I have the longest filter in the game, which is the opposite of the game we just played where all you did was desire my head. JUSTIFY YOURSELF."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also tell me how I \"fucked us up\"")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "this is completely different to what he's doing here"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "vote him")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "He had the same intention this game and that I am thinking he's town.")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I never called you town. You just claimed day 1 games 4 days inarow. Here robiks doing it. Its a really really bad play and my meta says I always try to stop people from doing it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So scum reading me for not liking what robik did is actually retarded")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil} "\"your meta says\"...?")}
 {:user "Damdred",
  :message
  ("HF I'm glad I have a town read on you this early usually I am super suspicious of you But I like you so far. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "At work so will be hit and miss. Rob is obvious town, I'm a bit confused why people would defend me for setup talk. I think it's really scummy what I did partially, I am right in what I'm saying but set up is super safe to talk about so ff,  Eden are on my radar and Sl is as well")}
 {:user "IAmRobik",
  :message
  ("HOW THE FUCK ARE THERE SO MANY SCUMMY PEOPLE."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: red"},
      :content
      ("TOWNIES, PLEASE ACT TOWN INSTEAD OF ACTING LIKE SCUM....IT'S REALLY DIFFICULT TO FIGURE OUT THE GAME IF YOU'RE JUST GONNA BE SCUMMY THE WHOLE FUCKING TIME")})})}
 {:user "sicklucker",
  :message
  ("Like I just got an early Ls town read. Ls barely ever give strong reads. You should listen to him")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 360px; height: 240px;",
     :src "http://s.hswstatic.com/gif/sweat-salty-foods-1.jpg"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil} "but, but they'll n1 me.")}
 {:user "Eden1892",
  :message ("i just want to play one game and get to d2. just one")}
 {:user "Eden1892",
  :message
  ("hell i can't even count on marv and hf to get nk'd first because i died 1st in imperial with them in it")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "The last time you did you were scum :O")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "i know"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i want to get to d2 as town"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "my d1 isn't good and i always die anyway")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "if it's any consolation, you were just a medic dodge in Imperial")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 288px; height: 288px;",
     :src
     "http://www.okdani.com/wp-content/uploads/2014/01/ooooh-disbelief.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "fightin"
   {:tag :br, :attrs nil, :content nil}
   "words")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i wasn't even in that game")}
 {:user "Holyflare", :message ("and marv was mafia lol?")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "and i was mafia"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "lol")}
 {:user "marvellosity", :message ("eden you're such a noob.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "HAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHHAHAHAHAHAHAHA")}
 {:user "sicklucker",
  :message
  ("Guys marv posted"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :a,
    :attrs
    {:onclick "return toggleShowSpoiler2(this, 1)",
     :title "",
     :href "#",
     :style
     "text-decoration:none;font-family:monospace;color:#808080"},
    :content
    ({:tag :span, :attrs nil, :content ("+ Show")}
     " Spoiler"
     {:tag :span, :attrs nil, :content (" +")})}
   {:tag :div,
    :attrs
    {:style
     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
     :id "spoiler_1"},
    :content
    ({:tag :div,
      :attrs {:class "forummsg"},
      :content ("He might be town guys")})})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil} "put me in ur power ranks")}
 {:user "LightningStrike",
  :message ({:tag :br, :attrs nil, :content nil} "Yes.")}
 {:user "Holyflare", :message ("so when are we gonna vote sl?")}
 {:user "marvellosity", :message ("not now")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil} "sure. he dodged my question")}
 {:user "sicklucker", :message ("Not ever")}
 {:user "Eden1892", :message ("wait no he didnt im retarded LOL")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil} "Can I be something too?")}
 {:user "LightningStrike",
  :message ({:tag :br, :attrs nil, :content nil} "Never.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I would say \"helpful at some stage\" but I fear I'd be pushing my luck")}
 {:user "Eden1892",
  :message ({:tag :br, :attrs nil, :content nil} "become Chethreezu")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This is a absolutely terrible read. The only time ive rolled mafia mspaint. I froze up and had a 2-4 page filter day1. Dandred/chezina my mafia partners can verify this. I was super afraid to post early in that game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I want to scum read ff for it since he was in that game. But he just puts scum on me everygame and im always town. The one time I was mafia he actually laid off me."
   {:tag :br, :attrs nil, :content nil})}
 {:user "sicklucker",
  :message
  ("Oh wait thats not even chez who the hell is this imposter!")}
 {:user "Damdred",
  :message
  ("I'm voting Sl now. Sl is never scared to post, and this just sends me into bs heaven. ")}
 {:user "marvellosity",
  :message
  ("I love that BH does a votecount after 1 vote"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "but doesn't put filters in OP"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "such hosting"
   {:tag :br, :attrs nil, :content nil}
   "wow")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Did you play with a game when he was scum?")}
 {:user "sicklucker",
  :message
  ("Im not afraid to post as mafia. I never said I was all the time. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "but day 1 in my last mafia game I was and ff was in it. So its a bad read. and you should remember how bad I was day1")}
 {:user "Damdred", :message ("YES he was my Scum partner!")}
 {:user "sicklucker",
  :message
  ("And we both played so bad day 1 we had to bus each other day2")}
 {:user "sicklucker", :message ("Palmers going to be mad at me")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "why is that?")}
 {:user "Damdred",
  :message
  ("Here's what I'm really not liking about Sl right now. Instead of coming into the thread carefree like he normally would laugh this off and find something interesting to talk about."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He instead is overly defensive and downplays his game by giving months old examples when it's just not the case. His co as ching is the exact opposite, and he was so scared of posting early that game he had a rather large d1 filter."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sl is Scum get on him")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "that's exactly what i've already said :O")}
 {:user "Eden1892",
  :message
  ("now this i can sheep"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("vote sicklucker")})}
 {:user "Eden1892",
  :message
  ("but not completely."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "sicklucker why do you seem so mad? I did ask you this before and while you answered most of the thought behind it, I still don't get the frustrated entrance.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "how does this even make sense, you're sheeping us because you think he's mad and voting him but you are now asking him why he's mad which makes the reason you're sheeping us entirely redundant?????")}
 {:user "Blazinghand",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Vote Count")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("sicklucker (3):")}
   " Holyflare, Damdred, Eden1892"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Not Voting (9):")}
   " Trfel, LightningStrike, Chezitwo, IAmRobik, rsoultin, sicklucker, Half the Sky, Palmar, Marvellosity, Holyflare, FecalFeast"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Currently,")}
     " sicklucker "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("is set to be lynched. Day 1 ends in "
       {:tag :span, :attrs {:id "bbcountdown1"}, :content nil}
       {:tag :script,
        :attrs {:type "text/javascript"},
        :content
        ("$(\"#bbcountdown1\").countdown({until: new Date(Date.UTC(2015, 02-1, 01, 21, 00, 00)), onTick: bbcountdownTick, tickInterval: 1});")}
       " at 21:00 UTC (+00:00)."
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Reminders: Votes are done in the voting thread "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476972-linux-mini-mafia-voting-thread"},
        :content ("(link)")}
       ". Make sure to unvote if you want to vote someone new. Voting is mandatory-- you may not abstain.")})})}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("##vote: damdred")})}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "just not feelin it "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You can't just vote people for no reason so why are you voting Damdred?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "huuuuh? are you disagreeing with blatant fact now?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "1) i can"
   {:tag :br, :attrs nil, :content nil}
   "2) my reasoning doesn't matter because it won't make sense to anyone but me")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "so what you're basically saying is that my case was 100% legitimate ")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm saying that I don't like the formatting of his post. There's no reason that the first paragraph should be disconnected frmo the second paragraph and I find that scummy. ")}
 {:user "Fecalfeast",
  :message
  ("SL if you'll notice I didn't even use the vote thread but you're getting upset at my joke post anyway....")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   ".... right so \"yes\"")}
 {:user "Holyflare",
  :message ("i'm like 1000000% sure sl is mafia btw")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I thought you were happy? Why the sad face?")}
 {:user "Holyflare",
  :message
  ("so anyone avoiding him or not voting him is auto mafia or silly")}
 {:user "marvellosity", :message ("I do love being silly.")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "With odds like that how can I lose?!")}
 {:user "Palmar", :message ("Hi guys ))))))))")}
 {:user "Damdred",
  :message
  ("Lol ok robik, I put my post in a more readable form because I was phone posting but that's ok."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also if you look at metal mafia where Sl was town and in two games and people brought up his weirdness he wasn't overly defensive like he is here and pointing at his old Scum game. He was super involved proving he was towny the opposite here")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Hi what you think of the openings so far?")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I think LightningStrike is linux software.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Literally not read a single post except this one. I'm going to ctrl+f for my name though, so I might read posts where people mention me.")}
 {:user "Chezitwo",
  :message
  ("Palmar"
   {:tag :br, :attrs nil, :content nil}
   "Palmar Palmar Palmar Palmar Palmar Palmar Palmar Palmar Palmar ")}
 {:user "Palmar",
  :message
  ("oh nobody mentioned me."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Back to civ then.")}
 {:user "Artanis[Xp]",
  :message
  ({:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "LightningStrike",
  :message
  ("Artanis what you think of the game so far?"
   {:tag :br, :attrs nil, :content nil}
   "Palmar filter sicklucker and tell me what you think of him?")}
 {:user "LightningStrike",
  :message ("Wait Artanis isn't even in the game ignore me Artanis.")}
 {:user "Holyflare",
  :message
  ({:tag :div,
    :attrs {:style "text-align:center"},
    :content ("palmar")}
   "palmar"
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ("palmar")}
   "palmar"
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ("palmar")}
   "palmar"
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ("palmar")}
   "palmar"
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ("palmar")}
   "palmar"
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ("palmar")}
   "palmarpalmarpalmarpalmarpalmarpalmarpalmarpalmarpalmarpalmar"
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ("palmar")}
   "palmar"
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ("palmar")}
   "palmar"
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ("palmar")}
   "palmar"
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ("palmar")}
   "palmar"
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ("palmar")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil})}
 {:user "Fecalfeast", :message ({:tag :br, :attrs nil, :content nil})}
 {:user "Holyflare",
  :message ("that was way harder than it should have been")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Do you also have a question for Palmar? How exciting!")}
 {:user "marvellosity",
  :message
  ("we could just kill him. that's more fun than spamming his name")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil} "this makes me smile")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you should already know sl is confirmed mafia so like you are too and stuff")}
 {:user "marvellosity", :message ("uh huh.")}
 {:user "Holyflare",
  :message ("maybe you should re-read his filter and then vote him")}
 {:user "marvellosity",
  :message ("why don't you show me what i'm looking for?")}
 {:user "Holyflare", :message ("i can't but you should read it")}
 {:user "marvellosity",
  :message ("you're drawing conclusions that you shouldn't be.")}
 {:user "Holyflare",
  :message ("well whatever i'll show it at some point")}
 {:user "marvellosity",
  :message
  ("i know, but i don't think you're drawing the right conclusion"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i mean, sure he might be mafia, but i don't agree with your logical progression.")}
 {:user "Holyflare",
  :message
  ("well it has nothing to do with what i've been saying i'm scum reading him for it's something completely different now but the saltyness helps it along")}
 {:user "marvellosity", :message ("i know dumbo")}
 {:user "marvellosity", :message ("you know i'm clever right? lol")}
 {:user "marvellosity",
  :message
  ("this conversation must be enlightening to everyone else :d")}
 {:user "Holyflare",
  :message
  ("probably but yeh i re-read it and i might be reading too much into it but whatever")}
 {:user "marvellosity",
  :message ("at least, i think it makes you town...")}
 {:user "Holyflare",
  :message ("dislike when people play multiple games")}
 {:user "marvellosity",
  :message
  ("anyway, i stand by my kill Palmar stance."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "excellent stance.")}
 {:user "Holyflare", :message ("not an awful stance no")}
 {:user "Chezitwo",
  :message
  ("How does an unactivated program use the search function?")}
 {:user "Fecalfeast",
  :message
  ("A mutalisk walks in on a carrier and a battlecruiser talking about nothing and says \"HHHAAAAUUUGHH\"")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :onclick "window.open(this.src)",
     :style "width: 736px; height: 414px; border:1px solid yellow",
     :src "http://i.imgur.com/mI6lDRW.png"},
    :content nil})}
 {:user "Chezitwo",
  :message ("You don't understand! That is an activated program.")}
 {:user "Holyflare", :message ("if you log out it's the same")}
 {:user "sicklucker",
  :message
  ("Like im confirmed town if you know ls's meta. The only scum read on me that makes sense is dandred and its just out of fear")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "?????????????????????? damdred's scum read on you is nothing about fear at all ????????????????????? and how does ls' meta make you confirmed town in the slightest regardless of his alignment")}
 {:user "sicklucker",
  :message
  ("Hf why do you scum read me I dont actually understand yours. And edens is weird too. Hes like HES MAD SO HES MAFIA? If I was mafia I would be super happy robik claimed")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "if damdred's reason for scum reading you makes sense and he copied my original scum read on you (not the later stuff) then why does MY scum read on you not make sense at all???????? Eden's is ALSO THE SAME AS DAMDRED'S but he has some super sketchy actions about it.")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Care to explain this post for the feeble minded?")}
 {:user "Holyflare", :message ({:tag :br, :attrs nil, :content nil})}
 {:user "Chezitwo",
  :message
  ({:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=Fecalfeast"},
    :content ({:tag :b, :attrs nil, :content ("##Vote Fecalfeast")})}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "So where's your reason, chez?")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "My reason for my vote is linked."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "As for LS, malicious software does not attack the strongest software backed by other subsystems; it seeks out the weak links to penetrate and defile.")}
 {:user "Blazinghand",
  :message
  ({:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("Do not discuss games in progress except in the appropriate threads for those games. There will be no further warnings on this subject.")})})}
 {:user "Fecalfeast",
  :message
  ("Oh your reason is that I haven't done anything yet I can understand that.")}
 {:user "Fecalfeast",
  :message
  ("Just to be clear, you're going with me over a lurker because I have made useless posts rather than not posting at all, correct?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So sheeping HF and posting garbage is \"seeking out weak links to penetrate and defile?\"")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "si"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The most sinister type of software is that which does not care about finding malicious software. They must be eradicated!")}
 {:user "Fecalfeast",
  :message
  ("So the simple calculator or alarm clock programs are truly evil? You would purge your system of benign files just because they aren't helping purge your system of malicious software? It almost seems to me like you've found a weak link and are trying to penetrate and/or defile me.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "No! We are talking about 13 specific programs. There are no calculators or alarm clocks here.")}
 {:user "Fecalfeast",
  :message
  ("I am not a program, though, I am a distro like DamnSmallLinux or something, I may not be very powerful or useful but, hey, I can be installed to and run from a stick of ram in a 2005 laptop!")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ls never gives reads hes always wissywashy even as town. He gave a great read so were both town")}
 {:user "rsoultin",
  :message
  ("@.@"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I did not expect to return to a game already started. This is going to have to wait until I get the schoolwork I've been procrastinating on done. Will try to get involved tonight after that's out of the way. Lol, BH, springing the game on people xP")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "it doesn't mean anything at all for your alignment"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "why do you keep saying it does?")}
 {:user "sicklucker",
  :message
  ("I always try to convince people im town nothing new here. The important part is that Ls is confirmed town. Hes usually pretty hard to figure out so im quite happy the way things are going. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "These guys are almost always town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Marv"
   {:tag :br, :attrs nil, :content nil}
   "Robik"
   {:tag :br, :attrs nil, :content nil}
   "Ls"
   {:tag :br, :attrs nil, :content nil}
   "Dandred"
   {:tag :br, :attrs nil, :content nil})}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Metal I was barely trying because I was in mylo as mafia in another game or something like that. Either way I remember I was not motivated in that game and in another one."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Look at pick your protoss mafia. I spent the whole last day convincing them I was town. It worked and mafia conceded")}
 {:user "sicklucker",
  :message
  ("Also in void. Also in two newbie games I played a huge portion of day 1 was about me being scum. This is why I said sorry palmer. Hes right I do spam and take too much attention. ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I have no idea how you have come to this list in the slightest and especially not included me when every individual in that list has done what i've done")}
 {:user "LightningStrike",
  :message
  ("I'm back and welcome to the game Rsoultin can you give me your reads and thoughts when you got time?")}
 {:user "Holyflare",
  :message ("why the fuck are you ignoring everything i write sl")}
 {:user "Holyflare",
  :message
  ("I fail to see how a sl that policy lynches marv because he's \"great at scum\" day 1 decides to town read marv when marv has done...? not much imo"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "the rest of his list is like wtf other than the robik who literally claimed blue"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "his ls read is because he's not being wishy washy when he's usually wishy washy as town.....................? what"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "no idea where batsnacks read is from")}
 {:user "Damdred",
  :message
  ("Why is Sl giving LS such a hard town read for play that's againdt his usual meta? LS is different but Sl sounds like tmi")}
 {:user "Damdred",
  :message
  ("I keep parroting hf it's kinda annoying posting at work blah")}
 {:user "sicklucker",
  :message
  ("I always kind of ignore you hf. I dont think ls gives strong reads as mafia and his read is true. And he certainly doesint try to defend me so early. ")}
 {:user "sicklucker",
  :message
  ("Like I dont think Ls can fake this read if hes mafia (sorry)")}
 {:user "Damdred",
  :message
  ("I don't get how you can all ls read on you strong really. Its sorta weird in all actuality, at that point you shouldn't of been town read at all and you even told ls he was wrong. So you think ls can't fake the read he gave?")}
 {:user "Damdred",
  :message
  ("Let alone that you accepted it at face value and called him totes town. It just seems off yo me. ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you literally just dodged everything i said to tell me that you normally ignore me which is everything i already knew... respond to the post???")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "and yes this")}
 {:user "sicklucker",
  :message
  ("No he cant. I called out Ls for claiming vt everygame IN THE GAME YOU HOSTED. When Im angry at robik for claiming and he town reads me for it I know hes in a town mindset."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If the reads good or not is not the point. Its a town read from a town. Ls is town maybe im not town from his read alone but ls is hes trying to solve the game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ls solves people from meta thats all he does. If I do something in game1 and im town and I do it in game2  he calls me town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It doesint matter if the reads good or not (its right so it is good) ")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "what post?")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Oh this post. You were not in the game but marvs scum strategy last game was the not post. So just him posting holds alot of value. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Last time I pressured marv he ragequit or something. I dont really want to do that again hes a good player")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I SAID IT 9 TIMES THAT WAS A POLICY PRESURE NOT A POLICY VOTE. I pressured him he claimed town and we moved on")}
 {:user "Blazinghand",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Vote Count")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("sicklucker (4):")}
   " Holyflare, Damdred, Eden1892, Fecalfeast"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Damdred (1):")}
   " IAmRobik"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Palmar (1):")}
   " marvellosity"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("FecalFeast (1):")}
   " Chezitwo"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Not Voting (6):")}
   " Trfel, LightningStrike, rsoultin, sicklucker, Half the Sky, Palmar"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Currently,")}
     " sicklucker "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("is set to be lynched. Day 1 ends in "
       {:tag :span, :attrs {:id "bbcountdown1"}, :content nil}
       {:tag :script,
        :attrs {:type "text/javascript"},
        :content
        ("$(\"#bbcountdown1\").countdown({until: new Date(Date.UTC(2015, 02-1, 01, 21, 00, 00)), onTick: bbcountdownTick, tickInterval: 1});")}
       " at 21:00 UTC (+00:00)."
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Reminders: Votes are done in the voting thread "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476972-linux-mini-mafia-voting-thread"},
        :content ("(link)")}
       ". Make sure to unvote if you want to vote someone new. Voting is mandatory-- you may not abstain.")})})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "right but the whole reason you \"policy pressured\" him is because he fooled you as scum by posting a lot and now he's in your almost always town list despite posting not much at all?????? like so what he didn't post as mafia last game it doesn't mean he's incapable of posting as mafia ever especially as your whole reason for the policy pressure to begin with was because he CAN fool you as mafia!??!?!?!"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "not to mention you didn't even comment on damdred being there at all, if it's because of his vote on you then it shouldn't be because he said that reasoning after me so it wasn't an original thought - or at least it might have been to him - and eden also has the same vote logic but only damdred is in this list"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "why?")}
 {:user "Half the Sky",
  :message
  ("So as acknowledged in another game I'm playing, we stepped out for a date right as this game started otherwise I'd have jumped in with you for the start. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm home now, and as such, I am catching up in the wee hours here, and will share any thoughts I have before I crash <3 ")}
 {:user "Holyflare",
  :message ("goddd you're not even drunk what kind of date was that")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "this bastard has been on ts for 4 hours and has been playing civ 5 instead of giving a crap about this game as usual")}
 {:user "Damdred",
  :message
  ("Thankfully I'm home so I can ninja hf instead of other way around."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "LS isn't trying to solve the game AND he's playing against how he plays town, usually he has three town reads at least by meta. Even his meta on you is super weak by ls standards so I'm not sure why you give him a free pass so early and so hard."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eh, I'm pretty tipsy actually. But not totally falling over, Holyflare. ")}
 {:user "Holyflare", :message ("where'd you go :o!")}
 {:user "Holyflare",
  :message
  ("i was supposed to go out to piccadilly institute and shit but that place is far too expensive "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Half the Sky",
  :message
  ("Alright, gave the last 15 pages a look. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I need to look harder at SL/HF convo, but on my first read: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "(those not listed, just assume null for now)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "LS - for now appears town, given his exp with blue roles and in games where there have been multiple claims. Had claimed in Student V prematurely so comments appear genuine. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Damdred - explaining the setup, eh, I could go either way on this. Especially since there is the possibility of modifications as Chez pointed out. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I've seen people misunderstand mechanics, at least in my student games. His enthusiasm itself should not be scum read - I know where he's coming from having been in the two games (well hosted one of them) he's just come out of them. He's being genuine. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden - seemed just as sarcastic as he was in Hammertime, he seems carefree enough that he's town, even if this is a weak read. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Robik - definite town, don't agree with the claim so early, but I do see why I did it. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sicklucker - had the exact same impression as Damdred, is appearing quite defensive and more serious than I'm used to seeing him. Granted he's in another game, so I'm not sure whether this is part of the issue. I can also related I was also doubled up in Newbie LX (as scum in that game) and was frazzled in my second game (NYE Party) as a result, trying to skate by on the bare minimum eventually. So to me, it's quite feasible he could be feeling the same way."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Marv - tone read is coming off the same way he was in Void, not doing much yet, but can't really read him either way at the moment. ")}
 {:user "Fecalfeast", :message ("What dilly would you have picked?")}
 {:user "Holyflare",
  :message
  ("also damd i don't really have a problem with ls' play so far, are you saying you do? or are you just trying to put emphasis on sl being super weird?")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ah I've not been there yet. You're in London too? We went to Kettner's. They are expensive but we wanted to give it a try. ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "does nobody in this game acknowledge when I do these things first? x_X"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "also your eden read is pretty weird seeing as you're just going off of tone and not content at all, I've quoted a post twice now which I'd like you or actually anyone for that matter, to comment on:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "he's sheeping a read that but he's questioning why the person is angry and still sheeping the read that he's mafia BECAUSE he's angry? surely it should be the other way around"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Half the Sky",
  :message ("EBWOP - Haven't been to Piccadilly Institute though. ")}
 {:user "Damdred",
  :message
  ("Overall I don't have a problem with ls play at this point as he takes a bit longer to get going. But I do not think that anything he's done should get a super hard town read like SL is giving him.")}
 {:user "Half the Sky", :message ("Taking a second look, HF. ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "yeh I live in nw london"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "also that place does look expensive "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "Half the Sky",
  :message
  ("And HF, definitely for sure I understand if you or others beat me to reading or seeing something, but at the same time, for myself, I want to make sure of what I'm seeing with my own eyes. ")}
 {:user "Holyflare",
  :message
  ("I can already predict the future btw... sl will return and comment on only one post and then talk about it and some other nonsense related to it and skip over every other post completely")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "eh? since when? Usually he has nothing")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "For example in the latest student mafia game he busts out several meta reads very early a couple were paragraph length, and his meta towards you is a single sentence where you did this as town before? And he doesn't even bring a conclusion like he normally would and just forgets about it? And you let it fly?")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I never played with town HF in a forum game and never played with town marv so I can't go meta on them. Also I was serious I told HF that sicklucker done this type of behavior in New Years Eve Party mafia which you hosted. Also my Great Uncle is at the house and we took him out to eat and stuff so that's why I been mostly inactive. I getting sicklucker town this game on meta alone but I really liking Holyflare this game so far so he's in my town pile with his questioning to sicklucker. Robik is uncc'd blue so he's town but I hate his claim though since it's easier for Mafia to PoE the 2nd blue.")}
 {:user "Holyflare",
  :message
  ("hey look my sl prediction became absolutely true"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "call me fucking psychic")}
 {:user "Half the Sky",
  :message
  ("Alright, HF, I see what you're saying on Eden. It was a sheep vote too, I could understand if he was the first one scumreading SL. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He should have unvoted IMO. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden's sarcasm threw me off, and I just know that in Hammertime, he was fairly sarcastic much of D1, and it took me a bit of time to figure out when he was going to start playing that game, and others had scumread him for his sarcasm (wrongly). ")}
 {:user "Holyflare", :message ({:tag :br, :attrs nil, :content nil})}
 {:user "Half the Sky",
  :message
  ("Also adding HF to my town list as well. Questioning and the pushing piece by piece is what I'm used to seeing. ")}
 {:user "Fecalfeast",
  :message
  ("Can I just be your hype man this game HF? I'll stand behind you looking tough and intimidating while sporadically interjecting with generic agreements.")}
 {:user "Half the Sky",
  :message
  ("Sidenote: Not sure why Palmar cba to play yet. Surely this must be more interesting than Civ. ")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Sometimes Palmar likes to be lazy as either alignment so it not worth looking into it.")}
 {:user "Damdred",
  :message
  ("People Who I would Lynch:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "SL"
   {:tag :br, :attrs nil, :content nil}
   "Eden"
   {:tag :br, :attrs nil, :content nil}
   "Trfel"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "LS also I disagree that it is the same as New Years with how SL reacted. Anyway I gotta go for a little bit")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "was he right tho? word length matters how? Its the context that matters")}
 {:user "Half the Sky",
  :message
  ("Too much discussion on meta is making my head spin...damn you SL. ")}
 {:user "Half the Sky",
  :message
  ("One more additional note on Eden, in his town game, he was spamming the crap out of the thread. Was top town read (and flipped town when NKed). Not sure if Eden's a type of person to do this all the time, and not sure why he'd be so apprehensive on being the night kill given the way others are playing. I'd think that's all WIFOM anyhow. ")}
 {:user "Trfel",
  :message
  ("Ok I just got Microsoft Word installed, going through the thread and taking notes now.  Feel free to ask me questions, though I reserve the right to delay my answer until I am completely caught up (I am slow, this could take a while).")}
 {:user "sicklucker",
  :message
  ("Edens scum because hes calling me salty about the robik thing while calling me mafia. If im mafia im not salty I would acualy be quite happy about . Therefor I propose that eden is certainly scum."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-01-31 06:37:59")})}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not hard town reading LS, but nothing weird is jumping out at me with LS yet. Play seems similar to Newbie play here at least from what I've read so far. ")}
 {:user "Half the Sky",
  :message
  ("EBWOP - I am townreading LS, but I wouldn't be like \"definite top town\"")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sicklucker, why are you talking in absolutes? ")}
 {:user "Half the Sky",
  :message
  ("Re-read pages 17-20. I can see where the question dodging is coming from. I don't like how he ignored this one in particularly since it points to a double standard. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "There were a few others on page 17-18 I think he missed too....")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Marvs posted quite abit. Hes also pushing palmer. SCUM MARV WOULD NEVER PUSH PALMER D1 ")}
 {:user "Onegu",
  :message
  ({:tag :font,
    :attrs {:style "color: blue"},
    :content
    ({:tag :b,
      :attrs nil,
      :content
      (" Again no talking about ongoing games even if the player has flipped in that game.")})})}
 {:user "sicklucker",
  :message
  ("Me town reading dandred is kind of ogi cant really explain it yet.")}
 {:user "sicklucker",
  :message
  ("Hf has spammed me for questions in repeated games. Im not his puppet ill answer them. But on my own time")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What are you talking about? Two page filter for Marv, mostly one-liners, no interaction between the two, the only post on Palmar is this: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "sicklucker",
  :message ("You just dont understand the meta between those two.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Before y'all ask me anything, I am still on this page (12). I just found it amusing that Eden caught the same thing that I did reading SLs post.")}
 {:user "Half the Sky",
  :message
  ("Alright I'm assuming Onegu's comment was directed at me. My mistake. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "SL, answering those questions on your own time is not the best way to get him to townread you. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Just saying. ")}
 {:user "sicklucker",
  :message
  ("Like mafia marv doesint want to try. He wants to put in the minimum effort. He wont push palmer day1 as scum. When he was scum recently he didnt even push palmer when he was lynched on day 5")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "History just might be repeating itself FYI...")}
 {:user "sicklucker", :message ("Scum marv is afraid of town palmer")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Never say never, especially if you're LS.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I want to respond to this, but the information I have is related to a current ongoing game....argh. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I meant never on Day 1 because sickluckers Day 1 always been horrible to play with as both alignments as I played with sicklucker on Day 1s as both alignments and it's a pain in the butt to deal with.")}
 {:user "Half the Sky",
  :message
  ("I'm just going to say this...we're 8h into D1, and it's stupid late for Marv atm...I wouldn't judge him either way quite yet. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And speaking of stupid late, it really is. It's almost 5am. I'm going to call it a night. "
   {:tag :br, :attrs nil, :content nil}
   "Will continue to crack this game when I wake up. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Good night lovelies <3")}
 {:user "Trfel",
  :message
  ("Yeah, no clue why you Europeans stay up so late XD"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Though to be fair, I often stay up so late that you guys go to sleep and wake back up and start posting before I finally sleep....")}
 {:user "LightningStrike",
  :message
  ("Same thing as HTS I going to bed now it's 11 pm for me in Texas and when I fake up I will give you my thoughts on everything after this post so cheer!")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I would. I would ride or die with marv on day 1 because hes pushing palmer. The only way there ever scum is if there mafia together."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Gnight")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I went out tonight, and I stepped out just as this game began, so I didn't want to fall much further behind tbh. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Generally I don't stay up very late at all if I am staying in. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Anyhow, off with me. ")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Forgive me (or ignore me) if you've already answered this and I just haven't gotten to it yet, but why is being able to figure out someone usually hard to figure out as town a towntell?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You basically just said \"this is different from when he is town\" ergo \"he is town\""
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   ":/")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I think we're all waiting for this one")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Were you not townreading him before? Has your read changed since then? Why? (Please quote what changed your mind.)")}
 {:user "Eden1892",
  :message
  ("Lol at people speculating about my absence or lack of followup when I explicitly said I had work coming up near the end of my posting."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm gonna catch up later but to answer HF: Calling it sheeping was a joke, I just thought you had a good point on SL being unreasonably angry/defensive and voted to add to the pressure on sicklucker to explain himself. I asked my question because I wanted to see why sicklucker was tilting."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also I am completely serious about trying not to get nightkilled n1. Across all sites I play at I've literally gone half a year since I got to see d2 as town. Meanwhile as mafia I've had to drag myself through two final 3's and a final 4. I really don't like playing mafia and I like playing town, but my current style isn't letting me get there for whatever reason, and I'm pretty pissed that I sign up for a game and only get to play 3 days of the side I want to play while dragging myself through 2+ weeks of the side I don't want to play so I'm not a completely shitty teammate. To me being mafia is a fulfillment of the social contract of the game - we can't all be town all the time, so every now and then you have to pay your dues by playing the foil. And I feel like I've gotten a raw deal lately because 80% of my play time has been as the foil."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The really maddening thing is that I don't even feel like my d1 play has been all that good in the games I've been town. It's been "
   {:tag :i, :attrs nil, :content ("okay I guess")}
   " but I never feel like I've gotten close to solving the puzzle. I could be okay with dying n1 if I caught the scumteam or even felt like I'd gotten close, but I never really did. And again with bigger names like marv and HF in the game, maybe it's silly to even worry about it, but the data says that my play style = nightkilled often, and my self-evaluation doesn't change that."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So yeah, I wanted to sandbag d1. I've deliberately made my play style the last 2 games trolly and bullshit to start day 1 so that I won't be in everyone's townpile for trying hard to kickstart things. I wanted to do the same thing here, but it's getting in the way of actually chasing my lead on sicklucker, and I'm not going to sandbag so hard that I stop actually playing the game right. If I still get nightkilled here to start off then I'll just have to try something else next game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also I'm pretty sure I didn't actually ask my question well before work, so I'm gonna try again."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "sicklucker, I remember you saying that \"your meta says\" you get upset at early roleclaims. It seemed like really weird wording, because it's almost like you were explaining yourself following directions. \"My meta says I get mad at Robik for claiming, so I got mad at him.\" Maybe I read too much into it but it seems really formulaic, almost like a checklist. Needless to say, I think that's far more likely to come from a mafia POV. What did you mean by that statement?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Requoting here for reference sake:"
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Truffle bby weren't you taking notes?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "How about the part where I said that I'm really slow?  And the part where IEM is on right now?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'll get through the thread before I go to sleep.  Just, that may be after everyone else has gone to sleep and woken up again.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "holy walltext eden o.0"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I got bored halfway through"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "got a cliffnotes version?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i.e. you not wanting to die isn't alignment-indicative (according to you)?")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I also say Ls is not capable of faking it. So when he has a correct strong read about me hes always town")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "More curious about the nonsense posting while you're \"taking notes\"."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "No worries though truffle-bby...I'm not calling you scum. Yet. "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil})}
 {:user "sicklucker",
  :message
  ("Im not reading that wall of text till later. But it sounds like a sicklucker correctly called me out as mafia rage posts")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "TL;DR I guess I get why people would be skeptical of my disdain for getting n1'd, but I really truly honestly for real do not want it to happen again, because it seems like I only ever get to actually play the side I dislike playing (mafia)")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You clearly didn't read it because there was a part explicitly addressed to you that had nothing to do with me:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also I'm pretty sure I didn't actually ask my question well before work, so I'm gonna try again."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "sicklucker, I remember you saying that \"your meta says\" you get upset at early roleclaims. It seemed like really weird wording, because it's almost like you were explaining yourself following directions. \"My meta says I get mad at Robik for claiming, so I got mad at him.\" Maybe I read too much into it but it seems really formulaic, almost like a checklist. Needless to say, I think that's far more likely to come from a mafia POV. What did you mean by that statement?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Requoting here for reference sake:"
   {:tag :br, :attrs nil, :content nil}
   "[/QUOTE]")}
 {:user "Eden1892",
  :message
  ("asdf formatting"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "w/e you get it, or should")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm not going to be 100% serious.  Shadowing Artanis showed me that there is a lot of room for fun in mafia, too.  The serious stuff is coming, don't worry.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ooookay. This makes no sense. If he has a \"correct\" strong read about you on Day 1 shouldn't you be worried he has perfect info if he never does this?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Not hard to \"fake\" a town read on someone you know is town.")}
 {:user "sicklucker",
  :message
  ("I would love to get n1ed tbh. I think I set a forum mafia record for most days without me lynched or nked. Which probably means im bad. I think ive gone 40+ days so far")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Well being lynched is lame for sure, but being nk'd... eh. It's an ego boost for a while but at some point it crosses the threshold of \"This ego boost isn't worth not being able to play the part of the game I like\" into shit-land. I'm there."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So you gonna answer my question? I even cut out the irrelevant bitching for your convenience.")}
 {:user "rsoultin",
  :message
  ("I'm bored."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I like HF this game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Still deciding on most of the rest of y'all...entertain me. Especially FF. You boring, bro."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also, HTS, but I'm thinking (read: hoping) she actually becomes interesting tomorrow."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Going to bed for once. Ciao.")}
 {:user "Fecalfeast",
  :message ({:tag :br, :attrs nil, :content nil} "fite me")}
 {:user "sicklucker",
  :message
  ("I mean I spazzed at Ls for claiming in previous games and he townread me for it which he should do. There is nothing strange about it")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Speaking of strange what do you think of this post eden."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also I accidentally edited that post but I didnt change it no mod kill "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Onegu",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Vote Count")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("sicklucker (4):")}
   " Holyflare, Damdred, Eden1892, Fecalfeast"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Damdred (1):")}
   " IAmRobik"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Palmar (1):")}
   " marvellosity"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("FecalFeast (1):")}
   " Chezitwo"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Eden1892 (1):")}
   " Sicklucker"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Not Voting (5):")}
   " Trfel, LightningStrike, rsoultin, Half the Sky, Palmar"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Currently,")}
     " sicklucker "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("is set to be lynched. Day 1 ends in "
       {:tag :span, :attrs {:id "bbcountdown1"}, :content nil}
       {:tag :script,
        :attrs {:type "text/javascript"},
        :content
        ("$(\"#bbcountdown1\").countdown({until: new Date(Date.UTC(2015, 02-1, 01, 21, 00, 00)), onTick: bbcountdownTick, tickInterval: 1});")}
       " at 21:00 UTC (+00:00)."
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Reminders: Votes are done in the voting thread "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476972-linux-mini-mafia-voting-thread"},
        :content ("(link)")}
       ". Make sure to unvote if you want to vote someone new. Voting is mandatory-- you may not abstain.")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-01-31 06:44:17")})}
 {:user "Onegu",
  :message
  ({:tag :font,
    :attrs {:style "color: blue"},
    :content
    (" "
     {:tag :b,
      :attrs nil,
      :content
      (" No editing. Next offense will result in a mod kill! ")})})}
 {:user "Eden1892",
  :message
  ("I see no issue with my reasoning. If it's your shtick as town to criticize quick role claims, and you know it is, then you're going to do it as mafia even if you're actually happy about it, because you're going to try to emulate your perception of your town behavior. You're going to do it, and because you're doing it artificially instead of naturally, it might not be a perfect facsimile of your town behavior. You might be underselling it, like you don't really care... or you might be overselling it, and become unreasonably upset about it, and unreasonably defensive when people call you on it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "In other words, exactly what I was worried about with you. Your statement that this is what \"your meta says,\" as I'm interpreting it, seems to reinforce this idea, because it indicates that you were deliberately trying to interpret your own meta on the subject, when as town you presumably wouldn't be bothered about it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think you need to answer my question now. Am I misinterpreting your statement I quoted, and if so, how? If I'm not, how else am I supposed to interpret your behavior other than \"you oversold your town proclivity to hate on blue claims because you aren't actually town\"?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Work with me here. I'm entertaining the idea of your innocence, but if you don't cooperate with me when I ask a basic and important question, you give me very little recourse to assuming your guilt.")}
 {:user "sicklucker",
  :message
  ("That entire post was just fluff I believe ive answered your qeustion")}
 {:user "Blazinghand",
  :message
  ({:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("Just in case Onegu wasn't clear:"
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Sicklucker has been warned for editing! Remember, you may not edit posts.")})})}
 {:user "Trfel",
  :message
  ("Ok, sorry, I've been really distracted with IEM and stuff.  I read through the thread twice, but not particularly in depth."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Surprised that rsoultin wasn't willing to read Eden1892's entire post.  I guess it's late, and she wasn't expecting to need to play mafia, but rsoultin seems like the player who is willing to read every word of every post."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I understand why Eden1892 says he doesn't want to play as mafia, and his town games are always so short.  And posting that isn't just a rant, it's a really good way to seem scummy and not get nightkilled (unless the mafia team is full of complete jerks and they nightkill him in pure cruelty)."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I agreed with Holyflare a lot this game.  The early pressure on Damdred, the pressure on sicklucker, and telling the other VTs not to claim."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sicklucker has been acting suspiciously this game, and I'm inclined to scumread him.  But I've always had a ton of trouble reading sicklucker.  Our playstyles are basically complete opposites, so I have a lot of trouble understanding what he is trying to do, and I often can't understand his logic.  Basically, I don't expect town!sicklucker or mafia!sicklucker would be able to answer all of the questions asked to him in ways that would satisfy me.  Hopefully sicklucker will get some time to talk about other parts of the thread more, so we can get a better read on him."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I still don't like Robik's claim, and I don't think it makes him confirmed town.  I asked a few times for an explanation, and no one really gave one, so I'll just ignore this for now.  If it comes down to this in later stages of the game, I'll take another look.  Roles, setup, and claims really aren't something I understand."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'll try to be much more active and helpful tomorrow.")}
 {:user "Palmar",
  :message
  ("hi "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil}
   "))))")}
 {:user "Palmar",
  :message
  ({:tag :b, :attrs nil, :content ("##vote sicklucker")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Policy lynch. Back to Civ now.")}
 {:user "sicklucker",
  :message
  ("Can you at least explain your policy lynch? Thats way too convenient.")}
 {:user "Fecalfeast", :message ("I'd kill palmar for sure now")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Bruh I better be x-posting with you answering my questions now.")}
 {:user "sicklucker", :message ("didnt I tho?")}
 {:user "sicklucker",
  :message
  ("Eden your not asking questions your just saying im mafia. ")}
 {:user "sicklucker",
  :message
  ("Like eden when your town you ask me actual questions like in Christmas carol. Your going into this just going YOUR MAFIA BECAUSE X AND X WHAT DO YOU THINK ABOUT THIS? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This is not what a town eden does")}
 {:user "sicklucker",
  :message
  ("Your not actually trying to figure me out. Ive played 21 questions with you in previous games this is not that.")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Like I dont understand the premise? I would probably do this as either alignment your right. I didnt think of it at the time because im not mafia. Is this all you have?")}
 {:user "Eden1892",
  :message
  ("Sigh. I don't understand what there is not to understand about my question. Maybe breaking it down will help?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What did you mean by this:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And why did you get mad at Robik for his claim?")}
 {:user "sicklucker",
  :message
  ("Because robiks not that dumb. imo he claimed so he can be lazy."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Well im talking to/about Ls and were talking about meta. Thats not a \"slip\" thats me talking about my meta")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil} "LAS (lynch all sickluckers)")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Word count: 310")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I swear to god, you just make shit up as you go along, don't you?")}
 {:user "Chezitwo",
  :message
  ("marvellosity: Do you think "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?user=FecalFeast"},
    :content ("Fecalfeast")}
   " is a distro?")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "kill Palmar")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "maybe. he's always shit and useless.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "what has that got to do with anything?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "wtf?")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Looking at his other programs... It makes me sad."
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("##Unvote")})}
 {:user "marvellosity",
  :message
  ("well atm I got nothing."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "let's kill Palmar.")}
 {:user "Palmar",
  :message
  ("No pls civ and weekend and Super Bowl tomo and various other excuses. ")}
 {:user "marvellosity", :message ("tough shit.")}
 {:user "Chezitwo", :message ("Will voting Palmar make you happy?")}
 {:user "marvellosity",
  :message
  ("last time you were lazy and begged to avoid the lynch d1 you were mafia."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "and the fact i don't really know who to push thus makes it more likely you're mafia here"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "die please")}
 {:user "Palmar", :message ("(((((((((((((((((")}
 {:user "Palmar", :message ("Okay ")}
 {:user "marvellosity",
  :message
  ("I'd say there's a better than average chance Palmar is mafia and that's not a bad hit for this stage.")}
 {:user "Palmar",
  :message ("You've got a point there. Maybe I am mafia. ")}
 {:user "Chezitwo", :message ("But does it make you happy?")}
 {:user "Palmar", :message ("I haven't read my role pm")}
 {:user "marvellosity",
  :message
  ("of course voting Palmar makes me happy"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "do you not know me at all? :<")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "now it's even more likely you're mafia, because you rage about people who do that."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Palmar is mafia"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "kill Palmar")}
 {:user "Palmar", :message ("I claim Gentoo")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("##Vote Palmar")})}
 {:user "marvellosity", :message ("lol gj.")}
 {:user "Palmar",
  :message ({:tag :br, :attrs nil, :content nil} "Wow such meta")}
 {:user "marvellosity",
  :message
  ("I'm just gonna push this all day and it'll be fantastic.")}
 {:user "Palmar", :message ("(((((((((")}
 {:user "Palmar", :message ("When is day end??")}
 {:user "marvellosity", :message ("not telling.")}
 {:user "Palmar", :message ("Pla")}
 {:user "Palmar", :message ("Ok I'm out. Good talk bros")}
 {:user "marvellosity",
  :message
  ("to the dear readers:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I have never mislynched Palmar (as town "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil}
   ")"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "ever.")}
 {:user "marvellosity", :message ("so let's kill him")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Now I'm excited about this lynch. ")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I was townreading him before. No because sicklucker always have a weird Day 1 and makes the game awkward almost all of Day 1 either through a trap or trying to coach people...... I also don't like Robik's claim but there is no counterclaim to him so he is a uncc'd blue. ")}
 {:user "Damdred",
  :message
  ("Like rob might be mafia godfather and we don't have a named vt. He's not confined at this juncture until he's nkd or useful. So you gotta look at him to."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "catching up")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lol, Day 1 no-lynch pass chez just for this post.")}
 {:user "rsoultin",
  :message
  ("I kinda agree with LS that SL is a hard read cause he's always a bit insane (though I don't understand how that translates into a townread, LS; the two of you make as much cents as a broken coke machine)."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Marv, can you explain your Palmar read a little better? I was under the impression (entirely from being a fly on the wall in earlier games) that he cba to play weekends on a regular basis. What makes this weekend special?")}
 {:user "Damdred",
  :message
  ("Edens posts are interesting, they make sense. I actually like them right now, explained himself then went to pressure sl. I probably wouldn't lynch Eden today then if he keeps this up."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I might be willing to lynch Palmar ")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :a,
    :attrs
    {:onclick "return toggleShowSpoiler2(this, 29)",
     :title "",
     :href "#",
     :style
     "text-decoration:none;font-family:monospace;color:#808080"},
    :content
    ({:tag :span, :attrs nil, :content ("+ Show")}
     " Spoiler"
     {:tag :span, :attrs nil, :content (" +")})}
   {:tag :div,
    :attrs
    {:style
     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
     :id "spoiler_29"},
    :content
    ({:tag :div,
      :attrs {:class "forummsg"},
      :content
      ("It's not a read, he has no idea if I'm mafia or not"
       {:tag :a,
        :attrs
        {:onclick "return toggleShowSpoiler2(this, 28)",
         :title "",
         :href "#",
         :style
         "text-decoration:none;font-family:monospace;color:#808080"},
        :content
        ({:tag :span, :attrs nil, :content ("+ Show")}
         " Spoiler"
         {:tag :span, :attrs nil, :content (" +")})}
       {:tag :div,
        :attrs
        {:style
         "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
         :id "spoiler_28"},
        :content
        ({:tag :div,
          :attrs {:class "forummsg"},
          :content
          ("He just wants to force me to play"
           {:tag :a,
            :attrs
            {:onclick "return toggleShowSpoiler2(this, 27)",
             :title "",
             :href "#",
             :style
             "text-decoration:none;font-family:monospace;color:#808080"},
            :content
            ({:tag :span, :attrs nil, :content ("+ Show")}
             " Spoiler"
             {:tag :span, :attrs nil, :content (" +")})}
           {:tag :div,
            :attrs
            {:style
             "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
             :id "spoiler_27"},
            :content
            ({:tag :div,
              :attrs {:class "forummsg"},
              :content
              ("well that's the most likely explanation"
               {:tag :a,
                :attrs
                {:onclick "return toggleShowSpoiler2(this, 26)",
                 :title "",
                 :href "#",
                 :style
                 "text-decoration:none;font-family:monospace;color:#808080"},
                :content
                ({:tag :span, :attrs nil, :content ("+ Show")}
                 " Spoiler"
                 {:tag :span, :attrs nil, :content (" +")})}
               {:tag :div,
                :attrs
                {:style
                 "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                 :id "spoiler_26"},
                :content
                ({:tag :div,
                  :attrs {:class "forummsg"},
                  :content
                  ("Although there could be another one"
                   {:tag :a,
                    :attrs
                    {:onclick "return toggleShowSpoiler2(this, 25)",
                     :title "",
                     :href "#",
                     :style
                     "text-decoration:none;font-family:monospace;color:#808080"},
                    :content
                    ({:tag :span, :attrs nil, :content ("+ Show")}
                     " Spoiler"
                     {:tag :span, :attrs nil, :content (" +")})}
                   {:tag :div,
                    :attrs
                    {:style
                     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                     :id "spoiler_25"},
                    :content
                    ({:tag :div,
                      :attrs {:class "forummsg"},
                      :content
                      ({:tag :a,
                        :attrs
                        {:onclick
                         "return toggleShowSpoiler2(this, 24)",
                         :title "",
                         :href "#",
                         :style
                         "text-decoration:none;font-family:monospace;color:#808080"},
                        :content
                        ({:tag :span, :attrs nil, :content ("+ Show")}
                         " Spoiler"
                         {:tag :span, :attrs nil, :content (" +")})}
                       {:tag :div,
                        :attrs
                        {:style
                         "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                         :id "spoiler_24"},
                        :content
                        ({:tag :div,
                          :attrs {:class "forummsg"},
                          :content
                          ({:tag :a,
                            :attrs
                            {:onclick
                             "return toggleShowSpoiler2(this, 23)",
                             :title "",
                             :href "#",
                             :style
                             "text-decoration:none;font-family:monospace;color:#808080"},
                            :content
                            ({:tag :span,
                              :attrs nil,
                              :content ("+ Show")}
                             " Spoiler"
                             {:tag :span,
                              :attrs nil,
                              :content (" +")})}
                           {:tag :div,
                            :attrs
                            {:style
                             "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                             :id "spoiler_23"},
                            :content
                            ({:tag :div,
                              :attrs {:class "forummsg"},
                              :content
                              ({:tag :a,
                                :attrs
                                {:onclick
                                 "return toggleShowSpoiler2(this, 22)",
                                 :title "",
                                 :href "#",
                                 :style
                                 "text-decoration:none;font-family:monospace;color:#808080"},
                                :content
                                ({:tag :span,
                                  :attrs nil,
                                  :content ("+ Show")}
                                 " Spoiler"
                                 {:tag :span,
                                  :attrs nil,
                                  :content (" +")})}
                               {:tag :div,
                                :attrs
                                {:style
                                 "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                 :id "spoiler_22"},
                                :content
                                ({:tag :div,
                                  :attrs {:class "forummsg"},
                                  :content
                                  ("He just hates me"
                                   {:tag :a,
                                    :attrs
                                    {:onclick
                                     "return toggleShowSpoiler2(this, 21)",
                                     :title "",
                                     :href "#",
                                     :style
                                     "text-decoration:none;font-family:monospace;color:#808080"},
                                    :content
                                    ({:tag :span,
                                      :attrs nil,
                                      :content ("+ Show")}
                                     " Spoiler"
                                     {:tag :span,
                                      :attrs nil,
                                      :content (" +")})}
                                   {:tag :div,
                                    :attrs
                                    {:style
                                     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                     :id "spoiler_21"},
                                    :content
                                    ({:tag :div,
                                      :attrs {:class "forummsg"},
                                      :content
                                      ("hehe no I'm kidding, marv and I are bros"
                                       {:tag :a,
                                        :attrs
                                        {:onclick
                                         "return toggleShowSpoiler2(this, 20)",
                                         :title "",
                                         :href "#",
                                         :style
                                         "text-decoration:none;font-family:monospace;color:#808080"},
                                        :content
                                        ({:tag :span,
                                          :attrs nil,
                                          :content ("+ Show")}
                                         " Spoiler"
                                         {:tag :span,
                                          :attrs nil,
                                          :content (" +")})}
                                       {:tag :div,
                                        :attrs
                                        {:style
                                         "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                         :id "spoiler_20"},
                                        :content
                                        ({:tag :div,
                                          :attrs {:class "forummsg"},
                                          :content
                                          ({:tag :a,
                                            :attrs
                                            {:onclick
                                             "return toggleShowSpoiler2(this, 19)",
                                             :title "",
                                             :href "#",
                                             :style
                                             "text-decoration:none;font-family:monospace;color:#808080"},
                                            :content
                                            ({:tag :span,
                                              :attrs nil,
                                              :content ("+ Show")}
                                             " Spoiler"
                                             {:tag :span,
                                              :attrs nil,
                                              :content (" +")})}
                                           {:tag :div,
                                            :attrs
                                            {:style
                                             "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                             :id "spoiler_19"},
                                            :content
                                            ({:tag :div,
                                              :attrs
                                              {:class "forummsg"},
                                              :content
                                              ({:tag :a,
                                                :attrs
                                                {:onclick
                                                 "return toggleShowSpoiler2(this, 18)",
                                                 :title "",
                                                 :href "#",
                                                 :style
                                                 "text-decoration:none;font-family:monospace;color:#808080"},
                                                :content
                                                ({:tag :span,
                                                  :attrs nil,
                                                  :content ("+ Show")}
                                                 " Spoiler"
                                                 {:tag :span,
                                                  :attrs nil,
                                                  :content (" +")})}
                                               {:tag :div,
                                                :attrs
                                                {:style
                                                 "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                 :id "spoiler_18"},
                                                :content
                                                ({:tag :div,
                                                  :attrs
                                                  {:class "forummsg"},
                                                  :content
                                                  ({:tag :a,
                                                    :attrs
                                                    {:onclick
                                                     "return toggleShowSpoiler2(this, 17)",
                                                     :title "",
                                                     :href "#",
                                                     :style
                                                     "text-decoration:none;font-family:monospace;color:#808080"},
                                                    :content
                                                    ({:tag :span,
                                                      :attrs nil,
                                                      :content
                                                      ("+ Show")}
                                                     " Spoiler"
                                                     {:tag :span,
                                                      :attrs nil,
                                                      :content
                                                      (" +")})}
                                                   {:tag :div,
                                                    :attrs
                                                    {:style
                                                     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                     :id "spoiler_17"},
                                                    :content
                                                    ({:tag :div,
                                                      :attrs
                                                      {:class
                                                       "forummsg"},
                                                      :content
                                                      ("No he most likely just wants me to play"
                                                       {:tag :a,
                                                        :attrs
                                                        {:onclick
                                                         "return toggleShowSpoiler2(this, 16)",
                                                         :title "",
                                                         :href "#",
                                                         :style
                                                         "text-decoration:none;font-family:monospace;color:#808080"},
                                                        :content
                                                        ({:tag :span,
                                                          :attrs nil,
                                                          :content
                                                          ("+ Show")}
                                                         " Spoiler"
                                                         {:tag :span,
                                                          :attrs nil,
                                                          :content
                                                          (" +")})}
                                                       {:tag :div,
                                                        :attrs
                                                        {:style
                                                         "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                         :id
                                                         "spoiler_16"},
                                                        :content
                                                        ({:tag :div,
                                                          :attrs
                                                          {:class
                                                           "forummsg"},
                                                          :content
                                                          ({:tag :a,
                                                            :attrs
                                                            {:onclick
                                                             "return toggleShowSpoiler2(this, 15)",
                                                             :title "",
                                                             :href "#",
                                                             :style
                                                             "text-decoration:none;font-family:monospace;color:#808080"},
                                                            :content
                                                            ({:tag
                                                              :span,
                                                              :attrs
                                                              nil,
                                                              :content
                                                              ("+ Show")}
                                                             " Spoiler"
                                                             {:tag
                                                              :span,
                                                              :attrs
                                                              nil,
                                                              :content
                                                              (" +")})}
                                                           {:tag :div,
                                                            :attrs
                                                            {:style
                                                             "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                             :id
                                                             "spoiler_15"},
                                                            :content
                                                            ({:tag
                                                              :div,
                                                              :attrs
                                                              {:class
                                                               "forummsg"},
                                                              :content
                                                              ({:tag
                                                                :a,
                                                                :attrs
                                                                {:onclick
                                                                 "return toggleShowSpoiler2(this, 14)",
                                                                 :title
                                                                 "",
                                                                 :href
                                                                 "#",
                                                                 :style
                                                                 "text-decoration:none;font-family:monospace;color:#808080"},
                                                                :content
                                                                ({:tag
                                                                  :span,
                                                                  :attrs
                                                                  nil,
                                                                  :content
                                                                  ("+ Show")}
                                                                 " Spoiler"
                                                                 {:tag
                                                                  :span,
                                                                  :attrs
                                                                  nil,
                                                                  :content
                                                                  (" +")})}
                                                               {:tag
                                                                :div,
                                                                :attrs
                                                                {:style
                                                                 "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                 :id
                                                                 "spoiler_14"},
                                                                :content
                                                                ({:tag
                                                                  :div,
                                                                  :attrs
                                                                  {:class
                                                                   "forummsg"},
                                                                  :content
                                                                  ("Maybe he's mafia though, just using this opportunity to get rid of me and a free mislynch"
                                                                   {:tag
                                                                    :a,
                                                                    :attrs
                                                                    {:onclick
                                                                     "return toggleShowSpoiler2(this, 13)",
                                                                     :title
                                                                     "",
                                                                     :href
                                                                     "#",
                                                                     :style
                                                                     "text-decoration:none;font-family:monospace;color:#808080"},
                                                                    :content
                                                                    ({:tag
                                                                      :span,
                                                                      :attrs
                                                                      nil,
                                                                      :content
                                                                      ("+ Show")}
                                                                     " Spoiler"
                                                                     {:tag
                                                                      :span,
                                                                      :attrs
                                                                      nil,
                                                                      :content
                                                                      (" +")})}
                                                                   {:tag
                                                                    :div,
                                                                    :attrs
                                                                    {:style
                                                                     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                     :id
                                                                     "spoiler_13"},
                                                                    :content
                                                                    ({:tag
                                                                      :div,
                                                                      :attrs
                                                                      {:class
                                                                       "forummsg"},
                                                                      :content
                                                                      ({:tag
                                                                        :a,
                                                                        :attrs
                                                                        {:onclick
                                                                         "return toggleShowSpoiler2(this, 12)",
                                                                         :title
                                                                         "",
                                                                         :href
                                                                         "#",
                                                                         :style
                                                                         "text-decoration:none;font-family:monospace;color:#808080"},
                                                                        :content
                                                                        ({:tag
                                                                          :span,
                                                                          :attrs
                                                                          nil,
                                                                          :content
                                                                          ("+ Show")}
                                                                         " Spoiler"
                                                                         {:tag
                                                                          :span,
                                                                          :attrs
                                                                          nil,
                                                                          :content
                                                                          (" +")})}
                                                                       {:tag
                                                                        :div,
                                                                        :attrs
                                                                        {:style
                                                                         "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                         :id
                                                                         "spoiler_12"},
                                                                        :content
                                                                        ({:tag
                                                                          :div,
                                                                          :attrs
                                                                          {:class
                                                                           "forummsg"},
                                                                          :content
                                                                          ("although, I think that's kind of unlikely"
                                                                           {:tag
                                                                            :a,
                                                                            :attrs
                                                                            {:onclick
                                                                             "return toggleShowSpoiler2(this, 11)",
                                                                             :title
                                                                             "",
                                                                             :href
                                                                             "#",
                                                                             :style
                                                                             "text-decoration:none;font-family:monospace;color:#808080"},
                                                                            :content
                                                                            ({:tag
                                                                              :span,
                                                                              :attrs
                                                                              nil,
                                                                              :content
                                                                              ("+ Show")}
                                                                             " Spoiler"
                                                                             {:tag
                                                                              :span,
                                                                              :attrs
                                                                              nil,
                                                                              :content
                                                                              (" +")})}
                                                                           {:tag
                                                                            :div,
                                                                            :attrs
                                                                            {:style
                                                                             "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                             :id
                                                                             "spoiler_11"},
                                                                            :content
                                                                            ({:tag
                                                                              :div,
                                                                              :attrs
                                                                              {:class
                                                                               "forummsg"},
                                                                              :content
                                                                              ("because he doesn't know if I'm gonna turn it on or not"
                                                                               {:tag
                                                                                :a,
                                                                                :attrs
                                                                                {:onclick
                                                                                 "return toggleShowSpoiler2(this, 10)",
                                                                                 :title
                                                                                 "",
                                                                                 :href
                                                                                 "#",
                                                                                 :style
                                                                                 "text-decoration:none;font-family:monospace;color:#808080"},
                                                                                :content
                                                                                ({:tag
                                                                                  :span,
                                                                                  :attrs
                                                                                  nil,
                                                                                  :content
                                                                                  ("+ Show")}
                                                                                 " Spoiler"
                                                                                 {:tag
                                                                                  :span,
                                                                                  :attrs
                                                                                  nil,
                                                                                  :content
                                                                                  (" +")})}
                                                                               {:tag
                                                                                :div,
                                                                                :attrs
                                                                                {:style
                                                                                 "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                                 :id
                                                                                 "spoiler_10"},
                                                                                :content
                                                                                ({:tag
                                                                                  :div,
                                                                                  :attrs
                                                                                  {:class
                                                                                   "forummsg"},
                                                                                  :content
                                                                                  ({:tag
                                                                                    :a,
                                                                                    :attrs
                                                                                    {:onclick
                                                                                     "return toggleShowSpoiler2(this, 9)",
                                                                                     :title
                                                                                     "",
                                                                                     :href
                                                                                     "#",
                                                                                     :style
                                                                                     "text-decoration:none;font-family:monospace;color:#808080"},
                                                                                    :content
                                                                                    ({:tag
                                                                                      :span,
                                                                                      :attrs
                                                                                      nil,
                                                                                      :content
                                                                                      ("+ Show")}
                                                                                     " Spoiler"
                                                                                     {:tag
                                                                                      :span,
                                                                                      :attrs
                                                                                      nil,
                                                                                      :content
                                                                                      (" +")})}
                                                                                   {:tag
                                                                                    :div,
                                                                                    :attrs
                                                                                    {:style
                                                                                     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                                     :id
                                                                                     "spoiler_9"},
                                                                                    :content
                                                                                    ({:tag
                                                                                      :div,
                                                                                      :attrs
                                                                                      {:class
                                                                                       "forummsg"},
                                                                                      :content
                                                                                      ({:tag
                                                                                        :a,
                                                                                        :attrs
                                                                                        {:onclick
                                                                                         "return toggleShowSpoiler2(this, 8)",
                                                                                         :title
                                                                                         "",
                                                                                         :href
                                                                                         "#",
                                                                                         :style
                                                                                         "text-decoration:none;font-family:monospace;color:#808080"},
                                                                                        :content
                                                                                        ({:tag
                                                                                          :span,
                                                                                          :attrs
                                                                                          nil,
                                                                                          :content
                                                                                          ("+ Show")}
                                                                                         " Spoiler"
                                                                                         {:tag
                                                                                          :span,
                                                                                          :attrs
                                                                                          nil,
                                                                                          :content
                                                                                          (" +")})}
                                                                                       {:tag
                                                                                        :div,
                                                                                        :attrs
                                                                                        {:style
                                                                                         "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                                         :id
                                                                                         "spoiler_8"},
                                                                                        :content
                                                                                        ({:tag
                                                                                          :div,
                                                                                          :attrs
                                                                                          {:class
                                                                                           "forummsg"},
                                                                                          :content
                                                                                          ({:tag
                                                                                            :a,
                                                                                            :attrs
                                                                                            {:onclick
                                                                                             "return toggleShowSpoiler2(this, 7)",
                                                                                             :title
                                                                                             "",
                                                                                             :href
                                                                                             "#",
                                                                                             :style
                                                                                             "text-decoration:none;font-family:monospace;color:#808080"},
                                                                                            :content
                                                                                            ({:tag
                                                                                              :span,
                                                                                              :attrs
                                                                                              nil,
                                                                                              :content
                                                                                              ("+ Show")}
                                                                                             " Spoiler"
                                                                                             {:tag
                                                                                              :span,
                                                                                              :attrs
                                                                                              nil,
                                                                                              :content
                                                                                              (" +")})}
                                                                                           {:tag
                                                                                            :div,
                                                                                            :attrs
                                                                                            {:style
                                                                                             "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                                             :id
                                                                                             "spoiler_7"},
                                                                                            :content
                                                                                            ({:tag
                                                                                              :div,
                                                                                              :attrs
                                                                                              {:class
                                                                                               "forummsg"},
                                                                                              :content
                                                                                              ("So in conclusion, it's a \"pressure vote\""
                                                                                               {:tag
                                                                                                :a,
                                                                                                :attrs
                                                                                                {:onclick
                                                                                                 "return toggleShowSpoiler2(this, 6)",
                                                                                                 :title
                                                                                                 "",
                                                                                                 :href
                                                                                                 "#",
                                                                                                 :style
                                                                                                 "text-decoration:none;font-family:monospace;color:#808080"},
                                                                                                :content
                                                                                                ({:tag
                                                                                                  :span,
                                                                                                  :attrs
                                                                                                  nil,
                                                                                                  :content
                                                                                                  ("+ Show")}
                                                                                                 " Spoiler"
                                                                                                 {:tag
                                                                                                  :span,
                                                                                                  :attrs
                                                                                                  nil,
                                                                                                  :content
                                                                                                  (" +")})}
                                                                                               {:tag
                                                                                                :div,
                                                                                                :attrs
                                                                                                {:style
                                                                                                 "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                                                 :id
                                                                                                 "spoiler_6"},
                                                                                                :content
                                                                                                ({:tag
                                                                                                  :div,
                                                                                                  :attrs
                                                                                                  {:class
                                                                                                   "forummsg"},
                                                                                                  :content
                                                                                                  ({:tag
                                                                                                    :a,
                                                                                                    :attrs
                                                                                                    {:onclick
                                                                                                     "return toggleShowSpoiler2(this, 5)",
                                                                                                     :title
                                                                                                     "",
                                                                                                     :href
                                                                                                     "#",
                                                                                                     :style
                                                                                                     "text-decoration:none;font-family:monospace;color:#808080"},
                                                                                                    :content
                                                                                                    ({:tag
                                                                                                      :span,
                                                                                                      :attrs
                                                                                                      nil,
                                                                                                      :content
                                                                                                      ("+ Show")}
                                                                                                     " Spoiler"
                                                                                                     {:tag
                                                                                                      :span,
                                                                                                      :attrs
                                                                                                      nil,
                                                                                                      :content
                                                                                                      (" +")})}
                                                                                                   {:tag
                                                                                                    :div,
                                                                                                    :attrs
                                                                                                    {:style
                                                                                                     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                                                     :id
                                                                                                     "spoiler_5"},
                                                                                                    :content
                                                                                                    ({:tag
                                                                                                      :div,
                                                                                                      :attrs
                                                                                                      {:class
                                                                                                       "forummsg"},
                                                                                                      :content
                                                                                                      ({:tag
                                                                                                        :a,
                                                                                                        :attrs
                                                                                                        {:onclick
                                                                                                         "return toggleShowSpoiler2(this, 4)",
                                                                                                         :title
                                                                                                         "",
                                                                                                         :href
                                                                                                         "#",
                                                                                                         :style
                                                                                                         "text-decoration:none;font-family:monospace;color:#808080"},
                                                                                                        :content
                                                                                                        ({:tag
                                                                                                          :span,
                                                                                                          :attrs
                                                                                                          nil,
                                                                                                          :content
                                                                                                          ("+ Show")}
                                                                                                         " Spoiler"
                                                                                                         {:tag
                                                                                                          :span,
                                                                                                          :attrs
                                                                                                          nil,
                                                                                                          :content
                                                                                                          (" +")})}
                                                                                                       {:tag
                                                                                                        :div,
                                                                                                        :attrs
                                                                                                        {:style
                                                                                                         "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                                                         :id
                                                                                                         "spoiler_4"},
                                                                                                        :content
                                                                                                        ({:tag
                                                                                                          :div,
                                                                                                          :attrs
                                                                                                          {:class
                                                                                                           "forummsg"},
                                                                                                          :content
                                                                                                          ({:tag
                                                                                                            :a,
                                                                                                            :attrs
                                                                                                            {:onclick
                                                                                                             "return toggleShowSpoiler2(this, 3)",
                                                                                                             :title
                                                                                                             "",
                                                                                                             :href
                                                                                                             "#",
                                                                                                             :style
                                                                                                             "text-decoration:none;font-family:monospace;color:#808080"},
                                                                                                            :content
                                                                                                            ({:tag
                                                                                                              :span,
                                                                                                              :attrs
                                                                                                              nil,
                                                                                                              :content
                                                                                                              ("+ Show")}
                                                                                                             " Spoiler"
                                                                                                             {:tag
                                                                                                              :span,
                                                                                                              :attrs
                                                                                                              nil,
                                                                                                              :content
                                                                                                              (" +")})}
                                                                                                           {:tag
                                                                                                            :div,
                                                                                                            :attrs
                                                                                                            {:style
                                                                                                             "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                                                             :id
                                                                                                             "spoiler_3"},
                                                                                                            :content
                                                                                                            ({:tag
                                                                                                              :div,
                                                                                                              :attrs
                                                                                                              {:class
                                                                                                               "forummsg"},
                                                                                                              :content
                                                                                                              ({:tag
                                                                                                                :a,
                                                                                                                :attrs
                                                                                                                {:onclick
                                                                                                                 "return toggleShowSpoiler2(this, 2)",
                                                                                                                 :title
                                                                                                                 "",
                                                                                                                 :href
                                                                                                                 "#",
                                                                                                                 :style
                                                                                                                 "text-decoration:none;font-family:monospace;color:#808080"},
                                                                                                                :content
                                                                                                                ({:tag
                                                                                                                  :span,
                                                                                                                  :attrs
                                                                                                                  nil,
                                                                                                                  :content
                                                                                                                  ("+ Show")}
                                                                                                                 " Spoiler"
                                                                                                                 {:tag
                                                                                                                  :span,
                                                                                                                  :attrs
                                                                                                                  nil,
                                                                                                                  :content
                                                                                                                  (" +")})}
                                                                                                               {:tag
                                                                                                                :div,
                                                                                                                :attrs
                                                                                                                {:style
                                                                                                                 "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                                                                 :id
                                                                                                                 "spoiler_2"},
                                                                                                                :content
                                                                                                                ({:tag
                                                                                                                  :div,
                                                                                                                  :attrs
                                                                                                                  {:class
                                                                                                                   "forummsg"},
                                                                                                                  :content
                                                                                                                  ({:tag
                                                                                                                    :a,
                                                                                                                    :attrs
                                                                                                                    {:onclick
                                                                                                                     "return toggleShowSpoiler2(this, 1)",
                                                                                                                     :title
                                                                                                                     "",
                                                                                                                     :href
                                                                                                                     "#",
                                                                                                                     :style
                                                                                                                     "text-decoration:none;font-family:monospace;color:#808080"},
                                                                                                                    :content
                                                                                                                    ({:tag
                                                                                                                      :span,
                                                                                                                      :attrs
                                                                                                                      nil,
                                                                                                                      :content
                                                                                                                      ("+ Show")}
                                                                                                                     " Spoiler"
                                                                                                                     {:tag
                                                                                                                      :span,
                                                                                                                      :attrs
                                                                                                                      nil,
                                                                                                                      :content
                                                                                                                      (" +")})}
                                                                                                                   {:tag
                                                                                                                    :div,
                                                                                                                    :attrs
                                                                                                                    {:style
                                                                                                                     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
                                                                                                                     :id
                                                                                                                     "spoiler_1"},
                                                                                                                    :content
                                                                                                                    ({:tag
                                                                                                                      :div,
                                                                                                                      :attrs
                                                                                                                      {:class
                                                                                                                       "forummsg"},
                                                                                                                      :content
                                                                                                                      ("Man robik's response to marv calling him \"sweetie\" was hilarious.")})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})})}
 {:user "Damdred",
  :message
  ("Also don't know if I like rs so far or not, one post echos my sentiment the others are a bit meh. Kinda weird start")}
 {:user "Half the Sky",
  :message
  ("Palmar is just trolling and doing jack all...."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Catching up. I have an hour before Pilates, but will keep burning through this afterwards. ")}
 {:user "Half the Sky",
  :message
  ("I actually don't like Rasputin as of the time when I went to bed. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "She calls me boring. Ironic because both of us were playing catchup last night because of RL commitments and she started commenting even later than I did. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So I'm not sure what that makes her, really. ")}
 {:user "Half the Sky",
  :message ("EBWOP - Let's see if my opinion changes though. ")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Are you typically cautious of calling out malware?")}
 {:user "Half the Sky",
  :message
  ("Chez, null atm, but to answer your question, no, when I'm clear something is scumlike, I'll call it. I'm still on page 22. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sicklucker is still dodging questions. Surprise, surprise...")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "How about when he's hardly answering ANY of the questions or saying he'll answer them later? ")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You're boring cause all you're doing is making excuses and posting list posts that don't dazzle me. I like to be dazzled."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Come at me bae.")}
 {:user "Damdred", :message ("Why are you so boring rs")}
 {:user "Half the Sky",
  :message
  ("I'm looking at Chez's filter. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "No idea where he's going with his ideas. His linked explanation to Fecalfeast's vote simply linked to his filter. Why don't you explain exactly what about Fecalfeast made him scumlike?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Then he asks Marv whether he's a distro, when his vote is on him. Where did that come from? ")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Mostly cause I'm bored."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Talk to me about truffle.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sicklucker was trying to read you, and I didn't understand where he was getting alignment indicative information from, when you had posted so little. At the time he was reading you it was late for us.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I like chez. He at least is entertaining. I get the \"a happy marv is a townie marv\" read, even if I'm not entirely sure how accurate it is. Plus he made a funny. If he dies today the rest of you will bore me to tears ;o;")}
 {:user "Damdred",
  :message
  ("I like hts posts seem ok at this point town pile for now."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Tr just isn't here in a way I feel is towny, posts lack focus and intent and promises contribution later days. Really don't like it and under the radar")}
 {:user "Half the Sky",
  :message
  ("Tone reads are generally weak reads. I realise that town will be more carefree, etc, at the off, but the area I was looking at was at the bottom of page 2 of his filter, which I was pointing out. So well past the honeymoon phase IMO. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "BTW, scum can make jokes too. ")}
 {:user "LightningStrike",
  :message
  ("Does Trfel remind you of his play in Student V Damdred? Any difference from here and that game?")}
 {:user "Damdred",
  :message ("Hts tell me about two people you haven't mentioned yet")}
 {:user "Half the Sky",
  :message
  ("I really don't like how Palmar still can't be arsed to play this game, but he'd be a policy lynch for me at this point. ")}
 {:user "Damdred",
  :message
  ("I can't remember how he played in that student game, I think that was the one where Scum he was. So a bit")}
 {:user "marvellosity",
  :message ("I could kill rsoultin for being boring.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Let's see if I can get any information off FF and anything additional off Trfel. Think I commented on everyone else. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden I agree with you though - he's looking better since splitting phrases with Sicklucker. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "sicklucker's play always is insane on Day 1 but the way he questioned Robik on his claim feels like he is trying to solve the game but it seems like the majority of the people in here had played with sicklucker and should know that his Day 1 play is always insane as either alignment.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Here's his filter from that game when he did play scum (I red checked him as a Cop)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/475036-student-mafia-v?user=trfel"},
    :content
    ("http://www.teamliquid.net/forum/mafia/475036-student-mafia-v?user=trfel")})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Fair enough. He's done the under the radar thing as town before. He's trying to change his gameplay, which is the interesting bit to me, but I'm not seeing the more vocal, contributive Truffle that he claims he wants to be."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Talk to me about Palmar."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You keep saying you're interested in possibly lynching people without saying why."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "As for HTS...she reads more town to me when she's scum. So I don't think she's my lynch today. Still...underwhelming.")}
 {:user "Half the Sky",
  :message
  ("Marv and Damdred, what do you think about this? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Earlier she said this about me: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And from what I can tell of Chez, he's not quite doing anything substantial. At least not in terms of solving the game...yet. Not from which I can tell. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I feel like HTS is town this game although the last I gave her a town read Day 1 she fucked me over as scum and not quite forgiven her for that but you know I never played with scum HTS before that game so what can I say. Can you tell me why you're right and I'm wrong about our reads on HTS?")}
 {:user "Damdred",
  :message
  ("Hts posts are good I think."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also Palmar is a policy lynch at best it's pretty obvious. ")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil}
   " Cool story, bro."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Now, palmar. 'splain plz. 'less you're cool with him explaining you for you.")}
 {:user "LightningStrike",
  :message ("Damdred what you think of rsoultin and me?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Are we disagreeing?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Our reasons for saying she's probably town (or at least may not be scum, in my case) are different, but the conclusion is more or less the same."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "She's not screaming town to me. The only game I was hard townreading her early on was her scum game. Ergo I'm not interested in lynching her today.")}
 {:user "Damdred",
  :message
  ("Rs is super boring and kinda meh to me. I'm not sure if I would lynch him today but not the town rs I generally see. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "LS you could be town but IDK you are playing different but wouldn't lynch you yet")}
 {:user "Half the Sky",
  :message
  ("Damdred - On Fecalfeast, I'm not sure his first post "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I would think overexplanation of things is generally a scum trait, but it could be faulty reasoning."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Not much to glean from most of his posts at the moment. I get this thought of laziness from the first few hours of the game. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This quote is also a potential issue:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Now as I said, I'm reading HF as town. But the issue with this quote is a few things:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "1 not an interest to solve the game himself "
   {:tag :br, :attrs nil, :content nil}
   "2 HF obv not confirmed town - if both are scum, this could be quite dangerous"
   {:tag :br, :attrs nil, :content nil}
   "3 Could be a scum trying to take advantage of a possible incorrect read by HF"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "On these two quotes, he doesn't look so good, but let's see if he picks things up. ")}
 {:user "Damdred",
  :message
  ("That's good thoughts not sure if it makes ff Scum at this point but I like the read progression."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Would you lynch robik hts ")}
 {:user "rsoultin",
  :message
  ("Okay, HtS, I stand corrected."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I like where your head is on your reads on me and FF. You get a town pass today.")}
 {:user "Damdred", :message ("Same question to you rsoul ")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I thought you weren't townreading her my bad on misreading your posts T_T.")}
 {:user "Damdred",
  :message
  ("Also rs marv said his reason in his filter about Palmar begging out of a lynch? You don't like his reasons or missed it?")}
 {:user "Half the Sky",
  :message
  ("Robik hard claimed. It's early to hard claim. I've only played one game with Robik so far (can't talk about that game, it's in progress) but he struck me as a low post count person. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If he's town he could be hard claiming and just being lazy. Thing is, he's not doing a whole lot so far. He voted you, and based on what I know, he's not pushing you. So that's a possible red flag. Think he said something along the lines of \"it only matters to me or something\" and then when HF calls him out, he talks about formatting. So I'm confused there. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also of all the other things he's said, I looked at these: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "First quote seems noncomittal, I feel and second quote he's making a generalisation when you were the one that made the quote. I think he'd have been more town if he specifically commented on YOU making that quote. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "No. I see no point in lynching a claimed role Day 1."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "For being the amazing town leader to sheep to victory, he's been especially useless, and I'd probably lynch him later if he continues as he is, but not today.")}
 {:user "Half the Sky",
  :message
  ("Damdred - I want to talk about Trfel, but I need to bolt for the pilates class.  "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Will touch on that when I return. ")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "My Great Uncle was over at my house so ofc my activity took a hit because I was hanging out with them and I don't got  a scum qt so I aint scum this game at all. My reasoning might be a bit weak though yes but I feel like you are much more motivated this game than Student V and so does Marv but HF I like him so far but the last town I gave him a Day 1 townread he was scum (Carol of the Bell) so I need to seem his progress this game to see difference between his play at Carol and here.")}
 {:user "rsoultin",
  :message
  ("@Damdred"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay, yeah, I did miss that. Probably because I still have trouble sheeping what others say others' meta are, so tend to disregard it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "However, Palmar appealing to me when I asked marv to explain his read better is kind of funny, given the arrogance I associate with Palmar.")}
 {:user "Damdred",
  :message
  ("I'm not really commenting on your activity LS, it's not horrible and you don't lie about rl things. So what I have been commenting on when it comes to you is a marked change in your posting at this point, reads are a bit different which isn't bad. It should just give people pause when reading you.")}
 {:user "Damdred",
  :message
  ("Actually yeah, Palmar post made me chuckle which makes me want to not lynch him."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm liking HF cause he's not focusing on one thing to the exclusion of all others. He tunneled hard as scum Day 1 the only other game I've played with him in."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This doesn't look like that game to me. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't know that he's incapable of this as scum, and given his scum win record I'd say it's not enough for a hard townread. But I don't want to lynch him today, for sure.")}
 {:user "Damdred",
  :message
  ("I was looking at Trfel filter again and a few things popped up at me that raised a red flag."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Really hard disbelief/doubt on robik claim when it happened. This is interesting to me because of the difference in what Trfel did and thread. People were mad at Rob claiming but believed it, brownies generally believe claims due to it adding more information and game being slightly easier even if it's bad. Mafia already knew partial setup, and disbelief to robik  claim could be a Scum slip from to much info."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Moving on thread presence is really down and lots of excuses about why he's not posting much."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lastly a pretty decent sized list post with no conclusive reads no Scum reads just really noncommittal reads,"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Trfel is scum")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I could get behind this read."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Chezi already said the same thing you know. It's why I said he gets a no-lynch pass from me today. "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil})}
 {:user "Damdred",
  :message
  ("IDK I haven't looked at chez.  But just did and I guess he did in his own way, didn't take it that way when I read it the first time")}
 {:user "LightningStrike",
  :message
  ("Ya I started to think Tfrel was scum again mainly he seemed to play similar to how he played in Student V as scum which was pretty much his posts were a lot less to be desired knowing how he plays as town but it might be paranoia from playing a scum with him for the first time and I had a similar paranoia about Breshke in Student V. But seeing you have the feeling about Tfrel as I do I trusting you on this."
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("##Vote:Tfrel")})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What is \"different\", specifically?")}
 {:user "Damdred",
  :message
  ("Smaller posts, reads are a bit harder compared to other games. Not using meta as much.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not voting him right now simply to not be a bitch. He pm'd me after last game, telling me that he really "
   {:tag :i, :attrs nil, :content ("was")}
   " trying to change his gameplay because he feels like he hasn't made a real impact the last few games. So I want to give him a little more time before I throw him under the bus today."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Trfel was pretty concerned before we received our roles that I would meta-read him to death lol. That said, truffle-bby, you also promised me no giant novels of null as town. You're making it hard for me to give you the benefit of the doubt.")}
 {:user "Onegu",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Vote Count")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("sicklucker (4):")}
   " Holyflare, Damdred, Eden1892, Fecalfeast"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Damdred (1):")}
   " IAmRobik"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Palmar (2):")}
   " marvellosity, Chezitwo"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("FecalFeast (0):")}
   " "
   {:tag :s, :attrs nil, :content ("Chezitwo")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Eden1892 (1):")}
   " Sicklucker"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Trfel(1):")}
   " LightningStrike"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Not Voting (4):")}
   " Trfel, rsoultin, Half the Sky, Palmar"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Currently,")}
     " sicklucker "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("is set to be lynched. Day 1 ends in "
       {:tag :span, :attrs {:id "bbcountdown1"}, :content nil}
       {:tag :script,
        :attrs {:type "text/javascript"},
        :content
        ("$(\"#bbcountdown1\").countdown({until: new Date(Date.UTC(2015, 02-1, 01, 21, 00, 00)), onTick: bbcountdownTick, tickInterval: 1});")}
       " at 21:00 UTC (+00:00)."
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Reminders: Votes are done in the voting thread "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476972-linux-mini-mafia-voting-thread"},
        :content ("(link)")}
       ". Make sure to unvote if you want to vote someone new. Voting is mandatory-- you may not abstain.")})}
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He seems more certain than I'm used to him being. Hard to tell if that's just him becoming more confident or if it's alignment-indicative.")}
 {:user "Damdred",
  :message
  ("IDK why Trfel would change his town game he's always obvious town and is impactful when he plays meh")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "He was very effective in Carol idk what the hell he been smoking and he had good impact in Student IV in fact I NK'd him there because I was afraid of him. In Carol he used his Cop power on a question mark and got us to clear FF and he made a good case on KSC in that game that got KSC lynched as scum. Granted he didn't have good impact in the Newbie game but still it wasn't to worrying. His scum game with policy lynching is far from normal from him so that why we both went after him on that in the last game we played (Student V).")}
 {:user "Chezitwo",
  :message ({:tag :br, :attrs nil, :content nil} "A friend!")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I just more confident that is all and in fact I acted very confident in Student V about my knowledge on Tfrel and argued with DarthPunk (who is a Veteran Mafia player) in that game about Tfrel on Day 1.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I gave you the fishing rod, it seems you can fish fine for yourself!")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lol, I know, I don't know where he's getting this from either, unless it's just the newbie game. But I can say for certain that he does at least "
   {:tag :i, :attrs nil, :content ("believe")}
   " that he hasn't been playing well.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Ya the Newbie game was a bit underwhelming on him but he had irl stuff going on I think in that game so that could affect his play so who knows why would he think he played bad when if you play good you get NK'd like 90% of the time.")}
 {:user "Damdred", :message ("Opinions on ff. Rs and LS go")}
 {:user "rsoultin",
  :message
  ("Unless it's to avoid a medic save."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Badumdum. <3 you Eden."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay, well, talking in circles. Where I'm at right now is despite wanting to give Truffle a chance to break in his new town play, if he doesn't step it up I'm totally behind lynching him today."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "FF and Palmar feel more like policy lynches to me."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "SL I just don't know about. It's very possible he could be scum but I always think that about him so I don't know. One thing that stood out about me regarding him is he's just not up to his usual mind-fuckery town antics so far this game. I don't know that the rage! based on what his meta said thing is scum SL or just irrational SL.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eh, not a fan of his play in general. I only townread him last game because I knew what role I had and that he was townreading me because of my questioning SL half-claiming it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'll take another look through his filter, though, to see if anything specific stands out.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "EBWOP:"
   {:tag :br, :attrs nil, :content nil}
   "Actually, I'm not getting a scumread off him after filtering him. What's your problem with him, Damdred, other than him saying he didn't think your setup posts were scummy?")}
 {:user "LightningStrike",
  :message
  ("FecalFeast doesn't seem memorable for me and he seemed to just seem to avoid questioning a lot and doesn't seem to have good developed reads and is less involved compared to when I played with him at Campus Mafia when he was VT so far. Here is his filter from that game if you guys are interested."
   {:tag :br, :attrs nil, :content nil}
   {:tag :a,
    :attrs
    {:target "_blank",
     :href
     "/forum/mafia/469857-campus-mafia-new-newish-players-welcome?user=FecalFeast"},
    :content
    ("http://www.teamliquid.net/forum/mafia/469857-campus-mafia-new-newish-players-welcome?user=FecalFeast")})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I didn't notice the question avoidance on the first read-through."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Quotes?")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I mean he not been questioning people a lot compared to his game on Campus where I played with him and in his filter this game he posting a lot of fluff and only like 1 or 2 questions which are the following Quotes: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "These are the only relevant questions he had asked as far I am concerned.")}
 {:user "Damdred",
  :message
  ("I'm not sure how much a problem I have with ff his filter is kinda blah nothing much going on. Which is a negative, but mostly it's good to talk so I can get reads."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "LS is a good town read now though I really liked his ff post ")}
 {:user "Holyflare", :message ("What's up")}
 {:user "Holyflare",
  :message ("We can lynch palmar for free mafia today ")}
 {:user "Damdred", :message ("Hi hf, I thought Sl was free mafia?")}
 {:user "Holyflare",
  :message
  ("well I was wrong on what I was reading into because it could have been construed both ways so I've dropped it for now, his question dodging and shit is still getting on my nerves though but I still wouldn't put it past him as both alignments because that's just the type of guy he is")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "although this post is another double standard because I was the one calling him salty 24/7 and posting pictures of salt and salt shakers and I'm not mafia and he didn't even mention me at all")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm back. Damdred, I saw this. I think if he was confused, he should have asked. Trfel IS inexperienced, but a townie would be trying to ask first instead of disregarding the evidence. Granted I was scum in that game but the point stands. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If Trfel does turn out to be scum, maybe it's possible we should look into Robik. I know it's early for associative reads and they are poor but it's just a thought. ")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ah, yes. That makes more sense. I still don't think his filter's terrible, personally. Part of it is tone. Seems like he's just playing around. But I get where you're coming from.")}
 {:user "Holyflare",
  :message ("urgh ff's filter is really boring too")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "To be fair Damdred, in past obs QTs, he has expressed some frustration at getting killed prematurely. His first two games, he was a blue, and third game in Newbie, we (I was scum in that game) killed him because he's solid at making cases. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "Half the Sky",
  :message
  ("EBWOP - his first two games, he was KILLED PREMATURELY as a blue....")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Palmar is striking me as policy, unless you're metaing him for scum. ")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Hold on. I stand corrected on Trfel. He DID ask....however, this DOES sound waffly. He doesn't seem to have the information, he's asking and then concludes he's not convinced he's town? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Is anyone else confused by this? ")}
 {:user "Holyflare",
  :message
  ("absolutely 0 policy, chez even linked a post where he says he lynches all people that haven't read their role pm. The last time I've seen him do that was world heavyweight 2? he was mafia")}
 {:user "Half the Sky",
  :message
  ("Damdred if you are still here, I'm going to jump into LS's filter next. I'm trying to understand why we are coming up with different reads. You're basically saying he's different or you have a different feel or something. Did something in particular jump out at you? ")}
 {:user "Holyflare", :message ("ls seems pretty towny to me?")}
 {:user "Half the Sky",
  :message
  ("One more point on Trfel. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So Trfel, you don't understand claims coming out of Student Mafia where two people claimed, one claim of which brought you down. You came to me after Carol saying you liked my play at the end, where I claimed medic to save myself. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "People have also claimed VT in some of the games you have played. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Basically you've had enough games where there's been many claims, or you have observed them. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "My conclusion here is that I don't find what you are saying believable. ")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That's how I feel, but Damdred apparently feels otherwise. I'm double checking to make sure I didn't miss something. ")}
 {:user "rsoultin",
  :message
  ("LS' play has gotten progressively more townie as the game went on, imo. I, too, found his read on SL odd, so I can't blame Damdred for that."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If Damdy still thinks that LS is scum, though, I'd like to hear why.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Is this a good reason? I'm not following it.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't know Chez (must be a smurf I'm guessing), let alone what he was trying to convey but at least now it makes sense with your explanation. So basically meta. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "From experience with Palmar, he's come off as a troll when messing around, but it wasn't fully indicative to me and I didn't make a conclusion on him until he did what he did for the better part of the day (as opposed the first few hours), though it proved incorrect. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Disregarding meta, I am coming to a policy lynch based off his current behaviour (and not knowing that game you referenced), but now I understand your position. ")}
 {:user "Holyflare", :message ("meh feeling pretty lazy now")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Ok, I have been in games where there are claims.  I have seen claims occasionally used effectively.  Sometimes, I know how to use claims.  But in what I think are the majority of cases, I don't know how to use claims.  I believe I've mentioned this in previous games, if necessary I can dig that up."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I DID ask, pretty sure at least twice, for someone to explain Robik's claim to me.  And no one did.  My extreme lack of mafia experience (never having played in real life) makes me completely unconvinced that Robik is town based on this claim, and that is not going to change until someone explains this to me in a way that I can understand (or links me a guide of satisfactory quality, or whatever).  Or maybe I will end up accepting it because if everyone else thinks it, it's probably right, even if I don't know why.  But I don't see how I should be expected to come to a certain conclusion about something despite asking about it multiple times and receiving no answer."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "As for my previous post, I intended to convey that I am a little suspicious of Damdred and Robik and very suspicious of sicklucker.  Yes, I put a few comments that didn't contain a read, but are you going to scumread Holyflare and Half the Sky for talking about London restaurants?  I'm talking about stuff that I want to talk about because I think it's interesting, if you want to talk about it too, then it was a good thing I mentioned it.  If you don't, no harm done."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I really have no clue what to make of the Palmar lynch.  I don't know that much about Palmar, other than his play is marked with laziness and he plays in bursts of effectiveness."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Really, my stance on Palmar and sicklucker is similar right now.  I am willing to lynch them and there is a good chance they are scum, but I don't feel there is much else to say about them.  Therefore, I will look into other things for now, and decide on the best lynch closer to the deadline (which I think I will need to leave about 3 hours before.....).  I just see no reason to push sicklucker or Palmar at this point, since there is nothing I could say about them that hasn't already been said.")}
 {:user "Trfel",
  :message
  ("Oh and before you guys pick on me for vanishing, I need to eat lunch and then start carefully reading the game again.  And maybe nap, I'm super tired (went to bed at 5:30).")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "pretty much my feeling too"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The robik thing is because claiming a blue as mafia is like a ticking time bomb, in this setup it's the biggest risk because people would eventually end up counter claiming him and he would die if he was mafia. He would essentially be risking that the setup doesn't contain the extra blue because if it did he would be obvious mafia which is a silly risk to take as mafia so it's more likely that he's town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "or his team is lazy and shit and he wanted a way out and is actually mafia")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "People not reading thread get Scum points strike one to hts and rs ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "this doesn't make sense btw because there are modifiers and shit and trfel's latest post was pretty on point so I like him")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "hey what about me I want my points I've not read anything"
   {:tag :br, :attrs nil, :content nil})}
 {:user "Palmar",
  :message ("Okay I am now available for an interview. Ask away!")}
 {:user "Holyflare", :message ("what does your role pm say?")}
 {:user "Damdred", :message ("But you aren't misrepresenting palmar")}
 {:user "Half the Sky",
  :message
  ("Alright, I did go back. I stand corrected Damdred, only reinforces LS as a town read. ")}
 {:user "Half the Sky",
  :message
  ("I'd like a few more opinions on Robik, I brought it up before, but what do some of you currently in thread think? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "As I said before, Robik is not doing a whole lot so far. He voted Damdred, he's not particularly pushing Damdred. So that's a possible red flag. Think he said something along the lines of \"it only matters to me or something\" and then when HF calls him out, he talks about formatting. That was the last post in his filter. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So I'm confused there. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also of all the other things he's said, I looked at these: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think the first quote is noncomittal, I feel and second quote he's making a generalisation when Damdred was the one that made the quote. I think he'd have been more town if he specifically commented on Damdred making that quote. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also Damdred, just realised I missed your question - would I lynch Robik? "
   {:tag :br, :attrs nil, :content nil}
   "With the information I have right now? I'd put him on the lynchables list, but Sicklucker seems to be the worst of everyone so far. ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "him being town is far more likely")}
 {:user "Holyflare",
  :message
  ("and also if it wasn't apparent my case on damdred was a complete joke "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "Half the Sky",
  :message
  ("Palmar what are your reads on people so far? Probably the first and obvious thing. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Second what are your thoughts on HF and Chez scumreading you based on meta? Including the relevant quotes: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Of course.  That doesn't mean I didn't like it.  Not that I would sheep it or anything, but I liked that something happened, and I found it weird that Damdred started out by saying that the other named VT should claim, and then when he ran into light opposition, he took it back immediately.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "but what would you expect him to do when countered by so much logic?")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Chez, yes, you might be right about the bolded but my issue with these quotes is that you don't appear to be thinking critically - in this case, I had to answer that question for you. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also you didn't answer this question. You asked Marv whether he's a distro, when your vote was on him at that time. Where did that come from? ")}
 {:user "marvellosity",
  :message
  ("Robik's abandoned us :<"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "perhaps we should sheep Damdred to great glory."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "No pressure Damdy.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Take it back immediately."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think it's a little suspicious because that means that he either wasn't thinking very much when he asked for blues to claim (which is very bad, see KelsierSC and kushm4sta in Carol of the Bells...), he actually didn't really care if the blues claimed or not (in which case, asking them to claim seems really strange), or he is just a terrible player who rolled mafia (I think we can ignore this option).")}
 {:user "marvellosity",
  :message
  ("rsoultin might actually be mafia though"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "lots of town-passes, lots of no-lynch-today passes, very few suspicions or pushes")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "-_- meh. forgot about your reaction to the FF case"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "anyway, why is palmar making you chuckle significant?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "xP hi pot"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "More no-lynch than town, but essentially you're correct. I'm not seeing anyone jumping out at me today, and contrary to popular opinion I actually don't just randomly tunnel people for the lolz.")}
 {:user "marvellosity", :message ("uh huh.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm just here so I won't get lynched.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("##Vote Palmar")})}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm just here so I won't get lynched."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm just here so I won't get lynched.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Well she isn't as assertive as I'm used to her in her town games. I've yet to play a game with her when she RNGs scum. "
   {:tag :br, :attrs nil, :content nil}
   "What you've said above is supported by the lack of such in her filter. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also in case you missed Marv...this was one thing that stuck to me, but after posting, Ras gave me a town pass, not sure if she was trying to find a random reason at the time to scumread me. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "marvellosity",
  :message
  ("rsoultin's reason for giving HTS a no-lynch pass is particularly atrocious.")}
 {:user "Trfel",
  :message
  ("Palmar, you are currently leading the voting.  Please do something about it.")}
 {:user "marvellosity",
  :message
  ("\"she's not looking town and because of that i don't want to lynch her because when she looks town she's scum\""
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "\"i'm not going to pressure her in any way to discern her alignment though, i'm just going to give her a pass\""
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "\"i'm so town\""
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :i, :attrs nil, :content ("rsoultin")})}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm just here so I won't get lynched.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "How so? The answers were clear and right here."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Can you point me to where I voted for Marv?")}
 {:user "marvellosity",
  :message
  ({:tag :b,
    :attrs nil,
    :content
    ("##unvote"
     {:tag :br, :attrs nil, :content nil}
     "##Vote: rsoultin")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "pretty much willing to vote Palmar at any point including at deadline though.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Rasputin...."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sicklucker has 3-4 votes on him. You commented on him twice. You don't have a conclusion on him yet for the time you've been in game (even having to catch up)? Nothing about SL is jumping out at you either way? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Seriously? "
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "^ that was the reason. Which, ironically enough, was actually stated in the post.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Trfel are you not with the program? Sicklucker has 4 votes. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And Palmar you aren't helping yourself doing jack all. Answer my questions please. ")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "^ That."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I've questioned him about reading LS town for hard townreading him but it's SL. If you've got a good way to read the spaz, please let me know."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If anything, I like FFs reasoning for voting him best. He's not spazzing the thread much this game."
   {:tag :br, :attrs nil, :content nil})}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm just here so I won't get lynched.")}
 {:user "marvellosity",
  :message
  ("Palmar's not going to answer your questions just because you tell him to or you threaten him."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "We can decide EoD if he's done nothing else or if no-one else is super suspicious to lynch him.")}
 {:user "marvellosity",
  :message
  ("meanwhile let's kill the girl."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "the other one.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "What?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This is simply false.  Last vote count was 4 votes for sicklucker and 2 for Palmar.  Then Holyflare unvoted sicklucker and voted Palmar (3 to 3), and I voted Palmar (4 to 3, Palmar leading the voting).  Then I made the post in question.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "^ best case in the thread")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Looking into it, I'll get back to you on this in a bit."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And please, I use multiple tabs, so just because I'm looking into someone's filter doesn't mean that I won't be constantly checking the thread for new posts (mostly directed to rsoultin).")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Then why aren't you pushing sicklucker (further) or asking him about it? You have a meta point on his \"town antics\" so that's something you could have used to flesh things out with him. ")}
 {:user "Onegu",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Vote Count")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("sicklucker (3):")}
   {:tag :s, :attrs nil, :content (" Holyflare,")}
   " Damdred, Eden1892, Fecalfeast"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Damdred (1):")}
   " IAmRobik"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Palmar (3):")}
   " "
   {:tag :s, :attrs nil, :content ("marvellosity, ")}
   "Chezitwo, Holyflare, Trfel"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("FecalFeast (0):")}
   " "
   {:tag :s, :attrs nil, :content ("Chezitwo")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Eden1892 (1):")}
   " Sicklucker"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Trfel(1):")}
   " LightningStrike"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("rsoultin(1):")}
   " marvellosity "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Not Voting (3):")}
   " rsoultin, Half the Sky, Palmar"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Currently,")}
     " Palmar "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("is set to be lynched. Day 1 ends in "
       {:tag :span, :attrs {:id "bbcountdown1"}, :content nil}
       {:tag :script,
        :attrs {:type "text/javascript"},
        :content
        ("$(\"#bbcountdown1\").countdown({until: new Date(Date.UTC(2015, 02-1, 01, 21, 00, 00)), onTick: bbcountdownTick, tickInterval: 1});")}
       " at 21:00 UTC (+00:00)."
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Reminders: Votes are done in the voting thread "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476972-linux-mini-mafia-voting-thread"},
        :content ("(link)")}
       ". Make sure to unvote if you want to vote someone new. Voting is mandatory-- you may not abstain.")})}
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If this is truly the best case, this thread needs life support xP"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Daaaammmdred.")}
 {:user "marvellosity",
  :message
  ("It's a great case because it's completely true and demonstrates a total lack of townie inquisitiveness.")}
 {:user "marvellosity", :message ("why are you appealing to Damdred?")}
 {:user "Trfel",
  :message
  ("I have yet to get very far into the actual case presented against rsoultin, but the way she is responding to this pressure seems really poor.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lol do you see him in the thread, hun?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What exactly do you expect him to answer when I ask him why he's not being a spaz this time around?"
   {:tag :br, :attrs nil, :content nil})}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You're not helping yourself here exactly...you aren't particularly assertive this game. At all. This is my fourth game with you so I am qualified here to say that something isn't quite right. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Step it up m'lady."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ("##unvote"
     {:tag :br, :attrs nil, :content nil}
     "##vote Rasputin")})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Cause he still hasn't answered my question. (i.e. not an appeal)")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "and you've basically not bothered answering what i'm pushing you for."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "why is that?")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That's irrelevant. Completely irrelevant. Look at how I played in Newbie LX as only one of two Euros in the entire game. I posted my questions/thoughts even with no one around, and re-referenced to my targets if I did manage to interact with them. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I bitched about timezones - can't stay up until 4am GMT, could have kept bitching about them, but I didn't. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If you're town, you won't make (in this case) him not being around an excuse. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ask away and reform your read as appropriate. You're just making excuses now. ")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil} "You did not answer!!")}
 {:user "marvellosity",
  :message
  ("like I just can't see how it makes sense to think HtS is not playing townie and to give her a no-lynch pass (!), while not questioning her in any way (despite the fact she's always here and willing to engage)")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "if you think that when she's town she plays underwhelming town I don't see the problem?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ya know, I do kinda get where y'all get the misconception that I'm always aggressive, but I actually need something hitting me in the face to want to chase after."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not seeing that. And I'm really not understanding where anyone else is seeing it, either."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Not going to just RNG someone to tunnel to satisfy y'all's expectations of my \"bulldog\" reputation, thank you much.")}
 {:user "Holyflare",
  :message
  ("although to me she looks super towny now so should be a scum read for rsoul "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "if you can't see the issue then you're also suspicious.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You did not answer!![/QUOTE]"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Because I've been pushing another player. Hold on. ")}
 {:user "marvellosity", :message ("yeah HtS is pretty town.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I still don't know why have (or at least think you have) a tunneling reputation.  Your play seems fine to me."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But you really aren't scumreading anyone at this point?")}
 {:user "marvellosity",
  :message
  ("like last time i played with HtS i was suspicious of her immediately, I don't get that impression at all this game.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "that's a shame because I can't see the issue unless you take it to the next step"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "if rsoul thinks hts is playing underwhelmingly and plays that way as town then rsoul thinks hts is towny and thus gives hts a town pass i don't see any problem (from rsouls pov) from this logic despite how super flawed it is"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "taking it a step further now hts is super towny to and questioning everything and always around so rsoul's day pass should be over but it isn't and she isn't questioning hts about anything, which IS the weird thing")}
 {:user "Chezitwo",
  :message
  ("Is my one friend really a bad program? "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Damdred",
  :message
  ("Ok so Palmar response is great. Mr. Lynch/Palomar isn't getting lynched today. Look up super bowl interview with lynch, so great."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Catching up")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Marv."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "HtS is a player who as town in the games I've played with her, I've had to stick my neck out for because she was being scumread. Our first game together it almost got me lynched in last-minute shenannies cause I hammered the other wagon instead of her while reading her town when no one else was. In Carol, again, for saying something silly to Bunnies and later jumping on a bad shenanigans vote I started."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The one game she was being townread by everyone she was scum."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That's why I don't think her not reading super town is a good reason to call her scum."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I do like where she was coming from with her read on FF and myself, though, and that mindset appears townie to me.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Because in the logic presented, there's no way that rsoultin is ever going to be interested in lynching HtS."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I understand \"when this player looks town to me, s/he has been mafia\"."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But it's another step after that to give a blanket no-lynch pass"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And another step after that to not even think about trying to read the slot any further that day (which it looks like if you read rsoultin's filter)")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "this is the complete opposite to what you should be thinking")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "well yeh that's basically what I said"
   {:tag :br, :attrs nil, :content nil})}
 {:user "marvellosity",
  :message ("that's what i said originally you moron")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "if not the complete opposite, it's certainly not right. wtf.")}
 {:user "Holyflare",
  :message
  ("checking rsoul's newbie game and carol not seen her give passes to anyone ever?")}
 {:user "marvellosity",
  :message ("does it remind you of kels in carol? lol")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lol, it sounds bad and I should just throw out names to appease the masses, but I'm not seeing it. Your entrance has been better. Others are just question marks."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not certain about several people, including Damdred, SL and Robik...Palmar for me would be a policy lynch though the vets are calling it a meta read..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But as for strong lynch them now scum, no.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I want to believe you.  I really do."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I've felt the exact same way in the recent past.  It was the game where I was mafia.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i guess a bit? not particularly"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "this strikes me as a bit weird because rsoul said hts being uninteresting/underwhelming was towny but she wants hts to become more interesting which would give the opposite read??")}
 {:user "Trfel",
  :message
  ("rsoultin, I could be convinced to defend you, you just have to give me a reason to do so.  And I haven't really found one yet.")}
 {:user "marvellosity",
  :message
  ("yeah. the whole lady-on-lady treatment there is not getting me hot."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "maybe unsurprisingly :p")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "well this post is weird.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You did not answer!![/QUOTE]"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Alright, back at you now. You're still ignoring the point that I came up with the conclusion and not you. Which is why I am not impressed. Also not impressed with all this activity going on, you're clearly in thread, Chez and you aren't really doing a whole lot. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also my mistake on the thing with Marv, you ASKED him about Fecalfeast, but the gist of it stands - you just posted his filter. ")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And your strong scumread is...?")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Typical Marv...."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "*runs*")}
 {:user "marvellosity",
  :message ("10/10 for referencing previous jokes")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Very."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Mostly it's just a conscience post, since I would feel pretty bad if town!rsoultin was lynched on Day 1 like this.")}
 {:user "marvellosity",
  :message ("what does \"like this\" mean, Trfel?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Friggin a."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "My reads of HTS have in general been independent of thread opinion, as I just pointed out. At the time I posted about her being boring her filter was entirely excuses and one list post she posted drunk."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I am allowed to say that when she's being universally townread it probably is her scumgame, while still making my own read on her. When she returned to the thread I liked her pushes."
   {:tag :br, :attrs nil, :content nil})}
 {:user "marvellosity",
  :message
  ("no when she's being scumread she is scum"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "both HF and I scumread HF day 1 in Void and we were both right.")}
 {:user "Holyflare",
  :message ("some pretty weird reactions to posts in this thread")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Many pages of constant pressure and questions from a variety of players, including two of the best players on the site, with no defense at all.")}
 {:user "marvellosity", :message ("there really are")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Do you want a metal?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The other times she was being scumread she was town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "All that proves is that in that game you two were right.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Wait, what? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "1 You have yet to interact with Robik or even discuss him from what I'm seeing in your filter. So where did any read on Robik come from? Did I miss something? "
   {:tag :br, :attrs nil, :content nil}
   "2 You said earlier you wanted to get behind Damdred's read, you appealled to Damdred, and now all of a sudden you're not certain of him? Where did this come from? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "if there's no defense at all why would you assume it's a town rsoul???????")}
 {:user "marvellosity",
  :message ("I think he means defence from anyone else dear")}
 {:user "Holyflare",
  :message
  ("there's like 3 ppl questioning her and it's only just started")}
 {:user "marvellosity",
  :message
  ("yeah that's true."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i don't think i'm scumreading trfel for it though")}
 {:user "Holyflare",
  :message
  ("and if trfel thinks scum is probably policy palmar/maybe robik/sl and rsoul at this current time, who is going to defend her?")}
 {:user "Half the Sky",
  :message
  ("EBWOP - Scratch the part about the appeal, just saw you wanted a question answered. Still doesn't explain why you wanted to get behind the read. ")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "This is wrong."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Like Holyflare and marvellosity said (and also geript in his post-game analysis), apparently Half the Sky's scum play isn't all that good (no offense, it's still at least 1000x better than my own).  She was townread in Newbie Mafia for being one of the only bastions of logic and reason in a game full of newbies.  Her being scum was simply unthinkable when facing an ocean of unbelievably scummy players.  Meanwhile, Half the Sky has a very capable town game, and she can get townread while being town, despite what you seem to have stated here."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You can't possibly argue that your play was less boring and more useful than Half the Sky's play at the point where you posted the comment in question.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "still don't understand this, the fact that you are town reading hts and like her pushes and everyone else is saying the same thing makes your meta ..... irrelevant if you are town reading her but you're still sticking to it like it's true?")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "None taken, Trfel. I think my scum game is pretty terrible actually. Throw me in a pool of veterans and I will get caught out, end of. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :i, :attrs nil, :content ("Ah, wait now...")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And that second part, I'd already mentioned, quite the double standard. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "Holyflare",
  :message ("apex/superbowl weekend is super hype btw")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I do hope you're not mafia and the italic is you mocking me :<")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "don't care about superbowl."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "the deadline on sunday is at a really terrible time for me though, my activity is going to be awful to non-existent leading up to it :/")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That was in reference to recent, not current, experience. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And as for the \"typical Marv\" joke....hey I had to. Now we're even <3")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I have considered the possibility of town!rsoultin.  I would be mafia if I didn't."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I can stand up to Holyflare's pressure when I some reasonable backing (in this case, right after I lead a scum lynch in Carol of the Bells).  I expect that rsoultin could do the same.  But pressure from Holyflare, marvellosity, and the entire rest of the thread?  Given a weak start, I would be hard pressed to find a newbie who could adequately defend against that alone.  Therefore, if she is town, some help in defense would give her some more breathing room to actually go do something."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But I can't do that, since I don't see any reason to.  Rsoultin's answers seem to have been getting worse ans worse."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I guess I probably should let up on her for now, because her defense seems to be going nowhere, but she is definitely seeming scummy.  Could lynch.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I coulda sworn someone asked me about Robik and I just said that with the claim there was no sense voting him today, but down the line if he keeps acting like he is he's on the table."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I've also already questioned Damdred on names (like Trfel's) appearing in his list of possible lynchables without an explanation."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The Trfel thing was in response to that nullish reads post, and it was what Chezi was commenting on before. I also said that I wanted to give Trfel more time, if only because I know he's trying to change his game right now.")}
 {:user "Holyflare",
  :message
  ("Yeh, there's the possibility that she's town but that's why we ask her more questions, I don't think they are unreasonable questions and the imaginary pressure shouldn't even be high if you're just defending your point of view? It's been like 20 minutes on her and it's really not as big as you're making it out to be.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "How so?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I could be misinterpreting what you are getting at, but I believe you are focusing soley on the last line of my post: \"You can't possibly argue that your play was less boring and more useful than Half the Sky's play at the point where you posted the comment in question.\""
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "In explanation, I reread Half the Sky's and rsoultin's filter up to that point, and Half the Sky's filter seemed more useful and interesting.  And I don't see how rsoultin could possibly think or argue the opposite.  I'm judging by the same standard.")}
 {:user "Fecalfeast",
  :message
  ("I'm not boring I'm just resting my eyes."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Where is sicklucker?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm leaving my vote on SL until closer to deadline if the palmar train takes off. "
   {:tag :br, :attrs nil, :content nil}
   "Damdred I was scum reading you before I went to bed but you're like town jesus now. "
   {:tag :br, :attrs nil, :content nil}
   "HTS is town, so is hf"
   {:tag :br, :attrs nil, :content nil}
   "Going to look more closely at eden, I just perused that filter and was unimpressed"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Marv did you roll scum again and, if so, can we call you chairman marv?")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "wow this is an awful post.")}
 {:user "Fecalfeast", :message ("fite me then")}
 {:user "marvellosity",
  :message
  ("it's like you've not read the last 5+ pages of the game at all. ")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You guys really expect me to base my read on HTS entirely on whether or not the rest of the thread was townreading her?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I am trying to narrow down my lynch options, which was why I considered underwhelming play from HTS not enough to vote her today. Her play has picked up significantly since then."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I do not know how else to explain this to you beyond I am not an irrational dipshit to say HTS is being scumread therefore she must be town! or viceversa.")}
 {:user "Half the Sky",
  :message
  ("Trfel, "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If you're a townie, and people are wrongly/incorrectly pressuring you, you do two things:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "1 Defence/resolution of differences - ignoring questions will not let you get townread/neutrally read by proponents of your lynch"
   {:tag :br, :attrs nil, :content nil}
   "2 Propose alternate scumreads/alternative targets based on original thought of her own "
   {:tag :br, :attrs nil, :content nil}
   "3 If you suspect one of your lynch proponents is scum and has faulty logic in pushing you, you poke holes in that and use that person as the target"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "In Student IV, I was getting wagoned to death by Damdred, Oats, etc. I survived by a sliver because Damdred did not get the vote in time. But Damdred and I had a clash regarding the use of meta - I disregarded it entirely as a new player and he contested that Kushmasta (the other wagon) was not scum. After fully and thoroughly explaining my thought process (he thought I was sheeping) on why I felt Kush was scum, he tried to keep the vote off me and eventually tried to lynch me with some regret (he flipped VT). "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Was my thinking flawed? Yes, Was it town-driven? Yes. That's what I'm driving at."
   {:tag :br, :attrs nil, :content nil}
   "I'm not seeing any such parallels here. ")}
 {:user "Fecalfeast",
  :message
  ("Seeing as I wrote half that post, made coffee, smoked weed and had a poop before I came back and finished it, that makes sense.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Questioning definitely isn't bad.  They aren't unreasonable.  I'm not saying to stop questioning her in the slightest."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I guess to me, as both alignments, the pressure on me has always seemed higher than it really is."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You guys can do whatever you want, but I think I will stop focusing on rsoultin for the moment (unless she gives me more reason to do so)."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I maintain that rsoultin's answers to the questions have been quite lacking.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "well that's not entirely the problem we have? you've just said that you DON'T base your read entirely on thread sentiment or if she's playing towny - which meant that what you said earlier wasn't very accurate. Fine, that's ok, make your own reads. However, if this read isn't entirely based on it then why on earth would you give her a "
   {:tag :b, :attrs nil, :content ("town pass")}
   " for being underwhelming????")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I understand this.  I've been pressured a lot in the past, and I'm actually quite comfortable with defending myself as town.  Which is why I was willing to make a terrible post to potentially throw rsoultin a lifeline, which I don't feel that she accepted."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I believe that your point is that you don't see rsoultin's defense as being town-driven, and I agree completely.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I didn't. I gave her a townpass for her read on me, and then on FF. A post I've already quoted once.")}
 {:user "rsoultin",
  :message
  ("To answer y'all's question...or implication I guess...as to why I'm not pushing any of you pushing me is I think most of the pressure, if not all, is coming from town -_-"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "None of you were the ones I thought would be good lynches today, and even if you're wrong I can see where your arguments are coming from, so I have no reason to change that opinion."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And yeah, Trfel, looking back through her filter that was a hypocritical statement for me to make."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What is with super townreading Damdred, may I ask? Cause I think marv and FF have both alluded to it now and I'm just not feeling it.")}
 {:user "Trfel",
  :message
  ("Rsoultin, what do you think of me now?  Earlier, you were willing to lynch me.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Earlier all you had were excuses and a post full of nullish reads again. I specifically said that you were trying to change your style, and I'd give you a chance to see if you picked it up. You did. I'm fine with you.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "A few of us have opposite reads on Eden from what you are implying. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Why don't you elaborate on why Eden remains unimpressive? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And why are you asking Marv if he rolled scum? If you ARE scumreading him, tell us why. ")}
 {:user "rsoultin",
  :message
  ("Okay, I guess what I really don't understand is the progression of Damdred's read on Palmar."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So is it a policy lynch or isn't it?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Still don't understand what this has to do with anything, and it's the question I've been trying to get him to answer."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Or this -_-"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I mean, seriously, I can just say I don't want to be lynched over and over, too. Maybe I'm missing something but this really doesn't make any sense to me.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This was about Robik @HTS."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Easy to miss when I didn't have his name in there.")}
 {:user "Trfel",
  :message
  ("Yeah, I'm actually really interested to see Damdred's thoughts when he catches up in the thread.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Personally not that impressed with Eden, either. He said a couple things I like (mostly about SL) but the whining about the night kills got old quickly and was just plain unnecessary.")}
 {:user "Trfel",
  :message
  ("What do you guys think about Holyflare and marvellosity?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Meh, c/p'd the same quote twice. Fixed now :/")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "super sexy guys")}
 {:user "marvellosity", :message ("have met HF, can confirm sexy")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I like HF. His pushes make sense. I know he's supposed to be really good at scum, but, eh, all I can go with is how he reads to me, and I think he's town this game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Marv, I dunnae. It's not like the few scum games I've seen him play. It irritates me that he doesn't understand what I'm saying...but I'm probably not explaining it well since he's not the only one. I don't think he'd put it out there that he's always correctly lynched Palmar when he's town if he was scum pushing a mislynch. WIFOM but it's easy ammunition to use against him later."
   {:tag :br, :attrs nil, :content nil})}
 {:user "marvellosity",
  :message
  ("i understand perfectly well what you're saying."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i just think you're scum saying it.")}
 {:user "marvellosity",
  :message
  ("also i am amazingly obviously town given the games i've had in the past couple months."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "hf is way, way more likely to be mafia than me (even though i don't think he is currently)")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "No law against being wrong.")}
 {:user "marvellosity",
  :message ("no laws against being scum either, only the noose")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Why do you think that Holyflare is town?")}
 {:user "Trfel",
  :message
  ("I'm just worried that one or both of marvellosity and Holyflare is scum and they are going to completely destroy us.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "the weird sl thing we had together"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "and the weird argument we had about my reasons for pushing rsoultin"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i don't feel as strongly about it as i did in void though")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Alright, back at you now. You're still ignoring the point that I came up with the conclusion and not you. Which is why I am not impressed. Also not impressed with all this activity going on, you're clearly in thread, Chez and you aren't really doing a whole lot. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also my mistake on the thing with Marv, you ASKED him about Fecalfeast, but the gist of it stands - you just posted his filter. [/QUOTE]"
   {:tag :br, :attrs nil, :content nil}
   "I can only show you the fishing rod and the place where the fish are. I cannot eat your fish. Such is the way of the Chezitwo.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "-shrugs-"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You've asked. I've answered. You've made your decision. Look me up when you've got something new. At the very least I can cackle at you from the OBS qt later for wasting the day tunneling me "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Is there a reason for your paranoia beyond paranoia?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "ummmmmm"
   {:tag :br, :attrs nil, :content nil}
   "if you think ff is a policy lynch then why do you like hts' reads on ff and give it a town pass?")}
 {:user "Eden1892",
  :message ("rsoultin what are your reads right now and why?")}
 {:user "Eden1892",
  :message
  ("also I'm back for maybe an hour or so, what did I miss besides rsoultin being scumread(?!?!?!?!)")}
 {:user "marvellosity",
  :message
  ("why don't you just read the thread and decide for yourself?")}
 {:user "Eden1892",
  :message
  ("also has IAm \"Town Jesus\" \"tGOAT\" Robik posted recently"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I miss that dude and missed him when I was skimming earlier")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I liked where her head was at. The way she approached it. Lol, why would I agree with her read on me, anyway?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I've seen a lot of games where a skilled player is mafia, and convinces everyone that they are town, and in a few days the best townies are dead and it is too late.  See Eden1892 in New Year's Eve mafia, Artanis[Xp] in Imperial Mafia, DarthPunk in Student Mafia V, etc.  For only being here a few months and not watching all of the games in that time, that is a lot of games."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Add that to Holyflare and marvellosity both being capable of playing some of the best scum games on the site....")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Don't have a lot of time, some 30 hours or so of the first day is getting devoted to work and sleep instead of productive things like mafia :/"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "As it is I've got an hour, so. Highlights? Cliffs? Play-by-play? ESportsCenter Top 10?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Do you want a list post or something? I actually have been pretty open with where I stand on everyone.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "because it's super weird to think you haven't done much in the game and ff is a policy lynch at this point and then like someone who pushes both of them when you think her being good and looking towny is her staple town play????")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I think that sicklucker and Palmar are generally considered likely scum, and rsoultin not far behind."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "A few questions for Damdred when he gets back."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Half the Sky got townread."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think that's about it?")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Lol I didn't convince anyone I was town that game, I just convinced people not to lynch me. That is the difference."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think both Holyflare and marv are okay for now given what I've read (which isn't everything yet), so I wouldn't worry yourself yet. Get worried when people start going \"wow this dude is mafia\" and for some reason a wagon isn't materializing. That's probably the best way to sort out that paranoia. Otherwise you'll turn into a donkey like me in World Heavyweight and randomly make huge shitty tunnel cases on them that just fuck up the thread.")}
 {:user "Holyflare", :message ("mafia play***")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Gimme your 3 reads in which you're most confident, one of which needs to be a suspect. I'll just filter dive you for the rest."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I ask b/c people are scumreading you and I have a strong bias toward townreading you so I wanna catch up by touching base with you")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "um so you haven't read anything but already know we're both town for now? ok?")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Wait why's Palmar being suspected? I get people getting annoyed with his troll d1 shtick but this is almost literally becoming his standard d1 town play. Like he literally just did this in Hammertime Mafia d1 and got mislynched d2. If he's mafia there's no way he does that same thing IMO")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That still reads to me like paranoia? Granted, HF completely blindsided me (with the help of GB's yelling, let's be honest) in Carol, but that actually just makes me more cautious in townreading him, not less so. And marv...well, I don't know. He seemed less interested in how things were going in the game (Imperial) he actually "
   {:tag :i, :attrs nil, :content ("played")}
   " as scum, but there were so many damn pages of it I stopped following it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "DP I had nailed by Day 2. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So...if you've got a reason to suspect them I'd like to see it. My only reason right now would be them trying to lynch a town who hasn't been playing well. Not really alignment-indicative. Someone hard-towning me would be more suspicious."
   {:tag :br, :attrs nil, :content nil})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Trfel",
  :message
  ("I don't have a reason to suspect them, I've been sheeping them this whole game.  You guys are right, I'll drop it for a while at least.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't understand this question, probably due to the lack of punctuation."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Care to rephrase?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If you haven't done much in this game at all and you think FF is a policy lynch, why would you town read HTS and give her a town pass when you yourself have exclaimed that when she looks towny she is normally mafia?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "HF and LS for town. HF is obv, and LS had a strange start imo but this looks like his townplay, he's pressuring, and he's one of the players I'm most familiar with."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Damdred for his read-progression on Palmar."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If Palmar flips scum, and people don't look at Damdred, they're idiots or scum themselves.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "because to you she's exhibiting everything that should make someone mafia iin your world - pushing policy lynches and people who haven't really done anything as mafia  and also being town read by lots of people AND also looking more towny.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I am repeating myself over and over now."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "HtS not appearing town to the majority does not necessarily make her scum. The one scumgame I played with her in she was universally townread. I've acted as something of a buffer for her in the other games we've played in, because I see things that makes me think she's town others don't. At the time of this particular post she wasn't making an impression on me one way or another, which isn't unusual for me when it comes to her on Day 1."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think that her "
   {:tag :i, :attrs nil, :content ("approach")}
   " to her reads on FF and myself seemed townie. That does not mean I agree with her reads.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Fine. Let me dig out her reads and explain it, since this is so difficult to comprehend.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "you don't understand palmar at all")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Her read was based off having a different opinion on Chez. Granted, I don't think people understood what Chez was saying when he highlighted HF's name green and posted 350 words after Trfel's nullish reads post, which was what I thought was funny and was something that Chez and I both caught..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "However her reason for thinking I'm weird to say I like chez makes sense. My read =/= hers.")}
 {:user "Holyflare",
  :message
  ("don't think that read of hers was particularly good or a good thought process at all :o")}
 {:user "Holyflare",
  :message
  ("i wish i was mafia this game so i could shoot eden and make him cry")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That post from FF caught my eye, too, because it's practically describing a good scum play...sheeping strong towns, especially those on the wrong track."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Personally, though, I'd find it very weird for FF to just say he was going to do that if he was scum, so it's not actually something I'd scumread him for and he's still a policy lynch to me, and one I frankly don't care to pursue.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I tentatively townread rsoultin pending further catching up."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The Damdred read is what I would expect from town!rsoultin. When she and I were working together in Student V, there was a lot of stuff that I wanted to recommend to her to do that I felt like I couldn't because I'd be hydraing instead of coaching. I kept some of my reads and whatnot at arm's length and spent most of my time asking her questions to help her focus her thought process. She pays close attention to detail and picks up on a lot of apparent contradictions in others' posts and questions them to find her answers. Regardless of whether you think the Damdred read is especially compelling, the structure of it certainly fits that mold. And while I admit I haven't seen her play mafia sided, I think she would probably struggle to pay the same attention to detail for her first few outings, because it's natural for newer mafia sided players not to be as attentive as they normally are, since they don't have any answers to find."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think she's town, and separately I actually do like her comments on Damdred, whose flip on Palmar was completely unexplained from a quick search of his filter. I get why he'd like Palmar's jokes and not want to lynch him, since that's where I'm at. I also get why he would view Palmar as a policy lynch, because that's where I was on d1 of Hammertime. I don't get how he could go from one to the other when Palmar's behavior doesn't change at all, and it doesn't help that he doesn't explain."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think Damdred is a good lynch right now.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "k"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "he town doe...")}
 {:user "marvellosity",
  :message
  ("this game is too difficult."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Palmar-Chez-FF-(sl) make this game too hard. makes reading other people too hard as well. it's like domino effect.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "pretty good chance he isn't")}
 {:user "Eden1892",
  :message
  ("like if he would really do the exact same thing then just lol. I really don't see it")}
 {:user "marvellosity",
  :message
  ("you don't have to see it, you just listen to the guy who's played 30 games with him")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lol, well, it's based on not understanding what I'm doing "
   {:tag :i, :attrs nil, :content ("or")}
   " most of what Chez has been posting all game, so it's actually a shit read. Which is why I said I liked the approach...where her head is at. I think it's a generally townie thing to think that people with the same reads as you are town, and those with different reads are not, or at least are likely to be scum.")}
 {:user "Eden1892",
  :message
  ("I just don't buy it man. I admit I'm a bit mad at myself because I feel like I wasted more of d1 in that game than I should have chasing my tail with him, so maybe I'm overlooking something I shouldn't be, but the pattern match is just too real for me rn")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil} "can we kill damdred instead")}
 {:user "marvellosity", :message ("don't care if you buy it")}
 {:user "Eden1892",
  :message
  ("Oh I just noticed Robik was already voting Damdred"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lol")}
 {:user "marvellosity",
  :message
  ("i thought damdred looked quite good at points."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "now i dno")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "you don't care to help me buy it...?")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "this kind of post is more aggressive than i expect from mafia damdred")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "nope, you're irrelevant")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "false"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i'm a medic dodge, not a relevant")}
 {:user "marvellosity",
  :message
  ("ok i take it back"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you're useful to kill when i'm afraid of killing people i want to kill")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "lol \"scum points\" is aggressive? is damdred just a huge wuss as mafia then or something?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Why do you want to kill Damdred?  Just for the changes in his stance on Palmar as brought up by rsoultin?")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "tier 2 is still top 10 right")}
 {:user "marvellosity",
  :message
  ("i'm only teasing eden."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "re: damdred - maybe, that was just my impression when i read it")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "for now yeah. why does he want to policy lynch palmar and then not ever lynch palmar when palmar literally did nothing different between the two statements?")}
 {:user "marvellosity",
  :message
  ("i'm feeling less confident in rsoultin and don't really know where to go with anything, so I'll probably just let other people do things for a while")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "No, now I can't do my strategy of sheep marvellosity and Holyflare to victory."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I guess it's probably time I actually did something, though.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Some of his questioning I like. Some of the LS/SL interaction he was questioning on, not so much, cause it seemed like he was pushing scum at one or both and seeing which one stuck. Like...unless you believe both are scum and their idea of awesome scum play is hardtowning each other...that just doesn't make sense."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also, come on. His whole first page was about the setup. Could town do that, yes, but why would "
   {:tag :i, :attrs nil, :content ("Damdred?")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And I will shut up now cause I'm edging back into the same reasoning I was tunneling him for last game, where I just think he's smarter than this."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The Palmar read has to be explained, though, and he's been back into the thread without doing so."
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Yes, please. You have yet to fulfill your rsoul anti-confirmation bias role in any of our games. Unless you're scum and just a lot better at hiding it this game. Then shut up.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "What does this mean?  Sorry, I don't understand.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "he can't be anti your confirmation bias when you don't have a stance for him to argue against "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil})}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "This post is weird. He quotes two things that seem scummy to him but calls me too scum to be scum and says I'm still a policy lynch, while already happy with other points against me. Sounds like some wishy-washy tmi stuff to me.")}
 {:user "Fecalfeast",
  :message
  ("oh sorry he didn't quote them HTS did but he said they caught his eye")}
 {:user "Palmar", :message ("Hey guys")}
 {:user "Trfel",
  :message
  ("Hi Palmar."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Scumreads please?")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Myself, someone made a really good meta point.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "When I do tunnel. Granted, if you kill me today I may not, but as long as I live till day 2 or 3 it will almost undoubtedly happen -_-")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Yes, please join the anti-rsoul bandwagon; it's a convenient one."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I said I liked "
   {:tag :br, :attrs nil, :content nil}
   "where her head was at"
   {:tag :br, :attrs nil, :content nil}
   "cause she noticed"
   {:tag :br, :attrs nil, :content nil}
   "the same thing"
   {:tag :br, :attrs nil, :content nil}
   "I did"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "then explained"
   {:tag :br, :attrs nil, :content nil}
   "why I don't think"
   {:tag :br, :attrs nil, :content nil}
   "that scum says "
   {:tag :br, :attrs nil, :content nil}
   "what you said"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "which is why"
   {:tag :br, :attrs nil, :content nil}
   "you are still"
   {:tag :br, :attrs nil, :content nil}
   "a policy lynch"
   {:tag :br, :attrs nil, :content nil}
   "to me"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Do I need to sing for the people in this town or something for them to understand what I'm saying? -_-")}
 {:user "Eden1892",
  :message ({:tag :br, :attrs nil, :content nil} "ROFL")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "freestyle it to the beat of someone melodramatically reading an ee cummings version of your read you gave me on damdred that was slowed down to 3.7% normal speed")}
 {:user "Trfel",
  :message
  ("I guess I don't really see the case on Damdred yet.  His change in opinion on Palmar is really weird, but almost everything else he has said seems null at worst.  Though I do find it weird that he said he was feeling really good about this game and then vanished.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "He's literally the only one that got my joke."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Doesn't really say much about him though.")}
 {:user "Holyflare", :message ("ehhh trfel aint awful")}
 {:user "Holyflare", :message ("rsoul even")}
 {:user "Holyflare", :message ("she's no sl/palmar at least")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Do you see a case on anyone, Trfel? Because that's exactly my problem this game that so many people wanted to jump me for."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "There aren't many people rising to the top and too many floating near the bottom (and yes, I know I qualify as one of those, but we've already established I'm a hypocrite, so deal)."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think that of the things I've seen married against what I know of the players (yeah, I could lynch SL or Palmar here, but it would just be because they're blah and I don't see anything scummier hitting me between the eyes) Damdred looks the worst to me."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Though I will say this...the longer SL stays out of the thread the more he seems like scum and not just irrational SL. No spazzy spamming isn't like him.")}
 {:user "Trfel",
  :message
  ("I see a case on sicklucker.  I see a case on you as well.  At the moment I see no need to make said cases.  I suppose I'm also willing to lynch Palmar."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not sure about Eden1892 and Damdred.  Need some more stuff from them.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Why not make the cases, unless all you see is sheeping others' points? I explained my read on HTS about ten times, and apart from me not acting like a rabid animal or something (and I didn't in Protoss, either) the case on me is bullocks."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden's read on me rang true, but he'd be a fool to say anything that wasn't true since I'm right in the game with him."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden, why is Palmar town?")}
 {:user "LightningStrike",
  :message
  ("I'm back and everyone been going hard on rsoultin when I had her as town and her response to the pressure reassured my town read on her. Palmar claimed scum I think? At least Tfrel might not be the best lynch today but however there isn't really any good lynches as far as I can tell for now. HF what you think of Marv this game?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("##Unvote")})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "He literally just got mislynched like yesterday in Hammertime Mafia for doing this. He dicked around most of d1 and was wrong about somebody when he finally gave a strong read so he got ML'd d2. marv can say what he wants about me not knowing Palmar's style enough, but I struggle too much to believe that he goes right back to the thing that got him lynched when he's mafia.")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "why?")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "it's not the same thing at all...")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So...you're saying that you're not voting Palmar because Palmar claimed scum?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Town or scum I don't think it can be argued that at least up to this point Palmar hasn't given a flying fuck about actually helping town find scum. I can understand reading him null and useless, but town...that I don't understand at all.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I could see this...if he was pushing anyone today, anyway. It's WIFOMy, and I'm not sure it would ever deserve a town read, but I could see why you would think this.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Her pressuring on Tfrel along with pressuring me and asking good questions that don't seem to be to much out normal behavior for her but I never played with scum!rsoultin  so I might be a bit bias on that.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "If he claimed scum he's definitely trolling. Like hardcore trolling. He tried to policy somebody "
   {:tag :i, :attrs nil, :content ("just last game")}
   " for \"claiming scum\" (when it was actually reaction test)."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He hasn't given a shit yet, yeah, and he should do so soon, but I really don't think he goes back to the same thing as mafia. I'm not saying his actions are pro-town, I'm saying I don't see them being done by mafia, which means he has to be town, whether they're actually helpful or not.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I questioning if he claiming scum or not when HTS ask for his scumreads and reading himself as scum so idk if he really claimed scum or trolling that's my thing with him.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "How is it not? The only thing missing is him suddenly deciding somebody is mafia and hardcore tunneling them the rest of the day while still trolling around.")}
 {:user "Eden1892",
  :message
  ("Seriously marv if there's some significant difference I'm missing you should explain it so I get it and know it for future games. Help a man out here")}
 {:user "Eden1892", :message ("Actual work time now bbl")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "so the only thing missing is him legimitately making a push on someone with some basis?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "duh...")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay. I don't know how to even evaluate a scum \"claim\" or \"troll\" into a read on someone, frankly. Maybe there's a heuristic out there where it's statistically more likely that's one alignment over another, but I don't know it.")}
 {:user "rsoultin",
  :message ({:tag :br, :attrs nil, :content nil} "+1")}
 {:user "marvellosity",
  :message
  ("like Palmar may or may not be mafia, but don't mischaracterise what he's doing, that's really annoying")}
 {:user "Trfel",
  :message ("I'm going to take a break, I'll be back later tonight.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I don't feel like you're thinking this through. If he's mafia he has to push eventually or he'll get lynched. Unless he buses his push will be wrong. At that point he will have trolled then wrongly pushed someone which is exactly how he just got lynched. Why put himself in that spot if he's mafia by trolling early?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "read past games")}
 {:user "Damdred",
  :message
  ("Sorry I can't be here 24/7 but work takes precedence sometimes. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Anyway a few really dumb things were said while hi was catching up. Rs isn't reading the thread again and characterized my interaction in the ls/Sl as Scum reading both etc., when I specifically said LS is fine I have an issue with Sl and how he went about it. Hf was the first to ask this."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also LS is playing differently he's playing ok honestly and that's great really glad."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not sure what everyone is in arms about when it comes to Palmar progression. He's always been a policy lynch, me saying hey I could lynch him doesn't mean it's not a policy  lynch. Me changing on him doesn't matter there since there are better lynched which is what people should realize."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Trfel looks bad still to me, Eden looks marginally worse at this stage. Sl is still Scum.")}
 {:user "Damdred",
  :message
  ("Right now I Scum read more people than I town read which is blizzard damdred world going on.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "so you've got nothing new at all? :x")}
 {:user "Damdred",
  :message
  ("This push on me feels interesting though as a lot of it feels really opportunistic especially with misinformation."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Rs has strike two Eden strike one"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Hts reading strong town interestingly enough")}
 {:user "Damdred",
  :message
  ("That's silly hf since people are pushing on me saying I was Scum Scum Sl and LS in some regard, obviously you aren't reading either."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Which is ok since you might be scum")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "no that's absolutely not true seeing as i just bolded everything you said which is identical to what you said before")}
 {:user "Holyflare",
  :message
  ("like it's one thing to call it silly for no reason but there's literally nothing different between the quotes which i've provided")}
 {:user "Blazinghand",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Vote Count")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("sicklucker (2):")}
   " Damdred, Fecalfeast"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Damdred (3):")}
   " IAmRobik, Eden1892, rsoultin"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Palmar (2):")}
   " Chezitwo, Holyflare"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Eden1892 (1):")}
   " Sicklucker"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("rsoultin(2):")}
   " marvellosity, Half the Sky"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Not Voting (3):")}
   " Palmar, trfel, LightningStrike"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Currently,")}
     " Damdred "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("is set to be lynched. Day 1 ends in "
       {:tag :span, :attrs {:id "bbcountdown1"}, :content nil}
       {:tag :script,
        :attrs {:type "text/javascript"},
        :content
        ("$(\"#bbcountdown1\").countdown({until: new Date(Date.UTC(2015, 02-1, 01, 21, 00, 00)), onTick: bbcountdownTick, tickInterval: 1});")}
       " at 21:00 UTC (+00:00)."
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Reminders: Votes are done in the voting thread "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476972-linux-mini-mafia-voting-thread"},
        :content ("(link)")}
       ". Make sure to unvote if you want to vote someone new. Voting is mandatory-- you may not abstain.")})}
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-01 00:10:44")})}
 {:user "Holyflare",
  :message ("hahaahahah bh don't think i didn't see that")}
 {:user "Holyflare",
  :message
  ({:tag :a,
    :attrs
    {:rel "nofollow",
     :target "_blank",
     :href "http://i.imgur.com/46IM8UU.jpg"},
    :content ("http://i.imgur.com/46IM8UU.jpg")})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The Palmar progression is strange because there isn't an obvious reason why you're wobbling back and forth."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And I really don't understand how you can say on the one hand that SL cannot possibly be townreading LS because of yada yada laundry list of reasons, then say that no you weren't scumreading LS. When questioned on it you said it was SL you were scumreading...and eventually you townread LS for his FF case...but it's just a really weird thought process to me. If you saw so many things wrong with LS' play, why "
   {:tag :i, :attrs nil, :content ("weren't")}
   " you scumreading him?"
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ("Damdred, the Palmar progression is what has me voting for you."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Can you explain what it is about Palmar's post being funny that makes you no longer want to lynch him? I don't understand this any more than I do the superbowl post.")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Seriously hf are you high not paying attention? Scum? Listen to me carefully, people were pushing on me using misinformation and I restated what I had already said and said why it was dumb.")}
 {:user "Trfel",
  :message
  ("Ok, I'm back.  And I think I finally realized what all you guys know all game long: I've been playing miserably."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sorry, I will go and re-evaluate my reads on rsoultin and sicklucker.")}
 {:user "Fecalfeast", :message ("I'll kill palmar ok")}
 {:user "Damdred",
  :message
  ("Really rs? I say that there are better lynched out there than Palmar and you Que on the funny part being useless ok")}
 {:user "Holyflare",
  :message
  ({:tag :u,
    :attrs nil,
    :content ({:tag :b, :attrs nil, :content ("Towny")})}
   {:tag :br, :attrs nil, :content nil}
   "marvellosity"
   {:tag :br, :attrs nil, :content nil}
   "half the sky"
   {:tag :br, :attrs nil, :content nil}
   "trfel (might be down or staying here)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :u,
    :attrs nil,
    :content
    ({:tag :b,
      :attrs nil,
      :content ({:tag :br, :attrs nil, :content nil} "Townyish")})}
   {:tag :br, :attrs nil, :content nil}
   "lightningstrike (recent posts bit weird so mehish townyish)"
   {:tag :br, :attrs nil, :content nil}
   "chezitwo"
   {:tag :br, :attrs nil, :content nil}
   "damdred (maybe down but probably not - wait for responses)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :u,
    :attrs nil,
    :content
    ({:tag :b,
      :attrs nil,
      :content ({:tag :br, :attrs nil, :content nil} "Null")})}
   {:tag :br, :attrs nil, :content nil}
   "iamrobik (probably town but putting him in null for being awful at the game)"
   {:tag :br, :attrs nil, :content nil}
   "rsoul (was a tier below but moved up, maybe down again later?)"
   {:tag :br, :attrs nil, :content nil}
   "eden1892 (play the game plz)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :u,
    :attrs nil,
    :content
    ({:tag :b,
      :attrs nil,
      :content ({:tag :br, :attrs nil, :content nil} "Scummy")})}
   {:tag :br, :attrs nil, :content nil}
   "sicklucker"
   {:tag :br, :attrs nil, :content nil}
   "palmar"
   {:tag :br, :attrs nil, :content nil}
   "fecalfeast"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "standard lists")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So if you wanna know the main reason im town reading robik. Its because in a game that ended two days ago he went on this rant about how vt is his favorite role and only one he wants. So I kind of do expect him to claim vt especially if it confirms him as town. I didnt like it but I know its in his town playbook"
   {:tag :br, :attrs nil, :content nil})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "so nothing new it is then")}
 {:user "Holyflare",
  :message
  ("like you literally just said you restated which means you've said it before which means I'm right. Thanks?")}
 {:user "Fecalfeast",
  :message ("Hey HF so far I'm down to kill both my scum buddies ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "such a great team mate")}
 {:user "rsoultin",
  :message
  ("okay, Damdred:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I do get from your filter that your point was SL "
   {:tag :i, :attrs nil, :content ("shouldn't")}
   " be hard townreading LS at that point, and I agreed even when I read it. However, all of these are good reasons to scumread LS and you didn't come to that conclusion."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Especially the second post talking about meta and whatnot, it sounded like you definitely "
   {:tag :i, :attrs nil, :content ("did")}
   " have a problem with LS play, but only insofar as it effected your SL read? I wouldn't scumread you for this alone, but it's not like it isn't oddly contradictory.")}
 {:user "Fecalfeast",
  :message
  ({:tag :img,
    :attrs
    {:alt "",
     :border "0",
     :src "/mirror/smilies/pimatyourservice.gif"},
    :content nil})}
 {:user "Damdred",
  :message
  ("Hf is more worried about being right than doing anything, he might be Scum. ")}
 {:user "Fecalfeast",
  :message ({:tag :br, :attrs nil, :content nil} "Go on...")}
 {:user "Holyflare",
  :message
  ("if my scum team is ff/palmar/sl and none of them are even around in the slightest what exactly am I supposed to be doing? People are pointing out pretty good inconsistencies with what you are saying and doing and you are telling me i'm wrong when in fact I was actually quite correct which dropped you a tier in my list")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not seeing where you said anything about better lynches? And I've reread your filter for the third or fourth time today now -_-"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Can you quote it?")}
 {:user "Holyflare",
  :message
  ("For instance their qualm with you reading palmar is that you said he was a policy lynch and then you said he wouldn't be a good lynch at all but when you returned you decided to ignore all of these inconsistencies and actually say palmar is still a policy that you would want to lynch and then rehash exactly what you've already said before - you had no new ideas and you skate around everything."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You are dodging around questions in a way where you don't directly answer to what you've done wrong and it's bugging me.")}
 {:user "Palmar",
  :message ({:tag :br, :attrs nil, :content nil} "I am here broski")}
 {:user "Holyflare",
  :message
  ("it's kind of odd that you can't actually see what I'm getting at when I'm asking you if you are just rehashing the same points, how does that concern my well being rather than getting a better read on you?")}
 {:user "Trfel",
  :message
  ("I can't explain it, but my general feeling after the events of today is that the scum has a minimal presence in the thread.  And we're all just townies arguing with each other."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This game has too many lurkers."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :a,
    :attrs
    {:onclick "return toggleShowSpoiler2(this, 1)",
     :title "",
     :href "#",
     :style
     "text-decoration:none;font-family:monospace;color:#808080"},
    :content
    ({:tag :span, :attrs nil, :content ("+ Show")}
     " Spoiler"
     {:tag :span, :attrs nil, :content (" +")})}
   {:tag :div,
    :attrs
    {:style
     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
     :id "spoiler_1"},
    :content
    ({:tag :div,
      :attrs {:class "forummsg"},
      :content
      ("And please, before you try to policy lynch me for going after lurkers, I'm still scumhunting and researching.  And you can't deny that it's possible that all of the scum are lurkers, in my first game all of the scum lurked for basically the entire game.")})})}
 {:user "Palmar",
  :message ({:tag :br, :attrs nil, :content nil} "Et tu, Brute?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "so what does your role pm say? doctor again?")}
 {:user "Trfel",
  :message
  ("Palmar."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Is marvellosity scum for wanting to lynch you?")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil} "Omelette du fromage ")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Depends on if I am mafia or not I'd think?")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Actually people read me very well you might be the exception. Ive been town like 8 games now? I have never been misynched thats a pretty good track record. I post without thinking because people always read me right when I do it. + its very fun :D. It usualy takes people a day or 2 to come around tho. Which is why im a terrible day1 lynch")}
 {:user "Holyflare",
  :message ("sl who exactly are you scum reads and why")}
 {:user "Holyflare", :message ("a brief line on each would be fine")}
 {:user "sicklucker",
  :message
  ("I havent read from the entire thread yet. (skipped pgs 33-44 reading now) So im not gonna comment on this yet")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Truffle..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Dude. Why are you so anxious about being lynched when no one is pushing you? Damdred says he thinks you're scum, but all he has about you is the post from way back before you reentered the thread."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Why were you trying to half-ass defend me by saying no one was defending me when the thread was up my ass, yet after most of them seem to be okayish nah you can make a case against me now?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What is the point even of talking about marv and HF possibly being scum together if you have no evidence to suggest that's the case beyond paranoia? Or even to suggest that "
   {:tag :i, :attrs nil, :content ("one")}
   " might be scum?")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "There's like 400 mentions of me now."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I should be a kardashian, I'm really good at getting attention without contributing anything valuable to society.")}
 {:user "sicklucker",
  :message
  ("Off the top of my head tho eden, palmer I like marvs case on rsou. Im not sure his alignment but I would lynch ff as pure policy hes garbage.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Why am I your scumread?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Explain this now.")}
 {:user "Holyflare", :message ("why eden?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So basically, when you are scum, it is really obvious right away.  But you are a bad Day 1 lynch because people scumread you for a few days before eventually deciding that you are town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You're going to have to give up one of these two claims.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not disagreeing with the premise that giving you a day or two makes it easier to read you, though I think you may be overvaluing people's ability to do so. I was back to scumreading you enough for you to be my second check in Protoss...You may be right, though, and it's just me who can't get past your irrationality."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not seeing the crazy SL in this game, however.")}
 {:user "sicklucker",
  :message
  ("Because up to page 33 you were anti town doing nothing. Marv is town and that thing were you didnt read your pm role is kind of damning.")}
 {:user "Holyflare",
  :message ("hey palmar have you actually read anything at all yet?")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I read my role pm before I started playing wtf is wrong with you."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "100% mafia"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("##vote sucklucker")})}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Talking about policy lynching is dangerous.  I'm fine with pressure, but I just included the spoiler to avoid stupid tunnels on me because I mentioned lurkers.  Even if a competent player wouldn't tunnel me for that (at least, by my understanding of mafia), the spoiler provided a useful \"just in case\" way to make sure I don't get drawn out into a multi-page argument about this post."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not making a case against you.  I'm looking through your filter and trying to see why you were being scumread in the first place, and I will take a second look at how you responded to the pressure.  I'm going really slowly because I am doing it carefully this time, unlike before.")}
 {:user "sicklucker",
  :message
  ("And palmer where was your presure marv tactic that has a 100% record of finding scum marv. Like If I had an angle that caught marv as marfia 3/3 times I would probably continue doing it")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I've never \"pressured\" marv to find out he's mafia."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Again, confirmed mafia."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Like two out of three times I've got him recently it's because of strange wording/shitty content in his opening posts. That has literally nothing to do with pressure (these instances being the \"bitch\" thing and the one where I called him mafia for the \"partially conflicts with someone else\" thing that was completely pointless)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So yes. Keep saying things like this.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "not even my role pm bro )))))))")}
 {:user "Holyflare",
  :message
  ("you gonna start playing if we leave you alive till after weekend? kinda want to")}
 {:user "rsoultin",
  :message
  ("If Palmar's goal is to be completely unreadable, I think he's succeeding -_-")}
 {:user "Palmar",
  :message ({:tag :br, :attrs nil, :content nil} "I am the void.")}
 {:user "sicklucker",
  :message
  ("Well regardless. Marv didnt give up in those games because \"you saw a tell\" he gave up because he was mafia. So if you wanted to be a perfect town player you should find a \"tell\" in everygame you two are in untill it doesint work.")}
 {:user "Holyflare", :message ("is that a yes?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i have literally no idea what you're even talking about anymore, why do you scum read eden?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Sicklucker, please answer this question.")}
 {:user "sicklucker",
  :message
  ("Shut up yes you do. PALMERS SAYING HE KNEW MARV WAS MAFIA BECAUSE OF A TELL. like who cares?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "MARV GIVES UP AS MAFIA. You fucking pressure him. and its what a town palmer should do everygame and the one time he didnt mafia marv won. So he should have learn from that mistake."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Im making perfect sense")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Have I told you whether or not I've been looking for a tell, and if I have found one or not?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You can't just assume things like that."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also this:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Do you think this is a reasonable reaction to something that's very, very clearly a joke vote?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Holyflare",
  :message
  ("i literally don't give a shit, why do you scum read eden?")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "His shit sheeping of me. Also im pretty sure he slipped. He was saying I was salty robik claimed in thread. But if im mafia I would be very happy not salty")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "This is so dumb."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I can just feign having found something and start calling him mafia... That's literally the dumbest plan I've ever heard.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "oh this nonsense again"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ("##unvote"
     {:tag :br, :attrs nil, :content nil}
     "##vote sicklucker")})}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm here so I won't get lynched.")}
 {:user "Fecalfeast", :message ("So we're back to killing SL? ok")}
 {:user "sicklucker",
  :message
  ("Also eden unvoted me. Im not even still sure hes scum because you guys havent given me time to finish reading the thread.")}
 {:user "Trfel",
  :message
  ("Sicklucker, you aren't making sense."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You are aware that marvellosity is among the best scum players on this site?  And that he is capable of not giving up right at the start of the game?  See Imperial Mafia, Palmar was town and marvellosity was mafia in the same game, and marvellosity survived."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Even with that aside, marvellosity would know if Palmar's reason is genuine or not, he is smart.  I'm pretty sure he wouldn't give up and quit over a falsified scumread."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And even ignoring that, it's obvious that Palmar hasn't been doing anything in this game.  So why does it matter if he pressured marvellosity or not, when he is clearly not playing?  The only thing that a Palmar lynch has going for it that a normal non-post policy lynch doesn't is that marvellosity seems confident that Palmar is mafia.")}
 {:user "Palmar",
  :message
  ("isn't it ironic that marshawn lynch's last name is lynch?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "What is the last thing you ate?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i was actually about to use this line for you")}
 {:user "Trfel",
  :message ({:tag :br, :attrs nil, :content nil} "A cheeseburger?")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Marvs shit scum dude. I have no idea how his winrate is so high. Hes beat me twice as scum and it wasint him that won the game it was his partner.  "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Maybe hes good when he trys but thats rare. In pyp he gave up when he got a probe read the scum qt.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "aww man, that sucks."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I just had some toast with smoked salmon and butter and some leftover wine. Shit was great.")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He also avoided lynching palmer that game like the plague. Here hes not thats my main town read on marv")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "He is definitely very good when he tries."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "By far the most important thing I said was the last paragraph.  I will post it again for you."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "\"And even ignoring that, it's obvious that Palmar hasn't been doing anything in this game.  So why does it matter if he pressured marvellosity or not, when he is clearly not playing?  The only thing that a Palmar lynch has going for it that a normal non-post policy lynch doesn't is that marvellosity seems confident that Palmar is mafia.\""
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So, why do you want to lynch Palmar again?")}
 {:user "Palmar",
  :message ("Tbh if marv thinks I'm mafia I probably am guys.")}
 {:user "sicklucker",
  :message
  ("No kidding palmer. My top town read marv with a 100% rate of calling you mafia is calling you mafia. Why are you overly defensive to me? You should be worrying about marv. I will vote with him. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The fact your putting scum on me for sheeping a read you yourself believes in probably makes you mafia.")}
 {:user "Holyflare",
  :message
  ("keep ignoring the eden stuff and fighting with the person you already think is mafia instead of reading ty")}
 {:user "sicklucker",
  :message
  ("buzz off. Now I just read the thread tilted so I probably have to reread it. Be back in 20+ need  exercise.")}
 {:user "Trfel",
  :message
  ({:tag :b, :attrs nil, :content ("rsoultin")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Rsoultin's stance on Half the Sky was off.  It's been pointed out already why the stance is wrong, so I don't feel the need to do it again.  I also didn't particularly like Half the Sky's read on FecalFeast."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Then when rsoultin started getting questioned, she blew the first few questions off.  I guess that's not completely out of character, but I don't really like it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And while I still really don't like the way she responded to the questioning, it seems mostly consistent throughout.  And I really do like rsoultin's comments on Damdred's read progression on Palmar."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This is the other weird quote from rsoultin.  Before this, she said that I seemed suspicious, after this she said that I seemed suspicious.  With the same reasons both times."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But that's about all that I see.  Nowhere near enough to make me want to lynch rsoultin, since she provided consistent explanations, even if I disagree with them.  Therefore, I apologize for jumping on that wagon like I did without checking the support first.  Marvellosity and Holyflare did a fine job of questioning, I didn't need to go yelling too."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "On a side note, I am really curious.  Rsoultin, I've been a member of this forum for three years longer than you have.  But you have nearly four times as many posts as me, and we played the same first game.  How the heck did this happen?")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "What the hell are you on about. I cannot by definition agree with a read that says I'm mafia, even if I was mafia. Marv is wrong about my alignment, hell he isn't even sure I'm mafia."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also, please explain why you defended yourself so hard against a joke vote. Please don't change the subject.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You usually die a lot earlier than me, for one. I also generally post more than you do. Sometimes to the point of excess, which is something I'm trying to cut back on after being mislynched by Damdred and geript who somehow thought that I seemed scummier than DP for dumbass reasons.")}
 {:user "Trfel",
  :message
  ("Rsoultin, what do you think about sicklucker, given his recent return to the thread and posts?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If there's a vig in this game he should be shot. Actually, a lot of people should be shot, but in all seriousness I don't understand what he's doing even more than I usually don't understand what he's doing."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That he's the only one Palmar is actually fighting with could be significant, but Palmar's so frustratingly unreadable to me, too, I kind of just want to auto-block them -_-")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I see where you are coming from.  Perhaps you can help me go through sicklucker's filter and together we can get an okay read on him?  I'm trying, but I don't think I'm getting anywhere.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sure. Was there anything in particular that stood out to you?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Sicklucker, what are you trying to say here, in both of the quotes?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "\"Last time I pressured marv he ragequit or something\""
   {:tag :br, :attrs nil, :content nil}
   "\"I pressured him he claimed town and we moved on\""
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You refer to different games, right?  But the way you say this, you never changed the subject, so it seems like you ought to be talking about the same game.  Please explain what you are trying to say.")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "what joke vote? I dont remember maybe because im a serious person")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "First weird thing, what with praising LS for calling out Robik on making it easier for scum to use PoE. Probably has already been mentioned by people though.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Here he says that he doesn't want to pressure marvellosity and make him ragequit.  But he has repeatedly said that he wants Palmar to pressure marvellosity because he will give up if he is mafia.  I guess he is trying to say that Palmar's pressure will make marvellosity quit only when he is mafia, but sicklucker's pressure will make marvellosity quit as either alignment?  I just have a lot of trouble understanding this, and that makes me wonder if his view on if and how marvellosity should be pressured was fabricated.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I just quoted the occurrence a few posts ago.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Also this, what the heck?  Damdred is scared of something, so he scumreads sicklucker.  And that makes sense?")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Cant talk about this I dont think?. There has been way to much rulebreaking already. I only did because they started it")}
 {:user "sicklucker",
  :message
  ("Keep me around and we can talk about all that stuff. I will prove im town like I always do. Im not sure how active ill be tomorrow because of the superbowl but im all yours tonight")}
 {:user "Trfel",
  :message
  ("Holyflare brought up a really good point about both himself and Eden1892 calling sicklucker salty, but sicklucker only scumread Eden1892 for it.  Sicklucker never responded to this."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I can't tell if sicklucker just missed Holyflare's posts (he did say that he ignores Holyflare, but huge pictures of salt shakers are kind of hard to miss), or if he was trying to make a scumread but not wanting to get attention from Holyflare.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Any comments on the posts that rsoultin and I have made starting from the second to last post on Page 46?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And yeah, you're right, I suppose that inactivity for the Super Bowl tomorrow is understandable.  I'm the one who is going to miss the lynch deadline...  which means I'd like to get a pretty good idea of who to vote tonight.")}
 {:user "sicklucker",
  :message
  ("No I caught it. I thought hfs context was more joking. While edens context was serious I should reread. They could also be mafia together")}
 {:user "Trfel",
  :message
  ("Grr, I don't know about sicklucker any more, either.  His filter is full of apparent inaccuracies and inconsistencies, but I can't tell if it is the normal amount or if it is significantly higher.")}
 {:user "rsoultin",
  :message
  ("You know, honestly, trfel, there are a lot of things that don't make a ton of sense in SL's filter, but I am getting the impression that he somehow believes them."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The meta thing he said was what Eden has been pressuring him on."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And, for whatever reason, he does seem to think that his actions have a huge impact. Like I don't really think that him saying he was town a lot actually caused the scum team to concede in our last game, but I can see him thinking that was the cause? Just like I can see him thinking that because he pressured marv once, and marv gave up and was town, that if he pressures him again he'd give up again."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "His point that palmar should be pressuring marv to see if he's scum (not the rest about making things up) isn't a terrible one."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "SL...is your read on Eden pretty much just entirely because he's scumreading you for being angry at robik?")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "THREE TIMES. THREE TIMES 3 OUT OF 3")}
 {:user "rsoultin",
  :message
  ("You've pressured marv three times when he was town, he gave up all those times, and he was town all those times?")}
 {:user "sicklucker",
  :message
  ("My eden read was an early day 1 read. Take it for what it is but I did unvote him ")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That was your typo not mine")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Like whats your angel here. You know we both ment mafia instead of town.n. Its scummy")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I know you unvoted him, SL, but you were still scumreading him earlier. Has that changed now?")}
 {:user "sicklucker",
  :message
  ("I have to reread his filter. Ive spent the entire day answering questions. ")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Wait, you definitely said that you didn't want to pressure marvellosity because last time you did that, he gave up, and he was town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Did you mean to say scum there too?  So you don't want to pressure him this game because last time it worked?  I don't understand.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It's not an angle."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Trfel was asking why you didn't want to pressure marv but said that palmar should."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I was under the impression that you'd pressured marv when he was town and he gave up...which is the part of my post you bolded. Then you said it was three times? Either my facts are wrong or you didn't realize I was talking about you there. Or both.")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That was more of a joke because he replaced out of that. And its an ongoing game. Literally all your qeustions are about an ongoing game stop it plz.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Sorry, I didn't realize that I was talking about an ongoing game.  I'm just trying to understand things that don't make sense to me."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If that really is true, than you probably shouldn't have brought it up in the first place.")}
 {:user "sicklucker",
  :message
  ("No I dont actually think I made marv rage quit by pressure ROFL. He also flipped town and I town read him")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But I didnt bring it up others did. Thats a huge reason why im pissed. Everyones reason for wanting me dead is pretty much ogi.")}
 {:user "rsoultin", :message ("What is ogi?")}
 {:user "sicklucker",
  :message
  ("Like ff hates me. palmers sick of my spamming. Theres like 3 others I cant talk about ")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "out of game information? I think?")}
 {:user "Fecalfeast",
  :message ("I don't hate you SL, I think you're scum. <3")}
 {:user "sicklucker",
  :message
  ("Like I really do think you hate me but its not a fact. You have voted me in everygame weve ever played regardless of my alignment.")}
 {:user "rsoultin",
  :message
  ("Well, if it makes you feel any better, SL, I don't see anything you're doing as being so much worse or different than all the other games I've played with you when you were town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Have to ask, though...what makes you think robik claiming named vt makes him town?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He's got no presence in the thread whatsoever -_- despite crowing that we should follow his lead.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Well, Hammertime mafia just ended, so we can talk about that now."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Robik had a free hammer win in that game for a few hours, but didn't take it.  I'm guessing that he ended up being really really busy today.")}
 {:user "sicklucker",
  :message
  ("I think robiks town because of what he said at the end of pyp. Even tho he was mafia he had already knew it was over so I doubt he was lying."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But it is weird he hasint done anything else.")}
 {:user "sicklucker",
  :message ("Well there you go. Did mafia win that game?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Yes, but the point is that IAmRobik probably just hasn't been online all day."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I agree with rsoultin that it seems silly to lynch a claimed role on Day 1, even if it is just a named VT.")}
 {:user "Trfel",
  :message
  ("Rsoultin, how strongly are you scumreading Damdred?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'll be gone for a short while.")}
 {:user "rsoultin",
  :message
  ("I still don't think he's a good Day 1 lynch cause of the claim, even without reason to believe he's just got stuff going on irl..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I guess I just don't see how him liking being VT precludes him from fake-claiming it. Really, though, I don't see a good scum "
   {:tag :i, :attrs nil, :content ("or")}
   " town motivation for it. It's just kinda there.")}
 {:user "Half the Sky",
  :message
  ("Wrapped up a film, bitched about Hammertime mafia, and now back here catching up. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I also drank a load of wine as well, but I should be able to manage. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Let's see what I missed here. ")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Strongly enough that I don't think I'm down for a lynch that isn't either him or Palmar. His responses to not just my questions but several others' aren't making me feel any better about him."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "They don't even have the benefit of actually being reasonable explanations that I have to decide whether or not he's lying about...they simply aren't answers at all. Which means the problems I had with his play earlier still stand, particularly in regard to Palmar.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Yes they did. I made a fundamental error in lylo, I AFK voted, but back on topic...")}
 {:user "sicklucker",
  :message
  ("ff true or false? Ive been your top scumread in 5 games where we were both town?")}
 {:user "sicklucker",
  :message
  ("ff true or false? The one time I was mafia you didnt really vote me till final 3/4?")}
 {:user "Fecalfeast",
  :message ("I see what you're saying. Stop being scummy, I guess.")}
 {:user "Trfel",
  :message
  ("Ugh, I keep going back and forth on sicklucker.  His play does feel worse than in previous games.  The scumread on Eden1892 is potentially the least logical scumread sicklucker has ever made.  Am I wrong on this?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I guess, I think that the main thing Damdred has going for him is that his tone felt towny.  And I liked how he said he was feeling good about this game.  Though he hasn't delivered on that, so...")}
 {:user "sicklucker",
  :message
  ("Like everyone agreed with my eden read early on. Why the flipflop? If someone thinks im scum. But also thinks im mad because a townie outed his role Im going to think somethings up. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Its a weak day1 read. But it is a solid read imo")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I don't remember anyone agreeing with your Eden1892 read.  Quotes?")}
 {:user "sicklucker",
  :message
  ("Like its a double standard. He cant think im scum and be mad at the same time. Idc what hf says I read eden for this not him. "
   {:tag :br, :attrs nil, :content nil}
   "Eden was way more serious about it and used it as a reason to scum read me. Hf just said I was salty but never scum read me for that point")}
 {:user "sicklucker",
  :message
  ("Maybe not my read. No one ever agrees with my reads even tho I have proven to be very right in past games so no surprise there. I more ment people thought eden was scummy for the first 24 hours since then all I hear are town reads")}
 {:user "rsoultin",
  :message
  ("Lol, eden is the only one who really defended me and I'm still a bit suspicious of him anyway, though not to the same degree as I am of the other players I've mentioned. Maybe this makes me a lunatic."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Someone saying they're happy to be playing the game is just so not enough for me to read them town -_- @trfel")}
 {:user "Half the Sky",
  :message
  ("My word, so much to read. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Let me talk about Eden for a bit....here's my latest take given his talk on Palmar. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Now that Hammertime has just ended (we got endgamed), I feel a bit more free to talk about this game...at the off, I understand Eden's perspective given my own experience with him from Hammertime and NYE games with the nightkills. Eden was scum in NYE and N1'd in Hammertime. It seems like you are treating it as fluff, which might make sense since you had not actually played with him, but yet I'm treating it in the same vein as Trfel when he mentioned getting killed prematurely (something along those lines), that part, anyhow to be NAI. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The problem I think is Eden townreading Palmar given his behaviour in Hammertime, he was trolling like crazy, and he got lynched and he flipped town. "
   {:tag :b,
    :attrs nil,
    :content
    ("However, Palmar also contested in Hammertime that he did not have a meta and he acts different every game. So I'm still inclined to leave Palmar as a null/policy lynch since I think he can troll as either alignment.")}
   " Palmar specifically berated me in Hammertime for trying to meta him, and now I can see why. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I see Eden saying that why would Palmar put himself in a position to do this again as mafia, but again, when others are being questioned and scumread, do you think someone like Palmar would have the motivation to shape up, even if he was mafia? He sure didn't have that motivation in Hammertime, and ironically was hammered in that game whilst I was asleep. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So I don't feel his play deserves an instant townread at all, I disagree with Eden on that. ")}
 {:user "Half the Sky",
  :message
  ("Sicklucker is making my head spin at the moment honestly. Ugh. Going to come back to him. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Going to examine the whole Damdred read progression. Unless I missed something when I first read, Rasputin found something wrong with it, and Trfel did not pick up on anything wrong. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "HF is still looking fine by me. Marv I know had mentioned something recently about changing his towngame or rather toning it down, and I'm keeping that in mind. Right now, I'm not sensing anything off about either of them. ")}
 {:user "Half the Sky",
  :message
  ("Sidenote: Is anyone here in thread atm? Anyone want to talk about anything off the cuff whilst I'm still trying to filter dive? ")}
 {:user "Damdred",
  :message
  ("I'm sorry the push on me feels so idiotic. If you want me to play with super static reads that aren't whimsical at points then I'll just stop playing mafia"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Rs is borderline strike three for me as I've said a few times who look the worst for me. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Anyway I don't feel a palmar lynch and would feel comfortable lynching into these people"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Trfel"
   {:tag :br, :attrs nil, :content nil}
   "rsoultin"
   {:tag :br, :attrs nil, :content nil}
   "sicklyrker "
   {:tag :br, :attrs nil, :content nil}
   "hf"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Half the Sky",
  :message
  ("Think I'm going to stay up until roughly 4:30am or so again, so if anyone's here and wants to discuss stuff, shout please. ")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm here, but I've been playing this game all day and am a bit tired.  With IEM starting, I'm not sure how much effort I will put into this before I go to bed."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Though I do want to take a closer look at Damdred before I go to bed."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Again, I need to leave a few hours before the deadline tomorrow, so it would be nice to get some consensus on who we are lynching before then.")}
 {:user "Damdred",
  :message
  ("Like there's nothing at all wrong with my progression on ls/sl interaction or palmar."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Like this is one of the stupidest things I've ever heard."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "also four page filter 24 hours into game amazing for me working two 16 hour shifts.")}
 {:user "Half the Sky",
  :message
  ("Thank goodness. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay, I was scumreading Rasputin earlier and even voted her before AFKing. I'm trying to look harder into her read on you and making sure nothing is taken out of context. That must have happened either when I was afk or whilst looking at someone else. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Damdred - I think strike one was Rasputin not reading thread (which you gave me as well and I went back and found my mistake), strike two was her push on you, which you are contending has misinformation and strike three was her saying you're not answering her questions? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Seems like the brunt of this contention happened when I AFKed, so let me look into this from both sides...")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It's not about static reads. It's about "
   {:tag :i, :attrs nil, :content ("why")}
   " they're changing, or rather, the lack of any obvious reason for them to change, particularly in regard to Palmar."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It's about basically browbeating SL for townreading LS, listing off all the reasons LS is scummy (which is why he shouldn't be townread by SL), then saying you're okay with LS."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "At points I've agreed with you, but they're few and far between, and I'm not really feeling any of those lynches you've got down there. What's your problem with HF other than his questioning you?")}
 {:user "Half the Sky",
  :message
  ("Also Damdred, that HF scum read....and Trfel...."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Can you explain in one-liners why you are scum reading either?")}
 {:user "Trfel",
  :message
  ("I did not notice what rsoultin pointed out about Damdred, but now that it has been pointed out, I do agree that it seems off.  Damdred's filter was not overwhelmingly bad, but I definitely want to take another look at his filter."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I would really like to hear more people's thoughts on sicklucker.  I'm having a lot of trouble reading him."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Damdred, can you explain your scumreads in more detail please?")}
 {:user "Half the Sky",
  :message
  ("Yea I remember seeing the questioning from HF when I first read, which seemed in line with his earlier play, nothing unusual jumped at me with that. ")}
 {:user "Trfel",
  :message
  ("Half the Sky, before you go to bed, it would be nice to know who you are willing to lynch so I know where to leave my vote.")}
 {:user "Fecalfeast",
  :message
  ("Someone give me a filter to look at or something I'm bored. ")}
 {:user "Damdred",
  :message
  ("Basically. RS has been throwing misinformation around all game and seemingly playing towards not reading the thread for example when he was asking Marv why he wanted to lynch palmar when it was clearly stated in marvs filter and the thread obviously. RS claims to have missed it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He then went on to mid inform the thread about how I was reading ls, which got him strike one with me. You did as well but you found your mistake. RS repeats that mistake later by again misinforming the thread in the case how I am reading ls."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He is hounding me about me going from saying I would lynch palmar to not lynching. I mean that's just preference in not sure what else to be said I think there are scummier people and palmar was funny. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "if I have to explain it 10 times I will but its bad")}
 {:user "Trfel",
  :message
  ("Ok, that convinces me.  Time to look at Damdred's filter.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "RNG it?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Have you seen my points on Damdred? If they're not valid, would you tell me why?")}
 {:user "Trfel",
  :message ("FecalFeast, I would suggest Damdred or Sicklucker.")}
 {:user "Damdred",
  :message
  ("This is great. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "LS is a hard read half of the fucking thread was on SL because ls is a hard read but I'm scummy for it? Ls is fine, the read on him was the issue."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Damdred",
  :message ("Cause you guys are bad or scum not sure which tbh")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Just a little bit ago, you sounded pretty sure."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Still no explanation of the rest of your reads?")}
 {:user "LightningStrike",
  :message
  ("To be fair most of the new players in the Newbie game called me scum so I need to work on my own play. Anyways I seeing the latest exchanges about Robik and I do think Robik is just busy atm because in Hammertime Mafia he had the chance to Hammer people for a good like 3-4 hours but he didn't exactly hammer anyone. I really hope he is active all of tomorrow.")}
 {:user "Damdred",
  :message
  ("Lynch tr after I flip town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "already explained most of everyone")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not stopping anyone from reading your filter."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not saying I give a flying hoot if you scumread someone earlier and townread them later. I'm saying it's "
   {:tag :i, :attrs nil, :content ("weird")}
   " to attack SL with how many ways LS looks scummy, saying SL is scummy for townreading him, and practically in the same breath saying you see nothing wrong with LS. "
   {:tag :i, :attrs nil, :content ("That does not make sense to me.")}
   " That you townread him later for decent reasons notwithstanding."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So all you can give me for your read change on Palmar is that he said something funny? I still don't understand that explanation, but okay, maybe you're really that fickle. I don't know."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Can you explain your read on HF please?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You gave one-liners that I generally found questionable.  Which is why I asked for more detailed explanations, since I have trouble believing the current reasons.")}
 {:user "Fecalfeast",
  :message
  ("Damdred I am diving your filter, what is your updated read on eden?")}
 {:user "Damdred",
  :message
  ("I don't get why palmar is so hard to wrap your head around, I didn't say he's town like you are inferring  I said I didn't want to lynch him stop being dense."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Idk why you are being purposefully dense about ls. SL gave a question mark a hard town for nothing ok.")}
 {:user "Damdred",
  :message
  ("Nope re I think your scum gave more than one line you aren't reading."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden is so-so hate the push on me generally being useless")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Yeah, you gave more than one line.  Yesterday.  A lot of stuff has happened since then."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This is your old view on Holyflare.  Then you changed it with the only explanation being something like \"Holyflare isn't concerned with solving the game, just being right.\"  Can you provide examples to support this?")}
 {:user "Fecalfeast",
  :message
  ("Damdred looks fine to me. No glaring contradictions or anything. His reads stay consistent, he's scumreading SL... "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'll check eden's push but can someone give me the spark notes on why damdred is scum?")}
 {:user "Damdred",
  :message
  ("And hf isn't really trying to figure anyone out honestly. He's more concerned about being 100 percent right and saying he's misread or joking about reads than actually push something sustained.")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "And here's something I didn't notice. readingfeast")}
 {:user "Damdred",
  :message
  ("Tr is admitting to NOT reading the game lynch them with fire ")}
 {:user "Damdred",
  :message
  ("Like hf before and after that talked about me needing to admit he's right, did something similar to someone else and he's pretty forgettable and not pushing the thread he's scum."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I found two so far")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Is this all the push from eden? I don't see why this has you so bent out of shape.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "And you are the one who is not commenting on the game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm going through your filter right now.  Please, go ahead and dig your own grave.")}
 {:user "Damdred",
  :message
  ("I'm most unsure about RS cause she could honestly be just being bad by misunderstanding I'm not townreading palmar meh."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Damdred", :message ("Can't wait to flip town then.")}
 {:user "Damdred",
  :message
  ("Please lynch trfel and hf if I get lynched."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not purposefully being dense about anyone, Damdred -_- Though that word is used to describe me so often lately I may just use that as a smurf if I ever make one."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Not wanting to lynch someone you could lynch a second ago solely because they said something funny is just...eh. I've beaten this point to death. I was hoping you had something better cause I don't think that'll ever make sense to me."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I get that on SL. I pressured him, too, for similar reasons."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It's just you sad what...that he LS wasn't scumhunting. That he wasn't acting like he does when he's town. That he didn't have 3 townreads already based on meta...then nah you're okay with LS when you're asked. Just finding it hard to buy that those arguments don't add up to at least a scumlean. What more would you need from LS to call him scum?")}
 {:user "Fecalfeast",
  :message
  ("Why are you already martyring? There's more than 15 hours or something to go..")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm fine not mafia reading ls at the start when he's not there and has limited posts. I keep people around I generally enjoy reading palmar is enjoyable and made me laugh in a bad day especially when we have all these better lynched in the thread."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "like I wasn't even super excited about lynching palmarbi dedicated like 8 words to it and like 100 to SL and trfel and you don't see the difference?")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not marrying but the push on me is horrid, hf should know its bad and is just spectating and not leading. Trfrl is just sheeping onto something that is easish to push at this point and RS is tunneled."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "out of this RS is most likely town sadly. ")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "My read on Ls is very good. Ls likes to sheep people. But he had a good read as to why im not mafia and went agains tthe grain and called the leading wagon at the time town. Ls is toen")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "His push on me was more clinical than anyone else's. I wasn't the only one he did that with, but I can't really remember who the other was at this point.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm not scumreading you.  I'm looking at your filter in an attempt to discern your alignment.  There is a difference.")}
 {:user "Half the Sky",
  :message
  ("Okay here are my thoughts on the exchange. Had to read the thread and filters several times..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What I'm going to try and do here is analyse what Damdred said in the context of where these quotes were in the thread. The problem I have with Damdred's first quote (filter page 2, thread page 25) is \"he might be willing to lynch Palmar\" but there's no reason given. Amongst the other reasons cited in thread before Damdred posts is a meta read cited by Chez, Marv's read on him (looks like it's PoE based since he had nothing on others), before Damdred says \"I might be willing to lynch\". So I cannot tell at face value whether Damdred is sheeping what appears to be scum reads that others are making on page 24. When I say I think Palmar's policy, that's when he says the same thing (second quote posted here)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Only after that time Damdred posts the begging out part. But Rasputin, I see this post by Damdred, and seeing your response in quote, why was this concern not resolved when he posted this seven minutes later?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Should I just assume you are disagreeing on meta?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Another quote that has me a little confused from Damdred: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I can understand the confusion on Damdred's progression but I can't seem to see why Rasputin says this in her quote 5h later"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "...when she acknowledges him 5m later (per timestamp). "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Am I misunderstanding something? ")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I find it does this as either alignment. He always has to be right hes that kind of guy. remember that huge pointless fight in mspaint?")}
 {:user "Half the Sky",
  :message
  ("Ras, can you clarify what exactly question you were trying to get him to answer? Something isn't making sense to me when I'm reading this..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Was it this?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "As in you're trying to figure out why he was scumreading him? ")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It's Day 1. Everything's horrid. Nitpicking my HTS read to death when most of my defense was just quoting myself or repeating what I'd already said is horrid."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't get what you're doing."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But okay, I will pull back on you to give you space, cause right now it looks like you're just scumming people pushing you...and SL."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Do you have any reason to believe the people you are scumreading are scum that isn't Damdred-centric? That includes reading (or not reading) posts that you've written. Your initial case on Trfel was before he re-entered the thread.")}
 {:user "Half the Sky",
  :message ("Going to move on to the SL/LS thing...")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "ok I'll admit it is kind of null for hf to just want to be right."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "However, look at this game tell me what he's pushed and not backed off of?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Yeah, you missed my question. You can find it in my filter cause I still need to read your other post. I asked him why Palmar being funny had an impact on why he wanted to lynch Palmar or not.")}
 {:user "Half the Sky",
  :message
  ("Given the discussion on LS right now..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Off the cuff, I'm getting the usual LS town read from what I've read of him so far. LS is someone however, that people do tend to scumread, sometimes as has been said he's not fully articulate and sometimes a scum player can take advantage of that (honestly, I did in Newbie LX...yeah I know LS even mentioned he's still bitter on that). "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Even in Carol, he was sheeping left, right, everywhere and the only reason he wasn't being scumread in that game was because he claimed a ghost fairly early on. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So someone (not nec Damdred) scumreading him could be a potential red flag, maybe. ")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Is there anyone scumreading him??")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't give a shit if it's bad??????? I literally said you hadn't updated your reads this game since you left and you lied and said you did, I don't even scum read you and I posted my list of reads which you bluntly ignored and instead decided to say I don't care about my reads (lol)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Just because I don't give a crap about defending you from bad pushes doesn't mean i'm mafia rather than lazy.")}
 {:user "Half the Sky",
  :message
  ("EBWOP - someone scumreading LS could potentially be a red flag, if it appears he's going for an \"easy lynch\" etc. ")}
 {:user "Fecalfeast",
  :message
  ("everyone give me thoughts on chezzy-2 please his filter is gross")}
 {:user "rsoultin",
  :message
  ("@HTS"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "this..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I've scum read SL from the start who hasn't pushed me."
   {:tag :br, :attrs nil, :content nil}
   "Trfel was scum read before they re entered thread. And I didn't like trfel after that doesn't have many original thoughts sheeps opportunistic big pile of null etc."
   {:tag :br, :attrs nil, :content nil}
   "Hf hasn't really pushed me just he's not being him."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think the statement in only scim reading people who push me is wrong")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "A++ reading damdred, maybe that's a strike two for you?"
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ("and this just a few minutes later..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Discussion on previous page: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Throwing my two cents. Still looking into the part with LS/SL before I move on. ")}
 {:user "Half the Sky",
  :message
  ("Cheers Rasputin. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "(In the meantime I've unvoted you. I get the sense what you have been doing is town-driven. Accurate, that's another question...)")}
 {:user "Holyflare",
  :message
  ("I literally think nothing anyone is talking about is relevant at the moment. Focus on SL and his inconsistent shit, I'm pretty sure he's mafia and he STILL hasn't acknowledged this at all:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Fecalfeast",
  :message
  ("HF is that still your complete list or is anything different?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm sorry? Which of the three of us hasn't been pressuring you? (Maybe it's the wording I'm using.) It's not factually incorrect...I already indicated SL was the outlier."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I need to relook at trfel. I haven't really had the opportunity lately.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "He actually did respond to this."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I like rsoul a bit more, damdred has moved sideways and the afkers are dropping (chez/robik), I agreed with chez at the start on you but I did that in the last game I played with chez and he afk'd and was mafia")}
 {:user "Trfel",
  :message ("Yeah, in the end I'm just not sold on a Damdred lynch.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "More specifically talking about the second quote where damdred me AND eden all have the same read and to sl damdred's read was TOTALLY just, eden's made him mafia and mine is irrelevant."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "wut")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Well, if you think I'm wrong, you really should speak up. I'm trying to find reasons Damdred isn't a good lynch, which is why I'm questioning him still.")}
 {:user "Damdred",
  :message
  ("Omfg just lynch trfel this is hilarious."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'll deal with hf later or something, but trfel is so scum")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "If you were to look at chez with the read on me omitted where would he be?")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Since you're in here, to be blunt, yours isn't much better, especially when I see this: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Damdred's progression has been a point of contention, you would go a far way to say in detail why Rasputin is wrong. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Plus, you are saying he looks fine but then you're asking for the notes on why damdred is scum? Why aren't you making your own conclusions? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Start by reading pages 24-26...")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I don't think that Damdred is a good lynch."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Reading through his filter, it does seem like overall he is trying to discern alignments.  I disagree with his methods and results, but it looks like he is generally trying."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm still suspicious of him, just like I am suspicious of you (rsoultin), but I don't think either are good lynches for today."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The change in view on a Palmar lynch is probably the biggest point against Damdred, but I don't think that is enough to lynch him.")}
 {:user "rsoultin",
  :message
  ("FF, specifically what is it about chez?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He hasn't been very active which is an immediate red flag...I did like several of the points he made when he made them, though, like the wordcount one. He reminds me a little of my brother. Sarcastic git. (Which may make me predisposed to like/townread him when I shouldn't).")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "If I think he looks fine, why would I not want to know why others are reading him scum? I'd rather see it from all angles... I'll look at the pages in question.")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm like totally devoid of feeling at this, I just explained hfbisnt pushing me. Tfrl is independent of the push since it came before? ")}
 {:user "Trfel",
  :message
  ("What do people who aren't Damdred think of my alignment?")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "A feeling/underwhelming filter. I'm looking for opinions because it looked to me like he was just poking and prodding looking for easy targets/low hanging fruit but nobody really talked about him.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Can you elaborate on Robik's scum meta? Does he tend to afk?"
   {:tag :br, :attrs nil, :content nil}
   "Just finished Hammertime, and he was scum. AFKed in that game largely. Not sure if that's a regular thing with him. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "Trfel",
  :message
  ("Chezitwo is clearly playing the game in his own way.  He is reading it, and I'm assuming that he is understanding it, but he isn't providing many thoughts to the thread.  I see it as nothing more than a policy lynch."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If he keeps this up, I could become much more willing to lynch him.")}
 {:user "Damdred",
  :message ("Robik is super spammy as town usually he's afk as scum")}
 {:user "rsoultin",
  :message
  ("HTS and I have both talked about him some, FF, but he did fall beneath the radar as the day went on. Hold on and let me see if I agree with you on the actual content."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "@Damdred...eh, we're just gonna disagree there, I think. The more important part was your reads. I'll look into Trfel. You and Trfel can both expect an answer to your questions then (though probably in the morning @.@)."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Chez first.")}
 {:user "Onegu",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Vote Count")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("sicklucker (4):")}
   " Damdred, Palmar, Holyflare, Fecalfeast"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Damdred (3):")}
   " IAmRobik, Eden1892, rsoultin"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Palmar (2):")}
   " Chezitwo, Sicklucker"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("rsoultin(1):")}
   " marvellosity,"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Not Voting (3):")}
   " trfel, LightningStrike, Half the Sky"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Currently,")}
     " sicklucker "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("is set to be lynched. Day 1 ends in "
       {:tag :span, :attrs {:id "bbcountdown1"}, :content nil}
       {:tag :script,
        :attrs {:type "text/javascript"},
        :content
        ("$(\"#bbcountdown1\").countdown({until: new Date(Date.UTC(2015, 02-1, 01, 21, 00, 00)), onTick: bbcountdownTick, tickInterval: 1});")}
       " at 21:00 UTC (+00:00)."
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Reminders: Votes are done in the voting thread "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476972-linux-mini-mafia-voting-thread"},
        :content ("(link)")}
       ". Make sure to unvote if you want to vote someone new. Voting is mandatory-- you may not abstain.")})})}
 {:user "Damdred",
  :message
  ("Here's the thing hf, I don't see the typical hf oush or cling onto truly scummy things. You push things forget them move onto other things come back leave. You are strangely absent from the thread as well as the game foes along."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "also not sure what your list post has to do with anything as I never said you pushed me just that you wernt playing like you")}
 {:user "Trfel",
  :message
  ("I guess a sicklucker lynch wouldn't be terrible.  I'll leave my vote there for now.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "EBWOP:"
   {:tag :br, :attrs nil, :content nil}
   "I'm sorry, FF, but I really do like Chez this game. His posts are contributing, they're not sheeping others' reads...and yeah maybe they're not as direct as you like but I can follow them easily enough."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He's not someone I would lynch today, certainly not based on this information.")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "OK so are you talking about how he goes from \"I don't like palmar for being trolly\" to \"Palmar is policy at best\" or what? Just because he doesn't like someone's play doesn't mean he can't acknowledge when it's a policy lynch.. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm looking at rasputin's filter right now and I'm confused as to where I said he was wrong....")}
 {:user "Trfel",
  :message
  ("I guess I just don't understand why I am being scumread by Damdred.  I'm pretty sure my filter in this game is longer than my filter in all of my previous games.  I've been using pressure a lot more than I used to, and it hasn't been especially effective, but I feel like it is clear that I am genuinely scumhunting.  I've explained my thoughts and provided evidence using quotes."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I suppose it's possible that I'm wrong, and I don't look towny at all.  Which is why I'm asking, to figure out if Damdred's read on me is crazy or not.")}
 {:user "rsoultin",
  :message
  ("Tch, I don't think SL is scum :/"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm voting Palmar. (That and Robik I could genuinely see as scum this game, claim aside -_- and he's voting Damdred)")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The scum signs I'm seeing from Trfel is sheeping thread sentiment to some extent but I am seeing some followup, at least he appeared to do so with these: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The only other problem I have with Trfel is that he's saying he's having trouble reading SL and then in the end throws his vote on him (seemingly out of the blue?). He does bring up the scummy lurkers. He's having some trouble making reads I think, but he's showing in enough effort. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Damdred, if you think he's being misleading or something you need to be specific and point that out.  ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you fucking bs liar wtf"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "none of this shit is true in the slightest and it's egregious that you think otherwise since i'm the only one talking about relevant shit LIKE LYNCHING YOUR OWN SCUM READ?????? you wanna lynch sl and i'm constantly pointing out this sl stuff while you guys talk about absolutely nothing and here you are saying that I'M pushing nothing"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you tell me i'm not pushing you when you aren't my scum read, I have a list which you haven't questioned anything about? If i'm not figuring things out how on earth did I come up with a list?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "bsbsbsbsbsbsbsbsbsbsbsbsbsbsbsbsbs not a fucking chance you can believe any of the shit that you are writing ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "please quote where I have forgot a single thing in this game at all because that's also a lie")}
 {:user "Half the Sky",
  :message
  ("FF, there is a discrepancy between your read and Rasputin's. She's been making a fairly big deal in thread. That's what I was drawing at. You didn't say she was right or wrong, I'm drawing attention to the fact you both seem to have different interpretations. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Having looked at Rasputin's latest questions, I can see her question about the chuckle comment and now her concerns make sense. Do I think it's enough to lynch Damdred is another question. ")}
 {:user "Trfel",
  :message
  ("I didn't vote sicklucker out of the blue.  For some time I've been trying to get a read on him, I've been asking for help with that a good bit.  And I've explained why I keep going back and forth on him.  And I explained why I think that his play seems scummier than normal (the scumread on Eden1892, primarily)."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I've also mentioned that I want to have my vote in a reasonable place tonight, since I won't be on very much tomorrow and will be gone for the deadline.  It's getting late, so I I would vote.  Sicklucker is currently a wagon, so it's not a wasted vote."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not going to say that my sicklucker read is 100%, but I think that he is currently the most likely scum, and therefore the best lynch at the moment."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I can support all of this, except for the single sentence previous, with quotes that I have previously stated if you would like."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Today, I have seriously investigated rsoultin, Damdred, and sicklucker.  I'm townreading LightningStrike, Half the Sky, marvellosity, and Holyflare.  That leaves Chezitwo, IAmRobik, Eden1892, and FecalFeast, of which only Eden1892 has provided enough real thought and content that I could potentially get an accurate read on.  If you want me to do something other than vote sicklucker, you'll have to explain why.")}
 {:user "Damdred",
  :message
  ("Here we go trfel I'll explain what I'm seeing at least and be respectful because its what I would want done to me and we can discuss it in a somewhat civilized fashion. No quotes though as il be phone posting for awhile yet."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The first interactions we have with you and the thread are pretty lack luster and pretty unhelpful towards the thread and not really to content filled. Your first significant post is a somewhat big list post that is full of bulls and one town read. It has the look of someone paying attention and contributing but on closer inspection it really isn't."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Some of your later posts are better its true but to me there isn't a ton of commitable reads and a lot of the thoughts are pretty thread sentiments."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The push on me feels like a sheep and it got dropped pretty fast even though it seemed like you had a pretty strong scun read, and then you vote with me on SL and say I guess SL."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "No strong reads really and not scum hunting")}
 {:user "Holyflare",
  :message
  ("damdred has dropped a tier because I can't believe he'd ever think any of this shit since I just afk'd and was uninterested for 24 hours in void and was town and he was in that")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "forget things is a phrase such as dropping things, moving on. Like the SL thing when you cane back and I asked if he was a sure scum and you said no etc., not a literal forgetting")}
 {:user "Damdred",
  :message
  ("You have a totally different feel and push or lack thereof hf")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "so I thought a guy was super scummy, figured out it didn't make him scummy and moved on and that makes me scum? wtf")}
 {:user "Holyflare",
  :message
  ("i literally don't give a shit if I have a different \"feel\" i'm pushing my scum read sl and trying to make people see it and instead you're coming in and talking about nonsense that i'm forgetting my push on sl when literally 5 posts before you say that i'm pushing sl even more")}
 {:user "Holyflare", :message ("you've let me down damdy, incredibly")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Hf progression"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Damdred is scum>it was a joke>SL is scum>no he's not>palmar is sure mafia>lets focus on sl"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "here's what I mean")}
 {:user "rsoultin",
  :message
  ("@HF, trfel"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "the hyper-focus on SL scumming Eden for his \"anger\" at Robik over yours and Damdred's, HF...you really think that's the scummiest thing in the thread?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I mean, he's not a strong townread to me, either, but irrational from him is something that I kind of expect, and I can completely sympathize with the sentiment that he thought all your pictures (HF) were jokes, and not a strong push or read, as opposed to Eden's.")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "tfel just did the most townie thing ive ever seen. Pointed out that hf is ignoring my questions to his answers. He does this all the time its really annoying. Not sure if he doesint read or hes just never satisfied. ")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Town after that. Your actually trying to figure me out rather then have predetermined notions of what alignment you want me to be.")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "afked all of pyp and was obvious scum for it. Cant say its a habit of his tho that game was just unwinnable for him ")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Yes, I wasn't very effective at the start of the game.  I won't deny that.  However, as I have discussed already, that list post stated that I was suspicious of sicklucker.  I've maintained this view throughout the game.  When I look back at it, it's actually not a big list post, it's a small collection of a few thoughts.  The post looks small, it is small, there is no intent to try and force reads."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What about the times where I went against the thread sentiment, like when I started considering defending rsoultin?  And when I said that the mafia seem to be lurking, and that the thread is potentially primarily townies?  I still stand by that statement, by the way.  In the past, my intuition like that has been correct (see Carol of the Bells, where I felt that the mafia were supporting my case on KelsierSC, and Newbie Mafia, where I felt that all of the Day 1 lynch targets were town and that scum wasn't having to do anything).  I think that sicklucker is most likely to be scum, and I have kept this view rather consistently.  I'm also suspicious of rsoultin and Damdred."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I wasn't pushing you.  I disagreed with your reads and statements (still do), and I responded more aggressively than I should have.  Believe me, if I want to push someone, I would open up with a comprehensive case and then use that to push the lynch, not baseless comments.  See my play in Student Mafia IV and Carol of the Bells."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I looked through your filter, and while I disagreed with several of your reads and reasoning, I didn't think there was enough to lynch you at the time.  Are you saying that there is anything wrong with this?  My looking through your filter shows that I am scumhunting, and if you are in fact town, then deciding not to lynch you is a good decision.  I didn't provide evidence, since the reason I decided not to lynch you yet was more a lack of sufficient evidence for you being scum, not evidence for you being town.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "No, it's not the only scummy thing in the thread. Everything he writes is backwards, his read about ls, his 100% town read on marv after JUST policy \"pressuring\" marv because he was super good mafia last game???? his different reads on me/damd/eden based on absolutely nothing, sure he answered but it didn't make any sense at all. His scum read on palmar which is ass backwards because he's saying palmar is mafia because he's not finding marvs tell when he doesn't have a marv tell which he'd know from imperial or whatever it was. His useless behaviour. He isn't paranoid in the slightest and literally has no back and forth with anything. He isn't indecisive. Next cycle if he isn't lynched I'll explain some more."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "that's not true in the slightest THANKS FOR ASKING"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "damdred is scum which was a joke since nobody was talking about jack shit so I made something semi plausible to talk about and everyone just sad it was bad so I didn't achieve anything and dropped it"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "sl comes with his useless salty rage > scum read > out of game information > sure scum > not SURE scum but rest of posts are awful > think he's mafia 1/3 found"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "<other intermediary posts where I find out other peoples alignments>"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "palmar hasn't read role pm > meta > mafia 2/3"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "read other filters > fecal boring > sheeping stuff > meh > probably mafia because so boring (like hts in void)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "then you come along and I thought you were towny to begin with > you spend some time at work and then you brought \"new information\" WHICH WAS EXACTLY THE SAME CRAP YOU HAD ALREADY SAID ALL GAME > I question this stuff, you say i'm high and ignore what i'm saying entirely > you scum read me > you've dropped the ball somewhere and become crazy > you scum read all of my town reads for misreading when they actually have legitimate points on you > you shit up the thread talking about this nonsense instead of more obvious scum sl/palmar/robik/ etc. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You're literally just spamming how someone is mafia but not saying properly why and have nothing to back it up other than a feel.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "look at this stuff ^ how does that make anyone town other than observant, it's a key thing to mafia to call people town over pointless shit")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I like this post a lot. I will reconsider my read everything you said is extremely believable")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The paranoia point, and not being indecisive, those I can see. As I said, I expect irrationality from him so most of the rest more or less falls under that umbrella. His reads generally are pretty mutable, though, from my experience with him, so when they're not..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eh, I'm too tired to do more of this tonight. Will post some thoughts in the morning. Good night, all."
   {:tag :br, :attrs nil, :content nil})}
 {:user "Damdred",
  :message
  ("I've explained it five fucking times hf. I answered the push on me not updates reads I explained that at least twice but you just wanted me to say blah blah blah hf is right when you aren't paying attention."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So my give a shit is broken. The points on me are dumb because there aren't any inconsistencies I hate policy lynching I'm on record saying that a lot so its just whatever at this point")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "YOU DIDN'T ANSWER THE PUSH AT ALL AND THAT'S NOT WHAT YOUR POST EVEN SAID????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????")}
 {:user "Holyflare", :message ("gwhnjwehjwehwehwehwe")}
 {:user "Holyflare",
  :message ("how oblivious can a person be?!!?!?!?!?!")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "HOW DOES ANY OF THIS ANSWER A POST SINCE IT'S STATEMENTS AND NOT ANSWERS. IT DOESN'T EVEN ANSWER THE POINTS ABOUT YOU AND PALMAR")}
 {:user "Holyflare",
  :message
  ("jesus fucking christ this is such irrelevant shit, stop wasting my time and focus on my scum reads instead")}
 {:user "Trfel",
  :message
  ("Anger, that's the one part of Holyflare's town meta that was missing XD")}
 {:user "Damdred",
  :message
  ("It does answer the points...fuck it I don't care I'm blue gg.")}
 {:user "Holyflare",
  :message
  (".............................................................................................................................................................??????????????????????????????????????????????????????"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i have no words")}
 {:user "Holyflare", :message ("literally 0")}
 {:user "Holyflare",
  :message ("this rivals a bh blue claim, maybe even worse")}
 {:user "Holyflare",
  :message
  ("0 pressure, 0 people scum reading, 0 votes, claims blue! wtf damdred?")}
 {:user "Eden1892", :message ("d-did that just happen")}
 {:user "Fecalfeast",
  :message
  ("Damdred what do you think the stat of the thread is? It seems like you feel like you're under a lot of pressure when that is not the case..")}
 {:user "Fecalfeast", :message ("state*")}
 {:user "Fecalfeast",
  :message
  ("Like isn't this exactly what you want when you are blue? You're not being wagoned but you probably wont be nightkilled with the way people are talking about you.... waattt")}
 {:user "Damdred",
  :message
  ("This thread has literally sapped the fun out of mafia. The push on me was bullshit and bad and who the fuck cares if I didn't want to lynch palmar today, I answered the fuxking push by RS because his was the worst offender and misrepresented. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Idk if you think my answers are bad try to get me to expound if you are town. I die tonight maybe at least people will understand setup talk now")}
 {:user "Trfel",
  :message
  ("Hm.  Well I guess that happened."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sorry that you're upset Damdred.  I'll definitely try to play in a more civil fashion from now on, getting mad really doesn't help anything."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Side note, does someone mind taking the time to assume for a moment that I am 100% confirmed town and then giving me advice on how I could improve my play?  This game is a good example of what I'm getting at, I just don't feel like I've been playing effectively.  I see no reason to wait until after the game to start trying to improve my play, if someone is willing to help me.")}
 {:user "Holyflare",
  :message ("holy fucking shit what game are you even reading")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Please, let up on Damdred for now....")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm honestly confused. Where was the push so hard that you get sapped of all energy? Taking a break from the thread or something would be 100000x better than claiming blue."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Although this puts some doubt on robik's claim, no?")}
 {:user "Holyflare",
  :message
  ("i'm not even ON him that's what I literally don't understand")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ok I just got to break this all down since its all lies and out of context shit. Ive said all this stuff already but you all ignore me for whatever reasons."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "1. My read on Ls"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Its really freakin good stfu  I dont see why people dont see its good Its like one person calls it bad and everyone else does. If I was more respected you would all agree to never lynch ls for the rest of the game. Ls as a mafia will not go against 5 people voting me and make a really good read. He sheeps and hes not good at reads especially as mafia. So when he goes against the entire thread to call me town FOR CORRECT REASONS. Hes always going to be town. Ive played with him as mafia before hes a nervous kid. Its not in his playbook  to pocket me."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "2. My scum read on eden"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Its a thin day1 read sure but I made it 7 hours into the game but it is not the garbage you made it out to be. If he thinks im mafia he cant logicly think im salty about robik helping mafia it makes no freakin sense. He just jumped onto hf's/dandreds case on me without adding anything it was a really weak scum read on me. More then enough to get an early day1scum read for me. Better then alot of the garbage you guys are throwing around"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "3. My town read on marv."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Maybe im wrong because I have seen all his games, but what im saying from his games I have seen make perfect sense. I put pressure on marv in the last game because I wanted to be like palmer and catch him day1. Palmer  did it in 3/4 games marv was mafia so why shouldnt I mimic him? In this game and pyp I didnt even have to you know why? BECAUSE ITS PALMERS JOB I EXPECT HIM TO DO IT.  "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Marv also just came out of a mafia game where he never even posted the entire game. So when he comes out and trys im going to be leaning town with him immediately. Then when he has the balls to push palmer (who he completely ignored in a 300 page game as scum) Im going to freakin know hes town because im not a goober."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "4. Reading damd,hf,eden differently"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Your different people. I have ogi reasons for both hf/dandred to be afraid of me. I fooled them in the past there mad so I dont think them going after me is scummy. Eden had the weakest push on me and also has no ogi reasons."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "5. Im not paranoid."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This is not a great read. Sometimes I coast, sometimes I just dont see things but I think ive been fairly paranoid about eden/palmer/ Ive even light scummed rsou and hf. I dont even feel that great about dandred anymore with his attacks on tref")}
 {:user "Holyflare", :message ("mehhhhhhhhh now i'm a bit conflicted")}
 {:user "sicklucker",
  :message
  ("Like look at pyp or metal mini mafia. I barely tried. I typically dont try at the start of my second game but here ive been forced to. I usualy just coast and put my effort in the first game untill its over")}
 {:user "Eden1892",
  :message ({:tag :br, :attrs nil, :content nil} "Kill Damdred")}
 {:user "Eden1892", :message ("WAIT no nevermind hes blue lol")}
 {:user "Eden1892",
  :message
  ("God that claim was terrible"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The vote stays for a few hours as punishment"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Go to the corner and don't say a word")}
 {:user "Holyflare",
  :message
  ("well whatever sleeping, sorry if i mad you sad damdy "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "sicklucker",
  :message
  ("...."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Like I did a similar town claim as a watcher in dandreds own game because I didnt like the direction town was going."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Cliffs dandred called me bad for it and now hes doing the same thing but on day1...")}
 {:user "rsoultin",
  :message
  ("Can we lynch Robik?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm usually against lynching claims, but just staring at that OP..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That blue role was the most likely one to be in one of the set-ups, completely useless as a blue role so it doesn't matter if he doesn't do anything and he can't be checked that way, and he has been completely useless."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Like, that's actually the safest role for scum to claim and there's not a reason for town to do so. Yet scum can make it harder for blues to claim by throwing doubt on them if there are \"too many\" because of Robik's early claim."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I really want to do this ><"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Can anyone give me a good reason why it would be bad to lynch Robik?")}
 {:user "Damdred",
  :message
  ("No I called you bad for hammering the people you tacked lol")}
 {:user "sicklucker",
  :message
  ("No we dont. He will get confirmed as mafia at some point if hes not doing that as town. Like it makes little sense to do as town but it makes 0 sense to do that as mafia. Robik is like 95%+ town were not lynching him even if he afks 3 days in arow."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "We have max 2 blues right? So when they die or claim he cant win as mafia. Fake claiming here as mafia gives him like a 0% chance to win."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also how come no one comments on my awesome post?")}
 {:user "Damdred",
  :message
  ("Should wait to lynch robik for a little even if he's playing to scum meta. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Anyway I'm not really mad at anyone outside if game but a lot of people have toxic attitudes this game that really steal the fun, nothing like being called bad or people being disappointed in you when you legitimately don't see what they are saying. It really really steals all the fun out "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Its mafia suicide robik plays too win. Hes a cockybitch so he might do the claim as town but he would never claim it as mafia and be confirmed mafia on like day 3/4")}
 {:user "Damdred",
  :message
  ("There can be three blues actually so yea it makes it harder")}
 {:user "sicklucker",
  :message
  ("Like if you have to vote me over robik do it 10 times out of 10. But we should vote neither since we want to kill mafia")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Er but town will figure out what setup it is at some point. with a mafia or town powerole flipping")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Welcome to my world bro. Hf has this effect on people")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Cause I already didn't want to lynch you, and was just going to verify what HF was saying, anyway?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "HF responded by saying he wasn't sure anymore?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And actually there is? I just explained how it could be a good play for mafia to claim named VT right from the beginning."
   {:tag :br, :attrs nil, :content nil}
   "1. He gets townread until enough blues claim to cast doubt on his claim."
   {:tag :br, :attrs nil, :content nil}
   "2. He can get away with doing jack shit for several days just as he's doing now"
   {:tag :br, :attrs nil, :content nil}
   "3. Gives him an excellent launching point (or his scumteam) to mislynch blues, by saying that other claimants are fake-claiming, especially if they're about to be lynched and claiming blue when that would be too many blue claims."
   {:tag :br, :attrs nil, :content nil}
   "4. Named VT literally doesn't have to do a damn thing night action wise to prove he's actually blue."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It's practically like claiming regular VT. Would anyone be townreading him at all if he hadn't claimed?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I guess I'll request this again.  I feel useless, and I really don't like that feeling.  Someone help me please?")}
 {:user "Damdred",
  :message
  ("Honestly trfel your response to me was super towny so yea your not doing bad you just had a tunnel on you.")}
 {:user "sicklucker",
  :message
  ("Well I disagree but im not gonna fight you on it because this is all you need to know. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "We can confirm robik later as town or mafia when we figure out the setup so killing him now is bad")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Trfel, dude, can this wait until Night Phase since we're still trying to settle on a lynch? It's not great timing for this question.")}
 {:user "Damdred",
  :message
  ("Well this is robs meta as scum. I'm not sure if its worth a shot today though")}
 {:user "sicklucker",
  :message
  ("Trfel heres my advice. Find a mafia and get this lynch off my town ass")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay, you do realize that there can be 3 blues in the set-up?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So only once we hit 4 (depending on the make-up of the claims/flips) would Robik even be called into question? I mean, I'm cool with a Palmar lynch today, don't get me wrong, and I don't mind waiting till Day 2, but I honestly think he should be treated like a regular VT rather than placed on a pedestal."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think it's hardly suicidal for scum when you need 4 claimed/flipped blues to even look at him.")}
 {:user "Trfel",
  :message
  ("I'm not opposed to lynching IAmRobik.  The main reason against it is that everyone seems to think that the claim means he shouldn't get lynched."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Normally I would be inclined to leave him be, but I'm not seeing that much else to work with right now.")}
 {:user "sicklucker",
  :message
  ("Even if its only a small chance we can verify him we have to keep him around. Having one extra lynch in this game is kind of a big deal. And your potentially throwing that away if you do this guys ")}
 {:user "Trfel",
  :message ("How many people would be willing to lynch Robik?")}
 {:user "Damdred",
  :message
  ("22 Hours and i'm finally on a computer. Its magical sometimes not to have to use a phone in mafia."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Heres the deal with the Palmar lynch and i'll explain it in as much detail as I can. Palmar even when I said I could maybe go for a Palmar lynch was nothing but a policy at that point. Knowing Palmar and the way he plays mafia this was bound to happen due to when the game started (weekend) we never would of gotten anything out of town Palmar on a weekend. And as such I think we should give him till day two to prove his towniness."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Let alone to go into meta about the 0-10 scale for Palmar with a weird 7 being his scum game since he doesn't want to let down his team mates. His performance today is a 0, even though it would be a policy lynch I would of been down for it but at the time I really thought that there were better lynches on the table at the time and he isn't it I think.")}
 {:user "Damdred",
  :message
  ("I'm undecided whether I would like to lynch Robik at this point or not, he is playing to his scum meta perfectly barely any content etc., he could be the godfather so any check will come back and his reaction to eden claiming is odd in hindsight.")}
 {:user "Holyflare",
  :message
  ("nobody cares that you think palmar is a policy lynch all people cared about was that you said palmar was a policy lynch and then said you wouldn't lynch palmar today based on absolutely nothing and then maintained he was still a policy lynch for you that you COULD lynch -.-")}
 {:user "Trfel", :message ("Damdred, who do you want to lynch?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay, let me try to explain my thought process a little better."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "We've got 13 people yeah?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Say we mislynch today. We've come up with shit for wagons (let's just be honest here, we have)."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Damdred is most likely the NK. Even if Robik is telling the truth he's just a fancified VT."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "8v3"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay, so how many more mislynches does scum need to win? Just two."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "There is the potential for two more blues to claim."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Just basing it on blues, and ignoring the town mislynches that happen so frequently, there is a high probability here that Robik can scrape by as scum claiming named VT."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not saying lynch him blindly."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm just saying the usual don't lynch him unless it's MYLO or something may not be the best play if the only reason he's being read as town is because he claimed named VT right off the bat for some god-awful reason (if he "
   {:tag :i, :attrs nil, :content ("is")}
   " actually town).")}
 {:user "Trfel",
  :message
  ("I agree with rsoultin."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Assuming that we are in fact dealing with mafia!IAmRobik, and the claim is false, based on how the modifications work there is only a 33% chance that we can get three other flipped/claimed blues.  Which means that there is a very low chance of his claim ever being proven false."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I won't lynch him for going afk, but when he was here, his play didn't seem particularly good.")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't understands the bolded I never said that, I said I wouldn't lynch him today and that's it? I never said I could lynch him after that?")}
 {:user "rsoultin",
  :message
  ("HF, no offense, but I don't think any of the points on Damdred trumps a blue claim when he's been active in the thread. Can you focus on something productive here rather than arguing for the sake of it?")}
 {:user "Trfel",
  :message
  ("I guess I'm looking at Palmar, sicklucker, or IAmRobik for the lynch.")}
 {:user "Damdred",
  :message
  ("I'm really curious now honestly, like half of the sentence is true but the last part is absolutely untrue andi just looked through my filter.")}
 {:user "Damdred",
  :message
  ("Lynch for me would be SL, Rob I still have to relook at chez and fF though")}
 {:user "Trfel",
  :message ("Holyflare, thoughts on lynching IAmRobik?")}
 {:user "Damdred",
  :message
  ("Like am I the only person who finds HF post in the least bit interesting?  I know i'm biased cause tis about me though")}
 {:user "sicklucker",
  :message
  ("If the lynch is actually between me and robik town is  doomed. ")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Moreso if he continues to argue a fallacy rather than the initial stating of it, tbh, Damdred. I often post what I remember before double-checking so -shrugs- which is why I get yelled at for not reading xP"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Dude, for srs, if you're not a prime lynch and you really are blue (which I'm inclined to believe right now because not a prime lynch), claiming? The pressure really wasn't that bad :/")}
 {:user "sicklucker",
  :message
  ("If thats who you want to vote between. Then I suggest you policy lynch ff whos never found a mafia in his life. But I think you should just find scum and stop holding hands")}
 {:user "Eden1892",
  :message
  ("I could "
   {:tag :a,
    :attrs
    {:onclick "return toggleShowSpoiler2(this, 1)",
     :title "",
     :href "#",
     :style
     "text-decoration:none;font-family:monospace;color:#808080"},
    :content
    ({:tag :span, :attrs nil, :content ("+ Show")}
     " Spoiler"
     {:tag :span, :attrs nil, :content (" +")})}
   {:tag :div,
    :attrs
    {:style
     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
     :id "spoiler_1"},
    :content
    ({:tag :div,
      :attrs {:class "forummsg"},
      :content ("threaten to")})}
   " lynch Robik "
   {:tag :a,
    :attrs
    {:onclick "return toggleShowSpoiler2(this, 2)",
     :title "",
     :href "#",
     :style
     "text-decoration:none;font-family:monospace;color:#808080"},
    :content
    ({:tag :span, :attrs nil, :content ("+ Show")}
     " Spoiler"
     {:tag :span, :attrs nil, :content (" +")})}
   {:tag :div,
    :attrs
    {:style
     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
     :id "spoiler_2"},
    :content
    ({:tag :div,
      :attrs {:class "forummsg"},
      :content ("until he does something productive")})}
   " , yeah.")}
 {:user "Damdred",
  :message
  ("No RS this is HF remember he just said a few pages ago he didn't forget anything this game and then just obviously misrepresented what happened/forgot/lied. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It was a rage quit and now i'm trying to be useful for the next 36-40 hours or so before I get nkd more than likely")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think Palmar should be included in that list, and I like chez. Don't lynch my chez "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But I'm not sure why you're insisting so much on robik being a bad lynch? Generally, yeah, totally against lynching blue claims, but this situation isn't normal.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "do something interesting"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I can actually say that without being a hypocrite right now"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "-cracks whip-")}
 {:user "sicklucker",
  :message
  ("No its just bad. Its actually terrible. Robik has ogi excuses too. HE DIDNT VOTE AS MAFIA IN ANOTHER GAME THAT JUST FINISHED. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Like I would kill rsoultin now this is not real life")}
 {:user "Trfel",
  :message
  ("Sorry Damdred, I'm not ignoring you, but I'm having trouble reaching any sensible/useful conclusions.  I'll take another look tomorrow when I am less tired."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Speaking of being tired, I want sleep.  And I want to know where to leave my vote, since I won't be on very much until the deadline.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay. He did say that. If you die N1 I promise to watch him for you and not blindly townread him. I don't think it's enough to get a D1 HF lynch, and probably wouldn't support it myself, but you're right in that he said he remembers everything and that was not what actually happened with you.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i'm not scum reading him i'm explaining where he's going wrong with his thought process of what everyone is talking about.....")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm a dom, this isn't going to work the way you think it is")}
 {:user "sicklucker",
  :message
  ("Dandred is so town. You didnt need to out I been town reading you all game ffs. Hes actually pushing people that should be pushed. Since you think hf is scum are you willing to revulate on me yet?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay, as I said:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :i,
    :attrs nil,
    :content ("I am fine with a Palmar lynch today")}
   " but "
   {:tag :i,
    :attrs nil,
    :content
    ("I do not think that Robik should get a free ride for claiming named VT with absolutely no pressure.")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Waiting until Day 2 is fine with me. Waiting much longer than that if his play remains the same I think is stupid.")}
 {:user "Eden1892",
  :message
  ("I'm gonna go look at the player list and see who I forgot is playing. That guy's probably mafia.")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "it probably starts with a c")}
 {:user "Eden1892",
  :message
  ("Wait, is FecalFeast somebody's smurf or did someone actually pick that for their TL name. Lol")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil} "Who starts with a C?")}
 {:user "Eden1892",
  :message
  ("Omg that was genius. sicklucker is mad funny."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Oh yeah, Chezitwo. That is Chezinu right?")}
 {:user "Onegu",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Vote Count")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("sicklucker (5):")}
   " Damdred, Palmar, Holyflare, Fecalfeast, trfel"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Damdred (2):")}
   " IAmRobik, Eden1892"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Palmar (3):")}
   " Chezitwo, Sicklucker, rsoultin"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("rsoultin(1):")}
   " marvellosity,"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Not Voting (2):")}
   " LightningStrike, Half the Sky"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Currently,")}
     " sicklucker "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("is set to be lynched. Day 1 ends in "
       {:tag :span, :attrs {:id "bbcountdown1"}, :content nil}
       {:tag :script,
        :attrs {:type "text/javascript"},
        :content
        ("$(\"#bbcountdown1\").countdown({until: new Date(Date.UTC(2015, 02-1, 01, 21, 00, 00)), onTick: bbcountdownTick, tickInterval: 1});")}
       " at 21:00 UTC (+00:00)."
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Reminders: Votes are done in the voting thread "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476972-linux-mini-mafia-voting-thread"},
        :content ("(link)")}
       ". Make sure to unvote if you want to vote someone new. Voting is mandatory-- you may not abstain.")})}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Trfel",
  :message
  ("Since Damdred claimed, I am much more reluctant to give Robik a free pass for his claim."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I looked at his filter.  There is absolutely nothing redeeming about it.  His reason for claiming is that he would be an obvious town that people could follow.  He's done literally zero useful things this entire game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The only way he is town is if he meant to do useful things, intentionally didn't do them, then had a real life circumstance come up to prevent him from doing anything.")}
 {:user "Eden1892",
  :message
  ("Anyway my short list is actually LightningStrike and FecalFeast, but somebody was townreading LS for reasons I don't remember cause I didn't read. Maybe I should look into that."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I especially don't remember anything about FF. LS I at least went \"Oh yeah, that guy's in the game\" for. FF I was like \"...wait who?\"")}
 {:user "Eden1892",
  :message
  ("Man I'm too tired to reread this game. I'll just check back in tomorrow")}
 {:user "rsoultin",
  :message
  ("Why do you want to lynch Chez, SL?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "In terms of policy lynches there are better ones, so I'm expecting something from his content or reads to support your scumread.")}
 {:user "Trfel",
  :message
  ("I have a pretty strong townread on LightningStrike, and I think he is townread by most people."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't really want to lynch FecalFeast because of his play in Carol of the Bells.  Most of his posts this game have been spammy and useless, but at the same time he has shown indications of reading the game and trying to find people's alignments.  Which, I think, is more than I could say for FecalFeast at this time in Carol of the Bells.")}
 {:user "sicklucker",
  :message ("Wait I have 5 votes? We actually lost")}
 {:user "Eden1892",
  :message
  ("Wait wtf day ends at 3 PM my time? I get off work then. Smh")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "A guy trying to imitate chezunu. I cant think of anyone id rather policy lynch not even ff. He also tried to put scum on ls day one. Hes the easiest mislynch ever and its a scum tell 101")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm reading LS town this game. So are several others, including Damdred and SL. ")}
 {:user "Damdred",
  :message
  ("SK did hf really skip over what I said answer RS then peace out?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "yes I'll re evaluate on you in the morning sl"
   {:tag :br, :attrs nil, :content nil}
   "I'm sleeping now but hf is probable scum here")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "NO IM GONNA BE GONE WHY DO YOU THINK IM TRYHARDING NOW?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I misremembered seeing as I've literally just blanked every statement people have repeated about you because it's fucking boring and everyone ignored me. Did you remember what I wrote in void when you decided to ignore me in lynching mafia HTS? apparently not because you went against me there, you don't follow me, you don't listen to me so why does it matter what i'm pushing or not?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i'm really quite mad you've claimed blue for no reason and then the first thing you did is talk about palmar again instead of trying to literally do anything quite productive, you though it was best to defend yourself EVEN FURTHER when you literally just claimed a role - it boggled my mind and annoyed me because you continually go against what I think of you as a player"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "the point i didn't understand and what everyone else didn't understand is how you town read palmar and didn't want to lynch him today despite the overwhelming evidence that when he didn't read his role pm he's mafia as chez pointed out and his continual trolling, you've literally ignored a player because he made you laugh over a proven meta which didn't make any sense and made you look bad and you were too stubborn to see it and wasted like what? 20 pages making people question you over it when you could have just ignored the entirety of it and focused on what i've been saying"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "instead you're now saying you've scum read me for literally being boring when I have 10 pages(?) of filter that continually pushes people, just because you fail to read it does not make me mafia it makes you bad"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "now how about actually reading my content and then questioning that instead of moving on with baseless statements like i'm boring")}
 {:user "Eden1892",
  :message
  ("That's a lot of people quickly saying they townread LS. I'll just sheep the crowd on that for d1 and see if I change my mind later."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Trfel what is it about FecalFeast that makes you say that, in essence, \"He's mostly spammy and not helpful but sometimes he somewhat looks like he's trying\" is a town read? If my summary is in error then please correct me, but that's the gist I got from it and if that's true then you should be lynching him based on that. That's a pretty great place for mafia to be and a pretty bad place for town to be")}
 {:user "sicklucker",
  :message
  ("Like your top scum is hf but you might afk vote on the guy who hes trying to get killed all game. Nice townplay dandy help me "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I thought it was you he scummed? xP"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "All I remember was him asking someone about LS' alignment."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm sorry, but I have a soft spot for players like my brother, Slam the Man, and chez. Give me something scummy. I actually really like the points he was making with his posts this game. Like I could quote the ones that I liked, if you want me to, cause there were at least a few.")}
 {:user "sicklucker",
  :message
  ("Like i might be gone all day tomorrow (superbowl) we have had hours to get this lynch off me but your all being bad and talking about lynching and freakin blue role. I dont know what else to say. You guys blow. Who should I afk vote to not die? ")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Chez asked me if he thought Ls was scummy because he was putting scum on Ls. Ls is definitely town chez is scummy and a much better kill then me.")}
 {:user "Holyflare",
  :message
  ("someone talk to me about sl's big post (someone that isn't sl)")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Marvellosity has a larger filter, and I found this quote in Chezitwo's filter, so I'll just use that.  But the point is the marvellosity quote."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "To some extent, meta is necessary.  I'm not going to hold FecalFeast to the same standard that I hold you to."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Damdred, I believe that you are town 100% at this point.  But I don't think that Holyflare is getting lynched today.  I will take a look at it tomorrow if I get a chance.")}
 {:user "Trfel",
  :message
  ("Holyflare, I liked sicklucker's big post.  It seemed townie, and it helped me to see where he is coming from a lot better (not that I agree, but I could imagine sicklucker actually believing what he says)."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Holyflare, who are you willing to lynch?")}
 {:user "sicklucker",
  :message
  ("Your right tref that is a good post I forgot he made it because hes very forgetable.")}
 {:user "Holyflare",
  :message
  ("ff/palmar/chezinu (if he continues afking and does nothing)/could entertain the idea of robik"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "probably ff on a cursory glance, all he's done is mediocre \"what do you think of this\", \"i'm going to sheep you on that\" and not much else. He returned and only asked if my list had changed and then made nothing really of it"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "pretty underwhelming still")}
 {:user "sicklucker",
  :message
  ("But the thing is guys we have to lynch somebody. This isint a game of holding hands and rainbow. So far no ones pushed like really anyone even tho quite a few people seem to agree im not a great lynch. ")}
 {:user "Trfel",
  :message
  ("Am I the only person who doesn't want to lynch FecalFeast?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That just doesn't look like scumming to me, SL. He's asking you your read on LS.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "ok"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "1) His read on LS is entirely predicated on him being town which isn't a premise anyone was willing to accept, and for purposes of proving his innocence is assuming the conclusion. Not helpful to me."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "2) I don't really get where he was going with that shit anymore, I gave up questioning him on it because I couldn't make sense of it last night and didn't feel like it mattered when I woke up and reread. I feel like his read on me and subsequent answers were things he could say as either alignment"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "3) lol at underestimating marv's mafia game this bad."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "4) LOL at you being scared of him."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "5) I actually agree with him here, I don't feel like he's especially more or less paranoid than usual. My impression of him from NYE wasn't that of a paranoid poster, rather a carefree and freeflowing one. That's actually the meta point I thought had some teeth to it, and this long post addressing a bunch of things even contributes to that a bit lol."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Verdict: Seemed sincere and from the heart, but nothing he actually said made me think he was town. ???")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I have absolutely no idea why but you're probably wrong in thinking it.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "based holyflare"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i think i'm going here")}
 {:user "Eden1892",
  :message
  ("Unless someone has some scintillating insight on sicklucker right now anyway"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I dunno what to do with him atm")}
 {:user "rsoultin",
  :message
  ("I can agree on chez if he doesn't come back, I guess, but I'd prefer other lynches today. I'd actually prefer Robik over him lol.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "unfortunately this, his crazy level rivals steveling and that guy was a pain to play with... ")}
 {:user "Trfel",
  :message
  ("I guess lynching Palmar isn't horrible."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I would lynch Robik instantly except Hammertime mafia shows that Robik simply has been offline for a while now."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't really want to lynch Chezitwo for the same reasons I don't really want to lynch FecalFeast.  Both make mostly useless comments, but they are still reading the thread and seem to be putting a bit of effort in."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "One more comment about FecalFeast, I don't scumread him for the post about sheeping Holyflare.  All of FecalFeast's posts before and after this one are joking, and I see no reason to assume that this one is any different, especially when looking at his tone in the post.")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "probably. Have you ever played with ff?. Ill give you my word that if you dont lynch him today you will never figure him out and lynch him later. Ive played with him like 7 games and hes never actually done anything productive that I can read him off of.")}
 {:user "Holyflare",
  :message
  ("hey that damdred guy totally criticised me and then fucked off"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "fu damdy")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "vote fecalfeast"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 379px; height: 379px;",
     :src
     "https://lh6.googleusercontent.com/-OWqeP9vb9js/UdkbLWyyoJI/AAAAAAAAA3Q/HZZ1DNBEy50/w379-h379-p/3-tongues-90cm.gif"},
    :content nil})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't doubt it's a joke or semi-jokey, I just don't see ANYTHING in his filter at all.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Well, last game I played with him, I was the cop so I checked him "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "Holyflare",
  :message
  ("Trfel all you're doing is saying no to every lynch "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "all he does is make jokes tho. Thats the problem")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ya and were gonna have to waste a check (if we have one) and a lynch on him this game too. So you know where im cming from ")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Do you think any of them look good?  I think all of them have problems, and I've said why."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I guess of all of the options, I actually like lynching Robik the most.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't see any problem with a fecal lynch and you haven't shown me any reasons why we shouldn't lynch him other than his posts are jokey? Does that counteract the points I made?")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Let's try this instead."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Someone say in 5 sentences or less why sicklucker is mafia")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "lol, glad he did. you like a fight too much there, hf, even when it's serving no purpose xP"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "that said, I've done the same thing myself. so meh"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think palmar's a fine lynch, and better than an sl lynch. ff...meh. i'm not rereading filters at 0130 in the morning @.@ what I get out of them will probably make no sense in the light of day")}
 {:user "sicklucker",
  :message
  ("Tfel remember that time after you got nked as town I went through your filter and convinced town ff was your green check?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Im a useful town. FF not so much")}
 {:user "Eden1892",
  :message ({:tag :br, :attrs nil, :content nil} "yup, p. much this")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "The problem I see with lynching FecalFeast is that he doesn't do very much every game.  This game, he looked through Damdred's filter and townread him.  I feel that lynching FecalFeast is basically just a random luck lynch."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But it seems like as a whole, we are finally getting an agreement, so if I can't convince anyone (which seems likely) then I will go with it and vote FecalFeast.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Do it for me?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It's 2:30 AM here.  I'm still playing.")}
 {:user "Holyflare", :message ("boooo hooo it's 7.30 !")}
 {:user "Holyflare",
  :message
  ("i've literally stayed up to read filters that's how sad my saturday night life was this week")}
 {:user "Eden1892",
  :message
  ("@rsoultin"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "@HF when I went to dig this back up I saw you said \"read past games.\" can you save me the effort I'm not going to put forth to do this and tell me why I'm supposed to think I'm wrong were I to do so")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lol, pretty sure that was me, SL xP But for the purposes of getting people off your wagon...SL can be useful. Seriously. Especially when trying to kill the cop with wild aoe storms when he knows good town roles are in that cluster xP"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Actually, SL's reads can be useful when I can understand them, in all seriousness."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't think he's a good lynch today for sure.")}
 {:user "Eden1892",
  :message ("soulie what do you think a/b fecalfeast")}
 {:user "Trfel",
  :message
  ("I would prefer a FecalFeast lynch to a sicklucker lynch.  I'll move my vote, but only when I go to bed on the off-chance people change their minds.")}
 {:user "sicklucker",
  :message
  ("Hey it was either your area of the list got stormed or mine did. im just a playa ;p")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "he can do nothing as both alignments [✓]"
   {:tag :br, :attrs nil, :content nil}
   "he doesn't really post at the weekend as both alignments [✓]"
   {:tag :br, :attrs nil, :content nil}
   "in my experience he's only said he hasn't read his role pm as MAFIA [✓]"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "he also doesn't have to push anything as mafia because sometimes he just rolls over, trolls and dies? like you literally said the difference is that he hasn't pushed anyone, which IS a difference between these games but you still attributed it to a town palmar meta, that's what marv was talking about too")}
 {:user "Trfel",
  :message
  ("Can anyone tell me what makes FecalFeast's play this game worse than his play in his other games, such as Carol of the Bells?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "FecalFeast lynch is generally preferred to a Palmar lynch because the hope is that Palmar starts playing seriously and scumhunting while FecalFeast will probably continue to mostly joke around, right?")}
 {:user "Holyflare", :message ({:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I saw this when you fist posted it, Eden, and I still just really don't find it compelling. It's like \"he's doing a thing that could be scumread\", \"as scum he wouldn't want to be scumread\", \"so he wouldn't be doing scummy things if he were scum\"."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eh. If we used that premise for all players, we'd just lynch the towniest, so...unless something in particular makes Palmar a unique snowflake in this regard (hehe term from Protoss) not feeling it.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "like just reading from the start of page 2/3 I can already see he actually has multiple reads and thought progression? Here I can't really see it and he's only really talked about chez as a scum read but not actually at all other than to ask other ppl about him")}
 {:user "Trfel",
  :message
  ("Right, marvellosity has a 100% record against Palmar, doesn't he.  100% seems like pretty good odds.  Maybe that isn't a horrible idea..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So we're down to FecalFeast or Palmar?")}
 {:user "Holyflare", :message ("seems like a pretty good list to me")}
 {:user "Eden1892",
  :message
  ("I don't think calling my argument meta is an accurate descriptor. It's based off of one very recent result instead of an overarching analysis of his play, and it's only based off of that because I believe it's reasonable to think that Palmar would adapt to a failed result from his last game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And I'm not arguing it affirmatively makes him town, I'm trying to reduce the argument that it makes him mafia down and falsify it to get a read. My thought remains that, coming off a game where Palmar got lynched as town for trolling too hard and then whiffing on the d1 lynch, he wouldn't troll hard as mafia, because then he either doesn't push and gets lynched and flips, or he does push, whiffs on the lynch, and then gets lynched and flips. It's just begging to get lynched basically and while I could see town Palmar just not caring about whether his actions are begging for a lynch, idk that I see mafia Palmar doing the same")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Not quite, it's \"he's doing a thing that is literally setting himself up to get lynched unless he lynches mafia,\" \"as mafia he wouldn't want to do that while as town he might not be as concerned b/c he's confident he can lynch mafia,\" \"therefore it's more likely that he's town and digging a hole he thinks he can climb out of rather than mafia digging a hole he knows he can't.\"")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Hm, you're right.  Guess I should check my facts before I open my mouth."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Well, that's embarrasing."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Anyway, voting FecalFeast now.")}
 {:user "Eden1892",
  :message
  ("k i'm probably out for now"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "gonna try to be a shitty coworker and phonepost tomorrow, no promises though")}
 {:user "Holyflare", :message ("yeh bed for realsies now")}
 {:user "sicklucker", :message ("Now were talking.")}
 {:user "Trfel",
  :message
  ("Yeah, if you guys are going to bed, then I will too."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Good night all.")}
 {:user "sicklucker", :message ("zzzzzzz bye")}
 {:user "rsoultin",
  :message
  ("Eh, I didn't have a problem with FF's filter when I reread it just now -_-"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But that could be cause of the sleep deprivation."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What I saw looked like him trying to get involved and figure things out? Bah, doing the rest in the morning, and looking specifically at those 2/3 pages eden."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Right now I'm still thinking Palmar or Robik as top lynches. Although I can kinda see your point, Eden, again it's pretty Palmar-specific. Other players not doing stuff ppl go hey he's not doing stuff, could be scum. Palmar it's as scum he wouldn't just be not doing stuff? So if it's not based on meta I dunnae what it's actually based on.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "palmar can do nothing as both alignments so it's irrelevant but he hasn't read his role pm which is what he POLICIES people for in other games, the last time he said he hadn't read it (with me) was world heavyweight 2 afaik and he was mafia so that makes him way more likely to be mafia this time than the read of him not doing anything making him towny")}
 {:user "Holyflare",
  :message
  ("and meeeeeeh i dunno about fecal, you might actually be kind of right now that i re-re-reread him  after having read carol and stuff too")}
 {:user "Holyflare",
  :message
  ("but then that leaves me stumped for a mafia team somewhat")}
 {:user "Trfel",
  :message
  ("Ugh."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That was my last reload before sleeping."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Why do you do this to me.")}
 {:user "Holyflare",
  :message
  ("i dunno why do i do this to myself "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "So what's this about?  Did he read his role PM or not, or is the point that he is mafia when he claims to not have read his role PM?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "he lied and then literally like 2 posts later said he hadn't read it again")}
 {:user "Holyflare",
  :message
  ("basically he's trolling the game and it's pretty bm and makes palmar boring to play with and has been like that for a while")}
 {:user "Holyflare",
  :message ("anyway for realsies THIS TIME i'm going to bed")}
 {:user "rsoultin",
  :message
  ("Lol, I'm still awake, too, but it's not as late for me as y'all."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "HF, I'm less concerned about a mafia team right now when we don't have flipped scum. There are a few people who would never (should never) be Day 1 lynches that may be viable Day 2 depending on the flip.")}
 {:user "Trfel",
  :message
  ("Ok, I'll make sure to check back tomorrow and see what happened."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Good night again.")}
 {:user "Trfel",
  :message ("Unless rsoultin wants to stay up and talk about this?")}
 {:user "Holyflare",
  :message
  ("hah well i like to solve the game day 1 because I usually die n1 "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm up for bouncing ideas with y'all. They may just be a bit less coherent than normal.")}
 {:user "rsoultin",
  :message
  ("Okay, in all honesty, I need to filter-dive him (tomorrow @.@) but eden just isn't making me all excited this game :/ Some of it is I'm not agreeing with him, and some of it is he's not making much of an impact.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Cool.  Don't expect sanity from me either "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So we have FecalFeast, Palmar, and Robik, right?  I think we can drop Chezitwo from the list?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "To me, the most compelling reason to lynch Palmar is what the vets are saying about his meta (marvellosity on never mislynching Palmar, Holyflare on Palmar's claim to not have read his role PM)."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not sure what to think about FecalFeast.  The question seems to be if his play is worse than in previous games.  And I don't like heavily meta-based arguments like that.  The only alternative is that in the few posts he has actually been playing the game, he seems fine."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Then there's Robik.  I actually feel like scumreading him for his claim, since he followed it up with absolutely nothing and we already have another blue claim.  But he's been gone for quite some time, and it is very possible that he was intending to mess around for a while and then play seriously later, but real life intervened and he was not given the opportunity.")}
 {:user "rsoultin",
  :message
  ("Additionally, HtS, I'd want to look more closely at Day 2. Her presence when she returned to the thread didn't seem very thorough, but I was distracted by other more important conversations at the time. And of course some of these lurkier players that I'm inclined to clear for the day in favor of players I think are more likely scum.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Eh, I don't want to lynch Eden1892 at the moment.  Which I suppose makes him scum by his own admission...."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "His filter seems fine to me if you believe that he really doesn't want to get killed on night 1.  Unfortunately, that casts a cloud of doubt on everything he says."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I will certainly hold him to higher standards from Day 2 on out (assuming the mafia team has any sense of decency).")}
 {:user "Fecalfeast", :message ("Hi am town pls no lynch")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Don't wanna lynch you so much anymore tbh")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Who do you want to lynch, and why?  What makes them a better lynch than you (without using the \"I'm town\" argument)?")}
 {:user "Trfel",
  :message
  ("Ok, at this point I want to policy lynch Holyflare for lying.")}
 {:user "Holyflare", :message (":D i got into bed at least")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm actually quite content with a Palmar lynch?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "FF is policy. Even if I couldn't sheep the Palmar-meta from the two vets, FF has done more than Palmar has."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I still actually think it's a pretty good play by scum to have one of them claim the only blue role that literally could be in every single setup, that doesn't have any night actions it has to account for, and especially with a godfather doing it that would be about perfect to just sit safely in for several days."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But I'm willing to put it off a day to give him time to return to the game, if the reason he's AFK is really just irl issues like his other game suggests.")}
 {:user "Fecalfeast",
  :message
  ("I make list post? I don't wanna do much work but also would rather not die")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sorry lol this was in reference to Day 2/possible scumteams HF was talking about. Like, Eden and HtS, not a good Day 1 lynch, think they should be revisited Day 2 though, at least based on gut feels. I may feel differently after filter-diving them, which I haven't done lately at all.")}
 {:user "Trfel",
  :message
  ("Well, I'll hold off to see if FecalFeast does anything in the near future.  If he doesn't, pretty sure that is where my vote will stay."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If he does something, I could see voting elsewhere.")}
 {:user "Holyflare",
  :message ("Make a list post with a sentence reasoning is cool")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'll take what I can get.  A list post is better than what Robik has provided.")}
 {:user "Trfel",
  :message
  ("Hm, I guess I would prioritize looking into Holyflare over Eden1892 and Half the Sky, but I don't want to spend a ton of time investigating Holyflare if he gets nightkilled, which seems reasonably likely."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Maybe I'll just take the night easy, and catch up on all the homework I skipped today "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If you think I'm gonna get nk'd then why would you want to look into me over the more underwhelming people? ")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Because I think Damdred is town, and he is suspicious of you.  It's worth a look.")}
 {:user "rsoultin",
  :message
  ("Schoolwork. Ick. I forgot I have to reply to all my classmates on globalization."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Is it terrible that I hate reading stupid?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Digression."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What makes you worried about HF in particular, Trfel? I assume there's a reason he has top priority here?")}
 {:user "sicklucker",
  :message ("Oh you guys are still goin lol. Just cant stop eh?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It just feels like that is the logical first thing to look in to.  Holyflare being scum would change a whole lot."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Without a reread though, I just don't see it.  And I'm not going to pretend that I have any hope of catching mafia!Holyflare in a 3:45 AM reread.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I've never been in a game with a scum lynch on Day 1.  Last game was close, but I was the scum, so that doesn't really count...."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And I have to leave tomorrow.  I want to get this right, or at least get the lynch on the best place overall.")}
 {:user "rsoultin",
  :message
  ("Lol"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Everyone else got him on votes in Carol."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I got him on BS pushes. WHICH he tried to continue with a push on me. But I'm not holding grudges. See? A good rsoul I am. I guess that was all to say that he's not impossible to read. Just...good as scum lol. So worth rereading for sure, just was curious what made him top of the pile."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Everyone should probably be reread after the flip, if we're being completely honest here."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Hi SL xP We're not trying to lynch you, promise.")}
 {:user "Fecalfeast",
  :message
  ("1) Trfel  - Doesn't want to lynch me maybe, despite his vote, which is nice. Wanted to sleep 1.5+ hours ago but calls out hf for not gonig to bed...? null/town"
   {:tag :br, :attrs nil, :content nil}
   "2) LightningStrike "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?page=21#414"},
    :content
    ("http://www.teamliquid.net/forum/mafia/476878-linux-mini-mafia?page=21#414")}
   " ‘will return tmrw with reads'(nope) pokey questions and little substance. sorta tries to throw scum at me but never follows up. scumpile for sure"
   {:tag :br, :attrs nil, :content nil}
   "3) Chezitwo calls me scum for bad filter, has bad filter, seems to go for low hanging fruit, scumpile"
   {:tag :br, :attrs nil, :content nil}
   "4) Damdred Looks like he is actively trying to solve the game, has some inconsistencies but blue claim so town for now but "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   "5) IAmRobik zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"
   {:tag :br, :attrs nil, :content nil}
   "6) rsoultin  huge filter, asking real questions, pushing for answers, town"
   {:tag :br, :attrs nil, :content nil}
   "7) sicklucker  different this game, but he is right that I can't read him, really. null/would lynch since he wants to kill me."
   {:tag :br, :attrs nil, :content nil}
   "8) Half the Sky yeah lots of good stuff townpile"
   {:tag :br, :attrs nil, :content nil}
   "9) Eden1892 big posts, seems to be putting in effort but filter seems like following thread sentiment rather than putting anything new forward"
   {:tag :br, :attrs nil, :content nil}
   "10) Palmar would lynch to save self"
   {:tag :br, :attrs nil, :content nil}
   "11) MARVELLOSITY  Wants to kill palmar, 6 pages d1, 4x mafia in a row is improbable townpile"
   {:tag :br, :attrs nil, :content nil}
   "12) HolyFlare 11 pages, helping the game progress, rly mad sometimes. Seems town to me."
   {:tag :br, :attrs nil, :content nil}
   "13) FecalFeast poop eater 420"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I have a google doc for notes that I was \"using\" at work and I just did some filter looking to expand on it or completely change it in some parts")}
 {:user "Fecalfeast", :message ("go life")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Dude, last game would have gone so differently if people just listened to me when I was right instead of when I was wrong. -shot-"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But 2/3 scummers Day 1 and Day 2 was pretty damn good...and Shining was my lynch if Damdred and I could have ironed things out. Oh well."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "FF's list post, I want it.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "With you on that one."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So of that list, you probably want to lynch sicklucker today, right?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And yeah, I'm still not inclined to lynch FecalFeast any more.  Someone decide something.")}
 {:user "Fecalfeast",
  :message ("palmar sicklucker or lightning strike")}
 {:user "sicklucker",
  :message
  ("I aint hatin im lovin it. Just thought you all went to bed")}
 {:user "Fecalfeast",
  :message
  ("honestly probably not sicklucker idk"
   {:tag :br, :attrs nil, :content nil}
   "I wish robik was here to be town jesus")}
 {:user "Fecalfeast", :message ("YO LIFFEEE")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ninja'd"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Hmm, some of these I find rather funny. Like Robik. <3 and 4x mafia marv is improbable lol...(you do realize that technically the probability doesn't change that someone's mafia cause it's RNG?)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Who are you voting right now, FF? Could just look but Ise lazy and you're here.")}
 {:user "Trfel",
  :message
  ("He's voting sicklucker.  But he just said he probably doesn't want to end on sicklucker.")}
 {:user "Fecalfeast",
  :message
  ("I think SL? I haven't decided who I am leaving it on im not going to bed yet")}
 {:user "sicklucker", :message ("Not me poop eater, not me.")}
 {:user "Fecalfeast", :message ("yeah my vote is on SL")}
 {:user "sicklucker",
  :message
  ("FF saying that marv having that big of a filter after being mafia a ton makes him town. Which is acual true. Not that its improbable I think? ")}
 {:user "Fecalfeast",
  :message ("how many mafia in a row did chairman ray get?")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "lol true it'd just be silly to get mafia 4x when he hates it")}
 {:user "sicklucker", :message ("Im defending you poop eater...")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "goddamn I know I'm not gonna leave my vote on you god I'll unvote shit fuck")}
 {:user "rsoultin",
  :message
  ("Okay. Well, honestly, your willingness to reconsider SL I thought was townie when I saw it, but words have to be supported by actions or they're just lip service."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "LS would be a waste cause I know I'm not voting him today. Unless you feel strongly enough to drive that lynch yourself, FF, it's probably not going to happen.")}
 {:user "Holyflare",
  :message
  ("Like the ls point if it's true but far far too tired to fact check any of it, eden point might be worth checking into as well since i thought i was on same wavelength as him but might be what you say instead. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Palmar/chez/robik good lynches")}
 {:user "Trfel", :message ("So what are we left with.  Palmar?")}
 {:user "Trfel",
  :message
  ("Or Robik.  If someone is willing to drive that one through, that could work.  But I'm not going to be here, and without someone forcing it, I don't think it will happen.")}
 {:user "Fecalfeast",
  :message
  ("would maybe kill eden but meh."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "palmar/ls/chez")}
 {:user "Fecalfeast", :message ("or robik")}
 {:user "Holyflare",
  :message
  ("Well since i like ff's list and he's not actually that bad his pushes on chez aren't actually bad either ")}
 {:user "rsoultin",
  :message
  ("I think the general consensus on Robik was either to never lynch him *coughSLcough*"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Or to give him another day to see if he suddenly bleeds town")}
 {:user "Holyflare", :message ("Yeh 100% sleeping now :p :p")}
 {:user "rsoultin",
  :message
  ("That said I am totally for getting rid of him (robik) now if there are enough people up to that. I just honestly don't have a strong preference one way or another between him and Palmar.")}
 {:user "Trfel",
  :message
  ("I can't explain why, but I want to lynch Robik.  Just intuition, I suppose.  I really don't like his claim and where he went with it.")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I wish most of my scum wasn't lurkers tho")}
 {:user "Trfel",
  :message
  ("A lot of people are willing to lynch Robik, and since no one else is saying anything, I will decide.  We are lynching Robik."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If you don't want to lynch Robik, please say something.")}
 {:user "Fecalfeast", :message ("I'm in")}
 {:user "rsoultin",
  :message
  ("Heh, of course I'm down as long as we have enough votes. That's my only concern."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "(I brought up killing him in the first place xP)")}
 {:user "Trfel",
  :message
  ("In case people are wondering why I'm not voting Robik, I'm compiling the case first.  In case I somehow get more sleepy, I would rather have to make a vote than a case.")}
 {:user "rsoultin",
  :message
  ("Sorry Truffle gots to sleep. I'll change my vote if we can get the lynch some traction.")}
 {:user "Trfel",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content
    ({:tag :b,
      :attrs nil,
      :content
      ({:tag :font,
        :attrs {:style "color: red"},
        :content ("IAmRobik")})})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Robik opened the game by claiming named VT."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This is his explanation."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And then he says this.  I didn't think too much of it at the time, since I figured that he was probably joking or being sarcastic (though I am having trouble seeing how).  But when taken at face value, it makes no sense."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "First, if he is a poor player or intends to be ineffective, claiming named VT is a very poor idea.  It basically allows the mafia to choose if they would prefer to kill a named VT or whoever they would normally want to kill, and it can be assumed that the mafia will choose whatever they deem best.  Mafia could always just ignore Robik and be more accurate with their nightkills/roleblocks for a potential role."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The upside to the claim is that everyone knows he is town, so we can follow him and trust him.  But he didn't give us anything to follow (more on this later).  And I maintain that if the players in the game have a brain (which they do in most games on this site, and this game seems to be fairly skilled), anyone can get people to follow their reads just by making a well-constructed, logical case.  So, Robik feels that he wants to lead town, and that he needs to claim to do it.  But he has trouble getting people to follow him even when he is confirmed cop.  This doesn't make sense to me at all."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Meanwhile, as mafia, Robik has lots of incentive to claim named VT.  Given the modification system that potentially adds an extra named VT to the game, we only know that a claimed blue is lying if there are four claimed blues.  Since there are only three blues in the game 33% of the time, Robik's claim doesn't incriminate him 66% of the time, and even if there are in fact three blues in the game, Robik is safe until they all claim."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "After the claim, Robik gave a fake scumread on Eden1892.  Then he says he wants to lynch FecalFeast, no reasons provided.  Then he says this game has too many scum.  Then he votes Damdred for adding an unnecessary paragraph break."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If the game has too many scum, then why doesn't he share any of them with us?  Especially seeing as he claimed with the intention of making him confirmed town and leading the town?  As it is, all he gave us was two joke scumreads and one scumread with no reasoning in the slightest."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Robik has been hypocritical and ineffective.  The claim doesn't make him town, but instead of using it to lead town, he has used it as an excuse for doing nothing."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("##Vote Robik")})}
 {:user "Trfel",
  :message
  ("Yay for cases at 4:30 AM.....  Please forgive me if some parts don't make perfect sense, hopefully you can figure out the intent.  I would like to think that everything is easy to understand, but at this hour I can't guarantee that is true, and I'm not sure if I can be back to clarify."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I need sleep, and I'm not confident in being online much until well after the deadline.  Someone carry this lynch through please.  Unless of course new information comes up.")}
 {:user "Chezitwo",
  :message
  ("Hello, I seem to have missed 30 pages. I don't have much time today either, at least not for another 8 hours or so. If I can't catch up, I will sheep marv or HF.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Hi Chezitwo."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Do you mind reading and commenting on the case I posted two posts above your post?")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The point where ff pointed out chez is attacking bottom feeders is solid. I made the same point when he attacked Ls")}
 {:user "Trfel", :message ("Sicklucker, vote Robik with me?")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Er I still think its terrible. You convinced me enough that ill vote him over myself now if thats any consolation.")}
 {:user "Trfel",
  :message
  ("Rsoultin, why couldn't you have stayed up one minute longer....  Not the first time we've had a mis-cue by one minute (Newbie Mafia Day 1, you left a minute before I switched votes).")}
 {:user "sicklucker",
  :message ("Theres always a thing called tomorrow.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I don't have tomorrow......"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sorry for getting anxious.  I think I'm right, but I can't be there to force it through.  I guess there's nothing to do but hope for a scum lynch, however it ends up."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But please, people, when you wake up, read my case.  Decide for yourself.  And if you agree with me, then vote Robik.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Does a faulty device try to become favored, or would it settle to be average?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "It would probably settle for being average.  That's what it says in the stickied TL Mafia guide."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It is generally bad for scum players to try and lead town, since they are at opposing goals, and it will make their alignment too obvious.  Much easier for scum to simply avoid being lynched, while staying low profile.")}
 {:user "rsoultin",
  :message
  ("I'm still up cause I'm an insomniac."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "SL you boob. I quoted the so-called \"scumread\" of LS. Unless we're talking about different posts you don't have a leg to stand on there."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "(Still <3 you as a person, though, you phoenix killer ;o;)")}
 {:user "Palmar",
  :message
  ("is holyflare really this mad that Damdred is smarter than him?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You're awake?!?!"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Will you volunteer to lead the charge against Robik so I can sleep without worry?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "First sicklucker, then Chezinu, then Palmar.... next thing you know, maybe Robik will come back."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I will look at the Holyflare/Damdred interactions later."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Palmar, who do you want to lynch?")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm here so I won't get lynched.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Chez the Chez."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "A faulty device may try to become favored if his programming is protected by a firewall that can only be..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lol I don't speak geek well enough for this."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Statistically speaking he can go on being townread practically indefinitely as a claimed blue except under unusual circumstances, and as such, it's not a bad move for scum at all. Plus look at the specific role he claimed. Especially as godfather, but even as general scum, he can be overlooked without being required to do anything."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This leads me to want to treat him as a general VT."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And as a general VT, robik deserves death cause, as FF said...ZZZZZZZZZZZZZZZZZZZZZ"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Robik for lynch")})}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Unfortunately I will be gone for some time, but I will return!")}
 {:user "rsoultin",
  :message ("Lol, that answer your question Truffle?")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Would a faulty device in league with other faulty devices present itself as a favored distro, then sit back without trying to upgrade itself? I am not sure...")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Well enough."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Will be interested to see how the Europeans respond.  Especially seeing as how America is \"the stupider part of TL\" ( -Palmar, in a previous game)."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I really ought to go to sleep."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But that case removed my sleepiness, it fell together far better than I expected it to.")}
 {:user "Fecalfeast", :message ("we should kill palmar")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I disagree, he's a nice guy.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Why Palmar over Robik?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Side note, I just realized that I actually have the second longest filter in the game right now.  So much for my typical low post count.")}
 {:user "Trfel",
  :message ("EBWOP: Oops, third longest....  rsoultin also beat me.")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "why are you reading your own filter?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Palmar is here taunting us while robik is ded")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Maybe not. Robik generally AFKs as scum, though, according to those who know his meta better than I do. And as I said, if the general way to handle these things is to let it go unless blues are counter-claimed, it's not that big a risk. If we let this particular one go, he can ride all the way through because of the potential for 3 blues in this game and no need to lynch into them until a 4th emerges."
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I really am equally happy with a Palmar or Robik lynch, Trfel, to be quite honest. Happy to push for you especially if you're going to leave your vote there, but the more logical thing unless you don't believe Palmar is scum is to wait to push Robik Day 2 if we still wan to do that.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Gotta make sure I'm not scum.  Otherwise, how could I sheep my case?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I see Palmar as a pure coinflip with some vets who say it is better than a coinflip, without providing explanations.  We also have a vet (Eden1892) who says that Palmar is probably town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Meanwhile, making the case on Robik made his play seem even more suspect."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I will be back for a little after I wake up, I hope, just not for very long."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If the Robik push doesn't have support, by all means, let it drop.  But many people said they were willing to lynch Robik, so I think it can work.")}
 {:user "Trfel",
  :message
  ("Okay, finally going to bed."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Good night.  Please lynch scum.")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "two people can do the same thing yo uknow. Not my fault you didnt see my post")}
 {:user "Fecalfeast", :message ("bedtime nighty")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Apply brain to statement please.")}
 {:user "marvellosity",
  :message
  ("20 pages"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "wat")}
 {:user "marvellosity", :message ("26, i stand corrected")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "Bad, bad answer.")}
 {:user "Palmar",
  :message ({:tag :br, :attrs nil, :content nil} "Why?")}
 {:user "marvellosity",
  :message
  ("because my general play + the fact i'm happily going after you are more pertinent facts. which you should know."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "pretty sure you know i wouldn't be playing this game at all if i were mafia. you know that. so yeah, it's a bad answer."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "having said that, it's a mindnumbingly tedious read right now, i almost cba.")}
 {:user "marvellosity",
  :message
  ("I wonder if Trfel could be mafia."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The \"my plan is to sheep marv and HF to victory!\" + \"I am paranoid marv+HF mafia are going to wreck us!\" is so weird."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "not sure about his pressure on damdred either, although that's a bit reliant on me being right that damdred is town")}
 {:user "Palmar",
  :message ({:tag :br, :attrs nil, :content nil} "I disagree")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "maybe this is a town ending to it though.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "then you're a fucking shit player")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "although to turn it around again, he's suspicious of 2 players but doesn't want to lynch them."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "then what?")}
 {:user "Palmar",
  :message ({:tag :br, :attrs nil, :content nil} "That depends!")}
 {:user "marvellosity",
  :message
  ("I *hate* HF's reaction to Damdred being suspicious of him."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "it's awful.")}
 {:user "marvellosity",
  :message ("although I might end up sheeping his sl read. meh.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "blue claim heyooooo")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "no you aren't")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I already said it's weird that hf is mad that damdred is smarter than him )))))))))))))))))))")}
 {:user "marvellosity",
  :message
  ("i basically have to go for the rest of the day soon, might just afk my vote on Palmar and hope for the best")}
 {:user "Palmar", :message ("wow just when we were getting along.")}
 {:user "marvellosity", :message ("we weren't.")}
 {:user "Palmar",
  :message
  ("you keep sending me these mixed signals marv. I am emotionally torn at the moment.")}
 {:user "marvellosity",
  :message
  ({:tag :b,
    :attrs nil,
    :content
    ("##Unvote" {:tag :br, :attrs nil, :content nil} "##Vote: Palmar")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "clear enough?")}
 {:user "Palmar",
  :message
  ({:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "marvellosity",
  :message
  ("i saw a couple votes for robik in the vote thread. i don't think we should vote a blue-claimer even if he is afk. There are other mafia even if he is mafia, so it pays to wait a day."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think LS looks pretty bad for being absent so long")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "HAHAHAHAHA @ Eden is a vet")}
 {:user "marvellosity",
  :message
  ("ok i caught up. you can lynch robik and maybe he's mafia, but if he flips blue y'all gonna feel pretty dumb.")}
 {:user "marvellosity",
  :message
  ("secretly i hope town decides to lynch him while i'm (mostly) away and he flips blue so i can berate you all and not be wrong about advising against lynching him.")}
 {:user "marvellosity",
  :message
  ("also i pretty much take back any trfel suspicions i had while reading through.")}
 {:user "Palmar",
  :message ({:tag :br, :attrs nil, :content nil} "I claimed gentoo?")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I never town read palmar just said I didn't want to lynch him today")}
 {:user "Holyflare",
  :message
  ("............ "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Stahp")}
 {:user "Damdred",
  :message
  ("No you keep saying factually incorrect things and you want me to stop? If it was reverse you would beat me with a broom")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Reminder to revisit this in a bit ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Dude just stfu up about it. Nobody scum reads you for it. I don't scum read you for it. It was a fucking dumb thing to remove palmar from your lynch list because he made you laugh. Drop it and move on. ")}
 {:user "Damdred",
  :message
  ("Whatever I caught you in two lies/misremembering now and you would shit up the thread if you caught ANYONE foing that."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "but whatever")}
 {:user "Holyflare",
  :message
  ("There's literally nothing wrong with misremembering something at 7am."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What were you talking about when you said i \"just wanted to be right\" and now you're saying if it was the other way around that I'd beat you over the head with a broom... To show that I'm right :p? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Talk about something relevant for once this game. Sl made a massive post which you said nothing about, ff made some reads, palmar continued doing nothing. There's a robik case. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "LightningStrike",
  :message
  ("Just woke up and saw the case on Robik but the thing about Robik is that he claimed blue yes but I really hate the claim from him. Also Damdred did claim blue too so we got our 2 unCCed blues already. Also people still arguing that sicklucker is scum even after I gave a explanation on to why he not a good lynch Day 1 and more likely is town too. Also FF is calling me scum too -.-")}
 {:user "Half the Sky",
  :message
  ("Figures, I go to bed, and I have to catch up on 14 pages..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "After reading everything, it's between Palmar and Robik for me. The case against Robik is very good, but as has been discussed with the setup, it's possible there might be 3 blues. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I've put my vote on Palmar for now. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Filter diving Robik one more time. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I know there are quite a few lurkers, but I highly doubt the entire scumteam are all lurking, seeing as Trfel mentioned something along these lines. I know it happened to an extent in Student IV, but LS was an active scum, though he was caught out based on the things he was saying.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm remembering that analysis from Geript in Newbie LX. Where Celestial claimed blue, and then fucked off and did nothing. "
   {:tag :br, :attrs nil, :content nil}
   "I'm starting to wonder if some of us could be making that same mistake. ")}
 {:user "Half the Sky",
  :message ("EBWOP - That same mistake with Robik. ")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "There is no setup with 3 blues lol............. Also my team was afk in that game when I was scum but so was Holyflares to a extent.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Until we got another blue claim we got to take it as it is at face value.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Look at the modifications in the OP: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Forgot that there is a chance of 3 blues I wish it was a bit easier knowing all the setups possible lol.")}
 {:user "Half the Sky",
  :message
  ("Other general comments: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden's posting has dropped off compared to the super townie I recall from Hammertime, probably need to look into him for Day 2."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also noted Rasputin's comment on my thoroughness. Fair play, ask away tomorrow. I'll just say though I was tipsy the last two nights. I had the choice between playing this way, or not playing at all. Take that as you will. ")}
 {:user "Half the Sky",
  :message
  ("I'm going to change my vote to Robik. Though it was weekend and he did piss off and do nothing after that claim. He AFKed Hammertime and was scum. Palmar is still largely a policy vote for me. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I realise meta arguments have been made against Palmar..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Palmar could be trolling as either alignment as I learnt in Hammertime. ")}
 {:user "Damdred",
  :message
  ("@HF you are being a hypocrite, which is fine I thought better of you honestly and you refuse in the very least to even see what I'm trying to say instead turning it into the biggest fight we've ever had. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Hts why tobik over Eden at this point, robik has been afk bit he's blue we should give that a day cycle to see what shakes out at this point. Edens play has been a lot more lop sided tto a lot of things")}
 {:user "Half the Sky",
  :message
  ("Other thoughts: "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Trfel is definitely looking better upon re-reading. Same for Rasputin. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "After reading that large post (the first four key points) by Sicklucker, I'm inclined to think not lynching him for D1, and thankfully it doesn't look like he will be. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Damdred",
  :message
  ("Edens pretty bad actually, super sarcastic unhelpful until he gets called out. After that big posts, then spotlite shifts and Eden doesn't do much")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "From your perspective, weren't you the one who said it was his scum meta to afk? I'm just thinking back to Newbie LX when Celestial claimed blue and fucked off, it's smelling like the same thing here. If he were cop/doc, I'd think he'd be inclined to NOT claim D1 and try and do some work to maintain credibility as a townie. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden was at least somewhat active and contributing earlier in the day. I disagreed with his point on Palmar for instance based on our exp in Hammertime, but I can see why he's making it. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If you're saying the lurkiness is Robik's scum meta, why are you inclined to believe the blue claim? ")}
 {:user "Damdred",
  :message
  ("Hts who's the rest of the scum team then? You feel disconnected right now from thread")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You're telling me I'm lying when it's irrelevant to the game and I just don't care enough."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Are you bot buying what eden said about getting nk'd? ")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The same thing happened in Hammertime. Very sarcastic at the off. Lian called him out D1 and he shaped up. He was killed N1, was VT. ")}
 {:user "Damdred",
  :message
  ("Not really, at one level it feels sincere but it sounds more like bs honestly and an excuse to play like he did earlier. Also can we really say that edens play has dramatically improves since then? The number of big posts have increased but not sure if content measures up to it")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Pretty sure I said it before, but I'm treating that part as NAI. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ("Alright, I can make my setup argument vs. how many lynches we have argument again, which basically just proves that it's possible to claim blue as scum, do jack-all and ride it out."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I can also sit here and tell y'all how there is no good town motivation for Robik's immediate claim Day 1 (and there isn't) though that doesn't actually preclude him from doing it as town, cause he can still be just an idiot who then AFKd."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The honest truth though is that I genuinely think Palmar and Robik are equally good lynches here. In some ways I'd argue Palmar is better cause he's not the blue claim and he's actually been in the thread doing jack-all vice Robik who has demonstrably not been around anywhere."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I do agree with Trfel's intuition on that claim, though...it matches with mine. I can see a ton more reason for scum to make that claim like that than town. If y'all want to lynch either of them, great. I do not want a blue who can ride out his claim the entire game solely because it's "
   {:tag :i, :attrs nil, :content ("possible")}
   " to have 3 blue roles this game (while actually more likely that there are only 2, statistically) because town is too scared to lynch someone for doing jack shit after claiming. He cannot and should not be in MYLO without stepping up his game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "tldr: Read Trfel's case on Robik if you're not good with the Palmar lynch. I think if we lynch either of those we've got a great chance of catching scum today.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Yeh i know you said that :p"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Gonna mull some things over")}
 {:user "rsoultin",
  :message
  ("Also, I'm not really liking Eden this game on a gut level that I'd have to iron out, but why do people want him as a lynch over all the other possible lynches today?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Damdred, can you answer that? HF?")}
 {:user "Damdred",
  :message
  ("I agree in this setupwhat robik did is the safest thing for mafia gf to do. However we can have other information help us in lynching him another day."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't but i haven't read him yet other than in real time and he seemed ok then")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I explained a bit why I don't like Eden. I have to look at his filter build a case but id rather just not policy lynch d1 which is meh to me")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "See I don't disagree with this at all. Mostly because I've been advocating treating him as a regular player instead of a blue, and someone generally AFK I'd probably give another day over someone like Palmar who's here but not playing."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Who do you want to lynch, Damdred?")}
 {:user "rsoultin", :message ("Ninja'd.")}
 {:user "Half the Sky",
  :message
  ("The key points I'm gleaning from Eden's filter (from the large posts):"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "1 The meta claim issue with SL, which he pushed on. (page 2-3 of his filter)"
   {:tag :br, :attrs nil, :content nil}
   "2 Comments on Rasputin after her questioning of Damdred on read progression"
   {:tag :br, :attrs nil, :content nil}
   "3 Defending Palmar based on Hammertime "
   {:tag :br, :attrs nil, :content nil}
   "4 Recapping SL's post"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "1 and 2 seemed like thought out concepts but afterwards I see what you mean Damdred..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But on account of #3, I feel Palmar can troll as either alignment, and I don't like Robik's claim. ")}
 {:user "Palmar",
  :message
  ("I like how everyone is trying to kill me over robik because he's a blueclaim when I've claimed gentoo like 3 times now."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("##vote holyflare")})}
 {:user "Half the Sky",
  :message
  ("I need to head out for a few hours. I will definitely be back in that time and will be around at EoD if anyone wants to talk on anything. ")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Being a vet, why don't you explain what you are seeing in HF, that most here are not? ")}
 {:user "Damdred",
  :message
  ("Honestly picking a lynch at this point for me is super frustrating."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "we have Eden who I think looks bad."
   {:tag :br, :attrs nil, :content nil}
   "Hf who I'm in a tiff with "
   {:tag :br, :attrs nil, :content nil}
   "SL who made some towny posts"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "then you have a policy robik which isn't horrible "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I still have to read chez though which I will do soonish")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil} "He's so mad at Damdred!")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Sorry to tell you this but HTS is a girl and so is rsoultin "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil}
   " Also why HF out of all the people you want to vote for?")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Have I ever told you how much I like you LS?")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Yes when I was shadowing you in Imperial :O")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "wth is Gentoo and how does HF being mad at Damdy make him scum? Damdy, if blue, claimed way early under minimal pressure and it was a bad move...one that I feel was genuinely emotional but I can see people being pissed at him.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I don't see Gentoo in the list either so idk (shrugs)")}
 {:user "Damdred",
  :message
  ("RS I can understand people being upset at the claim which is ok. But do you think the way hf is reacting to everything else I posted over the top?")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Like this sentence here is just fantastic."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "First of all, most likely LS fails to properly read that when I say \"He is so mad at Damdred\" I'm talking about HF to HTS, which is why the gender is correct. But what if this assumption is incorrect?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "We can also take the post to mean that LS thinks that I need to be aware of HTS being a girl while talking to her, as if I should change my presentation based on what, and given the \"sorry\" at the beginning there it implies that if we assume that he did understand that I was talking about HF, he doesn't expect HTS to quite get my argument simply because she is a girl? I think an alternative to explain this option is \"Sorry palmar, but she's not gonna get that, please present simpler arguments a woman could understand\"."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Then there is the possibility the sorry is aimed at me, as in \"you poor soul, you're talking to women here, you should tread carefully\", in which case LS clearly thinks of the gender as not only relevant but also something to treat with the utmost care because it could have dire consequences if I don't."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Thirdly, maybe the \"sorry\" is aimed at himself, and he just feels incredibly saddened by the situation, as if a conversation between two people is extremely sad if those people happen to be of a different gender. \"I'm so sad this conversation is happening between these people of differing genders\"."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And lastly, maybe it's aimed at my intelligence, in kinda the same way southerners say \"Bless your heart\". As if he is simply pointing out my perceived ignorance that he somehow managed to extract from a post that had nothing to do with either HTS or rsoultin. \"Bless your heart Palmar, but didn't you know they were women?\""
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Palmar", :message ("Gentoo is a linux distro you imbeciles.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't see the point in y'all arguing over whether of not you defended yourself well yesterday, either, and got onto him for it last night. It's moot right now."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "As for his general attitude...it reads to me as ego-driven and argumentative. If that was all he was doing and he wasn't trying to find today's lynch, by all means, call him scum, but I can see this from a town HF easily. Granted I don't have as much experience with him. Unless you come up with something insanely huge about him, though, I don't see him being today's lynch. Do you?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That's probably what you should be concentrating on right now.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Ops misread I thought you were refering to HTS my bad :O Also thanks for answering the question about Gentoo being because I not used a Linux system before if I recall.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Wow..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Shit fluff post alert."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Is there a point to this?")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "He was making a statement about my post towards him.")}
 {:user "Onegu",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Vote Count")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("sicklucker (1):")}
   " Damdred, "
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Damdred (1):")}
   " IAmRobik, "
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Palmar (2)")}
   " Chezitwo, marvellosity "
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Fecalfeast(1):")}
   " Eden1892"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("IAmRobik(4):")}
   " Trfel, rsoultin, Half the Sky, Fecalfeast"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Holyflare (1):")}
   " Palmar"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Not Voting (3):")}
   " LightningStrike, Holyflare, Sicklucker"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Currently,")}
     " IAmRobik "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("is set to be lynched. Day 1 ends in "
       {:tag :span, :attrs {:id "bbcountdown1"}, :content nil}
       {:tag :script,
        :attrs {:type "text/javascript"},
        :content
        ("$(\"#bbcountdown1\").countdown({until: new Date(Date.UTC(2015, 02-1, 01, 21, 00, 00)), onTick: bbcountdownTick, tickInterval: 1});")}
       " at 21:00 UTC (+00:00)."
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Reminders: Votes are done in the voting thread "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476972-linux-mini-mafia-voting-thread"},
        :content ("(link)")}
       ". Make sure to unvote if you want to vote someone new. Voting is mandatory-- you may not abstain.")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-01 16:35:33")})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Oh, I see that. Trust me, LS. There's just no earthly reason for that post, unless it's to push you based on one of his many possible interpretations of your post."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Unless he's got something else hidden away in there that I'm just missing.")}
 {:user "Palmar", :message ("Are you 4real rsoultin?")}
 {:user "Palmar",
  :message
  ("Like this is a completely serious question. Are you a corporeal entity and not some kind of a benevolent yet extremely naive spirit that points out clever things like \"the sky is blue\"?")}
 {:user "rsoultin",
  :message
  ("<3 you Palmar"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Of course I'm a benevolent woodland sprite from fantasy town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "How much weed have you smoked today?")}
 {:user "LightningStrike",
  :message ("rsoultin why you voting Palmar?")}
 {:user "Onegu",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Vote Count")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("sicklucker (1):")}
   " Damdred,"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Damdred (1):")}
   " IAmRobik, "
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Palmar (3):")}
   " Chezitwo, marvellosity, rsoultin "
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Fecalfeast(1):")}
   " Eden1892"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("IAmRobik(3):")}
   " Trfel, Half the Sky, Fecalfeast"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Holyflare (1):")}
   " Palmar"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Not Voting (3):")}
   " LightningStrike, Holyflare, Sicklucker"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Currently,")}
     " IAmRobik "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("is set to be lynched. Day 1 ends in "
       {:tag :span, :attrs {:id "bbcountdown2"}, :content nil}
       {:tag :script,
        :attrs {:type "text/javascript"},
        :content
        ("$(\"#bbcountdown2\").countdown({until: new Date(Date.UTC(2015, 02-1, 01, 21, 00, 00)), onTick: bbcountdownTick, tickInterval: 1});")}
       " at 21:00 UTC (+00:00)."
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Reminders: Votes are done in the voting thread "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476972-linux-mini-mafia-voting-thread"},
        :content ("(link)")}
       ". Make sure to unvote if you want to vote someone new. Voting is mandatory-- you may not abstain.")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "For reasons I already stated. I'm happy with either a Robik or a Palmar lynch, but if one of them deserves some extra time to shape up it's Robik."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Clearly Palmar is determined to be a useless troll today."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Hey, but you made me chuckle this game, Palmar, so there's that.")}
 {:user "marvellosity",
  :message
  ("honestly the fact that the game is very hard to figure out is a decent argument for HF being mafia."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Actually it's a really terrible argument but it's kinda a good argument."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "not sure i want to take the punt today though..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "maybe Chezitwo is a good lynch after all?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And you are getting cold feet now because...?")}
 {:user "marvellosity",
  :message
  ("i've also not had the time to actually filter people and i'm not gonna have that time today, which kinda sucks."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "so take everything i say at superficial value")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I was literally not doing that."
   {:tag :br, :attrs nil, :content nil})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I was waiting for someone to make this argument and yeh chezinu looks much worse now that fecal looks good. ")}
 {:user "Palmar",
  :message
  ("But it's ok, we can talk postgame, when everyone's serious hats are off "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil})}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "well, it's kinda a combination of terrible associative reads, like this:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think Chezitwo is kinda suspicious, he's voting Palmar"
   {:tag :br, :attrs nil, :content nil}
   "I think sl is kinda suspicious, he's voting Palmar"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm kinda suspicious of HF atm, and the one thing Palmar has done is attack HF (the Damdred stuff)")}
 {:user "Palmar",
  :message
  ("Holyflare I have decided to talk to you maybe a little bit. Can you tell me why you are mafia?")}
 {:user "marvellosity",
  :message
  ("I'm kinda just going to vote Chezitwo, and not try to convince anyone else to vote with me because that's the confidence i have in my votes today. sorry boys."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ("##unvote"
     {:tag :br, :attrs nil, :content nil}
     "##Vote: Chezitwo")})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay, those actually aren't terrible reasons."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Maybe my read on Chez is wrong, but every time I've gone through his filter I've liked it :/"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "SL is SL lol >< I'm getting a town vibe off him but I can "
   {:tag :i, :attrs nil, :content ("always")}
   " be wrong about SL."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I kind of want to see a case though even if you said you're not going through filters. Chez' is really short. It should be easy to go through his at least.")}
 {:user "marvellosity",
  :message
  ("like it may just be that HF was up retardedly late and whatever else, but his arguments with damdred were amazingly unproductive and it simply wasn't all damdred's fault like HF tries to portray, also HF has done very little useful in that time period that i can see.."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "like, just arguing instead of pushing something clearly."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i dno, i don't get the townfeels that i do normally at this point in the game, maybe he's off, maybe i'm off, i don't know."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "also this weird combination of things where at some point he claims he's being lazy, at another he claims he needs to solve the game d1 because he'll get shot, doesn't mesh."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "bleh.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "there is no case."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "there are 3 mafia. of all the people in the game, i have better reasons to townread at least everyone minus 3 than Chezitwo.")}
 {:user "marvellosity",
  :message
  ("like give me 3 mafia rsoultin."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "are you gonna say Palmar, Robik, +1?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "that's gonna be pretty meh."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "who are you wrong on? because you're guaranteed to be wrong on a couple at this stage. ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Impossible ")}
 {:user "marvellosity",
  :message
  ("although it is kinda adorable you asked me for a case. for some reason i find that very sweet.")}
 {:user "Holyflare",
  :message
  ("But yeh my damdred thing was entirely bad and it was a mixture of rl+game stuff ")}
 {:user "Holyflare",
  :message ("I don't think I've really been unproductive though")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Honestly it's probably not both Palmar and Robik, which is why I'm going with the one that I have more than just paranoia, AFKing and a bad claim on."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I know some people search out whole scumteams, but I just find when I'm doing that it's a lot of confirmation bias and bs, so I'm trying to concentrate on one at a time."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden's pretty crappy defense of Palmar, though, doesn't make the rest of his lackluster play look any better, and regardless of the flip I'm going to be looking at him hard to see if there's any good reason to think he's town Day 2."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not any further than that right now. The last few games I pick up steam once I get voting to analyze, to check against my reads, cause Day 1 reads just usually aren't stellar, at least for me.")}
 {:user "Palmar",
  :message
  ("A robber robs a bank. The only description the banker could give the sheriff is that he was wearing a white hat."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So the sheriff walks into the local bar and announces \"Everybody stay quiet and raise your hands\". He quickly sees that two people are wearing white hats."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "One of the guys is playing cards, he barely takes notice of the sheriff and just keeps bantering at his table and when the sheriff repeats his request, he flips him off, it's not until the sheriff shoots a warning shot the guy shuts up."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The other guy is deathly silent sitting in a corner. He complies with everything the sheriff says without question."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Who would you arrest?")}
 {:user "Trfel",
  :message
  ("If I were treating Robik as a normal VT right now, and not giving him special privileges for his claim, I would lynch him."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't see it as a policy lynch per se, but I feel that his play has been the most anti-town play in the game to this point.  Him vanishing doesn't change that."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "@Palmar, I would arrest both of them.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "you're missing my point. but i cba to explain it. i didn't ask you because i wanted you to figure out the scumteam."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "like... say you list out the people you're confident are town, the people you think are scum, and the people in between. certainly there are the people in the in-between you're wrong about, and one of those could be chezitwo."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "or he could be town. who the fuck knows really.")}
 {:user "marvellosity",
  :message
  ("there is one thing about chezitwo i guess, if i had to pull something out of a hat:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "he voted Palmar on a metapoint from the middle of last year, yet never checked FF's meta at all until I mentioned it.")}
 {:user "Trfel",
  :message
  ("Marvellosity, can you give us any more insight to whether or not we should lynch Palmar?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm assuming you don't really want to lynch Palmar any more, since you  moved your vote to Chezitwo?")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "haha! yes, nice.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "not other than what i posted already.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Chezitwo is a smurf, no?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Thus, perhaps he played with Palmar in the game in question, and hasn't played with FecalFeast.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Yeah, I could be wrong about Chez. Problem is, I've already looked through his filter 3-4 times when others have brought it up: SL, FF, etc. I'm not getting a scum vibe from it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If others can quote and explain where they're getting the scumread, maybe it'll click."
   {:tag :br, :attrs nil, :content nil})}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "given smurfs are usually decent players trying to hide their identity, he has been massively shit and unproductive. he's hiding behind the smurf."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "he would still have had to search out that palmar game, unless he's a fucking freak and has palmar quotes saved somewhere on his hard drive like i definitely don't.")}
 {:user "Trfel",
  :message
  ("Marvellosity, do you expect Palmar to start playing the game more properly in the near future?")}
 {:user "marvellosity", :message ("no idea")}
 {:user "marvellosity", :message ("palmar is still an ok lynch.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay, let me check that. For some reason I thought he was just sheeping you because he'd townread you, heh.")}
 {:user "Palmar", :message ({:tag :br, :attrs nil, :content nil} "♥")}
 {:user "marvellosity",
  :message
  ("LS might be an ok lynch too."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i'm off to my other half's family imminently for dinner and what have you, and i don't think i'm back before deadline, and reception there is non-existent."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "if you trust anyone around deadline who's trying to move the lynch or whatever, trust damdred. trust damdred above HF.")}
 {:user "Palmar", :message ("Bye marv, it was nice knowing you.")}
 {:user "marvellosity",
  :message
  ("like Chezitwo is a smurf right? Played with Palmar before, probably played a decent number of games?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "the only thing he's done is \"i'm going to vote FF for being rubbish\" when everyone knows FF is always rubbish."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "that is it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "it's terrible.")}
 {:user "marvellosity",
  :message
  ("there you go rsoultin, you kinda have my case over the course of some inane ramblings.")}
 {:user "rsoultin",
  :message
  ("Meh, I don't like the speed with which Chez dug up those quotes, looking at the timestamps. Unless he had a very specific game in mind and knows Palmar much better than FF...that is genuinely weird. ><")}
 {:user "Trfel",
  :message
  ("I guess, I don't see how keeping Robik around helps with anything?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He is a claimed named VT.  Which, outside of claims and setup talk, has no more importance than a normal VT.  If he is in fact a named VT, his role serves the same purpose alive as dead."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Meanwhile, Robik probably won't be the night kill for a while, especially given Damdred's claim."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The only reason to keep Robik around is if you hope his play will improve upon his return, but I can also be hopeful for Palmar and Chezitwo and FecalFeast and all of the other lynch candidates."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Therefore, if I assume that Robik's claim is true, I believe his play has been the most harmful for town of all of the players to this point (if you are wondering why, look [link=http://www.teamliquid.net/forum/mafia/476878-linux-mini-mafia?page=66#1308]here[/link].  So, I think that Robik is the best lynch.")}
 {:user "Trfel",
  :message
  ("Well darn it, I forgot that I used code and should probably preview it first.  Hopefully you can figure out what I intended to say.")}
 {:user "Holyflare",
  :message
  ("what game is that quote from btw I searched for it and I can't find it anywhere?")}
 {:user "Damdred",
  :message
  ("ts from twiterverse mafia I think or something like that. I wasn't in it but I somewhat remember it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also fuck my phone I just lost a huge post about eden so i'm going to rewrite it without quotes zzzz")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Something played July of last year?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But on a second look at the context, there were 3 minutes between when Palmar claimed not to have opened that role PM and chez came up with those quotes. Unless he "
   {:tag :i, :attrs nil, :content ("knew")}
   " what Palmar was going to say beforehand, and they're both mafia, that speed is insane regardless of alignment."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So that leads back to whether or not it's reasonable for Chez to know a single \"meta point\" on Palmar better than FF? I don't know how long FF has been playing, or how well-known he is, but even I know he doesn't play much and has to be strong-armed into it most games. Unless this wasn't the case before, I can see why Marv is finding it weird.")}
 {:user "Damdred",
  :message
  ("Eden should be the lynch today, his play has been totally uneven and inconsistent with any iteration of his town game and tonely sounds close to the way he played in New Years Eve mafia."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden comes into the game being sarcastic and useless, he has several posts that are questionable at the time. The first post that is a head scratcher for me is the weak soft defense of me. He is disagreeing with HF case but draws no conclusions from it, he doesn't seem to draw any conclusions in his early filter at all his thought process is just totally devoid and lacks focus and direction. No reads at all are given in the early going and no scum hunting is going on, when this is somewhat alluded to Eden begins to pull the I do not want to get N1 card."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "His first large post is mainly him complaining about getting killed N1, with a question to SL at the very end. The post lacks any real content and has a real feeling of trying to look like hes doing something rather than what he was being accused of. Still he lacks conclusions and any type of reads in the thread at all."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He also sheeps a vote onto SL, but its very noncommittal vote that can be taken back very easily. Its a really weird vote that just doesn't seem right, I can sheep this but wait theres more. Just feels like trying to follow along with the thread sentiment at that point while looking for a way out and keeping options open."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "First real reads in the thread are that Marv and HF looked ok and then that Rsoultin has a tentative town read because of his push on me.  This is the second time that we see Edens scum hunting come down to sheeping people and not given any real thought to it. But I would be a good lynch for my flip on Palmar, but no real thought seems to go into it or fact checking, says they have read my filter but its a weird read because he says he can understand, and then goes on to call Palmar town even though hes starting to scum read me for not wanting to lynch Palmar? That doesn't make sense to me."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "After this post there really is not much of substantial value in the filter its just a lot of one liners some of them wanting to kill me, and then my blue claim and he looks for somewhere to put his vote and tells everyone to vote FF. Gives no explanation really why FF should be the lynch that day and never realy pushes it just afk a vote on FF and leaves the thread with the only content after that being that Palmar is town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Town reading people for no reason"
   {:tag :br, :attrs nil, :content nil}
   "Inconsitant thought process"
   {:tag :br, :attrs nil, :content nil}
   "Not scum hunting at all, barely giving any reads"
   {:tag :br, :attrs nil, :content nil}
   "Only sheeping people"
   {:tag :br, :attrs nil, :content nil}
   "Throwing away his vote"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden is scum vote him")}
 {:user "rsoultin",
  :message
  ("hey, damdy, your case jives with what I remember of eden (have yet to filter him) but I'm still trying to work out in my mind what makes him the best lynch today"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "do you have any objections to a robik or palmar lynch that would justify adding a third lynch train att?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "gonna go read his filter, but please answer this while I'm doing that, will you?")}
 {:user "LightningStrike",
  :message
  ("Now that I think of it he did the same shit with me on New Years Eve Party Mafia I guess it's better than nothing for me."
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("##Vote:Eden")})}
 {:user "Damdred",
  :message
  ("Yes he should be the lynch over robik and Palmar."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The main proponent of a Palmar lynch is off that wagon now, and Palmar is nothing more than a policy lynch. And it is my opinion that we should at least give him a weekday cycle to prove his towniness before we lynch him, weekend games are horrible start times and Palmar is notorious for just not caring on weekdays and I've seen him do this as town before."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Robik is a bit weirder, but I generally don't agree with killing claimed blues d1. Its just bad practice I could see him doing this as mafia because its safe, but I just would rather not today.")}
 {:user "Trfel",
  :message
  ("I need to leave in 5 minutes."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I won't have time to look all that carefully into the Eden1892 lynch."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Tell me what I should do.")}
 {:user "Damdred", :message ("Vote Eden Trfel")}
 {:user "Trfel", :message ("Vote Robik Damdred")}
 {:user "Damdred",
  :message
  ("Why, do you really think the case on robik being afk is better than the case I just presented?")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I am enchanted by your grandiose words, by your burly manliness, by your unwavering confidence and your courage."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If by my life or death I can protect you, I will."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You have my sword."
   {:tag :br, :attrs nil, :content nil})}
 {:user "Trfel",
  :message
  ("Damdred, I didn't get to look at all of Eden1892's filter, but I don't think it's as bad as you say it is."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden was pressuring sicklucker with the \"my meta says\" phrase as well."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I can understand that he says Palmar is town while still scumreading you for changing your stance on Palmar.  He isn't scumreading you for not wanting to lynch Palmar, he is scumreading you for changing your stance without Palmar doing anything."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think I will leave my vote on Robik.  I want Robik lynched.  I don't know how people will respond to the Eden1892 lynch, I wish I could be here, but I can't.  Therefore I will go with my instinct."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Whatever happens, hopefully you guys lynch a scum.")}
 {:user "Trfel",
  :message
  ("If I had more time to explain it, I could.  I don't have that time.  I'm sorry."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "See you tonight.")}
 {:user "rsoultin",
  :message
  ("Lol, Palmar."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Damdy, I'll lynch Eden with you if you can get the votes. Trfel, you should take the time to read Eden's 5-page filter if you can."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He wanted to ignore Palmar for shit reasons. His defense of me was eh and weird in that he was the only one doing it. If an entire town thinks I'm doing something scummy, it's probably because I am."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And I'm sorry but an FF or LS for lynch as default because he can't push Damdy anymore really "
   {:tag :i, :attrs nil, :content ("is")}
   " low-hanging fruit.")}
 {:user "Chezitwo",
  :message
  ("Hello friends! I am back. What can chezitwo do for you?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I have 40 pages to catch up to. In the meantime I will sheep marv.")}
 {:user "Damdred",
  :message
  ("[QUOTE]"
   {:tag :b,
    :attrs nil,
    :content ("On January 31 2015 15:44 Eden1892 wrote:")}
   {:tag :br, :attrs nil, :content nil}
   "I see no issue with my reasoning. If it's your shtick as town to criticize quick role claims, and you know it is, then you're going to do it as mafia even if you're actually happy about it, because you're going to try to emulate your perception of your town behavior. You're going to do it, and because you're doing it artificially instead of naturally, it might not be a perfect facsimile of your town behavior. You might be underselling it, like you don't really care... or you might be overselling it, and become unreasonably upset about it, and unreasonably defensive when people call you on it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "In other words, exactly what I was worried about with you. Your statement that this is what \"your meta says,\" as I'm interpreting it, seems to reinforce this idea, because it indicates that you were deliberately trying to interpret your own meta on the subject, when as town you presumably wouldn't be bothered about it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think you need to answer my question now. Am I misinterpreting your statement I quoted, and if so, how? If I'm not, how else am I supposed to interpret your behavior other than \"you oversold your town proclivity to hate on blue claims because you aren't actually town\"?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ("Work with me here. I'm entertaining the idea of your innocence, but if you don't cooperate with me when I ask a basic and important question, you give me very little recourse to assuming your guilt.[/")}
   "QUOTE]"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Look at this, the bolded looks fucking weird. And SL NEVER really answers in a very good way that could be innocent but Eden totally drops it past a couple one liners and moves on to pushing me then afking on ff?")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "fixed format")}
 {:user "Damdred",
  :message ("Also I have the votes Rsoultin if you switch")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "oh.."
   {:tag :br, :attrs nil, :content nil}
   "I thought you were my friend.")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Besides what I just posted, half of the thread had mentioned this weird read, sl was getting pressured from all angles."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not sure that SL can't be scum here but i'm more convinced that eden is scum at this point with the lack of follow up on things and the going after low hanging fruit with no real push.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Chezzy, your insta!meta-quotes and vote on Palmar caught Marv's attention after having to explain FF's play to you, and I'm inclined to think it's weird how quick they came, too. How do you know Palmar and not FF?")}
 {:user "Chezitwo",
  :message
  ("Marv votes me and no one follows? I do not understand. Maybe it needs help."
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ("##Unvote"
     {:tag :br, :attrs nil, :content nil}
     "##Vote Chezitwo")})}
 {:user "Trfel",
  :message
  ("I had band practice.  It just got canceled.  I'll be here until the deadline."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Please ignore my last few posts, I will take an in depth look at this now.")}
 {:user "rsoultin",
  :message
  ("Okay, damdy. Switching to Eden. Still want your response, Chez."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I was townreading you. You're making me sad "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I am good at using the search function when I know what I am looking for. With Palmar, I remembered. With FF, I had nothing to remember.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "What instrument you play in the band? Also when you get done checking out Eden tell us your thoughts on him and compare this game to his scum game on New Years Eve Mafia and here is the link for it: "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href
     "/forum/mafia/474389-new-years-eve-party-mini-mafia?user=Eden1892"},
    :content
    ("http://www.teamliquid.net/forum/mafia/474389-new-years-eve-party-mini-mafia?user=Eden1892")})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "How long have you been playing on this site, Chez?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I play trumpet."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not going to use meta here.  I don't feel that I know enough about mafia or about Eden1892's play to be qualified to judge this.  My usage of meta is limited to when I don't feel that it can possibly be wrong, and I usually use it to try and townread people (or rather, not scumread them, since I don't really like townreads), not the opposite.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Why does my self vote make you think I am not?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Since the dawn of time.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Your self-vote doesn't seem like a mafia play, but it's not a good town play either if you're town, imo."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Well, gonna have to let the vets sort out the veracity of your claims on Palmar and FF. I've actually liked your play so far, so this and the long absence were really the only questionmarks. Do you have the time to catch up some and give us updated reads/comments?")}
 {:user "Damdred",
  :message
  ("I really want people to read my case read Edens filter."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I keep going back and Trfel whats so good about the pressure does it go anywhere? Is there any true conclusion about SL from it? does SL reasoning make sense for how it was dropped and eden just moved on to me?")}
 {:user "Damdred",
  :message
  ("Also rsoultin how excited are yout o vote with someone you want to lynch in Palmar right now?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "EBWOP:"
   {:tag :br, :attrs nil, :content nil}
   "At the very least on the players being pushed for lynch: Palmar, Eden, Robik..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "(If I'm missing anyone someone chime in.)")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "How can those who are veterans assert whether these claims are correct when they do not even know who I am, let alone grasp how I might view both these players?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I will be present until deadline. I'm not sure if catching up or trying to participate in current conversation is a better use of my time.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What are you talking about?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I hear you.  Like I said, I didn't have the fact checking to really know at the time I needed to leave.  I will decline from answering your question at this time, I will cover my read on Eden1892's filter and my response to your case in one post, when I finish.  At this time, I don't know what my conclusion will be."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The main reason that I didn't want to vote Eden1892 before was that I expect him to come back before the deadline.  And as town or scum, I don't think he will want to get lynched today.  If I was out and my vote was stuck on him, that would be less than ideal.")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You voted with Palmar on Eden XD")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Why is the bolded that impmortant when Palmar or Robik would fall into the same category?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I don't think you are among the top lynch candidates at the moment.  I would prefer if you spend maybe an hour or so catching up, and then discuss closer to the deadline?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Palmar doesn't seem to mind being lynched."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden1892 has put a lot more effort into this game than Palmar or Robik.  You can't deny that.  I just feel like if Eden1892 decided to return and play the game seriously, he could do stuff that would make him seem more towny.  I am not convinced that Palmar and Robik could/would do the same.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ah, I don't know -_-"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think Eden can easily be scum independent of Palmar's alignment. I like your case and he's been bugging me ever since the night kill scamgasm. Marv not being sure on Palmar anymore, and the weekend thing is something I've seen mentioned before..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Obviously a Palmar lynch isn't going to happen when it completely distintegrated o.0"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think I'm fine with it based entirely on Eden's play and will worry about who Palmar is trying to save himself to lynch later.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I read it and I read Eden's filter."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't feel like he has been trying to find the poorly functioning programs between the distro's. He has been throwing up firewalls in front of himself and others, but he does not scan for malware. I am willing to uninstall him."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What do you think of me?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Your playstyle makes it difficult.  But I get the feeling that you are reading the game and putting some effort."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Mostly, I feel that an extra day to read you would make the read far, far, far more accurate.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "A search function explains the timing more than adequately, as for the vets...I'd figure they'd have a better idea than I would how widely-known FFs meta (not really playing) is. It would help if you'd actually give how long you've been playing here."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "TBH, FF is playing more here than he was in the first games I've played with him.")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This post just doesn't jive with me for some reason. So eden isn't acting towny to you and needs more time to act towny? But you would rather lynch someone who literally doesn't care? but usually does as mafia and someone who claimed blue?")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I find it weird that marv disagrees, yet his idea does not gain any traction. I am a potentially easy mislynch that no one will blame anyone for, yet no one pushes it through. If I weren't me I'd suspect me being mafia for it. Since I have unique information that this isn't the case, there are a few options;"
   {:tag :br, :attrs nil, :content nil}
   "1. Mafia is afraid of pushing me because I'm a wildcard."
   {:tag :br, :attrs nil, :content nil}
   "2. The current leading wagons are also town."
   {:tag :br, :attrs nil, :content nil}
   "3. Mafia has no thread presence/all current players discussing are town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not sure what to think.")}
 {:user "Damdred",
  :message
  ("cut off to soon, i'm nto sure how eden has put a ton of effort intot he game not much real thoughts besides sheeping and dropping stuff instantly")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Another thing to consider is that marv voting on you is rather new to the thread and i'm trying to push eden through since then.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "This town isn't big enough for two trolls.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "The idea has been softly pushed already though by Fecalfeast and HTS who have both voiced suspicions. There seemed to be willingness to start the wagon."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also I'm a terrible Chezinu. I'm breaking character until the lynch I guess.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm going to ignore these questions.  Let me finish looking into it and then we can talk about it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm sorry that I am slow.  I can't help it, unless you want my read accuracy to be even lower.")}
 {:user "Chezitwo",
  :message
  ("Here's what I'm working with:"
   {:tag :br, :attrs nil, :content nil}
   "1. Marv is town because marv has rolled scum 3 games in a row or something and he's never going to try as hard as he has here."
   {:tag :br, :attrs nil, :content nil}
   "2. Marv suspects me and marv is a smart player."
   {:tag :br, :attrs nil, :content nil}
   "3. Marv's towngame is one of the if not the most respected game of people currently active."
   {:tag :br, :attrs nil, :content nil}
   "4. Multiple people (FF, HTS) have already indicated a suspicion of me."
   {:tag :br, :attrs nil, :content nil}
   "5. Marv votes me, it's unlikely that given the character I'm playing there'll be a good defense. No one would be blamed of a mislynch on me."
   {:tag :br, :attrs nil, :content nil}
   "6. No one joins."
   {:tag :br, :attrs nil, :content nil}
   "Why?")}
 {:user "Damdred",
  :message
  ("If we go down this line of t hought there are two distinct possibilities."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Mafia is not active in the thread when it was going on as you indicated earlier or mafia want to keep you around for a mislynch later as they think you can't clear yourself through play. If we assume you are town and marv is town anyway")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'd disregard #1, if only because I don't think anyone knows who you are?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So the real question is if all the wagons are town, who is scum? Or is scum just not here right now?")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You forgot the option where mafia don't care because all wagons are town. That's the one that worries me a little.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "So do all who live to make such cases, but that is not for them to decide. All we have to do is decide what to do with the votes given to us. There are other forces at work in this world Damdred, besides the forces of the mafia.")}
 {:user "Trfel",
  :message
  ("I still feel like the mafia thread presence is low.  I can't explain it.  But that's what I think."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Unless of course it's Holyflare or a serious marvellosity....... but please please please let that not be true.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "The wildcard means they might not want to take the risk. There's also this thing called the Chezinu rule that states the first person to call Chezinu mafia that hasn't played with him before is always mafia."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "These people have posted since Marv voted on me but before I came back: rsoultin, Trfel, HolyFlare, Damdred, Palmar. LS also ninja voted in the meantime."
   {:tag :br, :attrs nil, :content nil}
   "I already townread Trfel and LS before. Damdred seems clearly town from how he's aggressively pushing things. rsoultin seems kinda town as well, leaving HF and Palmar open."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I guess it's definitely possible everyone that's been there is town. It'd help a lot in exonerating a town Palmar if Eden flipped scum.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "The chances that Marv is scum this game are extremely low.")}
 {:user "Holyflare", :message ("Voting eden")}
 {:user "Holyflare", :message ("Also being lazy because i can")}
 {:user "Trfel",
  :message
  ("Damdred is town because he claimed blue.  Not sure if you saw that.  I am confidently townreading marvellosity, though there is still a very small chance he is scum (and unless something happens to make me doubt him, I think that chance is so small I am willing to forfeit the game in that case).")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Hm. I'm inclined to think marv is town, too, just by how he's been interacting with me. (Both when he suspected me and just now.) HF's response to the suspicion was basically \"hey, I was thinking that, too\" yet I don't recall seeing anything further from him. That's probably the most suspicious reaction in-thread imo."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Palmar I can't read. Trolling. I'd be happy to lynch him just so I don't have to think about him anymore, but the Eden case is decent and lines up with what I've been feeling about Eden all game.")}
 {:user "Damdred",
  :message
  ("HF I thought you were ok with eden what changed your mind?")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil} "Didn't see it. Named VT?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "><"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Damdred, does this make you comfortable at all? He's been saying all night that we may be right but he didn't see it, and now he's just sheeping.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ummmmmmmm is that really a question? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Player hf says eden looked ok at cursory glance from responses in live play "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Player ff says he's just sheeping sentiment"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Player damd makes case"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Player hf reads filter confirms things and votes eden"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Profit? ")}
 {:user "Trfel",
  :message
  ("Here's my analysis of the Eden1892 case."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "First, I will give Eden1892 a slight town lean for all of the not wanting to get killed on Night 1 stuff.  It just seems like a really weird play as scum.  He's already shown that he can play a fine scum game, so why would he do all this talk about playing badly to avoid getting killed Night 1 if he was scum?  It's just adding an unnecessary risk.  Another option is that he wants to be a bad scum so he dies and doesn't have to keep playing scum, but that isn't the impression that I get from his filter."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "One thing to the contrary is that he stopped complaining about this in the Hammertime Mafia obs qt, which Artanis named "
   {:tag :a,
    :attrs
    {:rel "nofollow",
     :target "_blank",
     :href "http://www.quicktopic.com/51/H/qGtRZtBnxKFuM"},
    :content ("Eden's Hammertime obs rant corner")}
   " because he was upset about getting killed on night 1.  Eden1892 didn't do much ranting about it then.  Why would he rant now?  I can definitely see it coming from a town!Eden1892, but it does seem a bit strange."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "While he says that he is going to play poorly to not get killed on Night 1, he also shows signs of reading the thread and thinking about it.  See his comment on Holyflare's joke case on Damdred, see his questioning of sicklucker on his \"my meta says\" comment."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The next major thing is his progression on his sicklucker read.  He starts by questioning sicklucker's \"my meta says\" statement, which is a good pressure.  Then he says that he is willing to vote sicklucker for not answering the question, and then says that sicklucker actually did answer it.  I reread that section twice and I didn't see sicklucker's answer in between these posts (though I guess I could have missed it......).  I'm assuming that Eden1892 realized that sicklucker actually did NOT answer this question, and that is why he was willing to follow Holyflare and vote sicklucker to help add pressure.  Therefore, I can accept Eden1892's explanation, though the inconsistency that Holyflare brought up still has some merit."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This is a terrible post.  His progression is \"Did Damdred really just claim blue with zero votes\" -> \"Kill Damdred\" -> \"Never mind Damdred is blue\"."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden1892 also said that he isn't coming back for End of Day.  He will get back just in time to see the lynch.  So we aren't going to get any help there."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I guess I'm fine with voting Eden1892.  The inconsistencies in his play can be explained, but there are more of them than I would like to see.  And those aren't things that he is intentionally doing to not get killed on Night 1."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Really hoping that he is able to check on the thread and give some thoughts.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Quotes please since this never happened")}
 {:user "Damdred",
  :message
  ("It actually makes me worried a good bit honestly its really strange but we have an hour and a half to make sure.")}
 {:user "rsoultin", :message ("Ninjad")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil} "Non-specified blue.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I think scum Palmar would've plopped his vote on a townie if Eden were scum. He doesn't seem to give a shit, so mind as well promote a mafia agenda whilst not giving a shit.")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I can accept this, as it makes sense")}
 {:user "Trfel",
  :message
  ("What the heck.  Let's start investigating Holyflare today.  A lot of people have voiced suspicions of him for various things, that makes it worth a look."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Since a Robik lynch doesn't seem to have the support, I guess Eden1892 is probably the best vote."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :a,
    :attrs
    {:onclick "return toggleShowSpoiler2(this, 1)",
     :title "",
     :href "#",
     :style
     "text-decoration:none;font-family:monospace;color:#808080"},
    :content
    ({:tag :span, :attrs nil, :content ("+ Show")}
     " Spoiler"
     {:tag :span, :attrs nil, :content (" +")})}
   {:tag :div,
    :attrs
    {:style
     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
     :id "spoiler_1"},
    :content
    ({:tag :div,
      :attrs {:class "forummsg"},
      :content
      ("Holyflare is probably going to start yelling at me for filter diving him")})})}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Your most recent post on him?")}
 {:user "Half the Sky",
  :message
  ("I'm back in thread. Will be here through deadline. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "First thoughts on the whole Eden thing, I believe we might have something. Eden sometime back said that Palmar had to be town based on his behaviour in Hammertime. I disagreed with this since Palmar maintained that he had no meta and he could troll as either alignment. Yet he was willing to townread Palmar based on the same behaviour. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Granted, Eden himself is trolling, but started posting stuff, the quality of his posts I know is up for debate. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "As for Palmar, Marv for one suspected Palmar, and I think Chez did post a quote from a game from last year. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I realise neither of them have flipped but it's something to further think about. ")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This post is kinda weird i'm not sure how I feel about it")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 200px; height: 61px;",
     :src
     "http://img2.wikia.nocookie.net/__cb20150107020612/lalaloopsyland/images/b/b8/Rekt.jpg"},
    :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I disagree. It's something he's clearly been thinking about outside of the game, so it's easy to bring out during the game. Non alignment indicative at best."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Could you quote these? We have limited time and if you know where they are that'd speed this up."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Is this the same point you've mentioned before? Because when I went through Eden's filter I saw very little actual digging and more observations.")}
 {:user "Trfel",
  :message
  ("Eh, I'll wait for Half the Sky before I potentially change my vote.  Half the Sky, Robik or Eden?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'll highlight the discrepancy for you "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil}
   " ")}
 {:user "Trfel",
  :message
  ("I don't feel the need to bring up the quotes, since you guys are right.  Eden doesn't look very good.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I swear if people are going to keep going on about that quote I'm switching to Stutters695 meta.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Mmm...bah lol. Can I just say right now that I absolutely hate Day 1?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay, so either Palmar is town and Eden's alignment doesn't matter or Palmar is scum and Eden is probably town. This isn't getting me anywhere.")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think these are the only ones about hf case onme?")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Switching it on its head, Palmar is more likely to be town if Eden flips scum. Eden is the scummier of the two.")}
 {:user "Damdred",
  :message
  ("Trfel sudden posting leaves me feeling a sense of weirdness and spine tingly feelings")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Yes, the weird meta thing about how palmar is town is still weird. ")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Alright I can believe that. What do you think of HtS' reentrance into the thread?")}
 {:user "Chezitwo",
  :message
  ("9 page Trfel interacting with the thread and not making large list posts of fluff (ever since the start at least) make me pretty confident in town!Trfel Dammy whammy.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't remember anything she's done since the first time she entered the thread. ")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Sudden posting?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I've been writing that post for quite some time.  You have made the argument that Eden1892 is scum.  Therefore, I was making the argument that he is town and seeing how its validity compared.  I decided that your argument was better."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What is the problem here?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Truffle, your analysis..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It's kinda icky.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil} "What are you talking about?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Just a second ago. The post she just made. I feel like I wasted precious seconds of my life reading it.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Hrmph.  Seems like no one likes it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What I don't understand is why everyone is picking my analysis, while I arrived at the same conclusion that they did?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "When marv said palmars meta makes him very likely mafia and eden defended him saying he was town because he did something that was nothing like his town game. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "Half the Sky",
  :message
  ("This is tough. Using my knowledge of his super town play in Hammertime, I'm more inclined to scumread him on this play, but given his ranting in that game, I can understand him wanting to tone it down. Since we don't know whether it could be a cover, it is why I was treating his rant as NAI. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm still feeling worse about Robik, but another angle looking at Eden is whether he could give his one good point for the day (like that SL read, I mean a lot of people at that time were scumreading SL) and figured that if he was just good enough to not get lynched, he could afk. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "His scum play in NYE party mafia was just that. He wasn't townie, but did just enough or convinced just enough to not get lynched. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I had recapped the point on Eden how after the point on SL it was a point on defending Rasputin in the face of 3 of us questioning her but a scum Eden would have perfect information such that he could do that without suspicion. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I can see why Eden would be a good lynch for today. I was going to filter dive Robik before leaving but let me look at both those two now. ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Yeh i read the rehash of the thread and it really just said nothing :/"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Forgettable hts is mafia "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "The problem is that it seems you're going for this semi defense thing where you bring up reasons for him to be town and frame it in a town perspective."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The problem with seeing you as scum for it is that you end up voting for Eden anyway and that you're not actually accomplishing any scum objectives with it should you be scum, so it doesn't make sense for you to post it as scum.")}
 {:user "Half the Sky",
  :message
  ("But between those two, if I had to decide this VERY second, I'd say Robik. If something jumps out at me specifically from the tilers I'll post here. ")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Some of your analysis is a bit weird i'm going to admit. The first part is probably more null than anything as a true towny would love to get killed N1 because it means they did there job...or they were so bad had to claim blue and theres no pride in that, overall eden is a decent town player and has good thoughts which are not seen in his filter."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Your sl part is ok, eden drops it really fast though which is the lack of follow up i'm talking about."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Some other things are ok in your analysis, but I can't see how eden is doing what ehs doing as town.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Oh yeah I saw that I think. Not sure what to think of it.")}
 {:user "Holyflare",
  :message
  ("Well whatever superbowl and shit, going to afk so you guys better not switch. ")}
 {:user "Chezitwo",
  :message
  ("Oh and to confirm my alignment I'm going to claim Artanis.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Odd of you to say this considering we both pushed Rasputin together yesterday...")}
 {:user "Damdred",
  :message ("I KNEW IT! It was the rule of chez that got me.")}
 {:user "Palmar", :message ("I see the imposter is here again. ")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "One problem here, HtS."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Last time we talked you still \"suspected\" me."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I know I'm town. How do you?")}
 {:user "Chezitwo",
  :message
  ("There's basically no way I'd abandon Chez meta if I were scum after Imperial so yeah.")}
 {:user "Damdred",
  :message
  ("HTS you go into great detail about why eden is possible scum? But then you decide robik is the better lynch if you had to lynch this second with a lot less information? Why?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Trfel",
  :message
  ("Ok, from my experience shadowing Artanis in Imperial Mafia, playing Chezitwo like this seems extremely plausible.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I don't think you really need to speculate at this point anymore. I even accidentally posted a smiley under my normal nick earlier in the thread.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And after that I had said (though not interacting with you) that you were looking better. I had even unvoted you. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You bolded the part in my quote, if you are wondering that, that is a theoretical on my end. As to if Eden were scum, why #2 in my quote wouldn't make him any more towny."
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ("Lol, if it's Art that explains why all his posts made sense xP"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I only get about 50-60% of Slam's...if I'm lucky.")}
 {:user "Chezitwo",
  :message
  ("Writing in riddles is so hard. Chez is truly a skilled man.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I am struggling with why Robik would claim blue so early in the game and AFK the whole weekend. That's my biggest beef. It reminds me of what Celestial did in Newbie LX, as I said before. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Which is why I'm filter diving both again. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "Chezitwo",
  :message
  ("Robik rolled scum in both Hammertime and PYP. I can imagine him going for a play like this and afk as scum actually.")}
 {:user "Damdred",
  :message
  ("The Celestial situation is totally different and i'm baffled why you would bring it up here. Celestial was under scrutiny during the later stages of the game d2/3 and claimed medic after a vet flipped to get out of being lynched."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Robik claimed in his first post, the differences are staggering. So why does it remind you of that exactly?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You did unvote me, you're right, and I don't know that I can be bothered to look up the last time you said you suspected me after you unvoted me, but I'm pretty sure it exists. We'll go with a hypothetical for now because I think others are asking you more relevant things.")}
 {:user "Trfel",
  :message
  ("Damdred, I think that we are both suffering from confirmation bias.")}
 {:user "Eden1892",
  :message
  ("I am so disappointed."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I could have sworn Chezitwo was Chezinu.")}
 {:user "Damdred",
  :message
  ("I could see robik doing this as scum to, but I think eden is the better lynch today.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "100%")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "How so?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I had Celestial speared to the wall and the rest of the thread was up his grill right along with me. You were in that Obs QT HtS. I have a hard time thinking you actually believe what you're saying right now.")}
 {:user "Half the Sky",
  :message
  ("Damdred, I'll elaborate on his play in Hammertime. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He spends D1 pushing the shit out of GlowingBear with little evidence. I was scumreading GB for things I took out of context as one of the towniest people in the thread. Robik was able to push him on something relatively minor, but after D1 came back and just repeated the same push on GB. Never came under suspicion after that and AFKed as the rest of the townies were pointing at each other."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "We were endgamed last night. ")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Don't worry, I'll play like Chezinu again on D2."
   {:tag :br, :attrs nil, :content nil}
   "Shame you won't be around to see it "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Eden1892",
  :message
  ("HtS just vote me. It sucks that we lost the Rb but that's life")}
 {:user "Damdred",
  :message
  ("Like I really don't need to be convinced rob could do this as mafia, I have played with scum rob before and its in his wheel house."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You still did not explain exactly how it was so similar to celest claiming medic.")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "XD")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "What does this mean?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Does this mean what I think it means?")}
 {:user "Trfel", :message ("Time for mafia to concede now?")}
 {:user "marvellosity",
  :message
  ("hi, got back much earlier than i expected! what's happening?")}
 {:user "rsoultin",
  :message
  ("It's WIFOM as shit but at least pretty much confirms Eden as scum unless he's just being a trolly ass.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Not the first time I'm bringing up this parallel. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Similar issues here, people suspected Robik on the blue claim and even you and Trfel pushed those ideas. The "
   {:tag :i, :attrs nil, :content ("circumstances")}
   " of them being scummy is different, but overall, we have the same situation of them being pushed to nearly the point of lynch. I read what you had posted, and debated those possibilities along with what I knew of Robik's gameplay. ")}
 {:user "rsoultin", :message ("Eden just claimed mafia basically?")}
 {:user "Damdred",
  :message
  ("if Eden is trolling here as town its playing against his win con."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Artanis is chez and eden claimed scum marv")}
 {:user "Eden1892", :message ("Kill Toad")}
 {:user "LightningStrike",
  :message ({:tag :br, :attrs nil, :content nil} "Yes!")}
 {:user "marvellosity",
  :message ("if artanis is chez then he should be mafia.")}
 {:user "Trfel",
  :message
  ("Yeah, Eden1892 is scum."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I take it back, that was surely intentional.  You can't possibly post in a TL game thread instead of a QT.  He was probably giving up and trying to get a mislynch on Half the Sky tomorrow.")}
 {:user "Eden1892", :message ("Till Koad")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil} "Nah, I started playing.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And you're just saying that to get me mislynched. You're past your troll honeymoon phase..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ("##unvote"
     {:tag :br, :attrs nil, :content nil}
     "##vote Eden1892")}
   {:tag :br, :attrs nil, :content nil})}
 {:user "marvellosity",
  :message
  ("free mafia with Eden? I'll take it"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I need to do more thinking.  That's just WIFOM.  Disregard my last few posts please.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Pure WIFOM truffle. We just don't pay attention to a thing he says now, unless for some godawful reason he doesn't flip scum at EoD.")}
 {:user "marvellosity",
  :message
  ("I fucking told you to sheep Damdred."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I get all the glory here (just read his case)")}
 {:user "LightningStrike",
  :message
  ("Also Artanis you sneaky bastard I should of known better that you were Chez in this game "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil}
   ". Anyway guys had any of you play a good amount of games with Artanis as both alignments because this is my first playing with him although I did shadow Palmar in Imperial which Artanis was scum but that's the only game I watched him play.")}
 {:user "Trfel",
  :message
  ("Rsoultin, I ninja'd you."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You're right though, I didn't think clearly."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Good job, Damdred.  Thanks for making that easy.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "you're naughty for fighting Damdred"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "bad Trfel.")}
 {:user "Damdred",
  :message
  ("I really hope that he is scum and not just super trolling us as town if so i'm going to be so pissed."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But other than that I am really elated right now")}
 {:user "Half the Sky",
  :message
  ("So if Eden indeed flips scum we need to look into both Palmar and Holyflare."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden tried to steer us away from Palmar earlier today."
   {:tag :br, :attrs nil, :content nil}
   "Holyflare pushed the shit out of Damdred, who was largely responsible for this push. ")}
 {:user "rsoultin",
  :message
  ("-bounces-"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I shouldn't be happy until it's 100% confirmed, but catching on of my fav coaches makes me giddy xP")}
 {:user "LightningStrike",
  :message
  ("Marv you seemed to had played with Artanis enough to call him scum can you elaborate on it please?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "this isn't true in the slightest thanks for reading! It was actually just an argument")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "he is good and his play has been pathetic, that's all")}
 {:user "Damdred",
  :message ("RS was the hammer that makes me happy for some reason")}
 {:user "Half the Sky",
  :message
  ("45 minutes. Never too early to be thinking ahead Rasputin."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Nothing should make you more happier than to do one of your coaches in "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "Holyflare",
  :message
  ("and literally has nothing to do with eden and damdred already claimed blue which is irrelevant to this lynch in the slightest")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Gonna need to look into you too, sweetie. If you're town you should bleed town and be fine."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If he's really the RBer though Palmar jumping on his wagon almost definitely clears Palmar. Now if the troll would just play it would be great ><")}
 {:user "marvellosity", :message ("HF you are really scummy")}
 {:user "Holyflare", :message ("don't really care")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I've been roleplaying as Chez though, you have no idea how hard that is.")}
 {:user "Damdred",
  :message
  ("HTS actually looks really bad for this honestly, its a bit wifom for eden to do this but hts did say all these reasons for wanting to lynch eden but then said she would lynch robik instantly right then."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So we just need to not pay attention to eden and tear apart each of the posts")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "you will when i lynch you bbz")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i still won't care")}
 {:user "Trfel",
  :message
  ("I think this will be my first time still being in a game with an actual mafia lynch."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That's a whole new way to get reads, and I have no experience with it at all.  This will be interesting.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "yes it's fine, you get a clean slate from me because i'm nice like that")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I told you I only watched him play once and he played really well in that game as scum can you make a entire case on Artanis please?")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "no"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "why do people ask me to make cases?")}
 {:user "Damdred",
  :message
  ("HF should be really happy that I did something good this game "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil}
   ", it makes me sad he still so upset.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "We gotten a actual mafia lynch in Carol wtf you smoking.....")}
 {:user "Fecalfeast",
  :message
  ("I love when mafia offers themselves on a platter... Also good afternoon! I just caught up"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ("##unvote"
     {:tag :br, :attrs nil, :content nil}
     "##vote eden1892")})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "nothing to do with you, i am happy for you "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil}
   " I just have some irl stuff to be angry about")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "But I died that night......  and didn't get much of a chance to look into anything post-lynch....")}
 {:user "Chezitwo",
  :message
  ("I just had a potentially Vivaxesque theory."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden tells HF he's not going to bother defending himself."
   {:tag :br, :attrs nil, :content nil}
   "HF switches to Eden before Eden claims scum"
   {:tag :br, :attrs nil, :content nil}
   "Eden claims scum."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I already hate it myself but I'm still going to put it out there.")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "No minestrone soup to make fake puke with?")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I wouldn't put it passed HF.")}
 {:user "Damdred",
  :message
  ("I hope things go better HF sorry I was a turd yesterday I shouldn't of stayed up till 3 am trying to play mafia after back to back doubles I guess q.q."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "my gf was actually sick in that game but yeh i'm not really making excuses?")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm being sarcastic probably 80% of the time")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Isn't this a really weird post guys? I redchecked myself and posted it in the thread with enough time for people to react. If she's town she could just vote me and be done, but she felt the need to justify the ununjustifiable."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I scumread this.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "was more me than you bro don't worry about it")}
 {:user "Fecalfeast",
  :message ({:tag :br, :attrs nil, :content nil} "what")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "We will take part with a grain of salt from you.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Wait guys, this makes a lot of sense.  Maybe Eden1892 could be town here.")}
 {:user "marvellosity", :message ("just ignore everything eden says.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "not")}
 {:user "Chezitwo",
  :message
  ("I dunno why Eden decided to claim scum when I gave them a proper avenue to push though. I really would suspect me if I weren't me.")}
 {:user "Holyflare", :message ("probably team afk")}
 {:user "Chezitwo",
  :message
  ("Also, Eden, take this chance to post baby seals. You don't get many chances.")}
 {:user "Holyflare",
  :message ("if he claims blue he's literally 100% mafia though")}
 {:user "Chezitwo", :message ("HF why don't you suspect me?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i did/do/still do?")}
 {:user "Eden1892",
  :message
  ("ok well that was fun and I believe I look scummy enough now that I'll never be nk'd so here we go"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("I'm the Parity Cop, move your votes off of me.")})})}
 {:user "Damdred",
  :message
  ("I just don't get this if eden flips town I am going to lose it. This is playing directly against win condition by claiming scum in the last hour of the game smh")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "LOL"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm bluer than Artanis right now")}
 {:user "Eden1892",
  :message
  ({:tag :b, :attrs nil, :content ("##VOTE: Half the Sky")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I am serious about that post I made about her just now. If she's town why did she need to justify flipping to someone who \"claimed scum\"?")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "did: I was in your probably town list."
   {:tag :br, :attrs nil, :content nil}
   "Do/still do: I just posted a situation, you said probably afk rather than even thinking about it being me.")}
 {:user "Damdred",
  :message
  ("fuck"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "this"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "game"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Trfel",
  :message ("Modkill for using moderator text color? XD")}
 {:user "Palmar",
  :message ({:tag :br, :attrs nil, :content nil} "YOU SHALL NOT PASS")}
 {:user "Eden1892",
  :message
  ("Oh shit that is mod text"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Please don't modkill me I wasjust trying to emphasize my blueness")}
 {:user "Fecalfeast",
  :message
  ("So if eden is parity and damdred claimed blue does that not make robik's claim as shit as it gets without a fourth claim?")}
 {:user "marvellosity", :message ("kill eden")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "no you weren't I moved you down in a new list and all of this was based on me thinking you were chezinu instead, as soon as fecalfeast started acting more towny I suspected you because the only thing you had posted was about fecalfeast and it was wrong and chez did the same thing in a game I played with him where I agreed with his early read and he afk'd"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "now you're artanis I just haven't put any thought into it yet")}
 {:user "Fecalfeast",
  :message ("I mean if eden flips blue, that is. <3")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Good point"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Let's lynch Robik instead. HtS can wait til tomorrow."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("vote robik")})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "and you wouldn't think about this before because...?")}
 {:user "Damdred",
  :message
  ("No other blues should claim if there are any until d2 at earliest."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This is just stupid fucking silly. This is the opposite way you want to play blue I just yea")}
 {:user "rsoultin",
  :message
  ("Dude, there's no possible way anyone can believe you now, Eden. At least I can't. The flip will make sense of it.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "too late bro")}
 {:user "Trfel", :message ("Hi Eden, how's it going?")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Because there could be three blues which would make his claim not-auto?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I was kinda hoping for a fourth claim at some point so it would be auto but since we don't have one and I'm running out of time and oh yeah people are voting for me"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "We could kill HtS too though either one works")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "So why didn't you follow Marv when he unvoted and voted me? I don't get it. You were in the thread, thought I was scummy and obvtown marv voted me.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Pretty sure you play scummy so you don't get ml'd as a blue")}
 {:user "Fecalfeast",
  :message
  ("Damdred and Eden can you guys teach me how to play blue roles? I'd ask robik too but he's afk")}
 {:user "LightningStrike",
  :message
  ("rsoultin please forgive me if Eden was blue and showed no concern of his claim please because honestly I can't take him seriously after him claiming RB for Mafia.")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Playing scummy != Claiming scum")}
 {:user "Eden1892",
  :message
  ("Anyone lynching an un-cc'd parity cop is playing against their win condition")}
 {:user "marvellosity",
  :message
  ("i'm keeping my vote on eden for being a cock."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "the rest of you can do what you like")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Dude it was a joke  come on. Like I would actually do that as mafia lol"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Or at least I wouldn't stick around, or I'd be trolling")}
 {:user "Damdred",
  :message
  ("YOU CLAIMED SCUM"
   {:tag :br, :attrs nil, :content nil}
   "YOU CLAIMED SCUM"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "THATS NOT HOW TO PLAY BLUE, YOU DONT DO REACTION TESTS IN THE LAST HOUR OF A LYNCH CYCLE")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I was in bed and made an off-handed comment about you sure? I fail to see when I follow marv when he says he isn't even sure about you."
   {:tag :br, :attrs nil, :content nil})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil} "You can't have my cock")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil} "Cast it into the fire!")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "this is why i am keeping my vote on eden")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'd like to see your brilliant epik playz when you're a blue, you tell everyone you won't be around for EOD and then everyone is like \"LOL LETS LYNCH THIS GUY WHILE HE CANT DEFEND HIMSELF\"")}
 {:user "Trfel",
  :message
  ("Guys.  There is absolutely zero chance that Eden1892 is town.  Stop worrying."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Proof?  Holyflare mentioned the possibility of Eden1892 claiming blue right before he did it.")}
 {:user "Holyflare", :message ("i've already cc'd him anyway :O?")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "yes, you come back to the thread and claim, not fuck around for however long and then claim"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "cock.")}
 {:user "Blazinghand",
  :message
  ({:tag :b, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content ({:tag :b, :attrs nil, :content ("Vote Count")})}
   {:tag :b, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Damdred (1):")}
   " IAmRobik"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("IAmRobik(1):")}
   " Eden1892"
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Eden1892 (10):")}
   " Damdred, LightningStrike, Palmar, rsoultin, Chezitwo, Holyflare, Trfel, marvellosity, Half the Sky, Fecalfeast"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Not Voting (1):")}
   " Sicklucker"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Currently,")}
     " Eden1892 "
     {:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("is set to be lynched. Day 1 ends in "
       {:tag :span, :attrs {:id "bbcountdown1"}, :content nil}
       {:tag :script,
        :attrs {:type "text/javascript"},
        :content
        ("$(\"#bbcountdown1\").countdown({until: new Date(Date.UTC(2015, 02-1, 01, 21, 00, 00)), onTick: bbcountdownTick, tickInterval: 1});")}
       " at 21:00 UTC (+00:00)."
       {:tag :br, :attrs nil, :content nil}
       {:tag :br, :attrs nil, :content nil}
       "Reminders: Votes are done in the voting thread "
       {:tag :a,
        :attrs
        {:target "_blank",
         :href "/forum/mafia/476972-linux-mini-mafia-voting-thread"},
        :content ("(link)")}
       ". Make sure to unvote if you want to vote someone new. Voting is mandatory-- you may not abstain.")}
     {:tag :br, :attrs nil, :content nil})})}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm pretty sure he's just trying to cause chaos. You don't post this as town, ever."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Just ignore him.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "What"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You're blue too?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "OK then it's 100% Robik"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Everyone move to Robik")}
 {:user "marvellosity", :message ("kill eden")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "oh dummy.... i don't think you understand....")}
 {:user "LightningStrike",
  :message
  ("Also the last time someone claimed blue 1 in a game with me in it a hour before EoD and claimed a specific role they got away with it for the remainder of the game (Celestial in the Newbie game) and I don't want to take that chance.")}
 {:user "rsoultin",
  :message
  ("I won't be able to trust eden the entire game if we pull off him now."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm staying."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "LS...why are you appealing to me if eden flips blue?")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Pls, don't tell me you wouldn't take a few minutes to have some fun first. It's not like I waited until 5 minutes were left, we still have time to move to a fakeclaim blue like Robik"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I know what I'm doin man! C'mon")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Nah, he understands perfectly."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm taking notes so I know what to do next time I roll scum. (for those of you who remember last game...)")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "die in a fire")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I agree, he's completely trying to get me mislynched. As for me \"justifying\" it Eden that was a seriously weak point. I said the first thing on my mind. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Why would you claim cop in that manner D1, you're experienced enough to know better, I'd think. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "wait are you ccing ME"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "LOL"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "PLS")}
 {:user "Fecalfeast",
  :message
  ("In the event eden is parity cop, the chance one of our other two blue claimers is lying is 66% since 2/3 of the modifications make it impossible for 3blue roles.")}
 {:user "Eden1892",
  :message ({:tag :br, :attrs nil, :content nil} "The fire rises")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "this is a terrible reason."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "but kill eden anyway.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "THANK GOD I'M NOT THE ONLY ONE FEELING THIS WAY. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I said the same thing twice over earlier and Rasputin scumread me for it. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "Holyflare",
  :message
  ("well let's wait and see eden "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil})}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil} "This event is not possible.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Marv is right about one thing, I was cocky and thought I could get away with trolling a little more before I outed since I figured people would just believe my claim")}
 {:user "Fecalfeast",
  :message
  ("I mean if HF is CCing we have a nice pool of players to lynch from")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Remember the Newbie game when I didn't give a damn about WarWaffles blue claim? Ya that why I appealing to you since you were there and gave a reaction to it.")}
 {:user "Damdred",
  :message
  ("We do believe your claim "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil}
   ", i'm sorry your mafia team lost your rb.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Worrying way too much about her perception. Lynch d2 pls.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Hahahahahahahhahahaha, well played.")}
 {:user "Eden1892",
  :message ("No guys really move your votes I'm parity cop.")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You've never claimed scum in a game before, then. Shit doesn't wash off so easy unless you're palmar")}
 {:user "Eden1892", :message ({:tag :br, :attrs nil, :content nil})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content (" ")})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("   ")})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "no you aren't hahahahahahahaha")}
 {:user "Eden1892", :message ("Seriously move now pls.")}
 {:user "Trfel",
  :message
  ("This is actually extremely entertaining.  I wonder if Eden can keep it up for another 24 minutes.")}
 {:user "Eden1892",
  :message
  ("HF pls stop fake-ccing me and move. You're gonna look like such a donkey when you tried le epik gambitz to get your scumread lynched and he flips parity cop")}
 {:user "Eden1892",
  :message
  ("Guys move. I mean it. I'm more serious than I was about my n1 rant")}
 {:user "Half the Sky",
  :message
  ("Eden you are cracking me up. "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "Eden1892",
  :message
  ("Look how long my filter is. It's already longer than it was in the entirety of my last mafia game")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "EDEN CLAIMING PARITY COP"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "WAS NOT"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "WHAT WE WERE TALKING ABOUT"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "WE WERE TALKING ABOUT ROBIK"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "STOP BEING AN OBTUSE GIT"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "*ahem*"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "everyone else was yelling ^^")}
 {:user "marvellosity",
  :message
  ("eden could easily be town"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "we should kill him anyway")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 300px; height: 300px;",
     :src "http://i.imgur.com/L4h7pLo.gif"},
    :content nil})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Confirmed scum when I flip parity cop")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You literally said you were waiting for the argument though, suggesting you already strongly suspected me yet you just let it slide.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "no he literally fucking can't it's impossible")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "lol"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "because i'd definitely say that as mafia right bbz?")}
 {:user "Trfel", :message ("Eden, what's better, Day 1 or Night 1?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "so what?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay. These are different situations but I can see your concern in that context.")}
 {:user "Fecalfeast",
  :message ("I'm rly scared we're lynching cop rn")}
 {:user "Holyflare", :message ("NO WE ARE NOT JESUS FUCK")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "NIGHT 1 FOR SURE"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "MOVE VOTES PLEASE COME ON")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'll just let Holyflare do the talking.  I don't seem to be very convincing.")}
 {:user "Holyflare",
  :message ("he's literally mafia, there's nothing else to it")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You don't seem to be interested in lynching anyone in specific."
   {:tag :br, :attrs nil, :content nil}
   "I'm actually not sure what that means for you.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Yes we are don't be like this. You and marv need to stop being so salty about my epic plays and do the smart thing which is to move off and make mafia play around my claim")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "please just catch up with the game instead you're in some kind of weird separate thread"
   {:tag :br, :attrs nil, :content nil})}
 {:user "marvellosity", :message ("kill eden")}
 {:user "Trfel",
  :message
  ("I just realized, this is a lot of fun, but maybe we should all stop posting?  We're not getting any new information, and it just makes the thread harder to read for the people who aren't here right now.")}
 {:user "Eden1892",
  :message
  ("Like why would you lynch me when they have to nk me or I'll just break the game with scans. Pls")}
 {:user "Eden1892", :message ("DO NOT LYNCH ME JESUS GUYS COME ON")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "this is why we carry on")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Have you become Palmar-lite? "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Catching up is so much more boring than participating in active discussion though. I'll do it when everyone's gone and I can't chat to anyone.")}
 {:user "Eden1892",
  :message
  ("marv come on. You aren't rally going to lynch parity cop right")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "it worked out for him, right?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "right?!?!")}
 {:user "Eden1892",
  :message
  ("Like you made your point ok, I'll never do it agian. Cool. Now move pls? This is bullshit")}
 {:user "Half the Sky",
  :message
  ("Wait, sorry Marv, you weren't in Hammertime. Palmar was spamming \"Kill Toad\" all of D1 and D2 in that game...")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I think the past 24 hours have showed that this game keeps going 24/7.  So you won't really get this opportunity.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Fixed "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "i know")}
 {:user "Eden1892",
  :message
  ("Wtf guys for real don't do this. Think critically. Why would I do any of this as mafia. It makes 0 sense. If I were caught I wouldn't be hiding in the bathroom at work to phone post and I wouldn't claim scum when I can't even open QT on my phone")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I suddenly realized marv was trolling all this time."
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 300px; height: 300px;",
     :src "http://i.imgur.com/LJUWFWd.gif"},
    :content nil})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you wouldn't be asking me questions if you were even paying attention to real time discussion........................")}
 {:user "Eden1892",
  :message
  ("I told you guys I was gonna be afk today because of work. Wtf is wrong with you."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Fuck this is stupid")}
 {:user "Damdred",
  :message
  ("Heres the deal, its not an epic play to claim scum and then five seconds later to claim cop. it doesn't make sense and it basically is scum trying to get out of a lynch."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Hold true and se ethis through we have to take the information we gathered and put it to the next lynch. Eden isn't even trying to answer why hes town or show if he breadcrumbed the claim earlier. Which btw hes already claimed blue once and rescinded before now. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "he isn't answering the case against him hes just spamming. This isn't town behavior at this point.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I think things'll calm down during the morning.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "stop"
   {:tag :br, :attrs nil, :content nil}
   "please"
   {:tag :br, :attrs nil, :content nil}
   "just stop"
   {:tag :br, :attrs nil, :content nil}
   "he's 100% confirmed mafia")}
 {:user "marvellosity",
  :message ("it would be *hilarious* if he flipped cop though")}
 {:user "marvellosity", :message ("kill eden")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I don't have time to answer a big wall against me on a phone with 15 minutes you donkey"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I thought claiming parity cop would be enough. Apparently not")}
 {:user "Holyflare",
  :message
  ("if bh suddenly became a bastard host yes that would be hilarious")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Sure I am, it's more interesting than Eden making 100 posts about how he's a cop that he isn't and no one actually believing him.")}
 {:user "Eden1892",
  :message
  ("Wait wtf why would scum claim scum and THEN try to get out of a lynch???? Lol Damdred are you even listening to yourself")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Did you just pulled a Artanis?")}
 {:user "Damdred", :message ("KILL EDEN STAY TRUE ON THIS LYNCH.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "if you're cop we get HF guaranteed tomorrow, don't worry yourself "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil})}
 {:user "Trfel",
  :message
  ("I almost want Eden1892 to flip cop, it would actually be the funniest thing I've seen in a mafia game.  That would definitely trump Eden's earlier nomination for funniest moment.  This is a very funny game, isn't it.")}
 {:user "Damdred",
  :message
  ("Cops should never claim scum get all votes on them then claim cop, its the stupidest move ever. You are scum its ok")}
 {:user "Holyflare",
  :message ("which is why it's 100% obvious i'm the real deal yo")}
 {:user "marvellosity",
  :message
  ("like I said we get a free mafia HF if eden is cop"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "so the only solution"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "kill eden")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "It would be a blooper not funniest moment "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Wait why HF? I thought he said he didn't cc me. Did he?")}
 {:user "Trfel",
  :message ({:tag :br, :attrs nil, :content nil} "Well, fine, both.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "+1"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "With how HF plays scum I'd call that a win/win.")}
 {:user "marvellosity", :message ("he's hard-ccing you constantly")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Scum should never claim scum get all the votes on them then claim cop, its the stupidest move ever. Im cop its ok")}
 {:user "marvellosity",
  :message
  ("the funny thing is, it doesn't even make HF town necessarily :p")}
 {:user "marvellosity",
  :message
  ("if eden is mafia i mean"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "they could both be fakeclaiming cop as buddies")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Lol is he really"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I swear I asked im annd he said somethin like ait and see."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "W/e"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b, :attrs nil, :content ("Vote HF")})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "bahahahahah i dunno how like 5 people haven't even realised yet")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Cop should never claim scum get all the votes on them then claim cop.  its the stupidest move ever.  Im scum its ok")}
 {:user "Eden1892",
  :message ({:tag :br, :attrs nil, :content nil} "Confirmed")}
 {:user "Eden1892", :message ("He claimed scum ge thim")}
 {:user "Damdred",
  :message
  ("I realized it I just didn't want to talk about it HF "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Trfel", :message ("Aw, shucks.")}
 {:user "Eden1892", :message ("I'm not actually on my phone")}
 {:user "Eden1892", :message ("Lynch all liars")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "and then i would be cc'd...? :O")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "The amount of voting you were doing made that obvious.")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Oh yeah"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lol")}
 {:user "Eden1892",
  :message
  ("I put in one more"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sorry I wasn't funnier the last 40 minutes. My team is a bunch of tryhard ninnies who wouldn't let me troll")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "2 blues claimed already"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "good chance there isn't a 3rd blue, so cc-ing has little danger really")}
 {:user "marvellosity",
  :message
  ("anyway it doesn't matter, i'm not going to worry about it")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "assuming robik is town -.-")}
 {:user "marvellosity",
  :message
  ("if HF is alive at lylo, you kill him, no questions asked")}
 {:user "Trfel",
  :message
  ("Wait, I don't understand, is Holyflare actually claiming blue?")}
 {:user "Holyflare", :message ("yes  100%")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "l2read")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "-.-")}
 {:user "Eden1892",
  :message ({:tag :br, :attrs nil, :content nil} "confirmed scum")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil} "This is all that I see.")}
 {:user "marvellosity",
  :message
  ("Damdred, town hero."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I knew you'd do it bbygrl.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   ".........................right?")}
 {:user "Eden1892",
  :message
  ("I was serious about the n1 rant though. And work. Like if you take one thing away from this game, it should be \"The next time I'm mafia when Eden is town, I will "
   {:tag :i, :attrs nil, :content ("never")}
   " vote to kill him n1.\"")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Holyflare is claiming blue.  100%.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "you're an idiot."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "what i took from that was \"next time i am mafia, i will definitely kill eden n1\"")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I love how you are answering yourself in the thread")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "will shoot 10/10")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "are you illiterate "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "bubbles?")}
 {:user "Eden1892",
  :message ({:tag :br, :attrs nil, :content nil} "blossom")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "BUTTERCUP")}
 {:user "marvellosity", :message ("hahahahaha")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   ">> It may just be funny to see you rage. Like, win-conditions aside...eden!rage <3")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :font,
    :attrs {:style "color: green"},
    :content
    (">mrw i checked into the vote thread at work and saw votes votes everywhere")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 200px; height: 200px;",
     :src
     "http://img4.wikia.nocookie.net/__cb20121011211806/villains/images/f/fa/Mojo-Jojo-Photo.gif"},
    :content nil})}
 {:user "marvellosity",
  :message
  ("it's made my month doing powerpuff girls connections in a mafia game.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So how many claims do we have out? 3 (excluding Eden)? I recall Robik, Damdred soft claimed I think earlier and now HF? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "How do you feel about that Robik claim at this point?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil} "My thoughts exactly.")}
 {:user "Eden1892",
  :message
  ("happy to help, unvote?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "hahahahaha jk i don't want to be unvted!!!"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "if i'm lynched today"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: red"},
      :content
      ("AT LEAST I CAN'T BE N1'D!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")})})}
 {:user "Blazinghand",
  :message
  ({:tag :div,
    :attrs {:style "text-align:center"},
    :content
    ({:tag :br, :attrs nil, :content nil}
     {:tag :b, :attrs nil, :content ("Night 1")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :div,
    :attrs {:style "text-align:center"},
    :content
    ({:tag :br, :attrs nil, :content nil}
     {:tag :img,
      :attrs
      {:title "",
       :alt "[image loading]",
       :style "width: 450px; height: 399px;",
       :src "http://i.imgur.com/fNGsIu3.png"},
      :content nil}
     {:tag :br, :attrs nil, :content nil})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :hr, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: red"},
      :content
      ("Eden1892 the Proprietary, Intermittently-Functional Driver has been lynched!")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: red"},
      :content
      ("sicklucker the That One Program has been modkilled for failure to vote!")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :hr, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("Night 1 ends in 24 hours at Monday, Feb 02 9:00pm UTC (GMT+00:00). All night actions must be in to me and my co-hosts by that time.")})}
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-01 21:05:24")})}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "LOL I took it as NAI given the Hammertime game...."
   {:tag :br, :attrs nil, :content nil})}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Yes, I'm not the only one!!!")}
 {:user "marvellosity",
  :message ("also, no sicklucker today anywhere near deadline?")}
 {:user "Half the Sky",
  :message ("LOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLLLLLLLLLLLLLLLLLL")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Four"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Four blue claims"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "See u in the qt qtpi~")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "HAHAHA I HADNT READ THE POST")}
 {:user "Fecalfeast",
  :message ({:tag :br, :attrs nil, :content nil} "bad")}
 {:user "Eden1892", :message ("LMFAO HDkuszHFKJSDHLFHKSL AHAHAHAHAHA")}
 {:user "LightningStrike",
  :message ("Rolf sicklucker was scum afterall.")}
 {:user "Half the Sky",
  :message
  ("One scum lynched, and one modkilled.....bloody brilliant. ")}
 {:user "Eden1892", :message ("NOT EVEN MAD BYE")}
 {:user "Fecalfeast",
  :message ("HAHAHAHAHAHAHAHAHAHAHAHA HE WAS SCUM OMFG")}
 {:user "marvellosity",
  :message
  ("i literally called sicklucker and i was too late "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i am so sad")}
 {:user "rsoultin",
  :message
  ("-dies-"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "SL too? -amused-"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He really, really, really didn't want to kill robik. Maybe HtS is onto something, there.")}
 {:user "Fecalfeast",
  :message ("Well now I will never feel bad calling SL scum")}
 {:user "Damdred",
  :message
  ("I had two reads right this game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I am like really happy with myself today.")}
 {:user "Fecalfeast",
  :message
  ("I'd say robik is D2 lynch or maybe HF just for insurance")}
 {:user "Palmar",
  :message
  ("I am saddened by these results"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :a,
    :attrs
    {:onclick "return toggleShowSpoiler2(this, 1)",
     :title "",
     :href "#",
     :style
     "text-decoration:none;font-family:monospace;color:#808080"},
    :content
    ({:tag :span, :attrs nil, :content ("+ Show")}
     " Spoiler"
     {:tag :span, :attrs nil, :content (" +")})}
   {:tag :div,
    :attrs
    {:style
     "border:1px solid #808080;padding:5px;background-color:#EBEFF2;display:none",
     :id "spoiler_1"},
    :content
    ({:tag :div,
      :attrs {:class "forummsg"},
      :content ("Microsoft is love, Microsoft is life")})})}
 {:user "Holyflare",
  :message
  ("HAH"
   {:tag :br, :attrs nil, :content nil}
   "HAH"
   {:tag :br, :attrs nil, :content nil}
   "HAH")}
 {:user "Trfel",
  :message
  ("Guys."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Let's lynch marvellosity, Holyflare, and Damdred.  Those are our best players and our confirmed town.  That way, there is no possible way for a mafia to sneak by us.")}
 {:user "Fecalfeast",
  :message ("OH HEY I GOT A READ CORRECT LIKE A REAL ONE ON EDEN WTF")}
 {:user "marvellosity", :message ("Palmar mafia")}
 {:user "Chezitwo", :message ("HAHAHA")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil})}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Uhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh not much of a reason you have there trfel")}
 {:user "Chezitwo",
  :message
  ("Okay I'm basically going to be confirmed town for not conceding here.")}
 {:user "Half the Sky",
  :message ("FF, I'm pretty sure Trfel was being sarcastic. ")}
 {:user "marvellosity",
  :message
  ("so we just kill robik and palmar and see how we're doing or something")}
 {:user "LightningStrike",
  :message
  ("Damdred you made the case and you brought up a meta point for me. Thanks to Damdred we gotten 2 scum killed!")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Truffle, is this how you would play after Day 1? I'm flummoxed.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He said he was going for a Superbowl party. He forgot to vote!"
   {:tag :br, :attrs nil, :content nil})}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "HAha and here I am wondering why HF can't see my sarcasm."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Stupid internet")}
 {:user "marvellosity",
  :message
  ("like HF is extremely likely to be town now, not because of his claim, but because of the sicklucker stuff")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I think this is an excellent idea.")}
 {:user "Trfel", :message ("Is there an award for worst scumteam?")}
 {:user "Damdred",
  :message
  ("I got to look who attacked me the hardest for the SL thing I kept pushing?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "have a guess")}
 {:user "LightningStrike",
  :message
  ("It was me mainly but it was because I never played with mafia!sicklucker that was all.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That would probably be me. Just sayin."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Or Eden. But probably me.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "It was both of us "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Chezitwo",
  :message
  ("I suggest we use dick move analysis to decide who wouldn't concede after 2 mafia players die on D1 and lynch those players.")}
 {:user "Trfel",
  :message ("Can I just afk and let you guys win the game for me?")}
 {:user "Fecalfeast", :message ("LS who is the last scum?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Agreed."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Makes me wonder if it is an afk player like Robik.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "No we can't let you do that.")}
 {:user "Fecalfeast",
  :message
  ("Robik would concede when he got back and rage at the host for modkilling SL")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Truffle, what are you doing? -_-")}
 {:user "marvellosity",
  :message
  ("Eden hard-defended Palmar about 50 times"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "not sure what that means")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Being trash I'm sure this is incorrect but isn't calling someone town for dumb reasons as mafia usually to get town points if that player gets lynched? As in mafia defending town")}
 {:user "Chezitwo",
  :message
  ("God talking about conceding feels so dickish but yet it's actually a legit reason in this situation."
   {:tag :br, :attrs nil, :content nil}
   "Marv, would Palmar torture himself further by playing it out until he gets lynched?")}
 {:user "Chezitwo",
  :message
  ("There's going to be 40 pages that will never be read by me."
   {:tag :br, :attrs nil, :content nil}
   "The forgotten pages.")}
 {:user "Damdred",
  :message
  ("Palmar was also on Eden super early and sheeped me. His lynch had disintegrated. I'm not sure if bussing at that point is worth while especially if robik is town which is still a iffy thing")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "absolutely, he raged at geript for outing Palmar as the 3rd mafia when geript was quitting")}
 {:user "marvellosity",
  :message ("sicklucker's filter kinda makes me think robik is town")}
 {:user "Fecalfeast",
  :message
  ("IMO we lynch robik D2 while deciding who wouldn't concede. The inevitable death will certainly make robik concede and if he's town it'll make him shit town rainbows and/or remove a question mark from the game")}
 {:user "marvellosity", :message ("LS could still be mafia")}
 {:user "Chezitwo", :message ("I guess we lynch Palmar first then.")}
 {:user "marvellosity", :message ("hmm maybe not")}
 {:user "Fecalfeast", :message ("LS who is last scum?")}
 {:user "Trfel",
  :message
  ("Wait, the dead scum players are no longer allowed to play the game, right?  So they can't submit night kills?")}
 {:user "Fecalfeast",
  :message ({:tag :br, :attrs nil, :content nil} "This is correct")}
 {:user "rsoultin",
  :message
  ("xP maybe it would be a good idea to reread with all the differing opinions...though I'm not hating most of these suggestions")}
 {:user "Chezitwo",
  :message
  ("11 players, 1 is scum"
   {:tag :br, :attrs nil, :content nil}
   "We've got 4 mislynches, just need to confirm 7 people and we're good.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You"
   {:tag :br, :attrs nil, :content nil}
   "Marv"
   {:tag :br, :attrs nil, :content nil}
   "Me"
   {:tag :br, :attrs nil, :content nil}
   "Rsoultin"
   {:tag :br, :attrs nil, :content nil}
   "Half the Sky"
   {:tag :br, :attrs nil, :content nil}
   "LightningStrike"
   {:tag :br, :attrs nil, :content nil}
   "Damdred"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "GG")}
 {:user "Half the Sky",
  :message
  ("Based on the claims, the last scum is amongst HF, Damdred or Robik."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm 99.9% sure it's Robik. ")}
 {:user "Fecalfeast",
  :message
  ("I'm not sure whether I would concede or not in this position. Maybe if I was under pressure but probably not unless there was a boss-ass case on me.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I still thinking on who is the last scum but I got nothing so far but I will filter dive both of the scum to figure it out.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "this suggests robik is town, maybe.")}
 {:user "Fecalfeast",
  :message ({:tag :br, :attrs nil, :content nil} "FecalFeast!")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "this doesn't really make sense at all")}
 {:user "Palmar",
  :message ({:tag :br, :attrs nil, :content nil} "LS #2 townread.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Why?  I don't see why that says anything about Robik.")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Oh damn yeah that sounds like SL going for them townie points")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Why? I still don't even know if HF's blueclaim is serious, could just be to prevent shenannies."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "There are 3-blue setups in the game.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "why are you asking this?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you've been lynched as mafia before.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Please someone help me."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Show me where Holyflare claimed blue, and explain it to me.  I'm terrible and I actually can't figure this out, I'm not kidding."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Feel free to taunt me to years, but only AFTER you explain it truthfully.")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Mafia often townread people for dumb reasons when thread sentiment is against them because if that person is mislynched, the mafia players gets to say \"SEE I TOLD YOU HE WAS TOWN U SHITTERS\"")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "because he sounds resentful that the claim makes robik town")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm good with this list. Some question marks for HtS but probably not.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You're right, the events of the past few hours have been pretty chaotic, my mind is in a bit of a weird place right now.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Since there actually can be 3 blue roles in this game, this is poor analysis at best.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you literally answered yourself already??")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "HF did something called \"breadcrumbing\" which is where they leave hints in multiple posts. Except in this case he used entire loaves of bread and a big light-up sign")}
 {:user "Chezitwo",
  :message
  ("HF I really hope you're actually the cop because then the game is 100% solved.")}
 {:user "Holyflare",
  :message
  ("it's impossible to win the game for me and i'd just concede if i wasn't?")}
 {:user "Holyflare", :message ("like literally impossible")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Ah, I see.  I didn't notice that."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Haha, I'm terrible.  Maybe I really should switch to observing games for a while.")}
 {:user "Chezitwo", :message ("I can see you fakeclaim as VT though")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Trfel....you didn't remember this?")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Er, this is embarrasing...."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I was being sarcastic?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Yeah, yeah, I'm Romanian, I get it.  I'll go cry in a corner now.")}
 {:user "LightningStrike",
  :message ("The last time Tfrel was this forgetful he was scum.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I like Romanians. One helped me out a long time ago.")}
 {:user "Fecalfeast",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Hi,"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin", :message ("He already answered you, FF.")}
 {:user "Fecalfeast",
  :message ("oh hey... I am literally on drugs pls excuse me")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "The last time I took a shower I was town. I'm not sure that makes it a reliable tell though.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Haha, I'm not being forgetful.  I'm just being stupid.  There's a big difference.  I'm not scum.  I've posted more in this game than all my previous four games combined."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I never saw Holyflare actually claim blue, I just saw him say that he already claimed blue.  This was strange to me, so I asked him.  His \"yes 100%\" answer was posted right after, I assumed that was answering a post above me, and the \" -.- \" was directed to my question, as well as marvellosity's l2read.  So I assumed that Holyflare was being sarcastic, as shown by my being happy that Half the Sky also thought that Holyflare was claiming blue."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Now it turns out that Holyflare actually "
   {:tag :i, :attrs nil, :content ("did")}
   " claim blue.  So I don't even know what to do any more.")}
 {:user "Damdred",
  :message
  ("Also if we are going down the mafia town read people for dumb reasons than palmar is probably town.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "literally sitting on a pile of drugs")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "i'm voting him tomorrow"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "just so you know")}
 {:user "Damdred",
  :message
  ("That's fine I hope i'm alive so I can build another bomb case."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Like I feel really good about myself")}
 {:user "marvellosity", :message ("you didn't let me down, i'm proud")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Please, let me get the last one.  I need to redeem myself at least a little.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "How do you know you're alive tomorrow?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "HA! Caught, scum.")}
 {:user "marvellosity",
  :message ("I will laugh so hard if mafia kill me tonight")}
 {:user "Chezitwo",
  :message
  ("I need to roleplay as Vivax sometime. It's fun and easy.")}
 {:user "Trfel",
  :message ({:tag :br, :attrs nil, :content nil} "Why?")}
 {:user "Damdred",
  :message
  ("Why would marv die? We have basically 4-5 people who could be nk before him?")}
 {:user "marvellosity",
  :message
  ("because what damdred said"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "all i did was sheep my bro")}
 {:user "Chezitwo",
  :message
  ("I want to play a game of Vivax mini mafia now where everyone roleplays Vivax.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "This is actually distinctly possible "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil})}
 {:user "Damdred",
  :message
  ("I am getting away from this game for a few hours, my wife wants to go have dinner. ITs been a great mafia day even if I acted like a tard last night.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "^ virtually a scumclaim")}
 {:user "Fecalfeast",
  :message
  ("I always imagine you people younger than it seems you are so when damdred says his wife I'm like 'wow married so young' when you could be 45 for all I know")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "And then it's revealed that everyone rolled town and the real Vivax gives an award for best Vivax roleplay."
   {:tag :br, :attrs nil, :content nil}
   "I really want this to happen now.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "See it's stuff like this that makes you look bad."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Now I'm nowhere near certain, but still. There's something about how you've been posting after the deadline that's just off."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Like you mentioned LS being possibly scum, and even if you retracted it, you should have known he was literally the first person to sheep Damdred's case.")}
 {:user "marvellosity",
  :message
  ("lol palmar"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "nothing i've done makes me look bad"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "try harder")}
 {:user "Palmar", :message ("You should roleplay me Artanis.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This better be a town claim or I'm concerned for your immediate neighbors :0")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil} "But you have no meta.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Hahahahhahaahahahaaahaha....")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil} "I won't tell if you won't!")}
 {:user "Palmar",
  :message
  ("List of marv's kill suggestions:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "chez"
   {:tag :br, :attrs nil, :content nil}
   "LS"
   {:tag :br, :attrs nil, :content nil}
   "rsoultin"
   {:tag :br, :attrs nil, :content nil}
   "Palmar"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   ":D:D:D:D")}
 {:user "Chezitwo",
  :message
  ("Marv pretty much knows I'm town at this point simply by virtue of the game still going on."
   {:tag :br, :attrs nil, :content nil}
   "My concede history speaks for itself.")}
 {:user "rsoultin",
  :message
  ("Oh, does he want to kill me again?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That's not very nice.")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "and vice versa :p")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "no, palmar is just trying to make me look bad "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil})}
 {:user "Chezitwo",
  :message
  ("I already knew you were town when you had a larger than 2 page filter though.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "didn't even make it to the 2nd page last game "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Palmar",
  :message
  ("I don't think you're mafia Artanis, it's ok."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think it's probably marv actually. Although Trfel is an option too.")}
 {:user "LightningStrike",
  :message
  ("Artanis you can try and copy my meta and see where that takes you but warning Lian tried and died.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You should know I'm town and yet you're trying to kill me.")}
 {:user "Trfel",
  :message
  ("Question."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Is Holyflare claiming unspecified blue or cop?")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "you should know i'm town 100% after our irc conversation shortly before this game.")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "cop")}
 {:user "Chezitwo",
  :message
  ("I'm not really that concerned by what you think, Palmar. To solve the game you must die, and I'm just making sure everyone else knows I should never be lynched this game as my part of solving the game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "@LS that sounds kinda boring. Vivax would be more interesting.")}
 {:user "rsoultin",
  :message
  ("hey, don't disregard HtS"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "my gut's not always right, but it's getting better lately")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Maybe, maybe not."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Like it is super concerning you still think I could be mafia with these flips."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "1) In the midst of my trolling today I actually took the time to argue with sicklucker quite a bit. (although on second thought that very argument sort of makes you less likely to be mafia.... idk). Go read it, it's in my filter."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "2) I hadn't mentioned or talked to Eden all day, yet within like 10 minutes or something of Damdred dropping the case I sheep it, vote Eden and don't try to take any credit for a bus or anything. I was the third vote (after Damdy and LS) on Eden. Even if I was mafia, wouldn't I try to at least gain something from a bus by actually pushing the case?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Why?")}
 {:user "Trfel",
  :message
  ("This is hasty, but I'm going to do it.  Should save some time."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm the doctor."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Holyflare or Robik is scum, 100%.  Please concede now.")}
 {:user "marvellosity",
  :message
  ("the most interesting thing, and I think i should probably disregard it but i can't because i believe it, is this:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Eden basically trolled around when he came back to the thread right?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And then he actually tried a bit to get people off him by claiming"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "and he said \"my scumbuddy(ies) said i had to tryhard\""
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I actually believe this is true. And it wasn't sicklucker because he was afk."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "so i think there was probably a scumbuddy in QT who was telling him to try avoid the lynch at the time. i wonder who he'd listen to")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "oh yay :D")}
 {:user "Trfel",
  :message
  ("I don't see how we can possibly lose, so no reason to wait and try and get a save.  Town wins.  Unavoidable.")}
 {:user "Palmar",
  :message ("He claimed to try to get the counterclaim.")}
 {:user "marvellosity", :message ("game is over")}
 {:user "Chezitwo",
  :message
  (">A) 1 That One Program, 1 Proprietary, Intermittently-Functional Driver, 1 OS X, 1 tar, 1 | grep, 8 Linux Distros"
   {:tag :br, :attrs nil, :content nil}
   "This is the confirmed setup if HF wasn't trolling about his claim.")}
 {:user "Holyflare", :message ("sweet gg robik")}
 {:user "marvellosity",
  :message
  ("so you're town Palmar"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "whatever"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil})}
 {:user "Holyflare",
  :message ("makes that gf scenario totally make sense now")}
 {:user "Chezitwo",
  :message
  ("Even if we take into account for Robik:"
   {:tag :br, :attrs nil, :content nil}
   "1) Remove one Linux Distro and add one Favored Distro."
   {:tag :br, :attrs nil, :content nil}
   "We'd still have damdred whom claimed blue.")}
 {:user "Palmar",
  :message
  ("read the modifications bros (god, why don't people just read OP? lazy fucks).")}
 {:user "Chezitwo", :message ("Kk game solved ggs.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you fail")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "there cannot be 4 blues")}
 {:user "Palmar",
  :message
  ("oh damdred claimed too."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "ok then.")}
 {:user "Trfel",
  :message
  ("If you want proof of my claim, just look at my filter?  Why have I been wondering so much about nightkills?  Why did I ask for people's opinions about marvellosity and Holyflare?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The answer is simple.  I have no clue how to play doctor.  I don't know who the mafia will kill.  I was trying to get more information, and hope that you guys could teach me how to play doctor."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But now it doesn't matter.  There are four claimed blues, with a maximum of three in the setup.  We have four mislynches.  I know that my claim is genuine, and I believe Damdred."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If Holyflare actually is cop, then that means that the last scum is a godfather, leaving even more evidence to the Robik theory.")}
 {:user "marvellosity", :message ("palmar such a baddie")}
 {:user "Palmar",
  :message ("Hey don't blame me, I'm not reading the game.")}
 {:user "LightningStrike",
  :message
  ("Robik is more likely scum than Damdred and HF so we lynch Robik next Day Phase.")}
 {:user "marvellosity",
  :message
  ("you're way more of a baddie for calling me mafia than me calling you mafia"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "baddie.")}
 {:user "Chezitwo",
  :message
  ("So we just lynch Robik then HF then Damdred then Trfel and one of these will win us the game.")}
 {:user "marvellosity", :message ("yes")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You tried to lynch townie after townie."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I tried to lynch mafia, got distracted a bit by HF, and then I instasheeped a case onto mafia."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "marvellosity",
  :message
  ("/afk"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "(except i won't)")}
 {:user "Holyflare", :message ("yup")}
 {:user "LightningStrike",
  :message ({:tag :br, :attrs nil, :content nil} "Correct.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Now can I afk and let you guys win the game?")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "i went through people like i always do on day 1. and then sheeped my townbro who i said people should sheep."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "duh.")}
 {:user "Palmar",
  :message
  ("And I just said it was a possibility, i'm not actively trying to lynch you here!")}
 {:user "Holyflare",
  :message
  ("superbowl and a game basically ending day 1, maybe everything isn't bad "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil})}
 {:user "Chezitwo",
  :message
  ("Cool."
   {:tag :br, :attrs nil, :content nil}
   "Can I claim blue even if I'm not blue? "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Yeah well I shap much better than you, and with more swords.")}
 {:user "marvellosity",
  :message
  ("i am very disappointed that dinner delayed my sheeping, it is true "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "There we go. I was going to vote Robik tomorrow myself. ")}
 {:user "Palmar",
  :message ("Also I told you that LAS was a good policy.")}
 {:user "marvellosity",
  :message
  ("if i assume HF is town, i still dunno why he had so much beef with Damdred though")}
 {:user "Palmar", :message ("if HF is mafia, I only voted mafia.")}
 {:user "Palmar", :message ("That'd be okay with me.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "because he was ignoring everything people were saying and calling me mafia for having a problem with him saying nothing new")}
 {:user "Trfel",
  :message
  ("I really want it to be Robik.  That means that my wanting to vote him was justified."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "On a side note, it was the right play to claim there, right?")}
 {:user "Palmar",
  :message
  ("Although I was kinda hoping it was Trfel, but seems unlikely right now, because damdred called it very early"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Trfel"
   {:tag :br, :attrs nil, :content nil}
   "SL"
   {:tag :br, :attrs nil, :content nil}
   "Eden")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "yes")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "He was being a total bro"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You were being a dickhole.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I suspected him on this too, he voted Damdred at the off, but like was said, just lynch in that order. ")}
 {:user "Chezitwo",
  :message
  ("Yes Trfel, your claim effectively solved the game. It's impossible to lose unless we had a VT fakeclaiming blue."
   {:tag :br, :attrs nil, :content nil}
   "So basically we only need to worry about HF and Robik."
   {:tag :br, :attrs nil, :content nil}
   "Wait, shit")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "this is true")}
 {:user "Trfel",
  :message
  ("If I actually was scum, why would I possibly put myself in a group of 4 people, one of which has to be scum?  When town has 4 mislynches remaining?  That is an auto-loss play.")}
 {:user "Palmar",
  :message
  ("I claimed Gentoo too."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I was kinda assuming the named townies would get actually named distros like \"you are fedora\" \"you are centos\" \"you are elementaryos\" \"you are DSL\" \"you are slackware\" etc etc.")}
 {:user "Chezitwo",
  :message
  ("Yes Trfel that's why I even put you behind town hero Damdred.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "When 3 people post reasons that he has inconsistencies and he ignores them and calls them all mafia and doges with a summarised post of everything he had already said this game, it's very questionable.")}
 {:user "marvellosity", :message ("na Damdred was a total townbro.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I didn't find it questionable."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Then again, I hardly read it.")}
 {:user "Holyflare", :message ("then stfu")}
 {:user "Palmar", :message ("lol")}
 {:user "Holyflare",
  :message
  ("i actually abhor the way you play by the way, it's a total waste of a slot")}
 {:user "marvellosity",
  :message ("yeah palmar is a total douche basically")}
 {:user "Chezitwo",
  :message
  ("I just found a private picture of Robik that wasn't meant to be shared with the world."
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 720px; height: 576px;",
     :src "http://i.imgur.com/nm8gbsQ.jpg"},
    :content nil})}
 {:user "Palmar",
  :message ({:tag :br, :attrs nil, :content nil} "you mad bro?")}
 {:user "marvellosity",
  :message ("you been hacking my hard drive again?")}
 {:user "Palmar",
  :message
  ("I want to believe marv is obsessed enough to have palmar quotes on there...")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I guess you're okay with girls "
   {:tag :i, :attrs nil, :content ("clothes")}
   ".")}
 {:user "Holyflare",
  :message ({:tag :br, :attrs nil, :content nil} " a bit")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "It's quite efficient, honestly."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Especially with no time to read the thread. Just wait for someone to do your job for you and sheep that "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil})}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "haha, i promise i don't."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "the vivax textfile is real though :p")}
 {:user "Chezitwo",
  :message ({:tag :br, :attrs nil, :content nil} "I WANT IT")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you could also just not play in the game and achieve the same effect without any of us wasting time talking about you")}
 {:user "Palmar",
  :message
  ("btw yall know the mafia isn't going to concede right, so we're gonna do some funny stuff in here.")}
 {:user "marvellosity",
  :message
  ("wtf"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i just opened it and it's blank"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "who deleted all my swearing "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I didn't ask you to talk about me?")}
 {:user "Chezitwo",
  :message ({:tag :br, :attrs nil, :content nil} "liar")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "don't be obtuse.")}
 {:user "Trfel",
  :message
  ("Yeah, it's definitely Robik.  Even Holyflare would definitely concede at this point.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "i'd take a screenshot, but there's too many things i don't want to be seen ")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil} "Who you think did this?")}
 {:user "rsoultin", :message ("hrum")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "LOL"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "best question.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Now I'm going to call you even more of a liar.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Maybe we should lynch marvellosity before Robik just because we can?")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I've stored this one away :>")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "No we win by lynching Robik.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "But we laugh by lynching marvellosity.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm very much in favour of this.")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Well it's sort of true. I don't think HF has any right to be mad at how I play mafia simply because it doesn't fit his standards. He himself is very guilty of what I consider to be a very detrimental way to play, which is to spam so much that no one that's on a reasonable time schedule can follow the thread."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Everyone knows I don't play on weekends, yet during the limited time I had this game, I managed to do quite a few things."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "1) I actually built a case on sicklucker, based on mostly the massive overreaction to a joke made in the early game. It was just not a natural reaction at all."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "2) I called (likely wrong now) holyflare mafia for being mad with Damdred for making sense. What Damdred said was essentially 100% correct. HF had no business being mad at him for that."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "3) I read Damdred's case, agreed with it and sheeped it immediately."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Yes, I only have 5 pages of filter. I am NEVER going to change the fact that weekends aren't the time when I play mafia. And yes, I don't only play mafia to win, I also play it for theatrics, having fun, quoting movies, singing and just in general having a good time."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So back off with that \"get off my lawn\" attitude please.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "He's on a 40+ game town no-lynch streak.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "No we aren't screwing around at the Day Phase and we need to win this now while we can.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Sorry he was lynched in Metal Mini and the PYP game "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Only because he ragequits before he gets lynched.")}
 {:user "rsoultin",
  :message
  ("Nah, lol, my paranoia is in high gear xP Systematic is best.")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "town dear, town")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "completely untrue.")}
 {:user "Trfel",
  :message
  ("Uh, TOWN no-lynch streak.  Meaning, in his last 40 or so town games, he has not been lynched."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Scum games don't count.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Oh I thought he meant all time.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Do you not believe my claim and that we have a freewin?")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The point I want to make with the bolded is not that his way IS actually detrimental, or wrong, I'm just pointing out that we don't qgree."
   {:tag :br, :attrs nil, :content nil})}
 {:user "marvellosity",
  :message ("i get lynched as mafia all the time.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "there is literally nothing to be paranoid about?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Dunnae Truffle. I'm good at paranoid which I think we've established. You're also assuming no dumb town claimed just to claim so...perhaps a little early to be popping the champagne corks and lynching people for lolz.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "We're never going to get to lynch town!marvellosity ever again.")}
 {:user "marvellosity",
  :message
  ("can't wait for all future games when i never defend Trfel ever.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "That's cruel "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "At least Artanis will defend me every game now, right?")}
 {:user "rsoultin",
  :message
  ("okay lol so most likely robik is scum, I agree...99.5% chance"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "but if he's just dumb town claiming, then all our blues could be real"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "we've wasted a night and a day"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "and that's not including lynching marv xP"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "so let's just lynch robik yes? lol -flicks truffle-")}
 {:user "marvellosity", :message ("cruel but fair")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Such a wet blanket."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Fine."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Not like I was going to actually do it.  I would switch to Robik at the last second.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Yeah, I know, rationality takes the fun out of things "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil})}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/zoefzoef.gif"},
    :content nil}
   " ")}
 {:user "IAmRobik", :message ("Am I still alive?")}
 {:user "IAmRobik", :message ("I was in DC all weekend")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Yes."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Please concede.")}
 {:user "IAmRobik",
  :message
  ("I did see we lynched Eden who I insta-scum read. That's fun. Gotta see how that one happened ")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Concede? why would i concede? lolololol. I'm so fucking town it hurts")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Because we all know you are mafia.")}
 {:user "rsoultin",
  :message
  ("Because all the blues have claimed, there is 1 too many, and you are going to be the lynch tomorrow regardless?")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "We have 4 blueclaims."
   {:tag :br, :attrs nil, :content nil}
   "One is from Damdred who spearheaded the large case on Eden and has been proactive in general."
   {:tag :br, :attrs nil, :content nil}
   "One is from Trfel who claimed medic under 0 pressure after 3 people had already claimed and looked towny already."
   {:tag :br, :attrs nil, :content nil}
   "One is from HF whom CCed cop to Eden's cop claim."
   {:tag :br, :attrs nil, :content nil}
   "One is you."
   {:tag :br, :attrs nil, :content nil}
   "We can only have 3 blues in a setup with medic and cop.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Note that sicklucker was modkilled as well.")}
 {:user "IAmRobik", :message ("Oh, I'm obviously not blue. Dumbasses")}
 {:user "Holyflare", :message ("hahahahahahahahahahahahaha")}
 {:user "Holyflare", :message ("cya robik")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :onclick "window.open(this.src)",
     :style "width: 736px; height: 708px; border:1px solid yellow",
     :src "http://i.imgur.com/joRFCz7.png"},
    :content nil})}
 {:user "IAmRobik",
  :message
  ("Are you fucking serious? I'm never fucking getting lynched here. And if I was scum, I would have instantly conceded. You are on crack if you think I'm getting lynched here")}
 {:user "Trfel", :message ("You're getting lynched here.")}
 {:user "Holyflare", :message ("you're getting lynched here")}
 {:user "Holyflare", :message ("SNAP")}
 {:user "IAmRobik",
  :message
  ("Just like, look at the fucking interaction I had with Eden. It's pretty blatantly obvious")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You are getting lynched no matter what.")}
 {:user "IAmRobik", :message ("NO...I'M NOT FUCKING GETTING LYNCHED")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil} "GFY NO I'M FUCKING NOT")}
 {:user "Fecalfeast", :message ("So who's scum then, robik?")}
 {:user "Holyflare", :message ({:tag :br, :attrs nil, :content nil})}
 {:user "Chezitwo",
  :message ("Only way you're not getting lynched is if you concede!")}
 {:user "marvellosity", :message ("this is fun")}
 {:user "rsoultin",
  :message
  ("I'm beginning to wonder how many morons we have in this game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "See, Truffle! I told you it wasn't as black-and-white as you thought. Granted, I still want to lynch Robik tomorrow xP")}
 {:user "IAmRobik",
  :message
  ("There is precedent that I would fucking concede in this spot every fucking time as mafia. Not only that, but I'm about to quote the beginning of the fucking game. You can compare it to the very previous game where I was mafia. NO.NO.NO.NO.NO. YOU ARE NOT FUCKING LYNCHING ME. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "THERE IS NO FUCKING WORLD IN WHICH I WOULDN'T JUST CONCEDE IF I WAS FUCKING MAFIA")}
 {:user "Trfel",
  :message
  ("I don't care what Robik does.  He is getting lynched."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't mind looking into other possibilities and spending Day 2 discussing that, but not lynching Robik is the stupidest thing ever.  He simply has to go.")}
 {:user "marvellosity",
  :message
  ("don't care"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you hardclaim something"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you made your bed, now fucking lie in it")}
 {:user "Fecalfeast", :message ({:tag :br, :attrs nil, :content nil})}
 {:user "IAmRobik",
  :message
  ("NO.,..YOU'RE NOT FUCKING LYNCHING ME. I'M NOT FUCKING RUINING MY 0/X JUST BECAUSE YOU PEOPLE ARE FUCKING DUMB AND DECIDED TO MASS CLAIM BLUE. I AM NEVER FUCKING MAFIA HERE."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "GIVE ME 2 MINUTES TO QUOTE MY INTERACTIONS WITH EDEN TO START THE FUCKING GAME")}
 {:user "IAmRobik",
  :message ({:tag :br, :attrs nil, :content nil} "SHUT THE FUCK UP.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "No, I think we still win if we lynch marvellosity tomorrow and if Robik was town and lied and we lynch him next.")}
 {:user "marvellosity",
  :message
  ("you hardclaimed."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "tough "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil})}
 {:user "IAmRobik",
  :message
  ("HEY. DO WE HAVE A COP CLAIM? WE HAVE A DOC RIGHT? WHY DOESN'T THE COP FUCKING CHECK ME THEN....DO IT. THEN YOU DON'T HAVE TO BE DUMB FUCKTWATS WHO LYNCH A FUCKING TOWNIE BECAUSE OF A FAKE CLAIMED ROLE")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "no. i'm not fucking accepting that fate. ")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "That won't work, and you know it.")}
 {:user "Chezitwo", :message ({:tag :br, :attrs nil, :content nil})}
 {:user "marvellosity", :message ("this is a lesson to you robik")}
 {:user "marvellosity",
  :message
  ("you claimed to skate and now it's bitten you in the ass.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Because the fact that there is a Godfather in this setup so a Cop check means nothing now.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "It's funny because the goon and RB flipped which in the cop/medic setup means the only scum left is the godfather!")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That's acceptable."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And if he's town, we kill Truffle."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "<3 yolo")}
 {:user "rsoultin",
  :message
  ("oh now i'm being the moron, chez is right lol"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "sorry truffle >>")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "READ THIS FUCKING INTERACTION TO START THE DAY. I'M LITERALLY GONNA SIT AND PING OUT MY PARTNER FOR 20 FUCKING MINUTES JUST SO THAT I CAN SAY THAT I THINK HE'S MAFIA?"
   {:tag :br, :attrs nil, :content nil}
   "NO"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "FUCKING NO"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "YOU ARE NOT FUCKING LYNCHING ME."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "LITERALLY LOOK AT THE GAME WHERE I CALLED OUT MARV. I FUCKING CONCEDED WHEN BOTH MY PARTNER DIED AND I WAS IN A SHITTY SPOT. FUCKING NO. I'M NOT MAFIA HERE AND YOU'RE NOT FUCKING LYNCHING ME")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Did you forget a GF will appear town by a Cop Check?")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "ok. don't fucking check me. i don't fucking know. i didn't even consider the fucking setup. i just know that i'm town.")}
 {:user "Chezitwo",
  :message
  ("Getting yourself modkilled is acceptable too if you prefer that fate.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "funny, your vote was on damdred before you afked"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   ":OOOOOOOOOOOOOOOOOOOOO")}
 {:user "LightningStrike",
  :message ({:tag :br, :attrs nil, :content nil} "^")}
 {:user "Palmar", :message ("This is surprisingly enjoyable.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "actually it isn't surprising")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "well I sort of expected the game to become extremely dull, but robik is adding some spice to it.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I DON'T GIVE A FUCK WHERE MY VOTE WAS. MY VOTE WAS ON SOMEONE WHO I THOUGHT WAS SCUMMY. WHEN I VOTED YOU AFTER 3/4 OF D1 CAUSE YOU DIDN'T PLAY AND I WAS BUSSING, I HADN'T VOTED ANYONE ELSE. THIS GAME I VOTED WHO I THOUGHT WAS SCUM. DAMDRED WAS PLAYING FUCKING WEIRD. I DON'T EVEN REMEMBER WHAT IT WAS ANYMORE. NO"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "OASNDFIASDFNOISA"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "YOU ARE NOT FUCKING LYNCHING ME")}
 {:user "Trfel",
  :message
  ("Robik is dying on Day 2 no matter what."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Since if he is scum, the game ends, let's assume that he is town (we still lynch him anyway ofc)."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I know that I am town."
   {:tag :br, :attrs nil, :content nil}
   "I think that LightningStrike is town, but I could double check this."
   {:tag :br, :attrs nil, :content nil}
   "I am pretty sure that Chezitwo is town."
   {:tag :br, :attrs nil, :content nil}
   "I am 100% confident that Damdred is town."
   {:tag :br, :attrs nil, :content nil}
   "I think that rsoultin is town, but I could double check this."
   {:tag :br, :attrs nil, :content nil}
   "I think that Half the Sky is town, but I could double check this."
   {:tag :br, :attrs nil, :content nil}
   "I don't have any clue what to do with Palmar."
   {:tag :br, :attrs nil, :content nil}
   "I am pretty sure that marvellosity is town."
   {:tag :br, :attrs nil, :content nil}
   "I am pretty sure that Holyflare is town (cop claim and didn't back down while Robik did)"
   {:tag :br, :attrs nil, :content nil}
   "I don't have any clue what to do with FecalFeast."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So our next two lynches would probably be Palmar and Fecalfeast, and if we somehow still haven't won, we have a lot of time to figure out the final lynch.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Yeah, Truffle's insistence on lynching randomly as a tactic has got my paranoia running lol >< But I did forget about the GF part for a sec.")}
 {:user "Chezitwo",
  :message
  ("Basically you have four ways to exit the game."
   {:tag :br, :attrs nil, :content nil}
   "You could wait and get lynched."
   {:tag :br, :attrs nil, :content nil}
   "You could modkill yourself by spamming more in excessive caps."
   {:tag :br, :attrs nil, :content nil}
   "You could concede."
   {:tag :br, :attrs nil, :content nil}
   "Or you could shoot yourself presuming that's allowed.")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "this game, dopey.")}
 {:user "IAmRobik",
  :message
  ("The fact that Marv actually wants me lynched is fucking embarrassing. I don't know if he's mafia doing it because he wants more mislynched (or the more likely scenario that he's town and he knows that I'm town by this point and he just wants my fucking stats fucked up so that i also have a mislynch)")}
 {:user "Trfel",
  :message
  ("Robik, you already said that your read on Eden1892 was a joke."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Rsoultin, I already said that I was joking.  I would never actually lynch marvellosity when I know he is town.")}
 {:user "Palmar", :message ("how do you not think I'm town Trfel?")}
 {:user "marvellosity",
  :message
  ("Palmar does look annoyingly town during the \"solved\" phase")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I don't think your town for any other reason than figuring out the game through blues, though I can't say I've bothered much ever since.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Ah, I see, I wasn't reading that section for any alignment indicative information."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'll probably have to go back over it later.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You played with scum marv in PYP where is effectively didn't give a damn about the game so him giving a damn this game makes him town.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay, truffle wuffle. Robik is the lynch tomorrow anyway. Robik, can I hear some more fun protests? xDD")}
 {:user "marvellosity",
  :message
  ("does anyone remember when eden said his scumpartner(s) made him try not to get lynched?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "weren't robik/sl both away in that scenario?")}
 {:user "IAmRobik", :message ("no i'm not the fucking lynch")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I WAS IN FUCKING DC ALL OF SATURDAY UNTIL NOW. I DIDN'T EVEN HAMMER AS MAFIA IN MY OTHER GAME BECAUSE I WAS AWAY.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "If Robik somehow flips town, are you seriously going to lynch me?  Because that makes no sense at all.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Yeah, I saw that, but I didn't see any reason to believe Eden1892.  He is clever enough to try and sneak out misinformation, even while seemingly telling the truth.  It's just WIFOM.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "NO FUCKING SHIT. THAT'S WHY I SAID IT'S MORE FUCKING LIKELY THAT HE RECOGNIZES THAT I'M TOWN AT THIS POINT AND JUST WANTS TO FUCKING MISLYNCH ME TO PISS ME OFF AND FUCK UP MY STATS. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "IT'S SOOOO FUCKING PAINFULLY OBVIOUS THAT I'M TOWN HERE."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I LITERALLY WOULD HAVE SEEN THAT MY PARTNER GOT LYNCHED D1 AND ANOTHER GOT MODKILLED AND I WOULD SNAP FUCKING CONCEDE IF I WERE MAFIA")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I AM ALWAYS FUCKING TOWN HERE")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "maybe i'm getting wifomed")}
 {:user "Chezitwo",
  :message
  ("Trfel I know Marv quite well and he is 100% town here. I'm sure he can say the same about me to help your PoE.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Anyone can say that even Mafia "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil})}
 {:user "IAmRobik",
  :message
  ("OK. Someone who isn't a fucking braindead fuckface please talk to me so that I can ration with you as to why I'm always town here.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Yeah, I figured that out a long time ago.  I'm not a complete dunce "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "IAmRobik",
  :message
  ("I refuse to talk to you fucking idiots. Someone with a brain please fucking talk to me before i flip the fuck out ")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You said pretty sure though, whereas you used 100% on Dammy whammy.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "you're worse than a fucking dunce. you're literally fucking dumpster tier if you think i'm mafia here.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Nah, probably not, actually. If Robik's VT, the 3 claimants are probably telling the truth, and it's the rest of the player base that needs to be worried about.")}
 {:user "IAmRobik",
  :message
  ("LIKE. PEOPLE ARE SITTING HERE AND FUCKING TROLLING BECAUSE THEY THINK I'M MAFIA. I'M NOT FUCKING MAFIA. IF I GET LYNCHED THE GAME FUCKING CONTINUES AND THE ONLY THING THAT FUCKING HAPPENS IS THAT I'M GOING TO BE SITTING IN OBS CHAT PISSED THE FUCK OFF AND THEN GONNA END UP POSTING AFTER DEATH TO FUCKING BERATE ALL OF YOU FUCKTWATS WHO VOTE ME")}
 {:user "Chezitwo",
  :message
  ("I wonder if this is town!robik intentionally getting himself modkilled so he won't get lynched for his precious stats.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Fine with me."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If you actually are town, you deserve this lynch 100%.  Look at my case on you, if you actually are town, your play this game has been extremely anti-town.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "i literally am considering taking this road, but didn't want to discuss doing that because I thought it would be OGI")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Where is your case on me? Please...I'll fucking rip that shit to fucking shreds")}
 {:user "Chezitwo",
  :message
  ("If you get yourself modkilled when you were destined to get lynched it basically counts as a lynch though.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :iframe,
    :attrs
    {:allowfullscreen "1",
     :frameborder "0",
     :src "https://www.youtube.com/embed/aJEzl31zL-I",
     :height "315",
     :width "500",
     :type "text/html",
     :class "youtube-player"},
    :content nil})}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "NO PART OF MY PLAY THIS GAME HAS BEEN ANTI TOWN. YOU THINKING THAT JUST INCREASES MY STANCE THAT YOU'RE BRAINDEAD")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?page=66#1308"},
    :content
    ("http://www.teamliquid.net/forum/mafia/476878-linux-mini-mafia?page=66#1308")})}
 {:user "Holyflare", :message ("hard claimers die for lying")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "HF, YOU'RE FUCKING TERRIBLE TOO. LIKE YOU SITTING HERE POSTING YOUTUBE VIDEOS IS FUCKING ABYSMAL BECAUSE YOU SHOULD KNOW I'M FUCKING TOWN")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay, so here's the deal, Robik. If you're town you made a bad decision. Either AFK or help us figure out who scum is. The GF is left and that claim was perfect for the GF to make, so you're going to have a hard time convincing people not to lynch you."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Scum, just concede. It's gonna happen. Accept it.")}
 {:user "marvellosity",
  :message
  ("Robik - I think I know who I think is mafia if you are town. Go find them and we'll see if we agree?")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 550px; height: 385px;",
     :src
     "http://media-cdn.tripadvisor.com/media/photo-s/02/d8/7d/aa/salt-factory-of-janubio.jpg"},
    :content nil})}
 {:user "jrkirby",
  :message
  ("Sorry to interrupt in the middle of the game I'm not playing, but that flavor text is amazing.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "that's fucking dumb. If not for everyone fucking claiming, I would have taken a fucking bullet...EVERY. SINGLE. PERSON WHO HAS EVER PLAYED WITH ME INSTANTLY CALLED ME TOWN. EVERY. FUCKING. SINGLE. ONE."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "YOU KNOW WHY? BECAUSE IT'S FUCKING BLATANTLY OBVIOUS THAT I WAS TOWN AND I'M STILL TOWN. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "LYNCHING ME BECAUSE I CLAIMED TO TAKE A BULLET IS FUCKING DUMB.")}
 {:user "sicklucker",
  :message
  ("....................... gg never missed a vote in like 100+ and never seen someone get mod killed just for that. should be a funny thread to read when im drunk tonight")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :iframe,
    :attrs
    {:allowfullscreen "1",
     :frameborder "0",
     :src "https://www.youtube.com/embed/GHBkYpDTOQQ",
     :height "315",
     :width "500",
     :type "text/html",
     :class "youtube-player"},
    :content nil})}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil})}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 736px; height: 552px;",
     :src
     "http://chesapeakestormwater.net/wp-content/uploads/2012/01/industrial-road-salt.jpg"},
    :content nil})}
 {:user "marvellosity", :message ("stop it artanis")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Yes, the thread is absolutely hilarious."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Please ask your remaining mafia partner to concede?  I don't care who it is, there is basically no way they can survive through four mislynches.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "NO....I DIDN'T MAKE A FUCKING BAD DECISION. YOU ARE ALL MAKING A FUCKING BAD DECISION JUST BECAUSE YOU'RE TOO FUCKING SHITTY AT THIS GAME TO REALIZE WHY WHAT I DID WAS FUCKING GOOD. TAKING A BULLET AS VT WHEN YOU'RE UNIVERSALLY TOWNREAD ISN'T FUCKING BAD."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "THINK ABOUT THIS SCENARIO."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'M IN PYP, I CONCEDE AS MAFIA INSTANTLY WHEN MY MAFIA PARTNER DIES D1 AND THE OTHER GETS COP CHECKED D2. THEN I'M PLAYING ANOTHER MAFIA GAME IN HAMMERTIME WHERE I'M TRY HARDING. EVERY FUCKING PERSON HERE KNOWS THAT I FUCKING HATE PLAYING MAFIA. YOU REALLY THINK THAT I HATE PLAYING MAFIA NAD THEN CHOOSE TO TRYHARD TO MAFIA GAMES AT ONCE? YOU KNOW WHAT? NO. I DON'T. YOU KNOW WHY? BECUASE IT'S FUCKING HARD. IT'S DAMN NEAR IMPOSSIBLE. ESPECIALLY WHEN YOU FUCKING HATE SCUMMING TO FUCKING BEGIN WITH")}
 {:user "Chezitwo",
  :message
  ("But it's fun "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "marvellosity",
  :message
  ("stop being a fucking cock robik and actually engage properly with me"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "christ")}
 {:user "LightningStrike",
  :message ("Keep up with the salt man I loving it.")}
 {:user "Trfel",
  :message ("But you didn't tryhard this game.  You did nothing.")}
 {:user "marvellosity",
  :message ("no-one is even reading your capitalised rants")}
 {:user "rsoultin",
  :message
  ("truffle fluffle can you guess who I think our mafia is if it's not robik?")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 200px; height: 252px;",
     :src
     "http://www.cais-soas.com/CAIS/Images2/Parthian/saltman.jpg"},
    :content nil})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "2nd post of your filter, you are hardly universally town read at this point")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil} "FecalFeast or Half the Sky?")}
 {:user "IAmRobik",
  :message
  ("Dude. the superbowl is starting in 30 minutes and I should have left my house already. I got home and decided to quickly check in to see what happened in this game and in my other game while i was away and the other game ended. i come here and see that 2 mafia died. didn't know how that happened but was fucking happy and hten i happily post only to have people tell me to concede. i thougth that he was joking because i didn't even know what the fuck happened and becuase i was universally townread only for people to be jumping down my fucking throat. I'll try to read interactions and try to figure out who the last scum is but everyone sitting here and thinking it's me is fucking wrong and should actually try to do fucking work because i refuse to fucking get mislynched just because you're all fucking fat lazy ugly fucks")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "People were calling me town regardless of my fucking claim you twit")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Please provide a single instance of this.  I highly doubt this.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lol, read HtS at EoD and tell me what that looks like. Ignoring Eden, just HtS.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "So both mafia called me town...but so did HF")}
 {:user "Holyflare", :message ("that was clearly sarcasm you tit")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I could make a fantastic case on HtS based on how she treats BOTH eden and sl")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "you're fucking wrong. like if you took any fucking time to read pages 8-11 it's so fucking blatantly obvious then I'm never fucking mafia with eden or sicklucker because of our interactions. Like whatever. if you wanna be a piece of shit who mislynches me based off of a fucking fake claim which was only done to get n1d you can fucking be that shit tier player, but i assure you that I'm going to treat you like i treat GB from this point on.")}
 {:user "marvellosity",
  :message
  ("shut the fuck up robik"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "go find fucking mafia")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "THERE'S NO FUCKING WAY THAT THAT WAS SARCASM YOU FUCKING LYING SACK OF S***. I WAS SO FUCKING TOWNIY")}
 {:user "marvellosity", :message ("SHUT UP")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Looks like a mafia trying to keep options open?")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "No justice will be had")}
 {:user "Holyflare",
  :message ("it was clearly making a mockery of sl being salty")}
 {:user "Trfel",
  :message
  ("Guys who aren't named Robik, please calm down.  We don't want any townies to be modkilled.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I have to fucking go. I will fucking try thought. I will fucking find you mafia even though you fucking pieces of shit are actually gonna mislynch me tomorrow for the stupidest fucking thing ever. like you have to be a fucking brick to lynch me because of how obviously townie i am and for the fact htat i would have fuckign conceded as soon as i saw that both mafia died and found out that my fake claim was cc'd. like fuckaoasidfnasdoifnasoidnfnio;sdfgn;iosdf;ngoiadsn;iofni;ods god i'm so fucking maf")}
 {:user "IAmRobik", :message ("mad*")}
 {:user "LightningStrike",
  :message
  ("You're dead sicklucker be lie down in your scum grave............")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "hahahahaha")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "What caught my attention was how focused she was on looking innocent, even after the lynch, rather than getting the right scum. I haven't seen her in here with the rest of us trying to figure the last one out, either.")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "lol")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "The one problem with this is that I think Half the Sky has enough sense to concede.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "i think anyone here does. that's actually a bad argument at this stage.")}
 {:user "LightningStrike", :message ("Yep gg Robik claimed mafia.")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "chortle")}
 {:user "Holyflare", :message ("lol")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I LITERALLY WOULD HAVE FUCKING CONCEDED INSTANTLY YOU FUCKTWIT")}
 {:user "marvellosity",
  :message
  ("shut"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "up")}
 {:user "IAmRobik",
  :message
  ("I literally want to break shit right now because you're all such fucking dumb fucks that it's so fucking painfasdfnoasidfsdafaiohsrgfniosdfg;nioadsfion;'fdsgaion;lfgdsvn;ioadsfgnio;fadsniol;asfdniofvadsnoi['sdfgniojpdfasgjpniofqrweaijhnpoADFSBNUIObnfioadsniofbdvwsgniofdgswniogfbdwsnoifgn")}
 {:user "Holyflare", :message ("go watch the superbowl dude")}
 {:user "IAmRobik",
  :message
  ("no. i'm not gonna fucking shut up until the fucking retards who are pushing for my mislynch get fucking simple fucking concepts through their stupid fucking simple fucking heads")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "gonna go watch your mom fucking a goat instead")}
 {:user "Holyflare",
  :message
  ("it's night time nobody is even pushing anything and you have stuff to go do, just go away")}
 {:user "Holyflare", :message ("yeh ok... enjoy robik")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Is this HtS and Eden's way out of fucking up and favouring robik for the lynch?")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Doesn't look very townie, that's for sure. You were super certain on Robik because, presumably, you knew you were cop. She has no reason to be that certain.")}
 {:user "Trfel",
  :message
  ("Robik, you never responded to my case on you "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/476878-linux-mini-mafia?page=66#1308"},
    :content ("here")}
   ".")}
 {:user "IAmRobik",
  :message
  ("READ THIS YOU FUCKING PIECES OF SHIT WHO WANT TO HAVE MY LYNCHED. I HAVE NEVER EVER EVER HAD THIS FUCKING INTERACTION WITH A MEMBER OF MY MAFIA TEAM. EVER. I WOULDN'T FUCKING PING MY PARTNER OUT 30 FUCKING POSTS JUST TO TELL THEM THAT I THINK THEY'RE MAFIA. IF YOU THINK THAT'S WHAT MAFIA DO THEN YOUR'E FUCKING TRASH AT THIS GAME"
   {:tag :br, :attrs nil, :content nil})}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Yes, being a blue helped a lot more.  But I was never particularly impressed by Robik's play or his claim.")}
 {:user "marvellosity",
  :message
  ("robik, shouting convinces noone"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "ever"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "at any point"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "it convinces NOONE"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "only finding mafia convinces ANYONE"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "shut"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "up")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil})}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I think it's WIFOM."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But if Robik flips town, Half the Sky would make a good second lynch."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I still don't see how not lynching Robik here is ever a good idea.  He will always be a big question mark for the rest of the game.")}
 {:user "marvellosity", :message ("of course it's bloody wifom")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It seemed overdone to me. Not as much on Eden's end (that was just ludicrous anyway and expected to be) but on HtS' part. Complete toneread."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But I also had the impression that after she got townread by most of the thread she couldn't be assed to participate.")}
 {:user "marvellosity",
  :message ("doesn't mean you can't be right about the wifom")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I got to this point of the \"case\" against me and realized you're too dumb to deserve me responding to you. GOnna have to figure out how to dumb it down."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i."
   {:tag :br, :attrs nil, :content nil}
   "tried."
   {:tag :br, :attrs nil, :content nil}
   "to."
   {:tag :br, :attrs nil, :content nil}
   "get."
   {:tag :br, :attrs nil, :content nil}
   "night."
   {:tag :br, :attrs nil, :content nil}
   "killed."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If"
   {:tag :br, :attrs nil, :content nil}
   "I"
   {:tag :br, :attrs nil, :content nil}
   "were"
   {:tag :br, :attrs nil, :content nil}
   "mafia"
   {:tag :br, :attrs nil, :content nil}
   "I"
   {:tag :br, :attrs nil, :content nil}
   "would"
   {:tag :br, :attrs nil, :content nil}
   "be"
   {:tag :br, :attrs nil, :content nil}
   "putting"
   {:tag :br, :attrs nil, :content nil}
   "a"
   {:tag :br, :attrs nil, :content nil}
   "target"
   {:tag :br, :attrs nil, :content nil}
   "on"
   {:tag :br, :attrs nil, :content nil}
   "my"
   {:tag :br, :attrs nil, :content nil}
   "back"
   {:tag :br, :attrs nil, :content nil}
   "for"
   {:tag :br, :attrs nil, :content nil}
   "living"
   {:tag :br, :attrs nil, :content nil}
   "too"
   {:tag :br, :attrs nil, :content nil}
   "long."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Hope I didn't use any words that are too big buddy")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "How does finding mafia help \"convince\" anyone if everyone is fucking deadset on mislynching me anyway. It's not like they're going to be like \"oh, robik is trying to find mafia so he's not mafia\" CAUSE I'VE ALREADY PROVEN THAT I'M NOT MAFIA BASED OFF OF "
   {:tag :br, :attrs nil, :content nil}
   "1) MY INTERACTIONS WITH EDEN"
   {:tag :br, :attrs nil, :content nil}
   "2) THE FACT THAT I WOULD HAVE CONCEDED BECAUSE I HAVE ALREADY SHOWN THAT I DO THAT WHEN I HAVE 0 CHANCE OF WINNING"
   {:tag :br, :attrs nil, :content nil}
   "3) THE FACT THAT I'M CONSIDERING GETTING MODKILLED SO THAT I DON'T GET A FUCKING MISLYNCH ON MY RECORD")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "NOONE CARES ABOUT ANY OF YOUR DEFENCES")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You wouldn't be NK'd by claiming named VT unless you are GlowingBear facing DarthPunk.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "We could do that. Or we could try to find who the second scum might be, and lynch Robik in MYLO/LYLO if the game is still going. I mean, it's not like he's going anywhere or is going to be NKd regardless.")}
 {:user "marvellosity",
  :message
  ("go read HtS filter and see how she treats sl, it is fascinating"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "and the eden stuff at eod is well documented")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "yes I would because unlike you i'm not fucking shit tier at this game")}
 {:user "Trfel",
  :message
  ("Not true, mafia could simply avoid killing the guy who has confirmed that he has no night action to get a higher chance of killing an active town role.  Or kill players who are actively participating in the game and finding scum.")}
 {:user "IAmRobik",
  :message ("wait...we have 3 blue claims ASIDE from mine?")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "no, because i'm good at this game and the other 90% of you are fucking trash")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Yup.  Me, Damdred, and Holyflare.")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "EBWOP:"
   {:tag :br, :attrs nil, :content nil}
   "Third scum. All I'm saying is it's not entirely unbelievable that he's not scum here, since I do think he probably would have conceded after he just conceded in Protoss. If he's town he can help us find the third scum, and know that with his end game mislynch he lost us the game by doing a stupid play."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If he's scum, we lose nothing killing him last vice now.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Congrats you finally  saw that.")}
 {:user "IAmRobik",
  :message ({:tag :br, :attrs nil, :content nil} "dafuq")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I WOULD NEVER MAKE YOU PLAY OUT 10 EXTRA DAYS JUST TO KILL ME ON THE LAST DAY IF I WERE SCUM. I WOULD CONCEDE RIGHT HERE AND RIGHT NOW")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "That does work, I suppose, but that just doesn't feel logical.  If we ignore Robik, there is always the question, is it Robik?  I want to proceed with fewer questions, not more.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You sound just like Doublelift in here:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :iframe,
    :attrs
    {:allowfullscreen "1",
     :frameborder "0",
     :src "https://www.youtube.com/embed/J25u4NDcIrY",
     :height "315",
     :width "500",
     :type "text/html",
     :class "youtube-player"},
    :content nil})}
 {:user "rsoultin",
  :message
  ("Seriously, trfel, if Robik is scum we already have him. He's not wiggling out of it.")}
 {:user "LightningStrike",
  :message
  ("Oh should Damdred claim his exact role here to make it easier to PoE?")}
 {:user "Chezitwo",
  :message ("Damdred has to be a named VT. Pretty much no other way.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Why do you want to avoid lynching Robik until the last moment?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't want to force ourselves to lynch someone at LYLO.  It feels a lot easier if people can use the desperation to scumhunt and search.  What if people find another scummy person, so we have Robik and someone else who looks scummy, but it's LYLO?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That's why I want to get Robik out of the way now.")}
 {:user "rsoultin",
  :message
  ("There's no rest of the scumteam to worry about. We're just trying to find one. If we all insta!lynch robik and it's not robik you absolutely know what is going to happen here."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "No one is going to try to figure it out cause town is lazy that way. Let's be productive. Call it a fun exercise ^^")}
 {:user "Trfel",
  :message
  ("Anyway, I'm going to head out (Super Bowl party haha)."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Catch you guys later.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "The opposite.  I would be more willing to scumhunt if I knew we had to find scum or lose, not when I think the most likely scum is being saved for LYLO.")}
 {:user "IAmRobik",
  :message
  ("Hammertime:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I had 7 pages in 3 games days of that game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I ALMOST HAVE THAT D1 OF THIS GAME AND I MISSED A FULL FUCKING DAY OF PLAYING. ")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "CAUSE I'M TOWN YOU DUMB FUCKING BRAINLESS TWIT")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I don't know. Maybe I'm the biggest chump on earth, but I'm not feeling him as scum here, Trfel, if we're going to be completely honest here. Don't worry. I won't be around in LYLO lol so he'll probably get lynched if it goes that far "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Don't think it will.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you want to do this because you're fucking bad at the game and want to believe \"oh, it's just this easy...lynch robik and win\" because you're too fucking bad to actualyl try to win the game.")}
 {:user "Blazinghand",
  :message
  ({:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content ("Modkill")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: green"},
      :content
      ("IAmRobik the Linux Distro has been modkilled for behavior!")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("This is a blanket behavior warning for everyone in the game.")})})}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "ROBIK FLIPS TOWN. GO FUCKING FIND THE LAST SCUM YOU FUCKING TWIT")}
 {:user "IAmRobik",
  :message ({:tag :br, :attrs nil, :content nil} "oh. glhf")}
 {:user "LightningStrike",
  :message
  ("If Robik is town then here's the thing: We got 2 named VT and 2 regular roles which might be rare to happen but never less theoretically possible then one of the mafia could be one of the ones that didn't claim a role.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "If he actually was scum and he wanted to play the game still, it would look a lot like this.  Not really any alternative."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The only argument to keep Robik around is that he would concede in this situation, and like marvellosity said, most people here would."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm almost wondering if Holyflare snuck under the radar with a fake copclaim...  I suppose it is possible.")}
 {:user "rsoultin",
  :message
  ("There's you're motivation Truffle."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Marv, if not HtS, who are you thinking?")}
 {:user "LightningStrike", :message ("Oh he wasn't blue at all rolf.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil} "You had 3 until this spam")}
 {:user "LightningStrike", :message ("HF Robik had flipped VT.")}
 {:user "Holyflare", :message ("Yeh saw now, probably hts then")}
 {:user "Trfel",
  :message
  ("Ugh.  Hard game again."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I really do have to go out though.  First places to look are Half the Sky and Holyflare.  I remember Half the Sky seeming townie earlier, but that wasn't a reread, and that was pre-flips.  I am confident in Half the Sky's ability to act towny and avoid being mislynched when she is town, so I expect to see that here.  Half the Sky, if you are town, don't let me down."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm wondering if lynching Holyflare would be good.  Holyflare getting a cop claim could be a really good way for him to avoid the lynch.  And with my claim and Damdred's claim, there may not be another blue to counterclaim him.")}
 {:user "rsoultin", :message ("HF, top scum, who is it/are they?")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "noone else right now")}
 {:user "rsoultin", :message ("Ninjad again")}
 {:user "marvellosity",
  :message
  ("like i think there are a bunch of people who are very unlikely to be mafia based on the \"solved\" game time"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "like trfel and palmar")}
 {:user "Chezitwo",
  :message
  ("I'm surprised he lasted this long tbh."
   {:tag :br, :attrs nil, :content nil}
   "Blues, marv and I are 100% cleared I think. Leaves 5 people in Palmar/LightningStrike/rsoultin/Half the Sky/FecalFeast."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Guess I need to read HtS interactions I guess but I really really don't think LS is scum and probably not rsoultin too so I'm still tempted to just carpet bomb the rest.")}
 {:user "marvellosity",
  :message
  ("like... hts... fecal? hf?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i don't like either question mark option"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "don't know where else to look")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "He instant claimed to Eden's claim though, then again that could've been planned but eh. Seems unlikely.")}
 {:user "marvellosity",
  :message
  ("you're not quite 100% arty "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "like if we're ranking how cleared you and i are, i'm more cleared because i actually played, and you could just be using wifom"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "not to say i think that is the case ")}
 {:user "Half the Sky",
  :message
  ("Hey everyone. I'm in the process of making a very long post right now. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I completely understand why everyone is scumreading me or suspecting me but I'm going to explain everything, "
   {:tag :b, :attrs nil, :content ("especially")}
   " my actions at EoD. ")}
 {:user "Chezitwo",
  :message
  ("150 posts at N1 after Imperial when I could've just kept feigning being Chez or conceded and no one would've blamed me for it?"
   {:tag :br, :attrs nil, :content nil}
   "Come on marv.")}
 {:user "marvellosity",
  :message
  ("you could have, but what you've actually done isn't that hard."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you aren't 100%. very likely town, but not 100.")}
 {:user "Chezitwo",
  :message
  ("Posting is hard. Conceding is easy. If I rolled scum after imperial with this team my filter would not have gotten past page 2.")}
 {:user "marvellosity", :message ("see above")}
 {:user "rsoultin",
  :message
  ("well, if any of the blue claims, HF I think"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "but I'm not interested in looking there first at all. the NKs will probably sort that out"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "marv pretty much confirmed. ls seems town to me, too"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "palmar's vote and once he dropped the trolling, i'm fine with"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I've always like chez. call it a blindspot <3 art"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "so yeah my poe is bringing me to the same place, marv")}
 {:user "Chezitwo",
  :message
  ("Actually there's been a game that went exactly like this one. Mafia lynched D1, modkilled N1. "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href
     "/forum/mafia/439654-a-quiet-game-of-mini-mafia?page=65#1293"},
    :content ("link")}
   "."
   {:tag :br, :attrs nil, :content nil}
   "It's like you've forgotten all our skype convos from after Imperial already.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "still, this is roughly where i'm at"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "not even because i think hf is mafia"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "fecal maybe more likely?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "who else?")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "i've forgotten nothing, hence \"very likely\"")}
 {:user "Chezitwo", :message ("You're still annoying.")}
 {:user "marvellosity",
  :message
  ("you're cute that you're so annoyed i won't give you 100%")}
 {:user "marvellosity",
  :message
  ("knocks you up a percentage point or two i'd say :p maybe even 98 now ")}
 {:user "Chezitwo",
  :message
  ("I'm going to be annoyed until it's 100%."
   {:tag :br, :attrs nil, :content nil}
   "I don't even know why it annoys me because being confirmed town without blue roles just means you suck at scum in that position but it still bothers me.")}
 {:user "Half the Sky",
  :message
  ("First, I want to address what I said at EoD. Bear in mind THIS WAS BEFORE TRFEL CLAIMED. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Rasputin, I saw this from N1, and the reason I didn't respond right away was because it was night and did not want what I am about to say affect the scum kill. But with Robik modkilled, and Trfel claimed, I have no choice. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :u,
      :attrs nil,
      :content ("I am claiming Favoured Distro")})}
   ". "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This is a hard claim. I am not being sarcastic either. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "We see that Robik fakeclaimed FD.  "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Trfel's claim as doc is extremely believable. "
   {:tag :br, :attrs nil, :content nil}
   "Damdred is 100% claim with his push on Eden. "
   {:tag :br, :attrs nil, :content nil}
   "And I know I'm not lying."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Which means that HF lied. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I said what I said at EoD because my plan was to claim first thing D2 and fence the four of us in (at that time, HF, Damdred, Robik and myself). "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But when I saw Trfel's claim, I held back because my claim would have come to the same conclusion - that it's one of Holyflare or Robik as scum. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And "
   {:tag :b, :attrs nil, :content ("five")}
   " claims would have thrown the town into chaos at that point. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Artanis brought up the VT fakeclaiming and that's when I thought deeper was there a reason for anyone to fakeclaim.  "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I thought of the possibilities of Damdred fakeclaiming, largely beacuse of the pressure that Holyflare put him through. And I remember from his coaching of Silverarte (the coaching QT) that he did say that ocassionally it's fine for town to lie. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But here, I see that Robik has clearly done it with the modkill. So Damdred's claim is definitely true. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "When I first saw what was happening, I think Holyflare needs looked into regarding the exchanges with Damdred, I had brought this up before. I still maintain that position. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I might not have been all there/coherent this game but "
   {:tag :u, :attrs nil, :content ("prior to Trfel's claim")}
   " I had a feeling on Robik and I had cause for it. Now you know that cause. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It was wrong, but as a FD, you (Rasputin) should know why I thought the way I did. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also if you really think I'm scum (I'm looking particularly at Rasputin since she is suspecting me) would I come out of the blue and do something like this and be willing to sacrifice myself when I'm the only scum left? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If you don't believe me, you'll know the truth when I flip. You will see my flip and then you will know absolutely in what direction to go. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm outing myself now so that you lot don't waste time guessing every which way who is/might be scum. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And now, I'm going to go as far to say that I actually want to be auto-lynched at this point if that's what it will take, that you lot will know what to do when I flip. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ("With only one scum left now, if my death results in an auto-lynch on the last scum (likely HF at this point) and victory, then so be it.")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "We have four mislynches available so if you were to lynch between me and HF in the next two days, you have auto. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Again, I'm doing this so we don't waste those mislynches amongst the rest of town. ")}
 {:user "LightningStrike",
  :message
  ("I remember in Imperial how Artanis looked so townie until his lynch on to Palmar it was funny.")}
 {:user "Chezitwo",
  :message
  ("Also if you think there's even a 1 in 50 chance of me not conceding here you really don't know my defeatist scum attitude very well. I could accept a 1 in 500 chance maybe.")}
 {:user "Trfel",
  :message ("HAHHHAAHAHAHAHAHAHAHAHAHHAHHAHHAHAHAHAHAAHHAH")}
 {:user "marvellosity", :message ("lol wtf?")}
 {:user "Trfel",
  :message
  ("Back to where we used to be.  Four blues."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Half the Sky"
   {:tag :br, :attrs nil, :content nil}
   "Me"
   {:tag :br, :attrs nil, :content nil}
   "Damdred"
   {:tag :br, :attrs nil, :content nil}
   "Holyflare"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Might I actually suggest Half the Sky first, then Holyflare if she flips town?")}
 {:user "marvellosity", :message ("seriously why")}
 {:user "Chezitwo",
  :message ("Okay, back on HF we go. He rolled and he lost.")}
 {:user "marvellosity",
  :message
  ("it's tempting to go with HF first because it's more satisfying")}
 {:user "Trfel", :message ("Actually no.  Just lynch Holyflare.")}
 {:user "Half the Sky",
  :message
  ("Yes, I know Trfel. If you don't believe it, go ahead and lynch me tomorrow. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I know I wasn't coherent this game. ")}
 {:user "Chezitwo", :message ("IN BEFORE HF FAKECLAIMED COP TOO")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm fine with this, if this is what it will take. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I am that confident in what I'm doing. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "LightningStrike",
  :message ("Damn this game just got harder with HTS claiming.")}
 {:user "rsoultin",
  :message
  ("Friggin insanity -_-"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Can we just get a machine gun? lol")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "It's the right play because scumHtS saying this is literally making her an autolynch, which means it's much more likely to be HF.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "no, it got totally trivial")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "No, it's gotten really easy."
   {:tag :br, :attrs nil, :content nil}
   "We lynch the UnholyFlare.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Agreed, I figured that out after I posted."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If Holyflare is actually green and fakeclaimed cop this game would have to go down as the funniest game in mafia history.")}
 {:user "Half the Sky",
  :message
  ("I'm putting it all out there. My thought processes through all of this."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I see HF being smart enough to do something like this. A scum HF would have had the perfect information to see that SL wasn't voting in a scum QT and claimed blue at the time he did. ")}
 {:user "marvellosity",
  :message
  ("bit weird that HF didn't give up earlier if he's mafia"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "this game is so bizarre")}
 {:user "Trfel",
  :message
  ("Also, if town!Half the Sky lynches mafia!Holyflare twice in a row by claiming..... that would be pretty incredible.")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "If HF gets lynched and flips green I'm literally going to PM BH to make me a traitor because I wouldn't want to be on this team anymore.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I fine with lynching HF I guess but if he flips town it will be insane.")}
 {:user "Holyflare",
  :message ("lynch me first, lynch hts, win game, ezpz")}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "He's mass bussed before and won. Blue claim could've worked if he got lucky. Kinda makes sense.")}
 {:user "Chezitwo", :message ("You're not unclaiming cop HF?")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "didn't make sense when there were 4 claims in the thread earlier for ages...")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Not weird.  For a player like Holyflare, it actually makes sense that he would take a risk with two scum dying on Day 1.  Take a risk, see if it works out.  If it doesn't, you lose a basically lost game.  If it does work out, you might win an unwinnable game."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Since if we agree that Holyflare is confirmed cop, we aren't going to lynch him, and he could actually win.  It would probably be his only way to avoid detection through four mislynches.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "no")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "no that doesn't make sense, because one blue claim must be mafia in that spot.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Again folks, please note the time that HF claimed. A lot of votes on Eden, and SL clearly had not voted. The timing of the blue claim...."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But like I said, if people don't find me credible, I'll take the noose to prove my point. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "Chezitwo",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Gambling on one of the claims being fake when your back is against the wall isn't too outrageous of a thought.")}
 {:user "rsoultin",
  :message
  (":/"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Okay, so. Truffle claims doc."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "FF says here's the lynch:"
   {:tag :br, :attrs nil, :content nil}
   "Robik, HF, Damdy, Truffle cause he claimed doc"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Y'all are missing the fundamental difference between HTS and Trfel here. HTS is the prime suspect on a lot of prominent town lists right now."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "She claims."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "She expects to be put at the end of the lynch."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I say just lynch her. She can't even protest; she asked for it. "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil})}
 {:user "Holyflare",
  :message
  ("yes the timing of the blue claim directly as someone claimed my role, grats")}
 {:user "Trfel",
  :message
  ("Seriously.  We have four lynches, and four claimed blues.  Just lynch all of us.  If one of us is mafia, gg we win.  If none of us is mafia, then one of us is a fake-claiming town, and they had better retract their claim right now.  In no way is it possibly in their best interest to stand by their claim and let town lose.")}
 {:user "marvellosity",
  :message
  ("only damdred can retract at this stage"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "the others are locked.")}
 {:user "Chezitwo",
  :message
  ("Trfel, you're standing by your medic claim? You're not a VT?"
   {:tag :br, :attrs nil, :content nil}
   "Damdred, same?"
   {:tag :br, :attrs nil, :content nil}
   "HF are you willing to change your quote to the worst player of all time if you flip VT?")}
 {:user "Holyflare",
  :message
  ("yes it's literally impossible for me to win if I am mafia, I would have conceded as soon as hts claimed blue if she was town")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "100%")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "by that logic you should have conceded as soon as Trfel claimed earlier")}
 {:user "Half the Sky",
  :message
  ("Here's what I propose by what Rasputin said:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lynch in this order"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "1 myself "
   {:tag :br, :attrs nil, :content nil}
   "2 HF"
   {:tag :br, :attrs nil, :content nil}
   "3 Trfel"
   {:tag :br, :attrs nil, :content nil}
   "4 Damdred")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I will never retract my claim because it is true and I want to win this game.  The blue roles seem to be the way to do it.  If I flip VT, then BlazingHand would actually be the worst host of all time for not only sending me the wrong role PM.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "not particularly? I've won a game after losing 2 mafia day 1 before?")}
 {:user "Trfel",
  :message
  ("Holyflare, are you willing to change your signature to \"worst player of all time\" if you flip mafia?")}
 {:user "Chezitwo",
  :message
  ("I don't understand this situation."
   {:tag :br, :attrs nil, :content nil}
   "If mafia is within the 4 blue claims why haven't they conceded?"
   {:tag :br, :attrs nil, :content nil}
   "If there's a VT why haven't they retracted their claim?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "yup")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "there were 4 blue claims at that point.......")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Wait, this is probably against the rules.  Never mind.  Sorry.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "100%"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think he was banking on a Robik auto-lynch. The modkill blew everything out of the water. ")}
 {:user "rsoultin",
  :message
  ("Guys."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lynch HTS. Obvious. She claimed under pressure when the last person to claim blue got read as \"towniest blue\" for claiming last."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If it's not her, HF.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "VT was Robik, he was just modkilled. So it's a fakeclaim now in there. ")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "yes well it's robik and he's afk")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "100%")}
 {:user "Half the Sky",
  :message
  ("I stand by my claim and I stand by what I've said - I will take the noose to prove my point. ")}
 {:user "Holyflare", :message ("yuppppp")}
 {:user "marvellosity",
  :message
  ("i just don't get why either of them would waste my time."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "selfish")}
 {:user "Holyflare", :message ("totally")}
 {:user "Trfel",
  :message
  ("The main question now is whether or not Damdred retracts his claim.  If he doesn't just lynch the four blues and if we lose we can nominate the liar for worst player of all time.")}
 {:user "Holyflare",
  :message
  ("hts i have no idea what you're trying to do but it's not working..?")}
 {:user "Chezitwo",
  :message
  ("Let me get everything in order here just so we don't fuck up."
   {:tag :br, :attrs nil, :content nil}
   "Holyflare (Cop)"
   {:tag :br, :attrs nil, :content nil}
   "Trfel (Medic)"
   {:tag :br, :attrs nil, :content nil}
   "HtS (Named VT)"
   {:tag :br, :attrs nil, :content nil}
   "Damdred (Unknown, presumably Named VT)"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Possible setup: A) 1 That One Program, 1 Proprietary, Intermittently-Functional Driver, 1 OS X, 1 tar, 1 | grep, 8 Linux Distros"
   {:tag :br, :attrs nil, :content nil}
   "All other setups feature either no cop, no medic or neither."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Setup A has no Named VT's."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Setup A can have a maximum of one Named VT."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "There is no way that all blueclaims are true.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I won't speak for HF, but I would like to think I've "
   {:tag :i, :attrs nil, :content ("saved")}
   " you lot time...instead of you people running around guessing and debating whether or not I'm scum or not. ")}
 {:user "rsoultin",
  :message
  ("lol can we submit a lynch order as a game and "
   {:tag :i, :attrs nil, :content ("really")}
   " auto this? xP")}
 {:user "marvellosity",
  :message
  ("obviously, we just can't have 4"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "duh")}
 {:user "Chezitwo",
  :message
  ("If Damdred rescinds his claim I'm going to be so pissed.")}
 {:user "Holyflare", :message ("hahaha")}
 {:user "Trfel",
  :message
  ("Yes, that is 100% correct, Artanis."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "We just have to know if Damdred stands by his claim.  I'm assuming he does.")}
 {:user "Holyflare",
  :message ("i wouldn't put it past him... was a crazy claim")}
 {:user "Chezitwo",
  :message
  ("It's really the only thing that makes sense at this point.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "No but I'm pretty sure of what you tried to do."
   {:tag :br, :attrs nil, :content nil})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you think this game would still be running if i was mafia?????")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "If we can submit a lynch order (which I really really want to do), we probably should wait just to make sure that Damdred confirms that he is in fact a blue.  He wasn't here the first time we had four blues either, so it is possible that he might back down.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I think that is more likely than the game still running if anyone else was mafia.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I could try to get modkilled, but that would be poor show. "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "100%")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Plus, that is worthy of a ban, no?")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "it's literally impossible to win if i'm mafia i'm not stupid")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Nah, sweetie. See, we weren't even really debating. It was more like...HTS, then who?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So if you've really got a role babyface you're not making sense. Cause you claim you claimed so we'd lynch you, but based on thread sentiment...that was already going to happen."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This is what I call a BS meter moment. <3")}
 {:user "Trfel",
  :message
  ("It doesn't matter if we lynch Half the Sky or Holyflare first."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But I believe Half the Sky, and I don't really believe Holyflare.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "^ too")}
 {:user "Chezitwo",
  :message
  ("I can see a scum Palmar or FF looking at this thread and laughing about that one VT that claimed blue.")}
 {:user "Chezitwo",
  :message
  ("I really think Damdred's going to unclaim. Nothing else makes sense.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I agree."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "If he does, do we lynch him?  Or let him slide?")}
 {:user "Blazinghand",
  :message
  ({:tag :div,
    :attrs {:style "text-align:center"},
    :content
    ({:tag :br, :attrs nil, :content nil}
     {:tag :b, :attrs nil, :content ("End game")}
     {:tag :br, :attrs nil, :content nil})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: red"},
      :content ("HolyFlare the That One Program has conceded!")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: blue"},
      :content
      ("Trfel the tar is victorious!"
       {:tag :br, :attrs nil, :content nil}
       "Half the Sky the Favored Distro is victorious!")}
     {:tag :font,
      :attrs {:style "color: green"},
      :content
      ({:tag :br, :attrs nil, :content nil}
       "LightningStrike the Linux Distro is victorious!"
       {:tag :br, :attrs nil, :content nil}
       "Chezitwo the Linux Distro is victorious!"
       {:tag :br, :attrs nil, :content nil}
       "Damdred the Linux Distro is victorious!"
       {:tag :br, :attrs nil, :content nil}
       "rsoultin the Linux Distro is victorious!"
       {:tag :br, :attrs nil, :content nil}
       "Palmar the Linux Distro is victorious!"
       {:tag :br, :attrs nil, :content nil}
       "MARVELLOSITY the Linux Distro is victorious!"
       {:tag :br, :attrs nil, :content nil}
       "FecalFeast the Linux Distro is victorious!")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :b,
    :attrs nil,
    :content
    ({:tag :font,
      :attrs {:style "color: green"},
      :content ("Town Victory!")})}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Obs QT: "
   {:tag :a,
    :attrs
    {:rel "nofollow",
     :target "_blank",
     :href "http://www.quicktopic.com/51/H/cuVXRAgpSQVnN"},
    :content ("http://www.quicktopic.com/51/H/cuVXRAgpSQVnN")}
   {:tag :br, :attrs nil, :content nil}
   "Scum QT: "
   {:tag :a,
    :attrs
    {:rel "nofollow",
     :target "_blank",
     :href "http://www.quicktopic.com/51/H/7YTG7h29Ze2"},
    :content ("http://www.quicktopic.com/51/H/7YTG7h29Ze2")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Thanks for playing!")}
 {:user "Chezitwo",
  :message
  ("I don't want to talk about that because I don't want to influence his decision.")}
 {:user "marvellosity",
  :message
  ("haha"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "damdred fakeclaimed"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "hahahahaha")}
 {:user "Trfel",
  :message ("Wow.....  Damdred actually WASN'T blue.....  Oh my.")}
 {:user "Chezitwo", :message ("Finally.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Then go ahead and kill me tomorrow. You will see my flip. There is nothing more I can say on that. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You were sure of my guilt, but you will see that you were wrong. ")}
 {:user "Holyflare",
  :message ("doesn't really matter, I wouldn't have won")}
 {:user "Half the Sky", :message ("NICE!!!!!!!")}
 {:user "Artanis[Xp]",
  :message ({:tag :br, :attrs nil, :content nil} "LOL")}
 {:user "IAmRobik", :message ("I end-gamed")}
 {:user "Trfel",
  :message
  ("It actually wasn't over quite yet.  He could have done it if Damdred unclaimed.")}
 {:user "Holyflare",
  :message
  ("not in a great mood to play this game to begin with, let alone survive 4 mislynches")}
 {:user "Half the Sky",
  :message
  ("SUCK IT RASPUTIN!!!!!!"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "YOU WERE SO SURE ON ME WEREN'T YOU!?!??!??!?!?!")}
 {:user "rsoultin",
  :message
  ("Is Damdred bold enough to fake-claim blue as mafia, roll one of his partners and hard-buss the other? o.0"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I mean, if he wins that way that's probably individual scum performance of the year right there lol")}
 {:user "marvellosity",
  :message ({:tag :br, :attrs nil, :content nil} "thanks boys")}
 {:user "Half the Sky",
  :message
  ("<3 <3 <3 <3 <3 <3 "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "No hard feelings m'lady <3"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "<3 Rasputin. ")}
 {:user "Trfel", :message ({:tag :br, :attrs nil, :content nil})}
 {:user "marvellosity",
  :message ("literally called it as it happened")}
 {:user "Half the Sky",
  :message
  ("*hugs for all my townies*"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "<3 you all")}
 {:user "Holyflare", :message ("was the only move I could do tbh ")}
 {:user "Eden1892",
  :message
  ("literally as soon as I got caught, mafia collapsed."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "mvp?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "mvp")}
 {:user "LightningStrike", :message ("Town MVP for Damdred and HTS!")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "ROFL I 100% was lol."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "PLAY BETTER AS TOWN ASDOIJFOJEORJN FKN FLJM")}
 {:user "marvellosity",
  :message
  ("HtS did nothing but claim"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Damdred is obvious MVP")}
 {:user "Eden1892", :message ("i am obvious town mvp")}
 {:user "rsoultin", :message ("<3 HtS lol")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'd say Damdred 100%. I did jack all. ")}
 {:user "IAmRobik",
  :message
  ("for all of you who weren't HF, please read pages 8-11 again and realize that mafia don't interact like that because you clearly don't know how to play this game if you think that's mafia/mafia interaction. I "
   {:tag :b, :attrs nil, :content ("DARE")}
   " any of you to try to do that as maf/maf. ")}
 {:user "Eden1892",
  :message ("man. if i had been town i still wouldn't have been n1'd")}
 {:user "Trfel", :message ("Damdred for MVP.  No debate.")}
 {:user "rsoultin",
  :message
  ("Damdred gets it. That should make him happy when he returns to the thread xD")}
 {:user "Half the Sky",
  :message
  ("Trfel was right...two games now where my claiming does in a scum Holyflare "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It was written in the stars...")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "i insta-shat on eden. get on my level")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "two out of three terrible associations, not bad")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "yeah and your vote was on townhero damdred"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "gtfo")}
 {:user "Artanis[Xp]", :message ({:tag :br, :attrs nil, :content nil})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "pls. you were like an inconvenient pigeon shit on my old hoodie"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "damdred was a steaming pile of tyrannosaurus shit dumped on me at 90 mph by a rogue dump truck escaping jurassic park in my tux"
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-02 00:16:44")})}
 {:user "LightningStrike",
  :message
  ("HTS if I was 21 years old I would like to take some shots with you for today's victory but I'm only 20 "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "do it anyway. man up and get that victory bone on")}
 {:user "rsoultin",
  :message
  ("lol"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "fake-claiming...I really hate it -flicks townies-")}
 {:user "marvellosity",
  :message
  ("Damdred was really great"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "nailed Eden"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "had the right suspicions of HF"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "10/10")}
 {:user "justanothertownie",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You wouldn't say this had HF not conceded.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I LEFT TO GO TO DC. I WASN'T EVEN AROUND PSHHHH")}
 {:user "justanothertownie",
  :message
  ("Shouldn't have outed "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil}
   " This was a free town win...")}
 {:user "Blazinghand",
  :message
  ("This game had like 6 blue claims and there were only 2 blues. pretty gr9"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I've put ban list actions here: "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/427933-tl-mafia-ban-list-20?page=102#2026"},
    :content
    ("http://www.teamliquid.net/forum/mafia/427933-tl-mafia-ban-list-20?page=102#2026")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "if anyone wants to discuss them-- please discuss over there, not here. No punishment for SL, standard behavior for robik.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "probably should have left your vote on mafia if you were so awesome and caught him so obviously eh?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "eh???")}
 {:user "Artanis[Xp]",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Actually I was going to say Damdred was clearly town even if he unclaimed. I just didn't want to say it because in the unlikely scenario where he was scum it'd have made his decision easier.")}
 {:user "Trfel",
  :message
  ("Ok, now can I go back to my first question of how I can improve my play?  I still feel largely ineffective and I had a lot of trouble getting townread this game.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Like I said, I was impaired (from drinking) two of the nights I was playing this game. I was particularly poor last night. "
   {:tag :br, :attrs nil, :content nil}
   "Which is why I acknowledged my lack of coherence. ")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "i think you were kinda obviously town by the end of day 1."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "that's pretty good.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "100%")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "But the last time I tried alcohol it left me with a very bad after taste so meh.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Meh. I gues. I don't think I voted him....i'll say it's cause i was trying to figure out his partners. HF's case on damdred was bad. Mine wasn't. lawl")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "That was what I was thinking.  But I wasn't smart enough to think about not saying it.")}
 {:user "Artanis[Xp]",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "In the start you made this giant post that had one read on it: Townish on HF. I feel like you should try to be more efficient and focus on the important things rather than commenting on everything happening in the thread.")}
 {:user "LightningStrike", :message ("BTW guys any tips for me?")}
 {:user "Half the Sky",
  :message
  ("I know some of the obvious mistakes I made, but if anyone else has any thoughts or suggestions on my gameplay as well, I'm all ears. ")}
 {:user "Blazinghand",
  :message
  ("You did a good job of claiming blue, just like 6 out of 13 of the players in this game did.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Thanks, I'll work on it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Hopefully there will be another normal game up soon.  This one was pretty quick.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "you need to analyse your own gameplay"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "like think about how you thought about sicklucker. do you think you could have improved your approach there?")}
 {:user "Eden1892",
  :message
  ("guys can i get advice abot my play. for a better mofia side")}
 {:user "Artanis[Xp]",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Try to play more with your goal in mind. You want to get reads on people and push your scumreads, and if you're like me maybe have a little fun on the side too. Just remember those goals.")}
 {:user "rsoultin",
  :message
  ("Heh, I'll take advice, too."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Tried to do the less active thing and I've got people up my ass. Can't win lol.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Try to emulate your town play. It wasn't even close")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "why? it was fine. you got pressured and you came out the other side of it as fairly clear town"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "that's pretty normal in a mafia game.")}
 {:user "Trfel",
  :message
  ("I need to go back over Damdred's case about Eden, and figure out how he did that.  When I filter dove Eden, I didn't scumread him."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "That's probably the biggest read error I made this game?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "As for my playstyle, I have to remember not to get mad, that just makes my communication much less effective.  And I should probably return to my low-post, high content style.  That felt more effective.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It was Marv, HF and me on your bum, Rasputin....one of them was scum, and I was suspicious of your tone. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I was also hoping you'd be scum, I was always curious to see your scumgame <3"
   {:tag :br, :attrs nil, :content nil})}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "for what it's worth, i find it easier to read you with how you played this game than in your previous games (except where you pwned mafia in carol, but can't always rely on that)")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Don't townread me for bad reasons? xP"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And I'll stop making cases scum can steal lol >< grumblegrumble")}
 {:user "IAmRobik",
  :message ("My advice for everyone is to read the posts in the game")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I should have been more sure of the Eden scumread when I made the list of items that I did. The one point on SL and then the rest of the list fell off. "
   {:tag :br, :attrs nil, :content nil}
   "Bloody hell, I need to not ignore the obvious signs. ")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Well it was just a bad meta read I guess but if I was first time playing with sicklucker I would of called him out on it but I played with him as a townie only until this game so it was a big mistake I guess.")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "right, so you're over-relying on meta"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "people can do a lot of their town meta as mafia, because that's what they're trying to do"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you have to look out for that")}
 {:user "Artanis[Xp]",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "It never felt like you were really scumhunting. When you're town, you ask people questions with a specific direction in mind. This game, that rarely happened and that stood out to me. It looked more like you were giving random observations left and right with a few questions just for form, but without real direction. It's one of the hardest things to do though.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You mean play more games? Also ya I didn't really get many scum reads until I saw Damdreds case on Eden then I remembered how Eden was in New Years Eve Mafia which he mentioned in his case so I guess I need to get better at finding scum.")}
 {:user "IAmRobik",
  :message
  ("Hey LS, can you explain why you posted a bunch of images of salt?")}
 {:user "Artanis[Xp]",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I mean, when you post, think about why you're posting it. Justify the purpose it has. I'm not talking about making plays or anything like that.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I didn't post the images on salt it was HF and Artanis nice try "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "LightningStrike",
  :message ({:tag :br, :attrs nil, :content nil} "Fair enough.")}
 {:user "Half the Sky",
  :message
  ("Also Artanis, damn you for smurfing, I thought you were trying to troll all the players and between you and Palmar, I was going insane on that...")}
 {:user "Artanis[Xp]",
  :message
  ("I just felt like playing like Chezinu for once. Turns out I'm bad at it "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frown.gif"},
    :content nil})}
 {:user "rsoultin",
  :message
  ("lol i'm sorry"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I know it's just cause JJB/Chez/Slam all remind me of each other and I have a soft spot for my bro, but...I really liked Art's filter lol."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You should read it closer, HtS, the trolls had direction I promise "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil})}
 {:user "Damdred",
  :message
  ("I had to stop catching up to post this and I'm sorry."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not blue I wanted to catch a bullet tonight cause i was playing realm stupid and wanted out of the game. Now ill get lynched but I'm glad I at least caught mafia before I did.")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "It was obvious it was Artanis when he started posting Gifs and Images in this game lol.")}
 {:user "Alakaslam",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "So this is the goat remark"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sadly robik is simply American Marv, just as Marv is quintessentially English Robik is quintessentially East Coast U.S."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Both are very good at this, are well aware of it, prize their stats too highly."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Beyond that, they are culturally their homes."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "And I am SoCal Chezinu and L.A. Grush I know.  Still,"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I think it's funny so stupid as it is I said it"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Is this game in progress and BH already in ban list?  Wat"
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-02 00:38:55")})}
 {:user "rsoultin", :message ("Damdy we won!!! lol")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Wasn't obvious to me. I have never played a game with Artanis. Ever. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "lol")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "We won rolf cheers for you making the case!")}
 {:user "Damdred", :message ("Oh I'm well behind who was it")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It really didn't look like it when I first read, but I think this is where the cocktails from Friday night/Saturday morning did their part... :/"
   {:tag :br, :attrs nil, :content nil})}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I thought you shadowed him? I shadowed Palmar in that game so I knew when the images and gifs showing up in the filter that it was him lol. I guess that what happens when I got to much time on my hands XD")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Holyflare. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Trfel and I were the only blues. Robik also fakeclaimed but he was modkilled. ")}
 {:user "rsoultin",
  :message
  ("Eden/SL/HF"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "you're town mvp man "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil})}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "My observation of Imperial fell off when Newbie LX and NYE Party kicked in. "
   {:tag :br, :attrs nil, :content nil})}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Holyflare, sicklucker, and Eden1892")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I was lynched in Newbie LX so I had plenty of time to look at Imperial while NYE Party was going on.")}
 {:user "Alakaslam",
  :message
  ("The hell Damdred you made me hit my head on wall irl"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I post in active games too much")}
 {:user "Half the Sky",
  :message ("Now all we need is another normal mini.....woohoo!")}
 {:user "Blazinghand",
  :message
  ("Half the Sky, yours is probably next. Foolishness should PM you shortly.")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Alright Holyflare, let's see that sig change! "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "LightningStrike",
  :message
  ("I think BH should play with us next time I thought he was a funny player from the 2014 Mafia Wards Thread.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "It doesn't count if he's scum")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Are you still bitter I got you lynched in Newbie? You said that this game "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "<3 LS"
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-02 00:44:44")})}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I'm a little bitter about it still because I trusted you to much but when you killed rsoultin it made it clear you were scum in that game due to WIFOM alone :O")}
 {:user "rsoultin",
  :message
  ("lol I AM STILL BITTER ABOUT BEING MISLYNCHED"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "ahem"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Bueno"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "hts do you need a cohost? I wanted to get into that but no clue how ^^")}
 {:user "Blazinghand",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The next couple of normal minis aren't hosted by me, I'll probably play in one of them. You can also expect to see me in the next full-sized normal.")}
 {:user "Damdred",
  :message
  ("Well yea I just wanted to die n1 because the amount of horrible pushes really made me meh. I just sucked it up but I pinged all the mafias this game kinda happy")}
 {:user "Damdred",
  :message
  ("Gg I hope life goes better hf."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "It was dumb to claim blue but I was town besides that. Like it was the real reason I got so mad like my filter was almost tripple mu normal d1 and was trying to direct discussion"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But I feel ok about the game")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "You need to keep your eye on the active list of mafia games. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Right now, Sentinel has Titantic 8 in the mini normal queue, so his game would appear to come before mine. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Most hosts have no experience requirement, but I'm not sure if I might have a caveat being a first-time host (where I'd require someone else more experienced as a cohost.) BH, can you verify? "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Otherwise I'd have no issues taking you on, otherwise you should probably PM Sentinel since his game is next in queue. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin", :message ("you did great damdy")}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm curious to see how you play in a mafia game having never actually played with you. Should be fun "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil})}
 {:user "Blazinghand",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm not a particularly skilled player but I'm ruthless and pull no punches.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "All BH does is use random.org until he lynches all the townies and then claims he was trying to win")}
 {:user "LightningStrike",
  :message ({:tag :br, :attrs nil, :content nil} "How true is this?")}
 {:user "Blazinghand",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I have not, nor will I ever, use random.org for playing in a game of mafia."
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-02 00:53:30")})}
 {:user "Damdred",
  :message
  ("First case I've ever made that people sheep it, it made me feel pretty good")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :a,
    :attrs
    {:target "_blank",
     :href
     "/forum/mafia/461330-noir-mini-mafia-chapter-2?user=BlazingHand"},
    :content
    ("http://www.teamliquid.net/forum/mafia/461330-noir-mini-mafia-chapter-2?user=BlazingHand")}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "it's essentially random.org"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Not the only game he does this either")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I think I was the first one to sheep it too lol......")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This quote makes me laugh so hard")}
 {:user "Damdred", :message ("Bh has caught mafia using it though")}
 {:user "Blazinghand",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "it's infinitely better than posting some unverifiable screenshot from random.org and your denial of this fact only makes it more clear huehuehue"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "also this. this tactic has literally caught mafia. It has been successful 100% of the time, 33% of the time."
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-02 00:58:29")})}
 {:user "marvellosity", :message ("5% of the time")}
 {:user "Trfel",
  :message
  ("I hope that the next game starts soon..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "GGs all, fun game.  Sorry Robik.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "It's fine. HF and artanis knew what was going to happen. Especially HF since he knew I was town. Just please read the game")}
 {:user "Artanis[Xp]",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "BH will do anything to not get lynched. He will make any excuse, like this."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "IAmRobik",
  :message
  ("People in this game who I insulted, do you want me banned?")}
 {:user "Blazinghand",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Context: all of those statements are lies. I was scum trying to wriggle out of a lynch. I forgot if it worked or not."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "EDIT: at least, I *think* I was scum. I'm also 100% willing to lie about this kind of thing as town, too, if I think it'll work. I really play hard for my wincon."
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-02 01:05:41")})}
 {:user "Artanis[Xp]",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "If there was any hope of you stopping to tilt this easily, yes."
   {:tag :br, :attrs nil, :content nil}
   "Since there is none, I don't really have an opinion on it.")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "No, but it's not my decision and I don't think my opinion has anything to do with it."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "For the record, though, please don't accuse me of not reading the game.  I read the entire game and reread a bunch.  I'm fine if you call me stupid, I deserve that.  But I did read the game.")}
 {:user "LightningStrike",
  :message
  ("No Robik you kind of reminded me of myself in Metal Mini when I went toe to toe with Damdred at the night before MYLO.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I just mean, instead of doing what you did at end of game, just read the game. read what i'm writing. Don't just say \"oh lol you're obv mafia because you fake claimed\" after I'm posting evidence that makes me not mafia")}
 {:user "Eden1892",
  :message
  ("Rofl at the \"be who I wanted to be in high school\" thing. I would probably not lynch him for that for humor value alone")}
 {:user "Artanis[Xp]",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You didn't get lynched and you were scum. You got killed in some way on D6 though and town won a little later. It was Hogwarts."
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-02 01:08:55")})}
 {:user "justanothertownie",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "You were scum and it didn't work because I shot you. Like half of your team that game.")}
 {:user "Blazinghand",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "hahaha classic me")}
 {:user "Trfel",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Sorry if my intent wasn't clear.  I didn't think that you were obvious mafia, what you said made sense.  I forgot about the possibility that you could be fakeclaiming as town to take a night kill, and that was really terrible of me.  Once you pointed that out, I realized that you could be vanilla town."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I tried to seem overly confident in an effort to make you concede if you were in fact mafia."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I still maintain that you would have had to play extremely well Day 2 to avoid getting lynched (though for the aforementioned reasons, I didn't say that in the thread).  I guess this teaches me not to do that again.")}
 {:user "Holyflare",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "yes for a game and I was fucking mafia")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "So you were insulted when I said that I'm watching your mom fuck a goat?")}
 {:user "Holyflare", :message ("read banlist thread")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Lol I find rage!fits funny. You're fine by me.")}
 {:user "Alakaslam",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "A rare moment of modesty from the great one")}
 {:user "Alakaslam",
  :message
  ("Robik"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "U can dodge ban with CHUPAZI"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But since you are of Marvellosity and not of Chezinu, I know you cannot embrace any form of brown."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Only Grackaroni can do this."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "As for bans, I think until you fucking learn a better fucking word than fuck all fuck, like maybe even phuk for fucking example, you can fucking dodge a fucking ban for all the fucks that's worth.  Because fuck, you say variants of fuck way the fuck too fucking much."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Fuck, all that fuck alone is fucking reason enough, damn it "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "!!!"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Variety!!!!")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Fuck that. My caps lock was clearly broken at times because I had to click shift a few times to turn it off. And Fuck stupid fucking shit")}
 {:user "Alakaslam",
  :message
  ("Most ppl b like this about Robik "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 336px; height: 360px;",
     :src
     "http://cdn.ebaumsworld.com/mediaFiles/picture/1952861/81511145.jpg"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I'm up in here thinkin,"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs
    {:title "",
     :alt "[image loading]",
     :style "width: 360px; height: 270px;",
     :src
     "http://static.gamespot.com/uploads/original/1057/10579915/2516215-9276321372-13633.jpg"},
    :content nil}
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-02 01:37:05")})}
 {:user "Alakaslam",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "See? He said \"fuck that\" clearly says fuck too much.  He could have said \"shit that\" or \"bitch that\" or \"asshole that\" or \"buttshit jackass that\""
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "But he say fuck that"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "See?"
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ("lol so many good words"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "dumbass"
   {:tag :br, :attrs nil, :content nil}
   "shit-ass"
   {:tag :br, :attrs nil, :content nil}
   "bullshit"
   {:tag :br, :attrs nil, :content nil}
   "assholery"
   {:tag :br, :attrs nil, :content nil}
   "mindfuckery"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "and even"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "moronic"
   {:tag :br, :attrs nil, :content nil}
   "idiotic"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "so many fun words!"
   {:tag :br, :attrs nil, :content nil})}
 {:user "LightningStrike",
  :message
  ("Damdred were you surprised I was supporting your case 100% over the other cases at the time?")}
 {:user "rsoultin",
  :message
  ("lol there were no other cases"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "<3s LS"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "mostly just suspicions. robik was kinda a case")}
 {:user "Damdred",
  :message
  ("I wasn't to surprised I had to push it through a little cause people wanted policy for some reason")}
 {:user "Damdred",
  :message
  ("I was most surprised palmar jumped on it so fast and with such faith as well as Marv. Felt good")}
 {:user "rsoultin",
  :message
  ("A good case speaks for itself, Damdy. That's why it was sheeped so easily. You did a great job there.")}
 {:user "sicklucker",
  :message
  ("Oh this is over? Pretty lame. Thought we were in an ok spot not great but not bad")}
 {:user "Eden1892",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "LMAO"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "<3 u sl u my boi")}
 {:user "sicklucker",
  :message
  ("Like robik was mad out of line. But he was obvious town I didnt even try to put scum on him because it is so obvious? Newer players need to think wheres the mafia motivation in killing yourself day1")}
 {:user "sicklucker",
  :message
  ("Like it was really easy to defend robik there and fight you about it and look townie because you were all wrong")}
 {:user "sicklucker",
  :message
  ("This 180 was hilarious we went from getting an easy ff lynch which is basically my dream as either alignment then thinking the deadline was an hour earlier and coming back to the game being over")}
 {:user "Damdred",
  :message
  ("Honestly dcum wasn't in a good place. Hf was scummed by a few people, Eden was dead in the water and we weren't town reading you meh")}
 {:user "Palmar",
  :message
  ("Damdred town mvp. "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also I'm glad it was HF. Means I only voted mafia. ")}
 {:user "Damdred",
  :message
  ("Honestly from d1 you had strong towns in. Marv, palmar, ls, RS, blue claims. Basically the lynch pool was robik, hf, SL, ff if you hadn't got mod killed. Town would of won I think either way")}
 {:user "Onegu",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Was this on purpose?  Read close what she wrote on robik."
   {:tag :br, :attrs nil, :content nil})}
 {:user "Palmar",
  :message
  ("But everyone was trying to lynch me though!"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Except of course town hero Damdred. Maybe marv should learn something from you on how to read people."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Town hero Damdred never doubted me, so when he presented his case I did not doubt him."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I would have followed you. My brother, my captain, my king.")}
 {:user "Damdred",
  :message ("To glorious victory forever and ever amen")}
 {:user "Palmar",
  :message
  ("And don't be surprised that your case got sheeped."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "When you present a concise, well structured and insightful case, people are going to sheep it. I've written so much over the years on how sheeping is an essential (and very underrated) skill in mafia, and I actually pride myself in being a very strong sheep player."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "When I have an idea I would like to be sheeped, so when others have an idea I try to return the favor.")}
 {:user "sicklucker",
  :message
  ("Well we obviously kill dandred tonight because your really the only one scumming hf. Was tref a medic? Because that was probably an easy save. Eithe rway your neve rvoting me bishes")}
 {:user "sicklucker",
  :message
  ("Its like super depressing when you stay up all night convincing everyone your town and get the lynch off yourself for probably multiple days. Then you oversleep because of it wake up and be mod killed."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "lol nice catch"
   {:tag :br, :attrs nil, :content nil})}
 {:user "rsoultin",
  :message
  ("Lol, SL...I dunnae brah. HF's days were numbered I think. Guess it just depends on how good you can be at getting out of a lynch. This is the first time I've seen you play scum...and you really are much less erratic than you are as town "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil})}
 {:user "DarthPunk", :message ("Holyflare obvious scum :D")}
 {:user "sicklucker",
  :message
  ("Like I have never been lynched in like 4 months of playing. It just doesint so mafia wins!")}
 {:user "rsoultin",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ah, we've got to pop that cherry sometime "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil}
   " Preferably when you're scum."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I was mislynched when I shouldn't have been, thank you DP, and misery so does love company xP")}
 {:user "Fecalfeast",
  :message ("wtf is this you guys make 400 posts during superbowl??")}
 {:user "Fecalfeast", :message ("oh its over")}
 {:user "Fecalfeast", :message ("fecalfeast mvp")}
 {:user "Chezinu",
  :message ("To be a follower of The Brown is no easy task.")}
 {:user "Breshke",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Weren't you lynched in campus mafia?")}
 {:user "sicklucker",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Ya 4 months ago. That was also bullshit! :D")}
 {:user "Breshke",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Yeah true that")}
 {:user "Artanis[Xp]",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "Very, very true. It's so hard to actually get into the game too playing like that. I'm honestly impressed you manage to keep playing this way."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So many times I had reads but was like \"how do I explain it chezinu style?\" And then due to lack of interaction you don't really get into the game, at least I didn't."
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-02 10:25:34")})}
 {:user "Half the Sky",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Not everyone watches the Super Bowl "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil}
   " "
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Also just read the Scum QT...#41 in the QT."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Sicklucker..."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :i, :attrs nil, :content ("You bastard...")}
   " "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/plzdie.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil}
   {:tag :div,
    :attrs {:style "float:right; font-size:8pt; margin-top:15px"},
    :content ("Last edit: 2015-02-02 12:51:11")})}
 {:user "sicklucker", :message ("mwahaha")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil} "^ couldn't agree more")}
 {:user "Damdred",
  :message
  ("HTS was pretty towny d1 especially early part when I was talking to her with rsoultin not sure what was going on with that lol.")}
 {:user "Damdred",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "*sniff* I just wanted to make you guys proud")}
 {:user "Alakaslam",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "What is this"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "He forsakes CHUPAZI!  Blasphemy!")}
 {:user "Damdred",
  :message
  ("Slam you left the house of brown to induldge in smash boards!")}
 {:user "Alakaslam", :message ("Pah")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "While I'm on the topic of underrated skillsets, HTS has an amazing ability look town when she is. She is just so painfully obviously town that it makes the game so much easier."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Like for some reason everyone seems to think the be-all end-all townplayer skill in mafia is to figure out who is mafia, when in reality it's only one of half a dozen or so very important skills that can't exist without each other."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "The ability to convince, the ability to be townread, the ability to sheep when needed, the ability to control atmosphere and focus discussion etc etc etc."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "This game was actually a very good example of how unimportant actually figuring out who the mafia is can be. If you polled people in this game, more than half of them would put me in the bottom half for performance as town here. But no one was more right on the mafia than I was this game. I literally tried to kill 3 people day 1 and those were the mafia. However:"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I was not useful for direction/focus/atmosphere"
   {:tag :br, :attrs nil, :content nil}
   "I couldn't convince anyone to follow me"
   {:tag :br, :attrs nil, :content nil}
   "Half the players thought I was mafia."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "I agree! I didn't play this game well at all. And of the two things I did right, only one of them was actually really good, and it wasn't the fact that I went after the entire mafia team. In the end my willingness to sheep Damdred's case and thus make a good judgement call is something I'm far more happy about than being right."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "So yeah, don't sleep on players even if they are wrong sometimes. The #1 priority of any town player is to not get lynched.")}
 {:user "marvellosity",
  :message
  ("damn right"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "i knew 24h in advance that we needed to sheep damdred!"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil})}
 {:user "Palmar",
  :message
  ("yes, that was a good call "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/smile.gif"},
    :content nil}
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "In fact the post where you left and said \"trust Damdred over HF\" (I was voting HF at the time) was my \"I'm now fairly confident marv is town\" moment."
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "Whereas when you didn't realize that my instasheep on Damdred into a correct lynch made me town, because I've done the same thing with you a few times (smart sheeping "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/puh2.gif"},
    :content nil}
   ") made me do a double take on that read.")}
 {:user "IAmRobik",
  :message
  ("Marv. Were you planning on having me mislynched the next day it would you have stopped trolling me post night phase?")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "My stance was \"well robik is probably not mafia but man this is too funny I'm willing to lynch him anyway\".")}
 {:user "marvellosity",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "tbh i didn't pay nearly enough attention to that part of the game because i was catching up in a hurry"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "like you noticed i called LS mafia briefly before retracting it, i hadn't noticed how he'd followed the case either")}
 {:user "Palmar",
  :message
  ({:tag :br, :attrs nil, :content nil} "Yeah that was super bad.")}
 {:user "marvellosity",
  :message
  ("you not realising i was town after about 6h gameplay was super bad tbh "
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/wink.gif"},
    :content nil})}
 {:user "Palmar",
  :message
  ("I thought you were! notice how the absolutely first time I pushed you was after you called LS and me mafia during the night after the flips.")}
 {:user "marvellosity",
  :message
  ("when i was 100% obviously town already you mean?"
   {:tag :br, :attrs nil, :content nil}
   {:tag :br, :attrs nil, :content nil}
   "gj")}
 {:user "marvellosity",
  :message
  ("one day i'm going to go ahead and mislynch you and it will be glorious.")}
 {:user "IAmRobik",
  :message
  ({:tag :br, :attrs nil, :content nil}
   {:tag :img,
    :attrs {:alt "", :border "0", :src "/mirror/smilies/frusty.gif"},
    :content nil})}
 {:user "marvellosity", :message ("not you dumbo")}
 {:user "Palmar", :message ("men are talking robik")}
 {:user "Damdred",
  :message
  ("Honestly i'm not sure what the big deal was about Palmar or the hard on to lynch him especially day 1. I know it is kind of fun lynching marv/palmar but lynching palmar especially on a weekend day one is so bad, its like not lynching marv on day 4/5")}
 {:user "Damdred",
  :message
  ("It confused me at points how much a hard on the thread had for policy lynching at points. ")}
 {:user "LightningStrike",
  :message
  ({:tag :br, :attrs nil, :content nil}
   "I didn't buy into the policy lynching.")}
 {:user "Damdred",
  :message
  ("I know you didn't necessarily LS soon as something good came up you were on it in a second, you played pretty good this game LS. I could tell you were town after a few good posts")}
 {:user "rsoultin",
  :message
  ("lol i dunnae. too often day 1 for me is about not lynching my townreads that everyone wants dead and negotiating it to at least a null read. maybe not the best way to play but i dont expect to find mafia day 1 since im not that good lol")}
 {:user "Blazinghand",
  :message
  ("My new game is open for signups: "
   {:tag :a,
    :attrs
    {:target "_blank",
     :href "/forum/mafia/477307-slytherin-mini-mafia"},
    :content
    ("http://www.teamliquid.net/forum/mafia/477307-slytherin-mini-mafia")})})

)
